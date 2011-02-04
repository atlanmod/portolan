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
package fr.inria.portolan.common.exceptions;

/**
 * The project which is set as referent in the Portolan preferences
 * is not reachable within the current workspace or cannot be opened.
 * 
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class ReferentProjectException extends PortolanException {

	private static final long serialVersionUID = -261595868337781539L;

	/**
	 * @param message
	 */
	public ReferentProjectException(String message) {
		super(message);
	}
}
