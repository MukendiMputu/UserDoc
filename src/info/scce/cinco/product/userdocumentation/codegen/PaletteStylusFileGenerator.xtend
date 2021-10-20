package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate

class PaletteStylusFileGenerator extends UserDocFileTemplate {
	
	
	override fileName() {
		'''palette.styl'''
	}
	
	override fileTemplate() {
		'''
		/**
		 * Custom palette here.
		 *
		 * ref：https://v1.vuepress.vuejs.org/zh/config/#palette-styl
		 */
		
		$accentColor = #14c4bb
		$textColor = #2c3e50
		$borderColor = #eaecef
		$codeBgColor = #282c34
		'''
	}
	
}