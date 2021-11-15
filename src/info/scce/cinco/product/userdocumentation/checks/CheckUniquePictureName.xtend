package info.scce.cinco.product.userdocumentation.checks

import info.scce.cinco.product.usersequence.main.doc.Screenshot
import info.scce.cinco.product.usersequence.main.mcam.adapter.DocGraphModelAdapter
import info.scce.cinco.product.usersequence.main.mcam.adapter.DocGraphModelId
import java.util.ArrayList

/**
 * Based on info.scce.cinco.product.minidime.process.checks.UniqueName
 */
class CheckUniquePictureName extends UserDocCheck<DocGraphModelId, DocGraphModelAdapter> {
	
	ArrayList<String> picFileNames = new ArrayList
	
	override doExecute(DocGraphModelAdapter adapter) {
		for (id : adapter.entityIds) {
			switch obj : id.element {
				Screenshot: {
					adapter.checkFileNames(obj)
				}
			}
		}
		
	}
	
	override init() {
		picFileNames.clear
	}
	
	def private void checkFileNames(DocGraphModelAdapter adapter, Screenshot capture) {
		if (picFileNames.contains(capture.pictureName)) {
				addWarning(adapter.getIdByString(capture.id), '''"«capture.pictureName»" is not unique''')
			}
			picFileNames.add(capture.pictureName)
	}
	
}