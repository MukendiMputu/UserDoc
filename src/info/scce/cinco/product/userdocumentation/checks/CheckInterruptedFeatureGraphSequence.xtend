package info.scce.cinco.product.userdocumentation.checks

import info.scce.cinco.product.features.main.feature.DocNode
import info.scce.cinco.product.features.main.feature.PropertyContainer
import info.scce.cinco.product.features.main.feature.Start
import info.scce.cinco.product.features.main.feature.Stop
import info.scce.cinco.product.features.main.mcam.adapter.FeatureGraphModelAdapter
import info.scce.cinco.product.features.main.mcam.adapter.FeatureGraphModelId

/**
 * Based on info.scce.cinco.product.minidime.process.checks.LoopCheck
 */
class CheckInterruptedFeatureGraphSequence extends UserDocCheck<FeatureGraphModelId, FeatureGraphModelAdapter> {
	
	
	override doExecute(FeatureGraphModelAdapter adapter) {
		
		for (id : adapter.entityIds) {
			val obj = id.element
			switch obj {
				Start
					case obj.getOutgoing.empty:
						addWarning(id, 'missing outgoing connector')
				Stop
					case obj.getIncoming.empty:
						addWarning(id, 'missing incoming connector')
				DocNode
					case obj.getIncoming.empty || obj.getOutgoing.empty:
						addWarning(id, 'missing incoming/outgoing control flow')
				PropertyContainer
					case obj.webDrivers.empty:
						addWarning(id, 'missing WebDriver property')
			}
		}
		processResults
	}
	
	override init() {
		// Intentionally left blank
	}
	
	
}