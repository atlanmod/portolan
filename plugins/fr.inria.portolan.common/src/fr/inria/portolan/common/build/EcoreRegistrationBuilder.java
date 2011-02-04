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
package fr.inria.portolan.common.build;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRunnable;
import org.eclipse.core.resources.IncrementalProjectBuilder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class EcoreRegistrationBuilder extends IncrementalProjectBuilder {

	public static final String ID = "fr.inria.portolan.common.build.EcoreRegistrationBuilder";
	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IncrementalProjectBuilder#build(int, java.util.Map, org.eclipse.core.runtime.IProgressMonitor)
	 */
	@Override
	protected IProject[] build(int kind, @SuppressWarnings("rawtypes") Map args, IProgressMonitor monitor)
			throws CoreException {
		// we launch the build in another thread
		IWorkspaceRunnable runner = new IWorkspaceRunnable() {
			
			public void run(IProgressMonitor monitor) throws CoreException {
				IProject project = getProject();
				
				monitor.beginTask("Exploring Portolan project "
							+ project.getName() 
							+" in search of available view definitions!",
							IProgressMonitor.UNKNOWN);
				
				
				// we create the new view definition buttons
				project.accept(new EcoreRegistrationVisitor(monitor));
			}
		};
		ResourcesPlugin.getWorkspace().run(runner, monitor);
		
		return null;
	}

}
