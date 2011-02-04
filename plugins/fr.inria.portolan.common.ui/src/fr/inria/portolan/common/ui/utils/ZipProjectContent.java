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
package fr.inria.portolan.common.ui.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ZipProjectContent {

	private String bundleID;
	private String zipPath;
	
	public ZipProjectContent(String bundleID, String zipPath) {
		this.bundleID = bundleID;
		this.zipPath = zipPath;
	}
	
	public boolean unZipContent(IProject project) throws IOException, CoreException {
		URL zipURL = FileLocator.find(Platform.getBundle(bundleID), new Path(zipPath), null);
		
		ZipInputStream zipStream = new ZipInputStream(zipURL.openStream());
		ZipEntry zipEntry = zipStream.getNextEntry();
		
		while (zipEntry != null) {
			// the Zip utility cannot create folders
			if (! zipEntry.isDirectory()) {
				// it is a file
				File file = new File(project.getLocation().toString(),zipEntry.getName());
				
				// create containing folders
				File parent = file.getParentFile();
				if (! parent.exists())
					parent.mkdirs();
				
				OutputStream outputStream = new FileOutputStream(file);
				try {
					byte[] buffer = new byte[102400];
					while (true) {
						int length = zipStream.read(buffer);
						if (zipStream.available() == 0)
							break;
						outputStream.write(buffer, 0, length);
					}
					
				} finally {
					if (outputStream != null)
						outputStream.close();
				}
			}
			
			// get the next one
			zipStream.closeEntry();
			zipEntry = zipStream.getNextEntry();
		}
		
		project.refreshLocal(IResource.DEPTH_INFINITE, new NullProgressMonitor());
		return false;
	}
}
