package info.scce.cinco.product.userdocumentation.action

import de.jabc.cinco.meta.runtime.action.CincoCustomAction
import graphmodel.Node
import info.scce.cinco.product.features.main.feature.DocNode
import info.scce.cinco.product.usersequence.main.doc.SubDoc

class DocNodeOpenSubmodel extends CincoCustomAction<Node> {
	override execute(Node it){
		println('''Opening submodel for «it.eClass.name»''')
		switch it {
			DocNode : mgl
			SubDoc : subDoc
		}.openEditor
	}

	override hasDoneChanges() {
		false
	}
}