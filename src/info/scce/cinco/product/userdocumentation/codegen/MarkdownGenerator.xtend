package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate
import info.scce.cinco.product.features.main.feature.FeatureContainer

class MarkdownGenerator extends UserDocFileTemplate {
	
	val FeatureContainer featureCont
	
	new (FeatureContainer ftContainer){
		this.featureCont = ftContainer
	}
	
	def String featureName() {
		return featureCont.title.nullOrEmpty? 'UnknownFeature' : this.featureCont.title	
	}
	
		override fileName() {
		'''«featureName.trim».md'''
	}
	
	override fileTemplate() {
		
		'''
		# «featureName»
		
		This feature starts with the sequence «featureCont.starts.head.docNodeSuccessors.head.mgl.modelName».
		 
		'''
	}
		
}