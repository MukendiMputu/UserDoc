package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate
import info.scce.cinco.product.features.main.feature.FeatureContainer

class IndexMDGenerator extends UserDocFileTemplate {
	
	val FeatureContainer featureCont
	
	new (FeatureContainer ftContainer){
		this.featureCont = ftContainer
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
		
		This feature starts with the "«featureCont.starts.head.docNodeSuccessors.head.mgl.modelName»" sequence.
		
		## section 1
		
		[image-1](./1.png)
		
		here comes the description for the image shown above.
		
		[image-2](./2.png)
		
		here comes the second description for the image shown above.
		
		'''
	}
		
}