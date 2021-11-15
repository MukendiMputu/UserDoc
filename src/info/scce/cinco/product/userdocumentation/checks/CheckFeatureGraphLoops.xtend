package info.scce.cinco.product.userdocumentation.checks

import info.scce.cinco.product.features.main.mcam.adapter.FeatureGraphModelId
import info.scce.cinco.product.features.main.mcam.adapter.FeatureGraphModelAdapter
import info.scce.cinco.product.features.main.feature.FeatureGraphModel

/**
 * Based on info.scce.cinco.product.minidime.process.checks.LoopCheck
 */
class CheckFeatureGraphLoops extends UserDocCheck<FeatureGraphModelId, FeatureGraphModelAdapter>  {
	
	
	override doExecute(FeatureGraphModelAdapter adapter) {
		for (id : adapter.entityIds) {
			val obj = id.element
			if (obj instanceof FeatureGraphModel) {
				// for each feature graph model container
				for (container : (obj as FeatureGraphModel).featureContainers) {
					// retrieve the docNodes and check if they have errors or warnings and display them
					for (uSeq : container.docNodes) {
						if(!uSeq.eResource.errors.empty) { 
							addError(adapter.getIdByString(obj.id), uSeq.mgl.modelName+'(id: '+uSeq.mgl.id+') contains errors')
						} 
						if (!uSeq.eResource.warnings.empty) {
							addWarning(adapter.getIdByString(obj.id), uSeq.mgl.modelName+'(id: '+uSeq.mgl.id+') contains warnings')
						}
					}
				}
			}
		}
	}
	
	override init() {
		// Intentionally left blank
	}
	
	
}