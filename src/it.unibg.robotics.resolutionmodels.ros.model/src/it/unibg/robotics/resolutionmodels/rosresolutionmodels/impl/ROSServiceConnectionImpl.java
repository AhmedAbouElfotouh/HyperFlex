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
package org.hyperflex.resolutionmodels.rosresolutionmodels.impl;

import org.hyperflex.resolutionmodels.rosresolutionmodels.ROSServiceConnection;
import org.hyperflex.resolutionmodels.rosresolutionmodels.rosresolutionmodelsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Service Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl#getServiceServer <em>Service Server</em>}</li>
 *   <li>{@link org.hyperflex.resolutionmodels.rosresolutionmodels.impl.ROSServiceConnectionImpl#getServiceClient <em>Service Client</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ROSServiceConnectionImpl extends ROSAbstractConnectionImpl implements ROSServiceConnection {
	/**
	 * The cached value of the '{@link #getServiceServer() <em>Service Server</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceServer()
	 * @generated
	 * @ordered
	 */
	protected ServiceServer serviceServer;

	/**
	 * The cached value of the '{@link #getServiceClient() <em>Service Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClient()
	 * @generated
	 * @ordered
	 */
	protected ServiceClient serviceClient;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSServiceConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelsPackage.Literals.ROS_SERVICE_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer getServiceServer() {
		if (serviceServer != null && serviceServer.eIsProxy()) {
			InternalEObject oldServiceServer = (InternalEObject)serviceServer;
			serviceServer = (ServiceServer)eResolveProxy(oldServiceServer);
			if (serviceServer != oldServiceServer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER, oldServiceServer, serviceServer));
			}
		}
		return serviceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceServer basicGetServiceServer() {
		return serviceServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceServer(ServiceServer newServiceServer) {
		ServiceServer oldServiceServer = serviceServer;
		serviceServer = newServiceServer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER, oldServiceServer, serviceServer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient getServiceClient() {
		if (serviceClient != null && serviceClient.eIsProxy()) {
			InternalEObject oldServiceClient = (InternalEObject)serviceClient;
			serviceClient = (ServiceClient)eResolveProxy(oldServiceClient);
			if (serviceClient != oldServiceClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT, oldServiceClient, serviceClient));
			}
		}
		return serviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient basicGetServiceClient() {
		return serviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClient(ServiceClient newServiceClient) {
		ServiceClient oldServiceClient = serviceClient;
		serviceClient = newServiceClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT, oldServiceClient, serviceClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER:
				if (resolve) return getServiceServer();
				return basicGetServiceServer();
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT:
				if (resolve) return getServiceClient();
				return basicGetServiceClient();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER:
				setServiceServer((ServiceServer)newValue);
				return;
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT:
				setServiceClient((ServiceClient)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER:
				setServiceServer((ServiceServer)null);
				return;
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT:
				setServiceClient((ServiceClient)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_SERVER:
				return serviceServer != null;
			case rosresolutionmodelsPackage.ROS_SERVICE_CONNECTION__SERVICE_CLIENT:
				return serviceClient != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object arg0) {
		
		if(arg0 instanceof ROSServiceConnectionImpl){
			ROSServiceConnectionImpl connection = (ROSServiceConnectionImpl)arg0;
			
			ServiceServer ssA = connection.getServiceServer();
			ServiceServer ssB = this.getServiceServer();

			ServiceClient scA = connection.getServiceClient();
			ServiceClient scB = this.getServiceClient();

			if(ssA == ssB && scA == scB){
				return true;
			}else{
				return false;
			}
			
			
		}else{
			return false;
		}
		
	}

} //ROSServiceConnectionImpl
