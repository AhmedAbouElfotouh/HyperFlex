/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * Department of Engineering
 * University of Bergamo
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:lucagh@ethz.ch">Luca Gherardi</A>
 * 
 * In collaboration with: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package org.hyperflex.resolutionmodels.rttresolutionmodels.util;

import org.hyperflex.resolutionmodels.RMAbstractTransformation;
import org.hyperflex.resolutionmodels.RMRequiredComponents;
import org.hyperflex.resolutionmodels.RMRequiredConnections;
import org.hyperflex.resolutionmodels.RMTransfConnection;
import org.hyperflex.resolutionmodels.RMTransfImplementation;
import org.hyperflex.resolutionmodels.RMTransfProperty;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredComponents;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTRequiredConnections;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfConnection;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfImplementation;
import org.hyperflex.resolutionmodels.rttresolutionmodels.RTTTransfProperty;
import org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.hyperflex.resolutionmodels.rttresolutionmodels.rttresolutionmodelsPackage
 * @generated
 */
public class rttresolutionmodelsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static rttresolutionmodelsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rttresolutionmodelsSwitch() {
		if (modelPackage == null) {
			modelPackage = rttresolutionmodelsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case rttresolutionmodelsPackage.RTT_TRANSF_IMPLEMENTATION: {
				RTTTransfImplementation rttTransfImplementation = (RTTTransfImplementation)theEObject;
				T result = caseRTTTransfImplementation(rttTransfImplementation);
				if (result == null) result = caseRMTransfImplementation(rttTransfImplementation);
				if (result == null) result = caseRMAbstractTransformation(rttTransfImplementation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rttresolutionmodelsPackage.RTT_TRANSF_PROPERTY: {
				RTTTransfProperty rttTransfProperty = (RTTTransfProperty)theEObject;
				T result = caseRTTTransfProperty(rttTransfProperty);
				if (result == null) result = caseRMTransfProperty(rttTransfProperty);
				if (result == null) result = caseRMAbstractTransformation(rttTransfProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rttresolutionmodelsPackage.RTT_TRANSF_CONNECTION: {
				RTTTransfConnection rttTransfConnection = (RTTTransfConnection)theEObject;
				T result = caseRTTTransfConnection(rttTransfConnection);
				if (result == null) result = caseRMTransfConnection(rttTransfConnection);
				if (result == null) result = caseRMAbstractTransformation(rttTransfConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rttresolutionmodelsPackage.RTT_CONNECTION: {
				RTTConnection rttConnection = (RTTConnection)theEObject;
				T result = caseRTTConnection(rttConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rttresolutionmodelsPackage.RTT_REQUIRED_COMPONENTS: {
				RTTRequiredComponents rttRequiredComponents = (RTTRequiredComponents)theEObject;
				T result = caseRTTRequiredComponents(rttRequiredComponents);
				if (result == null) result = caseRMRequiredComponents(rttRequiredComponents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case rttresolutionmodelsPackage.RTT_REQUIRED_CONNECTIONS: {
				RTTRequiredConnections rttRequiredConnections = (RTTRequiredConnections)theEObject;
				T result = caseRTTRequiredConnections(rttRequiredConnections);
				if (result == null) result = caseRMRequiredConnections(rttRequiredConnections);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTT Transf Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTT Transf Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTTTransfImplementation(RTTTransfImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTT Transf Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTT Transf Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTTTransfProperty(RTTTransfProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTT Transf Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTT Transf Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTTTransfConnection(RTTTransfConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTT Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTT Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTTConnection(RTTConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTT Required Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTT Required Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTTRequiredComponents(RTTRequiredComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RTT Required Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RTT Required Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRTTRequiredConnections(RTTRequiredConnections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Abstract Transformation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Abstract Transformation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMAbstractTransformation(RMAbstractTransformation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Transf Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Transf Implementation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMTransfImplementation(RMTransfImplementation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Transf Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Transf Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMTransfProperty(RMTransfProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Transf Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Transf Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMTransfConnection(RMTransfConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Required Components</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Required Components</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMRequiredComponents(RMRequiredComponents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>RM Required Connections</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>RM Required Connections</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRMRequiredConnections(RMRequiredConnections object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //rttresolutionmodelsSwitch
