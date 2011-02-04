/*******************************************************************************
 * Copyright (c) 2010 INRIA Rennes Bretagne-Atlantique.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     INRIA Rennes Bretagne-Atlantique - initial API and implementation
 *******************************************************************************/
package fr.inria.portolan.visualization.build;

import java.util.Map;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;

import fr.inria.portolan.common.exceptions.PortolanInitializationException;
import fr.inria.portolan.common.exceptions.ProjectInitializationException;
import fr.inria.portolan.common.utils.CommonUtils;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
@SuppressWarnings("restriction")
public class PortolanVDBuilder extends IncrementalProjectBuilder {
	
	public static final String ID = "fr.inria.portolan.visualization.build.PortolanVDBuilder";

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#build(int, java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	@SuppressWarnings("rawtypes")
	protected IProject[] build(int kind, Map arguments, IProgressMonitor monitor)
			throws CoreException {
		
		/* we process any project, even if it is not the one referenced
		  in Portolan preferences (the visualisation will pick the good
		  view definitions to build its VDsBar) because here we have no
		  access to UI (and preferences store is in UI package. 
		 */
		
		// we launch the build in another thread
		IWorkspaceRunnable runner = new IWorkspaceRunnable() {
			
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = getProject();
				
				try {
					IProject referent = CommonUtils.getWorkspaceReferencedProject();
					if (project.equals(referent)) {
						monitor.beginTask("Exploring Portolan project "
									+ project.getName() 
									+" in search of available view definitions!",
									IProgressMonitor.UNKNOWN);
						
						
						// we create the new view definition buttons
						project.accept(new PortolanViewDefinitionsVisitor(monitor));
					}
					// else, it is not the referent so no View Definitions
				} catch (PortolanInitializationException e) {
				} catch (ProjectInitializationException e) {
				}
				
			}
		};
		ResourcesPlugin.getWorkspace().run(runner, monitor);
		
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#clean(org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected void clean(IProgressMonitor monitor) throws CoreException {
		// we launch the build in another thread
		IWorkspaceRunnable runner = new IWorkspaceRunnable() {
			
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = getProject();
				
				monitor.beginTask("Cleaning Portolan project "
							+ project.getName() 
							+" in search of available view definitions!",
							IProgressMonitor.UNKNOWN);
				
				IExtensionRegistry registry = Platform.getExtensionRegistry();
				IExtensionPoint point = registry.getExtensionPoint("fr.inria.portolan.visualization.viewDefinition");
				IExtension[] extensions = point.getExtensions();
				
				// we suppress existing view definition buttons
				for (int i = 0; i < extensions.length; i++) {
					// it is better to manage the access to the registry using
					// the " -Declipse.registry.nulltoken=true" argument
					// but it does not work
					Object token = ((ExtensionRegistry) registry).getTemporaryUserToken( );
					registry.removeExtension(extensions[i], token);
//					registry.removeExtension(extensions[i], null);
				}
			}
		};
		ResourcesPlugin.getWorkspace().run(runner, monitor);
	}
}
