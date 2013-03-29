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
package it.unibg.robotics.resolutionmodel.rosresolutionmodel.provider;

import it.unibg.robotics.resolutionmodel.RMResolutionElement;
import it.unibg.robotics.resolutionmodel.resolutionmodelPackage;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.rosresolutionmodelFactory;
import it.unibg.robotics.resolutionmodel.rosresolutionmodel.util.rosresolutionmodelAdapterFactory;
import it.unibg.robotics.resolutionmodel.util.resolutionmodelSwitch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class rosresolutionmodelItemProviderAdapterFactory extends rosresolutionmodelAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
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
	public rosresolutionmodelItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfImplementation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSTransfImplementationItemProvider rosTransfImplementationItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSTransfImplementationAdapter() {
		if (rosTransfImplementationItemProvider == null) {
			rosTransfImplementationItemProvider = new ROSTransfImplementationItemProvider(this);
		}

		return rosTransfImplementationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSTransfPropertyItemProvider rosTransfPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSTransfPropertyAdapter() {
		if (rosTransfPropertyItemProvider == null) {
			rosTransfPropertyItemProvider = new ROSTransfPropertyItemProvider(this);
		}

		return rosTransfPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSTransfConnectionItemProvider rosTransfConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTransfConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSTransfConnectionAdapter() {
		if (rosTransfConnectionItemProvider == null) {
			rosTransfConnectionItemProvider = new ROSTransfConnectionItemProvider(this);
		}

		return rosTransfConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTopicConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSTopicConnectionItemProvider rosTopicConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSTopicConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSTopicConnectionAdapter() {
		if (rosTopicConnectionItemProvider == null) {
			rosTopicConnectionItemProvider = new ROSTopicConnectionItemProvider(this);
		}

		return rosTopicConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewTopicConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSNewTopicConnectionItemProvider rosNewTopicConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewTopicConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSNewTopicConnectionAdapter() {
		if (rosNewTopicConnectionItemProvider == null) {
			rosNewTopicConnectionItemProvider = new ROSNewTopicConnectionItemProvider(this);
		}

		return rosNewTopicConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSServiceConnectionItemProvider rosServiceConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSServiceConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSServiceConnectionAdapter() {
		if (rosServiceConnectionItemProvider == null) {
			rosServiceConnectionItemProvider = new ROSServiceConnectionItemProvider(this);
		}

		return rosServiceConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewServiceConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSNewServiceConnectionItemProvider rosNewServiceConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewServiceConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSNewServiceConnectionAdapter() {
		if (rosNewServiceConnectionItemProvider == null) {
			rosNewServiceConnectionItemProvider = new ROSNewServiceConnectionItemProvider(this);
		}

		return rosNewServiceConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSActionConnectionItemProvider rosActionConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSActionConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSActionConnectionAdapter() {
		if (rosActionConnectionItemProvider == null) {
			rosActionConnectionItemProvider = new ROSActionConnectionItemProvider(this);
		}

		return rosActionConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewActionConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSNewActionConnectionItemProvider rosNewActionConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSNewActionConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSNewActionConnectionAdapter() {
		if (rosNewActionConnectionItemProvider == null) {
			rosNewActionConnectionItemProvider = new ROSNewActionConnectionItemProvider(this);
		}

		return rosNewActionConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredComponents} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSRequiredComponentsItemProvider rosRequiredComponentsItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredComponents}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSRequiredComponentsAdapter() {
		if (rosRequiredComponentsItemProvider == null) {
			rosRequiredComponentsItemProvider = new ROSRequiredComponentsItemProvider(this);
		}

		return rosRequiredComponentsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredConnections} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSRequiredConnectionsItemProvider rosRequiredConnectionsItemProvider;

	/**
	 * This creates an adapter for a {@link it.unibg.robotics.resolutionmodel.rosresolutionmodel.ROSRequiredConnections}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createROSRequiredConnectionsAdapter() {
		if (rosRequiredConnectionsItemProvider == null) {
			rosRequiredConnectionsItemProvider = new ROSRequiredConnectionsItemProvider(this);
		}

		return rosRequiredConnectionsItemProvider;
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
		if (rosTransfImplementationItemProvider != null) rosTransfImplementationItemProvider.dispose();
		if (rosTransfPropertyItemProvider != null) rosTransfPropertyItemProvider.dispose();
		if (rosTransfConnectionItemProvider != null) rosTransfConnectionItemProvider.dispose();
		if (rosTopicConnectionItemProvider != null) rosTopicConnectionItemProvider.dispose();
		if (rosNewTopicConnectionItemProvider != null) rosNewTopicConnectionItemProvider.dispose();
		if (rosServiceConnectionItemProvider != null) rosServiceConnectionItemProvider.dispose();
		if (rosNewServiceConnectionItemProvider != null) rosNewServiceConnectionItemProvider.dispose();
		if (rosActionConnectionItemProvider != null) rosActionConnectionItemProvider.dispose();
		if (rosNewActionConnectionItemProvider != null) rosNewActionConnectionItemProvider.dispose();
		if (rosRequiredComponentsItemProvider != null) rosRequiredComponentsItemProvider.dispose();
		if (rosRequiredConnectionsItemProvider != null) rosRequiredConnectionsItemProvider.dispose();
	}

	/**
	 * A child creation extender for the {@link resolutionmodelPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class resolutionmodelChildCreationExtender implements IChildCreationExtender {
		/**
		 * The switch for creating child descriptors specific to each extended class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		protected static class CreationSwitch extends resolutionmodelSwitch<Object> {
			/**
			 * The child descriptors being populated.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected List<Object> newChildDescriptors;

			/**
			 * The domain in which to create the children.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected EditingDomain editingDomain;

			/**
			 * Creates the a switch for populating child descriptors in the given domain.
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			CreationSwitch(List<Object> newChildDescriptors, EditingDomain editingDomain) {
				this.newChildDescriptors = newChildDescriptors;
				this.editingDomain = editingDomain;
			}
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			@Override
			public Object caseRMResolutionElement(RMResolutionElement object) {
				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelPackage.Literals.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS,
						 rosresolutionmodelFactory.eINSTANCE.createROSTransfImplementation()));

				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelPackage.Literals.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS,
						 rosresolutionmodelFactory.eINSTANCE.createROSTransfProperty()));

				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelPackage.Literals.RM_RESOLUTION_ELEMENT__TRANSFORMATIONS,
						 rosresolutionmodelFactory.eINSTANCE.createROSTransfConnection()));

				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelPackage.Literals.RM_RESOLUTION_ELEMENT__REQUIRED_COMPONENTS,
						 rosresolutionmodelFactory.eINSTANCE.createROSRequiredComponents()));

				newChildDescriptors.add
					(createChildParameter
						(resolutionmodelPackage.Literals.RM_RESOLUTION_ELEMENT__REQUIRED_CONNECTIONS,
						 rosresolutionmodelFactory.eINSTANCE.createROSRequiredConnections()));

				return null;
			}
 
			/**
			 * <!-- begin-user-doc -->
			 * <!-- end-user-doc -->
			 * @generated
			 */
			protected CommandParameter createChildParameter(Object feature, Object child) {
				return new CommandParameter(null, feature, child);
			}

		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Collection<Object> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
			ArrayList<Object> result = new ArrayList<Object>();
		   new CreationSwitch(result, editingDomain).doSwitch((EObject)object);
		   return result;
		}

		/**
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public ResourceLocator getResourceLocator() {
			return RosResolutionModelEditPlugin.INSTANCE;
		}
	}

}