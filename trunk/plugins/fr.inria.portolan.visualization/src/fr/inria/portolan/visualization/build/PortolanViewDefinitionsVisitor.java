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

import java.io.InputStream;

import org.eclipse.core.internal.registry.ExtensionRegistry;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IContributor;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
@SuppressWarnings("restriction")
public class PortolanViewDefinitionsVisitor implements IResourceVisitor {

	private IProgressMonitor monitor;
	/**
	 * @param monitor
	 */
	public PortolanViewDefinitionsVisitor(IProgressMonitor monitor) {
		this.monitor = monitor;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IResourceVisitor#visit(org.eclipse.core.resources.IResource)
	 */
	public boolean visit(IResource resource) throws CoreException {
		
		if (resource instanceof IFile) {
			monitor.subTask("Processing file " + resource.getName());
			
			IFile file = (IFile) resource;
			
			if (file.getFileExtension().equals("vd")) {
				// the file must contain an XML extension definition
				// create the corresponding ViewDefinition extension
				IExtensionRegistry registry = Platform.getExtensionRegistry();
				InputStream is = file.getContents();
				
				IExtensionPoint ep = registry.getExtensionPoint("fr.inria.portolan.visualization.viewDefinition");
				IContributor contrib = ep.getContributor();
				
				// it should be better to manage the access to the registry using
				// the " -Declipse.registry.nulltoken=true" argument
				// but it does not work
				Object token = ((ExtensionRegistry) registry).getTemporaryUserToken( );
				registry.addContribution(is, contrib, false, null, null, token);
//				registry.addContribution(is, contrib, false, null, null, null);
			}
			
			return false;
		}
		
		return true;
	}

}
