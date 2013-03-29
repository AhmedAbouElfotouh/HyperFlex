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
package it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl;

import it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTopicConnection;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.ros.model.ros.Publisher;
import org.ros.model.ros.Subscriber;
import org.ros.model.ros.Topic;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ROS Topic Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl.ROSTopicConnectionImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl.ROSTopicConnectionImpl#getSubscriber <em>Subscriber</em>}</li>
 *   <li>{@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.impl.ROSTopicConnectionImpl#getTopic <em>Topic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ROSTopicConnectionImpl extends ROSAbstractConnectionImpl implements ROSTopicConnection {
	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected Publisher publisher;

	/**
	 * The cached value of the '{@link #getSubscriber() <em>Subscriber</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscriber()
	 * @generated
	 * @ordered
	 */
	protected Subscriber subscriber;

	/**
	 * The cached value of the '{@link #getTopic() <em>Topic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopic()
	 * @generated
	 * @ordered
	 */
	protected Topic topic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSTopicConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return rosresolutionmodelPackage.Literals.ROS_TOPIC_CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher getPublisher() {
		if (publisher != null && publisher.eIsProxy()) {
			InternalEObject oldPublisher = (InternalEObject)publisher;
			publisher = (Publisher)eResolveProxy(oldPublisher);
			if (publisher != oldPublisher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__PUBLISHER, oldPublisher, publisher));
			}
		}
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publisher basicGetPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(Publisher newPublisher) {
		Publisher oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__PUBLISHER, oldPublisher, publisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber getSubscriber() {
		if (subscriber != null && subscriber.eIsProxy()) {
			InternalEObject oldSubscriber = (InternalEObject)subscriber;
			subscriber = (Subscriber)eResolveProxy(oldSubscriber);
			if (subscriber != oldSubscriber) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__SUBSCRIBER, oldSubscriber, subscriber));
			}
		}
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subscriber basicGetSubscriber() {
		return subscriber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscriber(Subscriber newSubscriber) {
		Subscriber oldSubscriber = subscriber;
		subscriber = newSubscriber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__SUBSCRIBER, oldSubscriber, subscriber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic getTopic() {
		if (topic != null && topic.eIsProxy()) {
			InternalEObject oldTopic = (InternalEObject)topic;
			topic = (Topic)eResolveProxy(oldTopic);
			if (topic != oldTopic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__TOPIC, oldTopic, topic));
			}
		}
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Topic basicGetTopic() {
		return topic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopic(Topic newTopic) {
		Topic oldTopic = topic;
		topic = newTopic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__TOPIC, oldTopic, topic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__PUBLISHER:
				if (resolve) return getPublisher();
				return basicGetPublisher();
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__SUBSCRIBER:
				if (resolve) return getSubscriber();
				return basicGetSubscriber();
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__TOPIC:
				if (resolve) return getTopic();
				return basicGetTopic();
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
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__PUBLISHER:
				setPublisher((Publisher)newValue);
				return;
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__SUBSCRIBER:
				setSubscriber((Subscriber)newValue);
				return;
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__TOPIC:
				setTopic((Topic)newValue);
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
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__PUBLISHER:
				setPublisher((Publisher)null);
				return;
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__SUBSCRIBER:
				setSubscriber((Subscriber)null);
				return;
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__TOPIC:
				setTopic((Topic)null);
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
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__PUBLISHER:
				return publisher != null;
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__SUBSCRIBER:
				return subscriber != null;
			case rosresolutionmodelPackage.ROS_TOPIC_CONNECTION__TOPIC:
				return topic != null;
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @generated NOT
	 */
	@Override
	public boolean equals(Object arg0) {
		
		if(arg0 instanceof ROSTopicConnectionImpl){
			ROSTopicConnectionImpl connection = (ROSTopicConnectionImpl)arg0;
			
			Publisher pubA = connection.getPublisher();
			Publisher pubB = this.getPublisher();

			Subscriber subA = connection.getSubscriber();
			Subscriber subB = this.getSubscriber();

			Topic topA = connection.getTopic();
			Topic topB = this.getTopic();

			if(pubA == pubB && subA == subB && topA == topB){
				return true;
			}else{
				return false;
			}
			
			
		}else{
			return false;
		}
		
	}

} //ROSTopicConnectionImpl