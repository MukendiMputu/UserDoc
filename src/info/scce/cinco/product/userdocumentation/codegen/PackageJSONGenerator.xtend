package info.scce.cinco.product.userdocumentation.codegen


class PackageJSONGenerator extends UserDocFileTemplate {
	
	override fileName() {
		'''package.json'''
	}
	
	override fileTemplate() {
		'''
		{
		  "name": "documentation",
		  "version": "0.0.1",
		  "description": "end-user documentation project",
		  "main": "index.js",
		  "authors": {
		    "name": "CINCO SCCE",
		    "email": ""
		  },
		  "scripts": {
		    "dev": "vuepress dev src",
		    "build": "vuepress build src"
		  },
		  "license": "MIT",
		  "devDependencies": {
		    "vuepress": "^1.5.3"
		  }
		}
		'''
	}
	
}