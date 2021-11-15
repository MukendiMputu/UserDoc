package info.scce.cinco.product.userdocumentation.action

import info.scce.cinco.product.usersequence.main.doc.WebElement


/**
 * This class execute method is triggered by the event postAttributeChange.
 * It checks whether the node emitting the event has it attribute highlighted changed,
 * and eventually adds a HighlightNode to it.
 * 
 * The idea was to synchronize highlighting through the property view and through the HighlightNode.
 */

class AddHighlightNode extends UserDocCustomAction<WebElement> {
	
	override execute(WebElement element) {
		
		
	}
	
}