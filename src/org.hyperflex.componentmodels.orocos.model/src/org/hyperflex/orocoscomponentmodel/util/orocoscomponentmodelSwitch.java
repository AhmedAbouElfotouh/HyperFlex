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
package org.hyperflex.orocoscomponentmodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.hyperflex.orocoscomponentmodel.AbstractComponent;
import org.hyperflex.orocoscomponentmodel.CompInputPort;
import org.hyperflex.orocoscomponentmodel.CompOperation;
import org.hyperflex.orocoscomponentmodel.CompOperationCaller;
import org.hyperflex.orocoscomponentmodel.CompOutputPort;
import org.hyperflex.orocoscomponentmodel.CompProperty;
import org.hyperflex.orocoscomponentmodel.Composite;
import org.hyperflex.orocoscomponentmodel.ConnectionPolicy;
import org.hyperflex.orocoscomponentmodel.DataPort;
import org.hyperflex.orocoscomponentmodel.InputDataPort;
import org.hyperflex.orocoscomponentmodel.Operation;
import org.hyperflex.orocoscomponentmodel.OperationCaller;
import org.hyperflex.orocoscomponentmodel.OutputDataPort;
import org.hyperflex.orocoscomponentmodel.PeersConnection;
import org.hyperflex.orocoscomponentmodel.Property;
import org.hyperflex.orocoscomponentmodel.TCInputDataPort;
import org.hyperflex.orocoscomponentmodel.TCOperation;
import org.hyperflex.orocoscomponentmodel.TCOperationCaller;
import org.hyperflex.orocoscomponentmodel.TCOutputDataPort;
import org.hyperflex.orocoscomponentmodel.TCProperty;
import org.hyperflex.orocoscomponentmodel.TaskContext;
import org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage;

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
 * @see org.hyperflex.orocoscomponentmodel.orocoscomponentmodelPackage
 * @generated
 */
public class orocoscomponentmodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static orocoscomponentmodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orocoscomponentmodelSwitch() {
		if (modelPackage == null) {
			modelPackage = orocoscomponentmodelPackage.eINSTANCE;
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
			case orocoscomponentmodelPackage.COMPOSITE: {
				Composite composite = (Composite)theEObject;
				T result = caseComposite(composite);
				if (result == null) result = caseAbstractComponent(composite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.TASK_CONTEXT: {
				TaskContext taskContext = (TaskContext)theEObject;
				T result = caseTaskContext(taskContext);
				if (result == null) result = caseAbstractComponent(taskContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.TC_INPUT_DATA_PORT: {
				TCInputDataPort tcInputDataPort = (TCInputDataPort)theEObject;
				T result = caseTCInputDataPort(tcInputDataPort);
				if (result == null) result = caseInputDataPort(tcInputDataPort);
				if (result == null) result = caseDataPort(tcInputDataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.TC_OUTPUT_DATA_PORT: {
				TCOutputDataPort tcOutputDataPort = (TCOutputDataPort)theEObject;
				T result = caseTCOutputDataPort(tcOutputDataPort);
				if (result == null) result = caseOutputDataPort(tcOutputDataPort);
				if (result == null) result = caseDataPort(tcOutputDataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.COMP_INPUT_PORT: {
				CompInputPort compInputPort = (CompInputPort)theEObject;
				T result = caseCompInputPort(compInputPort);
				if (result == null) result = caseInputDataPort(compInputPort);
				if (result == null) result = caseDataPort(compInputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.COMP_OUTPUT_PORT: {
				CompOutputPort compOutputPort = (CompOutputPort)theEObject;
				T result = caseCompOutputPort(compOutputPort);
				if (result == null) result = caseOutputDataPort(compOutputPort);
				if (result == null) result = caseDataPort(compOutputPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.CONNECTION_POLICY: {
				ConnectionPolicy connectionPolicy = (ConnectionPolicy)theEObject;
				T result = caseConnectionPolicy(connectionPolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.OPERATION_CALLER: {
				OperationCaller operationCaller = (OperationCaller)theEObject;
				T result = caseOperationCaller(operationCaller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.COMP_OPERATION: {
				CompOperation compOperation = (CompOperation)theEObject;
				T result = caseCompOperation(compOperation);
				if (result == null) result = caseOperation(compOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.TC_OPERATION: {
				TCOperation tcOperation = (TCOperation)theEObject;
				T result = caseTCOperation(tcOperation);
				if (result == null) result = caseOperation(tcOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.COMP_OPERATION_CALLER: {
				CompOperationCaller compOperationCaller = (CompOperationCaller)theEObject;
				T result = caseCompOperationCaller(compOperationCaller);
				if (result == null) result = caseOperationCaller(compOperationCaller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.TC_OPERATION_CALLER: {
				TCOperationCaller tcOperationCaller = (TCOperationCaller)theEObject;
				T result = caseTCOperationCaller(tcOperationCaller);
				if (result == null) result = caseOperationCaller(tcOperationCaller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.PEERS_CONNECTION: {
				PeersConnection peersConnection = (PeersConnection)theEObject;
				T result = casePeersConnection(peersConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.SYSTEM: {
				org.hyperflex.orocoscomponentmodel.System system = (org.hyperflex.orocoscomponentmodel.System)theEObject;
				T result = caseSystem(system);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.DATA_PORT: {
				DataPort dataPort = (DataPort)theEObject;
				T result = caseDataPort(dataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.INPUT_DATA_PORT: {
				InputDataPort inputDataPort = (InputDataPort)theEObject;
				T result = caseInputDataPort(inputDataPort);
				if (result == null) result = caseDataPort(inputDataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.OUTPUT_DATA_PORT: {
				OutputDataPort outputDataPort = (OutputDataPort)theEObject;
				T result = caseOutputDataPort(outputDataPort);
				if (result == null) result = caseDataPort(outputDataPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.ABSTRACT_COMPONENT: {
				AbstractComponent abstractComponent = (AbstractComponent)theEObject;
				T result = caseAbstractComponent(abstractComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.TC_PROPERTY: {
				TCProperty tcProperty = (TCProperty)theEObject;
				T result = caseTCProperty(tcProperty);
				if (result == null) result = caseProperty(tcProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case orocoscomponentmodelPackage.COMP_PROPERTY: {
				CompProperty compProperty = (CompProperty)theEObject;
				T result = caseCompProperty(compProperty);
				if (result == null) result = caseProperty(compProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComposite(Composite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTaskContext(TaskContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Input Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Input Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCInputDataPort(TCInputDataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Output Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Output Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCOutputDataPort(TCOutputDataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Input Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Input Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompInputPort(CompInputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Output Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Output Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompOutputPort(CompOutputPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection Policy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection Policy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnectionPolicy(ConnectionPolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProperty(Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Caller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Caller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperationCaller(OperationCaller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompOperation(CompOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCOperation(TCOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Operation Caller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Operation Caller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompOperationCaller(CompOperationCaller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Operation Caller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Operation Caller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCOperationCaller(TCOperationCaller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Peers Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Peers Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePeersConnection(PeersConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystem(org.hyperflex.orocoscomponentmodel.System object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPort(DataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputDataPort(InputDataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Data Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Data Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputDataPort(OutputDataPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponent(AbstractComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>TC Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>TC Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTCProperty(TCProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comp Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comp Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompProperty(CompProperty object) {
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

} //orocoscomponentmodelSwitch
