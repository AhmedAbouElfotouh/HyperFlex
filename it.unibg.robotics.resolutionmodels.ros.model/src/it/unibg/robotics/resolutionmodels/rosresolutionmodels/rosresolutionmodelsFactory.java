/**
 * Feature Model Plugin
 * 
 * Copyright (c) 2011
 * All rights reserved.
 * 
 * Luca Gherardi
 * University of Bergamo
 * Dept. of Information Technology and Mathematics
 * 
 * ***********************************************************************************************
 * 
 * Author: <A HREF="mailto:luca.gherardi@unibg.it">Luca Gherardi</A>
 * 
 * Supervised by: <A HREF="mailto:brugali@unibg.it">Davide Brugali</A>
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
package it.unibg.robotics.resolutionmodels.rosresolutionmodels;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see it.unibg.robotics.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage
 * @generated
 */
public interface rosresolutionmodelsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	rosresolutionmodelsFactory eINSTANCE = it.unibg.robotics.resolutionmodels.rosresolutionmodels.impl.rosresolutionmodelsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>ROS Transf Implementation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Transf Implementation</em>'.
	 * @generated
	 */
	ROSTransfImplementation createROSTransfImplementation();

	/**
	 * Returns a new object of class '<em>ROS Transf Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Transf Property</em>'.
	 * @generated
	 */
	ROSTransfProperty createROSTransfProperty();

	/**
	 * Returns a new object of class '<em>ROS Transf Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Transf Connection</em>'.
	 * @generated
	 */
	ROSTransfConnection createROSTransfConnection();

	/**
	 * Returns a new object of class '<em>ROS New Topic Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS New Topic Connection</em>'.
	 * @generated
	 */
	ROSNewTopicConnection createROSNewTopicConnection();

	/**
	 * Returns a new object of class '<em>ROS Existing Topic Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Existing Topic Connection</em>'.
	 * @generated
	 */
	ROSExistingTopicConnection createROSExistingTopicConnection();

	/**
	 * Returns a new object of class '<em>ROS New Service Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS New Service Connection</em>'.
	 * @generated
	 */
	ROSNewServiceConnection createROSNewServiceConnection();

	/**
	 * Returns a new object of class '<em>ROS Existing Service Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Existing Service Connection</em>'.
	 * @generated
	 */
	ROSExistingServiceConnection createROSExistingServiceConnection();

	/**
	 * Returns a new object of class '<em>ROS New Action Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS New Action Connection</em>'.
	 * @generated
	 */
	ROSNewActionConnection createROSNewActionConnection();

	/**
	 * Returns a new object of class '<em>ROS Existing Action Connection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Existing Action Connection</em>'.
	 * @generated
	 */
	ROSExistingActionConnection createROSExistingActionConnection();

	/**
	 * Returns a new object of class '<em>ROS Required Components</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Required Components</em>'.
	 * @generated
	 */
	ROSRequiredComponents createROSRequiredComponents();

	/**
	 * Returns a new object of class '<em>ROS Required Connections</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>ROS Required Connections</em>'.
	 * @generated
	 */
	ROSRequiredConnections createROSRequiredConnections();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	rosresolutionmodelsPackage getrosresolutionmodelsPackage();

} //rosresolutionmodelsFactory
