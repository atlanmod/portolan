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
 * The exception is thrown when one parameter of the Portolan application
 * has not been correctly initialized. The message should give accurate
 * informations about the empty/undefined parameter.
 * 
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class PortolanInitializationException extends PortolanException {

	/**
	 * @param message
	 */
	public PortolanInitializationException(String message) {
		super(message);
	}

	private static final long serialVersionUID = 4078298117151059072L;

}
