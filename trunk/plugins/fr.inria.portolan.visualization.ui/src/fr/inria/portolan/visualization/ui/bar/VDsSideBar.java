/*******************************************************************************
 * Copyright (c) 2009, 2011 INRIA Rennes Bretagne-Atlantique and others.
 *
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   INRIA Rennes Bretagne-Atlantique - Initial API and implementation
 ******************************************************************************/

package fr.inria.portolan.visualization.ui.bar;

import java.util.HashMap;

import org.eclipse.core.commands.Category;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.IHandler;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IRegistryEventListener;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.progress.UIJob;

import fr.inria.portolan.common.exceptions.PortolanInitializationException;
import fr.inria.portolan.common.exceptions.ProjectInitializationException;
import fr.inria.portolan.common.utils.CommonUtils;
import fr.inria.portolan.visualization.ui.handlers.ModelFullViewHandler;
import fr.inria.portolan.visualization.ui.handlers.ModelViewDefinitionHandler;

public class VDsSideBar extends ViewPart {
	
	// manage graphic objects created within the view
	private Color background;
	public static final String ID = "fr.inria.portolan.visualization.ui.bar.VDsSideBar";
	
	ScrolledComposite scrollComposite;
	ToolBar bar;
	HashMap<String, ToolItem> buttons = new HashMap<String, ToolItem>();
	
	public VDsSideBar() {
	}

	@Override
	public void createPartControl(Composite parent) {
		// initialize
		background = new Color(parent.getDisplay(), new RGB(255, 255, 255));
		
		parent.setLayout(new FillLayout());
		
		scrollComposite = new ScrolledComposite(parent, SWT.V_SCROLL | SWT.BORDER);

		bar = new ToolBar(scrollComposite, SWT.VERTICAL);
		bar.setBackground(background);
		new ToolBarManager(bar);
		
		/////////////// Manage full view //////////////////////
		// view definitions are handled dynamically through workspace build
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		
		IConfigurationElement[] elements = registry.getConfigurationElementsFor("fr.inria.portolan.visualization.fullView");
		for (int i = 0; i < elements.length; i++) {
			IConfigurationElement config = elements[i];
			
			addFullViewButton(config);
		}
		
		// we add a listener on view definition extensions
		registry.addListener(new IRegistryEventListener() {
			
			public void removed(IExtensionPoint[] extensionPoints) { }
			
			public void removed(IExtension[] extensions) {
				for (int j = 0; j < extensions.length; j++) {
					IExtension extension = extensions[j];
					if (extension.getExtensionPointUniqueIdentifier()
							.equals("fr.inria.portolan.visualization.viewDefinition")) {
						IConfigurationElement[] elements = extension.getConfigurationElements();
						for (int i = 0; i < elements.length; i++) {
							final IConfigurationElement element = elements[i];
							removeVDButton(element);
						}
					}
				}
			}

			public void added(IExtensionPoint[] extensionPoints) { }
			
			public void added(IExtension[] extensions) {
				for (int j = 0; j < extensions.length; j++) {
					IExtension extension = extensions[j];
					if (extension.getExtensionPointUniqueIdentifier()
							.equals("fr.inria.portolan.visualization.viewDefinition")) {
						IConfigurationElement[] elements = extension.getConfigurationElements();
						for (int i = 0; i < elements.length; i++) {
							addVDButton(elements[i]);
						}
					}
				}
			}
		});
		
		RowLayout layout = new RowLayout(SWT.VERTICAL);
		layout.center = true;
		layout.fill = true;
		layout.pack = false;
		
		bar.setLayout(layout);
		bar.pack();
		
		scrollComposite.setContent(bar);
		scrollComposite.setExpandVertical(true);
		scrollComposite.setExpandHorizontal(true);
		scrollComposite.addControlListener(new ControlAdapter() {
			public void controlResized(ControlEvent e) {
				Rectangle r = scrollComposite.getClientArea();
				scrollComposite.setMinSize(bar.computeSize(r.width, SWT.DEFAULT));
			}
		});
		scrollComposite.pack();

		
		// refresh the referenced project to activate view definitions
		try {
			IProject project = CommonUtils.getWorkspaceReferencedProject();
			project.build(IncrementalProjectBuilder.FULL_BUILD, null);
		} catch (CoreException e) {
			e.printStackTrace();
		} catch (PortolanInitializationException e) {
// #BUG 11352: message was printed at first launch of a new Portolan
		} catch (ProjectInitializationException e) {
		}
	}

	@Override
	public void setFocus() {
	}
	
	public void dispose() {
		// manage graphic objects created within the view
		background = null;
	}

	private void newButton(final IConfigurationElement config, final Image image) {
		// I do not understand why sometimes newButton() is called when "bar" is disposed...
		if (! bar.isDisposed()) {
			UIJob job = new UIJob("Adding a button to Portolan side bar") {
				
				@Override
				public IStatus runInUIThread(IProgressMonitor monitor) {
					ToolItem button = buttons.get(config.getAttribute("id"));
					if (button != null)
						removeVDButton(config);
					
					button = new ToolItem(bar, SWT.PUSH + SWT.WRAP);
					button.setText(config.getAttribute("text"));
					button.setImage(image);
					String tooltip = config.getAttribute("tooltip");
					if (tooltip != null)
						button.setToolTipText(tooltip);
					
					// rely to corresponding command
					button.addSelectionListener(new SelectionListener() {
						
						public void widgetSelected(SelectionEvent e) {
							IHandlerService hs = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);
							try {
								hs.executeCommand(config.getAttribute("commandId"), null);
							} catch (Exception ex) {
								ex.printStackTrace();
							}
						}
						
						public void widgetDefaultSelected(SelectionEvent e) {
						}
					});
					buttons.put(config.getAttribute("id"), button);
					return new Status(IStatus.OK, "fr.inria.portolan.visualization.ui", "");
				}
			};
			job.schedule();
		}
	}
	
	private Image getPluginImage(String pluginID, String iconPath) {
		Image image = null;
		try {
			image = AbstractUIPlugin.imageDescriptorFromPlugin(
						pluginID, iconPath).createImage();
		} catch (Exception e) {
			// default icon
			image = AbstractUIPlugin.imageDescriptorFromPlugin(
					"fr.inria.portolan.visualization.ui",
					"icons/portolan_32x32.png")
					.createImage();
		}
		return image;
	}
	
	private Image getProjectImage(String iconPath) {
		Image image = null;
		try {
			IProject referenceProject = CommonUtils.getWorkspaceReferencedProject();
			image = new Image(PlatformUI.getWorkbench().getDisplay(),
					referenceProject.getLocation().addTrailingSeparator().toString()
					+ iconPath);
		} catch (Exception e) {
			// default icon
			image = AbstractUIPlugin.imageDescriptorFromPlugin(
					"fr.inria.portolan.visualization.ui",
					"icons/portolan_32x32.png")
					.createImage();
		}
		return image;
	}
	
	protected void addVDButton(IConfigurationElement config) {
		Image image = getProjectImage(config.getAttribute("iconPath"));
		
		String commandID = config.getAttribute("commandId");
		
		// the corresponding command & handler may not be registered
		ICommandService cs = (ICommandService) PlatformUI.getWorkbench()
									.getService(ICommandService.class);
		Category category = cs.getCategory(config.getAttribute("categoryId"));
		Command command = cs.getCommand(commandID);
		if (! command.isDefined()) {
			command.define(commandID, "", category);
		
			// build the corresponding handler
			String editorId = config.getAttribute("editorId");
			String metamodelId = config.getAttribute("shortMM");
			String postName = config.getAttribute("postName");
			if (postName == null || postName.isEmpty())	// optional attribute
				postName = "_out";
			String transfoPath = config.getAttribute("transformationPath");
			
			IHandler handler = new ModelViewDefinitionHandler(editorId,
															  metamodelId,
															  postName,
															  transfoPath);
			
			IHandlerService hs = (IHandlerService) PlatformUI.getWorkbench()
										.getService(IHandlerService.class);
			hs.activateHandler(commandID, handler);
		}
		
		newButton(config, image);
	}
	
	protected void addFullViewButton(IConfigurationElement config) {
		Image image = getPluginImage(config.getAttribute("pluginId"),
									config.getAttribute("iconPath"));
		
		String commandID = config.getAttribute("commandId");
		
		// the corresponding command & handler may not be registered
		ICommandService cs = (ICommandService) PlatformUI.getWorkbench()
									.getService(ICommandService.class);
		Category category = cs.getCategory(config.getAttribute("categoryId"));
		Command command = cs.getCommand(commandID);
		if (! command.isDefined()) {
			command.define(commandID, "", category);
		
			// build the corresponding handler
			String editorId = config.getAttribute("editorId");
			
			IHandler handler = new ModelFullViewHandler(editorId);
			
			IHandlerService hs = (IHandlerService) PlatformUI.getWorkbench()
										.getService(IHandlerService.class);
			hs.activateHandler(commandID, handler);
		}
		
		newButton(config, image);
	}
	
	private void removeVDButton(final IConfigurationElement config) {
		// the corresponding handler must be unregistered
		String commandID = config.getAttribute("commandId");
		ICommandService cs = (ICommandService) PlatformUI.getWorkbench()
									.getService(ICommandService.class);
		Command command = cs.getCommand(commandID);
		if (command.isDefined())
			if (command.getHandler() != null)
				command.getHandler().dispose();
		
		// we must free the resource used for the image
		final ToolItem button = buttons.remove(config.getAttribute("id"));
		UIJob job = new UIJob("Removing a VD button") {
			
			@Override
			public IStatus runInUIThread(IProgressMonitor monitor) {
				// when cleaning the project, removeVDButton is called many times
				//TODO: find the origin of those multiple calls
				if (button != null) {
					if (! button.isDisposed()) {
						button.getImage().dispose();
						button.dispose();
					}
				}
				return new Status(IStatus.OK, "fr.inria.portolan.visualization.ui", "");
			}
		};
		job.schedule();
	}
}
