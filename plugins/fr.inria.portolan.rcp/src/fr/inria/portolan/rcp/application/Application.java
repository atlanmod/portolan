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

package fr.inria.portolan.rcp.application;

//import java.lang.reflect.InvocationTargetException;
//
//import org.eclipse.core.resources.IWorkspace;
//import org.eclipse.core.resources.ResourcesPlugin;
//import org.eclipse.core.runtime.CoreException;
//import org.eclipse.core.runtime.IProgressMonitor;
//import org.eclipse.core.runtime.IStatus;
//import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

/**
 * This class controls all aspects of the application's execution
 */
public class Application implements IApplication {
	
	public static final String PREF_WORKSPACE_NODE = "fr.inria.portolan.preferences.workspace";
	public static final String PREF_WORKSPACE_PATH = "workspace.path";

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.IApplicationContext)
	 */
//	@SuppressWarnings("restriction")
	public Object start(IApplicationContext context) {
		Display display = PlatformUI.createDisplay();
		
		try {
			int returnCode = PlatformUI.createAndRunWorkbench(display, new ApplicationWorkbenchAdvisor());
			if (returnCode == PlatformUI.RETURN_RESTART) {
				return IApplication.EXIT_RESTART;
			}
			return IApplication.EXIT_OK;
			
		} finally {
			display.dispose();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 */
	public void stop() {
		if (!PlatformUI.isWorkbenchRunning())
			return;
		final IWorkbench workbench = PlatformUI.getWorkbench();
		final Display display = workbench.getDisplay();
		display.syncExec(new Runnable() {
			public void run() {
				if (!display.isDisposed())
					workbench.close();
			}
		});
		
//		// try to save workspace
//		final MultiStatus status = new MultiStatus("fr.inria.portolan.rcp", IStatus.OK, "", null);
//		IRunnableWithProgress runnable = new IRunnableWithProgress() {
//			public void run(IProgressMonitor monitor) {
//				try {
//					IWorkspace ws = ResourcesPlugin.getWorkspace();
//					status.merge(ws.save(true, monitor));
//				} catch (CoreException e) {
//					status.merge(e.getStatus());
//				}
//			}
//		};
//		try {
//			new ProgressMonitorDialog(null).run(false, false, runnable);
//		} catch (InvocationTargetException e) {
//			e.printStackTrace();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		if (!status.isOK())
//			ErrorDialog.openError(display.getActiveShell(), "Saving Workspace", "Error of saving during workspace closure", status);

	}
}
