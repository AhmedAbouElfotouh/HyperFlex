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
package org.hyperflex.orocoscomponentmodel.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.hyperflex.orocoscomponentmodel.util.orocoscomponentmodelAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class orocoscomponentmodelItemProviderAdapterFactory extends orocoscomponentmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public orocoscomponentmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.Composite} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeItemProvider compositeItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.Composite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompositeAdapter() {
		if (compositeItemProvider == null) {
			compositeItemProvider = new CompositeItemProvider(this);
		}

		return compositeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.TaskContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskContextItemProvider taskContextItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.TaskContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskContextAdapter() {
		if (taskContextItemProvider == null) {
			taskContextItemProvider = new TaskContextItemProvider(this);
		}

		return taskContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.TCInputDataPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCInputDataPortItemProvider tcInputDataPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.TCInputDataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTCInputDataPortAdapter() {
		if (tcInputDataPortItemProvider == null) {
			tcInputDataPortItemProvider = new TCInputDataPortItemProvider(this);
		}

		return tcInputDataPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.TCOutputDataPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCOutputDataPortItemProvider tcOutputDataPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.TCOutputDataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTCOutputDataPortAdapter() {
		if (tcOutputDataPortItemProvider == null) {
			tcOutputDataPortItemProvider = new TCOutputDataPortItemProvider(this);
		}

		return tcOutputDataPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.CompInputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompInputPortItemProvider compInputPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.CompInputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompInputPortAdapter() {
		if (compInputPortItemProvider == null) {
			compInputPortItemProvider = new CompInputPortItemProvider(this);
		}

		return compInputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.CompOutputPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompOutputPortItemProvider compOutputPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.CompOutputPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompOutputPortAdapter() {
		if (compOutputPortItemProvider == null) {
			compOutputPortItemProvider = new CompOutputPortItemProvider(this);
		}

		return compOutputPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionPolicyItemProvider connectionPolicyItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.ConnectionPolicy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionPolicyAdapter() {
		if (connectionPolicyItemProvider == null) {
			connectionPolicyItemProvider = new ConnectionPolicyItemProvider(this);
		}

		return connectionPolicyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.Operation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationItemProvider operationItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationAdapter() {
		if (operationItemProvider == null) {
			operationItemProvider = new OperationItemProvider(this);
		}

		return operationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.OperationCaller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationCallerItemProvider operationCallerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.OperationCaller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOperationCallerAdapter() {
		if (operationCallerItemProvider == null) {
			operationCallerItemProvider = new OperationCallerItemProvider(this);
		}

		return operationCallerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.CompOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompOperationItemProvider compOperationItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.CompOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompOperationAdapter() {
		if (compOperationItemProvider == null) {
			compOperationItemProvider = new CompOperationItemProvider(this);
		}

		return compOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.TCOperation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCOperationItemProvider tcOperationItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.TCOperation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTCOperationAdapter() {
		if (tcOperationItemProvider == null) {
			tcOperationItemProvider = new TCOperationItemProvider(this);
		}

		return tcOperationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.CompOperationCaller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompOperationCallerItemProvider compOperationCallerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.CompOperationCaller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompOperationCallerAdapter() {
		if (compOperationCallerItemProvider == null) {
			compOperationCallerItemProvider = new CompOperationCallerItemProvider(this);
		}

		return compOperationCallerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.TCOperationCaller} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCOperationCallerItemProvider tcOperationCallerItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.TCOperationCaller}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTCOperationCallerAdapter() {
		if (tcOperationCallerItemProvider == null) {
			tcOperationCallerItemProvider = new TCOperationCallerItemProvider(this);
		}

		return tcOperationCallerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.PeersConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PeersConnectionItemProvider peersConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.PeersConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPeersConnectionAdapter() {
		if (peersConnectionItemProvider == null) {
			peersConnectionItemProvider = new PeersConnectionItemProvider(this);
		}

		return peersConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.System} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemItemProvider systemItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.System}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSystemAdapter() {
		if (systemItemProvider == null) {
			systemItemProvider = new SystemItemProvider(this);
		}

		return systemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.DataPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataPortItemProvider dataPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.DataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDataPortAdapter() {
		if (dataPortItemProvider == null) {
			dataPortItemProvider = new DataPortItemProvider(this);
		}

		return dataPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.InputDataPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDataPortItemProvider inputDataPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.InputDataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputDataPortAdapter() {
		if (inputDataPortItemProvider == null) {
			inputDataPortItemProvider = new InputDataPortItemProvider(this);
		}

		return inputDataPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.OutputDataPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDataPortItemProvider outputDataPortItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.OutputDataPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputDataPortAdapter() {
		if (outputDataPortItemProvider == null) {
			outputDataPortItemProvider = new OutputDataPortItemProvider(this);
		}

		return outputDataPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.TCProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TCPropertyItemProvider tcPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.TCProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTCPropertyAdapter() {
		if (tcPropertyItemProvider == null) {
			tcPropertyItemProvider = new TCPropertyItemProvider(this);
		}

		return tcPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.hyperflex.orocoscomponentmodel.CompProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompPropertyItemProvider compPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link org.hyperflex.orocoscomponentmodel.CompProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCompPropertyAdapter() {
		if (compPropertyItemProvider == null) {
			compPropertyItemProvider = new CompPropertyItemProvider(this);
		}

		return compPropertyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (compositeItemProvider != null) compositeItemProvider.dispose();
		if (taskContextItemProvider != null) taskContextItemProvider.dispose();
		if (tcInputDataPortItemProvider != null) tcInputDataPortItemProvider.dispose();
		if (tcOutputDataPortItemProvider != null) tcOutputDataPortItemProvider.dispose();
		if (compInputPortItemProvider != null) compInputPortItemProvider.dispose();
		if (compOutputPortItemProvider != null) compOutputPortItemProvider.dispose();
		if (connectionPolicyItemProvider != null) connectionPolicyItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (operationItemProvider != null) operationItemProvider.dispose();
		if (operationCallerItemProvider != null) operationCallerItemProvider.dispose();
		if (compOperationItemProvider != null) compOperationItemProvider.dispose();
		if (tcOperationItemProvider != null) tcOperationItemProvider.dispose();
		if (compOperationCallerItemProvider != null) compOperationCallerItemProvider.dispose();
		if (tcOperationCallerItemProvider != null) tcOperationCallerItemProvider.dispose();
		if (peersConnectionItemProvider != null) peersConnectionItemProvider.dispose();
		if (systemItemProvider != null) systemItemProvider.dispose();
		if (dataPortItemProvider != null) dataPortItemProvider.dispose();
		if (inputDataPortItemProvider != null) inputDataPortItemProvider.dispose();
		if (outputDataPortItemProvider != null) outputDataPortItemProvider.dispose();
		if (tcPropertyItemProvider != null) tcPropertyItemProvider.dispose();
		if (compPropertyItemProvider != null) compPropertyItemProvider.dispose();
	}

}
