/**
 * HyperFlex Toolchain
 * 
 * Copyright (c) 2013
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
package org.hyperflex.featuremodels.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.hyperflex.featuremodels.diagram.edit.commands.Feature2CreateCommand;
import org.hyperflex.featuremodels.diagram.edit.commands.FeatureCreateCommand;
import org.hyperflex.featuremodels.diagram.edit.commands.SimpleAttributeCreateCommand;
import org.hyperflex.featuremodels.diagram.providers.FeatureModelElementTypes;

/**
 * @generated
 */
public class FeatureModelItemSemanticEditPolicy extends
		FeatureModelBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public FeatureModelItemSemanticEditPolicy() {
		super(FeatureModelElementTypes.FeatureModel_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (FeatureModelElementTypes.Feature_2005 == req.getElementType()) {
			return getGEFWrapper(new FeatureCreateCommand(req));
		}
		if (FeatureModelElementTypes.Feature_2006 == req.getElementType()) {
			return getGEFWrapper(new Feature2CreateCommand(req));
		}
		if (FeatureModelElementTypes.SimpleAttribute_2008 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleAttributeCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
