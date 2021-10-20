package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate

class IndexStylusFileGenerator extends UserDocFileTemplate {
	
	
	override fileName() '''index.styl'''
	
	override fileTemplate() {
		'''
		/**
		 * Custom Styles here.
		 *
		 * ref：https://v1.vuepress.vuejs.org/config/#index-styl
		 */
		
		.home .hero img
		  max-width 450px!important''
		'''
	}
	
}