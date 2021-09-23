package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate
import info.scce.cinco.product.features.main.feature.FeatureGraphModel

class MarkdownGenerator extends UserDocFileTemplate {
	
	val FeatureGraphModel featureModel
	
	new (FeatureGraphModel ftModel){
		this.featureModel = ftModel
	}
	
	override fileName() {
		'''«modelName».md'''
	}
	
	override fileTemplate() {
		'''
		# «modelName»
		'''
	}
	
	def String modelName()'''
	«featureModel.modelName.nullOrEmpty? 'UnknownModel' : this.featureModel.modelName»
	'''
}