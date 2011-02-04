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
package fr.inria.portolan.common.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.m2m.atl.adt.AtlNature;
import org.osgi.service.prefs.BackingStoreException;

import fr.inria.portolan.common.Activator;
import fr.inria.portolan.common.build.PortolanNature;
import fr.inria.portolan.common.build.RegisterMetamodel;
import fr.inria.portolan.common.exceptions.PortolanInitializationException;
import fr.inria.portolan.common.exceptions.ProjectInitializationException;
import fr.inria.portolan.common.exceptions.ReferentProjectException;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class CommonUtils {

	public static final String PROJECT_PATH_FIELD			= "Portolan_Project_Path";
	public static final String METAMODEL_PATH_PROPERTY		= "PortolanMetamodel";
	public static final String MODEL_PATH_PROPERTY			= "PortolanModel";
	
	public static void togglePortolanNature(IProject project) {
		try {
			IProjectDescription descr = project.getDescription();
			Collection<String> natures = new ArrayList<String>();
			natures.addAll(Arrays.asList(descr.getNatureIds()));
			
			// we need both ATL & Portolan builders
			boolean hasATLNature = false;
			
			for (Iterator<String> iterator = natures.iterator(); iterator.hasNext();) {
				String nature = (String) iterator.next();
				// we do not change ATL nature of the project
				// (it may have been set separately)
				if (nature.equals(AtlNature.ATL_NATURE_ID))
					hasATLNature = true;
			}
			for (Iterator<String> iterator = natures.iterator(); iterator.hasNext();) {
				String nature = (String) iterator.next();
				// we do not change ATL nature of the project
				// (it may have been set separately)
				if (nature.equals(PortolanNature.ID)) {
					natures.remove(nature);
					String[] newNatures = new String[natures.size()];
					newNatures = natures.toArray(new String[]{});
					descr.setNatureIds(newNatures);
					project.setDescription(descr, null);
					return;
				}
			}
			
			// no Portolan nature found so we add it
			
			if (! hasATLNature)		// we also need ATL nature
				natures.add(AtlNature.ATL_NATURE_ID);
			natures.add(PortolanNature.ID);
			descr.setNatureIds(natures.toArray(new String[]{}));
			project.setDescription(descr, null);
			
			// force the refresh of the project
//			project.build(IncrementalProjectBuilder.FULL_BUILD, null);
		} catch (CoreException e) {
			
			e.printStackTrace();
		}

	}
	
	public static String getWorkspaceProperty(String propertyId)
				throws PortolanInitializationException {
		String value = "";
		IScopeContext context = new InstanceScope();
		IEclipsePreferences node = context.getNode(Activator.ID);
		String defaultValue = "";
		if (node != null) {
			value = node.get(propertyId, defaultValue);
			if (value.equals(defaultValue))
			throw new PortolanInitializationException(
					"The property '"+ propertyId + "' is not set"
					+ " in workspace!");
		}
		
		return value;
	}
	public static void setWorkspaceProperty(String propertyId, String value) {
		IScopeContext context = new InstanceScope();
		IEclipsePreferences node = context.getNode(Activator.ID);
		if (node != null) {
			node.put(propertyId, value);
		}
		try {
			node.flush();
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block - What to do with that error???
			e.printStackTrace();
		}
	}
	
	public static String getProjectProperty(IProject project, String propertyId) 
				throws ProjectInitializationException {
		String value = "";
		IScopeContext context = new ProjectScope(project);
		IEclipsePreferences node = context.getNode(Activator.ID);
		String defaultValue = "";
		if (node != null) {
			value = node.get(propertyId, defaultValue);
			if (value.equals(defaultValue))
			throw new ProjectInitializationException(
					"The property '"+ propertyId + "' is not set"
					+ " in project '" + project.getName() +"'!");
		}
		
		return value;
	}
	public static void setProjectProperty(IProject project, String propertyId, String value) {
		IScopeContext context = new ProjectScope(project);
		IEclipsePreferences node = context.getNode(Activator.ID);
		if (node != null) {
			node.put(propertyId, value);
		}
		try {
			node.flush();
		} catch (BackingStoreException e) {
			// TODO Auto-generated catch block - What to do with that error???
			e.printStackTrace();
		}
	}
	
	public static String getWorkspaceReferencedProjectPath() throws
				PortolanInitializationException {
		String projectPath = getWorkspaceProperty(PROJECT_PATH_FIELD);
		if (! projectPath.isEmpty())
			return projectPath;
		else
			throw new PortolanInitializationException("The parameter "
					+PROJECT_PATH_FIELD
					+" has not been properly set!");
	}

	public static IProject getWorkspaceReferencedProject()
				throws PortolanInitializationException, ProjectInitializationException {
		String projectPath = getWorkspaceReferencedProjectPath();
		
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectPath);
		if (project.exists() || project.isOpen())
			return project;
		else
			throw new ProjectInitializationException("The project "
					+ projectPath
					+ " is not reachable within the current workspace!");
	}

	public static void setWorkspaceReferencedProjectPath(String projectPath) {
		setWorkspaceProperty(PROJECT_PATH_FIELD, projectPath);
	}

	public static void setWorkspaceReferencedProject(IProject project) throws ReferentProjectException {
		setWorkspaceReferencedProjectPath(project.getName());
		IProjectNature nature = null;
		try {
			nature = project.getNature(PortolanNature.ID);
		} catch (CoreException e) { }
		finally {
			if (nature == null) {
				nature = new PortolanNature();
				nature.setProject(project);
			}
			//TODO: should we force project build here???
		}
	}

	public static String getReferentProjectMetamodelPath()
				throws PortolanInitializationException, ProjectInitializationException {
		String cartoMetamodelUri = getProjectProperty(
				getWorkspaceReferencedProject(),
				METAMODEL_PATH_PROPERTY);
		return cartoMetamodelUri;
	}

	public static void setReferentProjectMetamodel(IFile cartoMetamodel)
				throws PortolanInitializationException, ProjectInitializationException {
		setReferentProjectMetamodelPath(cartoMetamodel.getFullPath().toString());
		RegisterMetamodel.registerMetamodel(cartoMetamodel);
	}

	public static void setReferentProjectMetamodelPath(String cartoMetamodelUri)
				throws PortolanInitializationException, ProjectInitializationException {
		setProjectProperty(
				getWorkspaceReferencedProject(),
				METAMODEL_PATH_PROPERTY,
				cartoMetamodelUri);
	}

	public static void setReferentProjectModelPath(String cartoModelUri)
				throws PortolanInitializationException, ProjectInitializationException {
		setProjectProperty(
				getWorkspaceReferencedProject(),
				MODEL_PATH_PROPERTY,
				cartoModelUri);
	}
	
	public static String getReferentProjectModelPath()
				throws PortolanInitializationException, ProjectInitializationException {
		String modelFilePath = getProjectProperty(
				getWorkspaceReferencedProject(),
				MODEL_PATH_PROPERTY);
		return modelFilePath;
	}
	
	public static IFile getReferentProjectMetamodel()
				throws PortolanInitializationException, ProjectInitializationException {
		IPath path = new Path(getReferentProjectMetamodelPath());
		IFile model = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		
		return model;
	}
	
	public static IFile getReferentProjectModel()
				throws PortolanInitializationException, ProjectInitializationException {
		IPath path = new Path(getReferentProjectModelPath());
		IFile model = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		
		return model;
	}
}
