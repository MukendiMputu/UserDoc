package info.scce.cinco.product.userdocumentation.checks

import graphmodel.Node
import info.scce.cinco.product.usersequence.main.doc.DocGraphModel
import info.scce.cinco.product.usersequence.main.doc.EndNode
import info.scce.cinco.product.usersequence.main.doc.SubDoc
import info.scce.cinco.product.usersequence.main.mcam.adapter.DocGraphModelAdapter
import info.scce.cinco.product.usersequence.main.mcam.adapter.DocGraphModelId
import java.util.ArrayList
import java.util.HashMap

/**
 * Based on info.scce.cinco.product.minidime.process.checks.LoopCheck
 */
class CheckDocGraphLoops extends UserDocCheck<DocGraphModelId, DocGraphModelAdapter> {

	var DocGraphModelAdapter adapter
	var ArrayList<Node> visitedNodes = new ArrayList
	var HashMap<Node, Integer> nodeDepths = new HashMap

	override doExecute(DocGraphModelAdapter adapter) {
		this.adapter = adapter
		for (id : adapter.entityIds) {
			val obj = id.element
			if (obj instanceof DocGraphModel) {
				obj.traverseDocGraphSequence
			}
		}
	}


	def private void traverseDocGraphSequence(DocGraphModel model) {
		for (startNd : model.startNodes) {
			nodeDepths.put(startNd, 0)
			var succ = startNd.successors.head
			while (!(succ instanceof EndNode)) {
				if(visitedNodes.contains(succ)){
					println("++++ Yes, "+succ.eClass.name+" (id: "+succ.id+") has already been visited. +++++") 
					addError(adapter.getIdByString(model.id), 'Cycle detected in graph model.')
					return
				}
				
				visitedNodes.add(succ)
				nodeDepths.put(succ, 0)
				
				if (succ instanceof SubDoc) {
					nodeDepths.put(succ, nodeDepths.get(startNd)+1)
					succ.subDoc.traverseDocGraphSequence
				}
				succ = succ.successors.head	
			}
		}
	}

	override init() {
		visitedNodes.clear
		nodeDepths.clear
	}

}
