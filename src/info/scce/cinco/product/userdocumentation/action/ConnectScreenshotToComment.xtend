package info.scce.cinco.product.userdocumentation.action

import de.jabc.cinco.meta.runtime.action.CincoCustomAction
import info.scce.cinco.product.usersequence.main.doc.Screenshot
import graphmodel.Node


/**
 * The intent is to automatically connect a ScreenshotNode
 * to the CommentNode once it's been assigned in the property view.
 */
class ConnectScreenshotToComment extends CincoCustomAction<Node> {
	override execute(Node it){
		if (it instanceof Screenshot){
			println('''Connecting Screenshot node «(it as Screenshot).id» to «(it as Screenshot).description»''')
			(it as Screenshot).description.newAnchor((it as Screenshot))
		}
		
	}

	override hasDoneChanges() {
		false
	}
}