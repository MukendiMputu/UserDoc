package info.scce.cinco.product.userdocumentation.checks

import info.scce.cinco.product.usersequence.main.mcam.adapter.DocGraphModelAdapter
import info.scce.cinco.product.usersequence.main.mcam.adapter.DocGraphModelId
import java.util.ArrayList

class CheckInterruptedDocGraphSequence extends UserDocCheck<DocGraphModelId, DocGraphModelAdapter> {
	
	ArrayList<String> picFileNames = new ArrayList
	
	override doExecute(DocGraphModelAdapter adapter) {
		
	}
	
	override init() {
		picFileNames.clear
	}

	
}