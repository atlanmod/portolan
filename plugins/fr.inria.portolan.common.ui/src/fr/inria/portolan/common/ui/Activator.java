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
 
package fr.inria.portolan.common.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Activator extends AbstractUIPlugin {
	
	private static Activator plugin;
	
	public static final String ID = "fr.inria.portolan.common.ui";
	
	public Activator() {
	}
	
	public static Activator getDefault() {
		return plugin;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

}
