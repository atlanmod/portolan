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
package fr.inria.portolan.visualization.prefuse.viewer;

/**
 * @author <a href="mailto:Vincent.Mahe@inria.fr">Vincent Mahe</a>
 *
 */
public class LayoutsParams {

	private static float _massValue = 1.0f;
	public static float getMassValue() {
		return _massValue;
	}
	public static void setMassValue(float massValue) {
		if (massValue < 1.0f)
			_massValue = 1.0f;
		else
			_massValue = massValue;
	}

//	private static float _springLength = -1.0f;
//	public static float getSpringLength() {
//		return _springLength;
//	}
//	public static void setSpringLength(float springLength) {
//		if (springLength > -1.0f)
//			_springLength = -1.0f;
//		else
//			_springLength = springLength;
//	}

//	private static float _springCoefficient = -1.0f;
//	public static float getSpringCoefficient() {
//		return _springCoefficient;
//	}
//	public static void setSpringCoefficient(float springCoefficient) {
//		if (springCoefficient > -1.0f)
//			_springCoefficient = -1.0f;
//		else
//			_springCoefficient = springCoefficient;
//	}
}
