package org.hyperflex.compositionmodel.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;
import org.hyperflex.compositionmodel.diagram.edit.parts.CompositeSrvConsumerPromoteEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.CompositeSrvProducerPromoteEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ConnectionEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.ROSCompositeEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.System2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeProvidedInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemCompositeRequiredInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemProvidedInterf2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemProvidedInterfEditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemRequiredInterf2EditPart;
import org.hyperflex.compositionmodel.diagram.edit.parts.SystemRequiredInterfEditPart;
import org.hyperflex.compositionmodel.diagram.part.CompositionModelDiagramEditorPlugin;

/**
 * @generated
 */
public class CompositionModelElementTypes {

	/**
	 * @generated
	 */
	private CompositionModelElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			CompositionModelDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType ArchitectureModel_1000 = getElementType("org.hyperflex.compositionmodels.diagram.ArchitectureModel_1000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType System_2001 = getElementType("org.hyperflex.compositionmodels.diagram.System_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SystemProvidedInterf_3001 = getElementType("org.hyperflex.compositionmodels.diagram.SystemProvidedInterf_3001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SystemRequiredInterf_3002 = getElementType("org.hyperflex.compositionmodels.diagram.SystemRequiredInterf_3002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SystemComposite_3003 = getElementType("org.hyperflex.compositionmodels.diagram.SystemComposite_3003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SystemCompositeProvidedInterf_3004 = getElementType("org.hyperflex.compositionmodels.diagram.SystemCompositeProvidedInterf_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SystemCompositeRequiredInterf_3005 = getElementType("org.hyperflex.compositionmodels.diagram.SystemCompositeRequiredInterf_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ROSComposite_3006 = getElementType("org.hyperflex.compositionmodels.diagram.ROSComposite_3006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ROSMsgProducer_3007 = getElementType("org.hyperflex.compositionmodels.diagram.ROSMsgProducer_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ROSMsgConsumer_3008 = getElementType("org.hyperflex.compositionmodels.diagram.ROSMsgConsumer_3008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connection_4001 = getElementType("org.hyperflex.compositionmodels.diagram.Connection_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SystemRequiredInterfExposed_4002 = getElementType("org.hyperflex.compositionmodels.diagram.SystemRequiredInterfExposed_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SystemProvidedInterfExposed_4003 = getElementType("org.hyperflex.compositionmodels.diagram.SystemProvidedInterfExposed_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(
					ArchitectureModel_1000,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getArchitectureModel());

			elements.put(
					System_2001,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystem());

			elements.put(
					SystemProvidedInterf_3001,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemProvidedInterf());

			elements.put(
					SystemRequiredInterf_3002,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemRequiredInterf());

			elements.put(
					SystemComposite_3003,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemComposite());

			elements.put(
					SystemCompositeProvidedInterf_3004,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemCompositeProvidedInterf());

			elements.put(
					SystemCompositeRequiredInterf_3005,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemCompositeRequiredInterf());

			elements.put(
					ROSComposite_3006,
					org.hyperflex.roscompositionmodel.roscompositionmodelPackage.eINSTANCE
							.getROSComposite());

			elements.put(
					ROSMsgProducer_3007,
					org.hyperflex.roscompositionmodel.roscompositionmodelPackage.eINSTANCE
							.getROSMsgProducer());

			elements.put(
					ROSMsgConsumer_3008,
					org.hyperflex.roscompositionmodel.roscompositionmodelPackage.eINSTANCE
							.getROSMsgConsumer());

			elements.put(
					Connection_4001,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getConnection());

			elements.put(
					SystemRequiredInterfExposed_4002,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemRequiredInterf_Exposed());

			elements.put(
					SystemProvidedInterfExposed_4003,
					org.hyperflex.compositionmodel.compositionmodelPackage.eINSTANCE
							.getSystemProvidedInterf_Exposed());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(ArchitectureModel_1000);
			KNOWN_ELEMENT_TYPES.add(System_2001);
			KNOWN_ELEMENT_TYPES.add(SystemProvidedInterf_3001);
			KNOWN_ELEMENT_TYPES.add(SystemRequiredInterf_3002);
			KNOWN_ELEMENT_TYPES.add(SystemComposite_3003);
			KNOWN_ELEMENT_TYPES.add(SystemCompositeProvidedInterf_3004);
			KNOWN_ELEMENT_TYPES.add(SystemCompositeRequiredInterf_3005);
			KNOWN_ELEMENT_TYPES.add(ROSComposite_3006);
			KNOWN_ELEMENT_TYPES.add(ROSMsgProducer_3007);
			KNOWN_ELEMENT_TYPES.add(ROSMsgConsumer_3008);
			KNOWN_ELEMENT_TYPES.add(Connection_4001);
			KNOWN_ELEMENT_TYPES.add(SystemRequiredInterfExposed_4002);
			KNOWN_ELEMENT_TYPES.add(SystemProvidedInterfExposed_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SystemEditPart.VISUAL_ID:
			return ArchitectureModel_1000;
		case System2EditPart.VISUAL_ID:
			return System_2001;
		case SystemProvidedInterf2EditPart.VISUAL_ID:
			return SystemProvidedInterf_3001;
		case SystemRequiredInterf2EditPart.VISUAL_ID:
			return SystemRequiredInterf_3002;
		case SystemCompositeEditPart.VISUAL_ID:
			return SystemComposite_3003;
		case SystemCompositeProvidedInterfEditPart.VISUAL_ID:
			return SystemCompositeProvidedInterf_3004;
		case SystemCompositeRequiredInterfEditPart.VISUAL_ID:
			return SystemCompositeRequiredInterf_3005;
		case ROSCompositeEditPart.VISUAL_ID:
			return ROSComposite_3006;
		case SystemProvidedInterfEditPart.VISUAL_ID:
			return ROSMsgProducer_3007;
		case SystemRequiredInterfEditPart.VISUAL_ID:
			return ROSMsgConsumer_3008;
		case ConnectionEditPart.VISUAL_ID:
			return Connection_4001;
		case CompositeSrvConsumerPromoteEditPart.VISUAL_ID:
			return SystemRequiredInterfExposed_4002;
		case CompositeSrvProducerPromoteEditPart.VISUAL_ID:
			return SystemProvidedInterfExposed_4003;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return org.hyperflex.compositionmodel.diagram.providers.CompositionModelElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return org.hyperflex.compositionmodel.diagram.providers.CompositionModelElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return org.hyperflex.compositionmodel.diagram.providers.CompositionModelElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
