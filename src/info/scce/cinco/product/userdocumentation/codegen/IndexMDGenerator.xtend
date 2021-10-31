package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate
import info.scce.cinco.product.features.main.feature.FeatureContainer
import info.scce.cinco.product.usersequence.main.doc.DocGraphModel
import static extension info.scce.cinco.product.userdocumentation.codegen.HelperExtension.getDocumentationText

class IndexMDGenerator extends UserDocFileTemplate {
	
	val DocGraphModel firstUserSequence 
	val FeatureContainer featureCont
	val Boolean firstGraphCreatesScreenshots
	
	new (FeatureContainer ftContainer){
		this.featureCont = ftContainer
		this.firstUserSequence = featureCont.starts.head.docNodeSuccessors.head.mgl
		this.firstGraphCreatesScreenshots = featureCont.starts.head.docNodeSuccessors.head.createScreenshots
	}
	
	def String featureName() {
		return featureCont.title.nullOrEmpty? 'UnknownFeature' : this.featureCont.title	
	}
	
	override fileName() {
		'''index.md'''
	}
	
	override fileTemplate() {
		'''
		# «featureName»
		
		«featureCont.documentation»
		
		## «firstUserSequence.modelName»
		
		«firstUserSequence.getDocumentationText(firstGraphCreatesScreenshots)»
		
		'''
	}
		
}