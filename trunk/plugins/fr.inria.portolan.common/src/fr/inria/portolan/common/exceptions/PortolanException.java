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
 * Head exception for the Portolan application.
 * The message should give accurate informations about the underlying problem.
 * 
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public abstract class PortolanException extends Exception {

	private String message = "";
	/**
	 * @param message
	 */
	public PortolanException(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.message;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 4078298117151059072L;

}
