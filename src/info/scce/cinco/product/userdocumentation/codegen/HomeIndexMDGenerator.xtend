package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate

class HomeIndexMDGenerator extends UserDocFileTemplate {
	
	new () {}
	
	override fileName() {
		'''index.md'''
	}
	
	override fileTemplate() {
		
		'''
		---
		home: true
		heroImage: 
		tagline: end-user documentation project
		actionText: Quick Start →
		actionLink: /features/
		---		
		'''
	}
		
}