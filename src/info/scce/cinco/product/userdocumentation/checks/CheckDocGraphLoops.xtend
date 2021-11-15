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
	var HashMap<Node, Integer> cycleDepth = new HashMap

	override doExecute(DocGraphModelAdapter adapter) {
		this.adapter = adapter
		for (id : adapter.entityIds) {
			val obj = id.element
			if (obj instanceof DocGraphModel) {
				obj.traverseDocGraphSequence
				obj.analyzeCycleDepth
			}
		}
	}

	def private void analyzeCycleDepth(DocGraphModel model) {
		for (node : cycleDepth.keySet) {
			val preNode = node.predecessors.head
			if (cycleDepth.get(node) !== null
					&& cycleDepth.get(preNode) !== null
					&& cycleDepth.get(node) < cycleDepth.get(preNode)) {
				addError(adapter.getIdByString(model.id), 'Cycle detected in graph model')
			}
		}
	}

	def private void traverseDocGraphSequence(DocGraphModel model) {
		for (startNd : model.startNodes) {
			cycleDepth.put(startNd, 0)
			var succ = startNd.successors.head
			while (!(succ instanceof EndNode)) {
				succ.hasAlreadyBeenVisited(cycleDepth.get(startNd))
				succ = succ.successors.head	
			}
		}
	}
		
	
	def private void hasAlreadyBeenVisited(Node node, Integer depth){
		
		if(visitedNodes.contains(node)){return}
		visitedNodes.add(node)
		cycleDepth.put(node, depth)
		
		if (node instanceof SubDoc) {
			cycleDepth.put(node, depth + 1)
			node.subDoc.traverseDocGraphSequence
		}
	}

	override init() {
		visitedNodes.clear
		cycleDepth.clear
	}

}
