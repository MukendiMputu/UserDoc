package info.scce.cinco.product.userdocumentation.checks

import info.scce.cinco.product.usersequence.main.doc.EndNode
import info.scce.cinco.product.usersequence.main.doc.Highlight
import info.scce.cinco.product.usersequence.main.doc.Navigation
import info.scce.cinco.product.usersequence.main.doc.Screenshot
import info.scce.cinco.product.usersequence.main.doc.SectionNode
import info.scce.cinco.product.usersequence.main.doc.StartNode
import info.scce.cinco.product.usersequence.main.doc.SubDoc
import info.scce.cinco.product.usersequence.main.doc.Timer
import info.scce.cinco.product.usersequence.main.doc.UnHighlight
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
						addWarning(id, 'missing outgoing connector')
				EndNode
					case obj.getIncoming.empty:
						addWarning(id, 'missing incoming connector')
				SubDoc
					case obj.getIncoming.empty || obj.getOutgoing.empty:
						addWarning(id, 'missing incoming/outgoing control flow')
				Highlight
					case obj.getIncoming.empty || obj.getOutgoing.empty:
						addWarning(id, 'missing incoming/outgoing control flow')
				UnHighlight
					case obj.getIncoming.empty || obj.getOutgoing.empty:
						addWarning(id, 'missing incoming/outgoing control flow')
				Screenshot
					case obj.getIncoming.empty || obj.getOutgoing.empty:
						addWarning(id, 'missing incoming/outgoing control flow')
				Timer
					case obj.getIncoming.empty || obj.getOutgoing.empty:
						addWarning(id, 'missing incoming/outgoing control flow')
				SectionNode
					case obj.getIncoming.empty || obj.getOutgoing.empty:
						addWarning(id, 'might need an incoming/outgoing edge')
				Navigation
					case obj.getIncoming.empty || obj.getOutgoing.empty:
						addWarning(id, 'missing incoming/outgoing control flow')
				WebElement
					case obj.getIncoming.empty || obj.getOutgoing.empty:
						addWarning(id, 'missing incoming/outgoing control flow')
			}
		}
		processResults
	}
	
	override init() {
	}

	
}