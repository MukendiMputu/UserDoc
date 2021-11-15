package info.scce.cinco.product.userdocumentation.checks

import info.scce.cinco.product.features.main.feature.FeatureContainer
import info.scce.cinco.product.features.main.mcam.adapter.FeatureGraphModelAdapter
import info.scce.cinco.product.features.main.mcam.adapter.FeatureGraphModelId
import java.util.ArrayList

/**
 * Based on info.scce.cinco.product.minidime.process.checks.UniqueName
 */
class CheckUniqueFeatureName extends UserDocCheck<FeatureGraphModelId, FeatureGraphModelAdapter> {
	
	ArrayList<String> picFileNames = new ArrayList
	
	override doExecute(FeatureGraphModelAdapter adapter) {
		for (id : adapter.entityIds) {
			switch obj : id.element {
				FeatureContainer: {
					adapter.checkFileNames(obj)
				}
			}
		}
		
	}
	
	override init() {
		picFileNames.clear
	}
	
	def private void checkFileNames(FeatureGraphModelAdapter adapter, FeatureContainer container) {
		if (picFileNames.contains(container.title)) {
				addWarning(adapter.getIdByString(container.id), '''"«container.title»" is not unique''')
			}
			picFileNames.add(container.title)
	}
	
}