package info.scce.cinco.product.userdocumentation.checks

import info.scce.cinco.product.features.main.mcam.adapter.FeatureGraphModelAdapter
import info.scce.cinco.product.features.main.mcam.adapter.FeatureGraphModelId
import java.util.ArrayList

class CheckInterruptedFeatureGraphSequence extends UserDocCheck<FeatureGraphModelId, FeatureGraphModelAdapter> {
	
	ArrayList<String> picFileNames = new ArrayList
	
	override doExecute(FeatureGraphModelAdapter adapter) {
		
		
	}
	
	override init() {
		picFileNames.clear
	}
	
	
}