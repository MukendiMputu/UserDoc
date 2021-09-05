package info.scce.cinco.product.userdocumentation.action

import de.jabc.cinco.meta.runtime.action.CincoCustomAction
import graphmodel.Node
import info.scce.cinco.product.features.main.features.DocNode
import info.scce.cinco.product.usersequence.main.usersequence.SubSequence

class DocNodeOpenSubmodel extends CincoCustomAction<Node> {
	override execute(Node it){
		println('''Opening submodel for «it.eClass.name»''')
		switch it {
			DocNode : mgl
			SubSequence : subSequence
		}.openEditor
	}

	override hasDoneChanges() {
		false
	}
}