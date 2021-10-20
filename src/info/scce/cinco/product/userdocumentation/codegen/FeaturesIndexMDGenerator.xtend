package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate
import info.scce.cinco.product.features.main.feature.FeatureGraphModel

class FeaturesIndexMDGenerator extends UserDocFileTemplate {
	
	
	val FeatureGraphModel model 
	new (FeatureGraphModel ftModel){
		this.model = ftModel
	}
	
	
	override fileName() {
		'''index.md'''
	}
	
	override fileTemplate() {
		'''
		# Introduction
		
		«model.documenation»
		'''
	}
		
}