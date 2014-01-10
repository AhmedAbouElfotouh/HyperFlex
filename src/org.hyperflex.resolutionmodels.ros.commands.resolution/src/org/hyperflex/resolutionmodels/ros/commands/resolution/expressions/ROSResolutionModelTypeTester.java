package org.hyperflex.resolutionmodels.ros.commands.resolution.expressions;

import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredComponents;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSRequiredConnections;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfConnection;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfImplementation;
import it.unibg.robotics.resolutionmodels.rosresolutionmodels.ROSTransfProperty;

import org.eclipse.core.expressions.PropertyTester;
import org.hyperflex.resolutionmodels.RMAbstractTransformation;
import org.hyperflex.resolutionmodels.RMResolutionElement;
import org.hyperflex.resolutionmodels.ResolutionModel;

public class ROSResolutionModelTypeTester extends PropertyTester{

	@Override
	public boolean test(Object receiver, String property, Object[] args,
			Object expectedValue) {
		
		if (property.equals("is_a_ROS_resolution_model")) {
			ResolutionModel model = (ResolutionModel)receiver;
			
			for(RMResolutionElement resElem : model.getResolutionElements()){
				
				if(resElem.getRequiredComponents() instanceof ROSRequiredComponents){
					return true;
				}
				if(resElem.getRequiredConnections() instanceof ROSRequiredConnections){
					return true;
				}
				for(RMAbstractTransformation transf : resElem.getTransformations()){
					
					if(transf instanceof ROSTransfImplementation ||
							transf instanceof ROSTransfProperty ||
							transf instanceof ROSTransfConnection){
						return true;
					}
					
					
				}
				
			}
			
		}
		return false;
	}

}