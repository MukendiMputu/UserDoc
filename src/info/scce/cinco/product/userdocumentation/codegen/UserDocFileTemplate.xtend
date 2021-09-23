package info.scce.cinco.product.userdocumentation.codegen

import de.jabc.cinco.meta.plugin.template.FileTemplate

abstract class UserDocFileTemplate extends FileTemplate{
	
	override getTargetFileName() {
		fileName
	}
	
	def String fileName() 
	
	override template() {
	'''
		«fileTemplate»
	'''
	}
	
	def String fileTemplate()
	
}