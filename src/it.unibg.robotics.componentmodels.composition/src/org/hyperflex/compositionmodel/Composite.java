/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Department of Engineering
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: 
 *   <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>, Department of Engineering
 * 
 * ***********************************************************************************************
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * 
 */
package org.hyperflex.compositionmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.hyperflex.compositionmodel.Composite#getProvInterfaces <em>Prov Interfaces</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.Composite#getReqInterfaces <em>Req Interfaces</em>}</li>
 *   <li>{@link org.hyperflex.compositionmodel.Composite#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getComposite()
 * @model abstract="true"
 * @generated
 */
public interface Composite extends EObject {
	/**
	 * Returns the value of the '<em><b>Prov Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.compositionmodel.CompProvidedInterf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prov Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prov Interfaces</em>' containment reference list.
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getComposite_ProvInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompProvidedInterf> getProvInterfaces();

	/**
	 * Returns the value of the '<em><b>Req Interfaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.hyperflex.compositionmodel.CompRequiredInterf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Req Interfaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Req Interfaces</em>' containment reference list.
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getComposite_ReqInterfaces()
	 * @model containment="true"
	 * @generated
	 */
	EList<CompRequiredInterf> getReqInterfaces();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.hyperflex.compositionmodel.compositionmodelPackage#getComposite_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.hyperflex.compositionmodel.Composite#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Composite
