package info.scce.cinco.product.userdocumentation.checks

import info.scce.cinco.product.usersequence.main.doc.EndNode
import info.scce.cinco.product.usersequence.main.doc.StartNode
import info.scce.cinco.product.usersequence.main.doc.WebElement
import info.scce.cinco.product.usersequence.main.mcam.adapter.DocGraphModelAdapter
import info.scce.cinco.product.usersequence.main.mcam.adapter.DocGraphModelId

/**
 * Based on info.scce.cinco.product.minidime.process.checks.LoopCheck
 */

class CheckInterruptedDocGraphSequence extends UserDocCheck<DocGraphModelId, DocGraphModelAdapter> {
	
	
	override doExecute(DocGraphModelAdapter adapter) {
		for (id : adapter.entityIds) {
			val obj = id.element
			switch obj {
				StartNode
					case obj.getOutgoing.empty:
						addWarning(id, 'no branch connector')
				EndNode
					case obj.getIncoming.empty:
						addWarning(id, 'no outgoing control flow')
				WebElement
					case obj.getIncoming.empty || obj.getIncoming.empty:
						addWarning(id, 'no incoming control flow')
			}
		}
		processResults
	}
	
	override init() {
	}

	
}