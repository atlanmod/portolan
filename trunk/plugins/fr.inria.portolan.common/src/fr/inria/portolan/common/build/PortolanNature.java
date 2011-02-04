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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class PortolanNature implements IProjectNature {
	
	public static final String ID = "fr.inria.portolan.common.build.PortolanNature";

	public static final String BUILDER_EXTENSION_ID = "fr.inria.portolan.common.builder";
	
	private IProject project;

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		IProjectDescription descr = getProject().getDescription();
		
		Collection<ICommand> commands = new ArrayList<ICommand>();
		commands.addAll(Arrays.asList(descr.getBuildSpec()));
		
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		
		IConfigurationElement[] builders = registry
					.getConfigurationElementsFor(BUILDER_EXTENSION_ID);
		
		for (int i = 0; i < builders.length; i++) {
			String builderID = builders[i].getAttribute("builderId");
			
			boolean isRegistered = false;
			for (Iterator<ICommand> iterator = commands.iterator(); iterator.hasNext();) {
				ICommand command = (ICommand) iterator.next();
				if (command.getBuilderName().equals(builderID))
					isRegistered = true;
			}
			if (! isRegistered) {
				ICommand portolanBuild = descr.newCommand();
				portolanBuild.setBuilderName(builderID);
				commands.add(portolanBuild);
			}
		}
		
		
		// refresh the project
		descr.setBuildSpec(commands.toArray(new ICommand[]{}));
		project.setDescription(descr, null);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		IProjectDescription descr = getProject().getDescription();
		ICommand[] current = descr.getBuildSpec();
		Collection<ICommand> commands = new ArrayList<ICommand>();
		commands.addAll(Arrays.asList(current));
		
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		
		IConfigurationElement[] builders = registry
					.getConfigurationElementsFor(BUILDER_EXTENSION_ID);
		
		for (int i = 0; i < builders.length; i++) {
			String builderID = builders[i].getAttribute("builder_id");
			
			ICommand builder = null;
			
			for (Iterator<ICommand> iterator = commands.iterator(); iterator.hasNext();) {
				ICommand command = (ICommand) iterator.next();
				
				if (command.getBuilderName().equals(builderID))
					builder = command;
			}
			
			if (builder != null)
				commands.remove(builder);
		}
		// refresh the project
		descr.setBuildSpec(commands.toArray(new ICommand[]{}));
		project.setDescription(descr, null);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return project;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject arg0) {
		this.project = arg0;
	}

}
