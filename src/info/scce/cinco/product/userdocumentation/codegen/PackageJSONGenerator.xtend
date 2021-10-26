package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.features.main.feature.FeatureGraphModel
import static extension info.scce.cinco.product.userdocumentation.codegen.HelperExtension.getCleanFileOrFolderName

class PackageJSONGenerator extends UserDocFileTemplate {
	
	override fileName() {
		'''package.json'''
	}
	
	override fileTemplate() {
		'''
		{
		  "name": "documentation",
		  "version": "0.0.1",
		  "description": "End-user Documentation",
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

class ConfigJSGenerator extends UserDocFileTemplate  {
	
	val FeatureGraphModel model
	
	new (FeatureGraphModel ftModel) {
		model = ftModel
	}
	override fileName() {
		'''config.js'''
	}
	
	override fileTemplate() {
		'''
		const { description } = require('../../package')
		
		module.exports = {
		  /**
		   * Ref：https://v1.vuepress.vuejs.org/config/#title
		   */
		  title: '«model.IResource.project.name» Wiki',
		  /**
		   * Ref：https://v1.vuepress.vuejs.org/config/#description
		   */
		  description: description,
		
		  /**
		   * Extra tags to be injected to the page HTML `<head>`
		   *
		   * ref：https://v1.vuepress.vuejs.org/config/#head
		   */
		  head: [
		    ['meta', { name: 'theme-color', content: '#14c4bb' }],
		    ['meta', { name: 'apple-mobile-web-app-capable', content: 'yes' }],
		    ['meta', { name: 'apple-mobile-web-app-status-bar-style', content: 'black' }]
		  ],
		
		  /**
		   * Theme configuration, here is the default theme configuration for VuePress.
		   *
		   * ref：https://v1.vuepress.vuejs.org/theme/default-theme-config.html
		   */
		  themeConfig: {
		    repo: '',
		    editLinks: false,
		    docsDir: '',
		    editLinkText: '',
		    lastUpdated: false,
		    nav: [
		      {
		        text: 'Features',
		        prefix: '/features/',
		        icon: "info",
		        items: [
		          «FOR feature : model.featureContainers SEPARATOR ',' AFTER ''»
		          { text: "«feature.title»", link: "«feature.title.cleanFileOrFolderName»/" }
		          «ENDFOR»
		        ],
		      },
		      {
		        text: 'Cinco SCCE',
		        link: 'https://gitlab.com/scce/cinco/-/wikis/home'
		      }
		    ],
		    sidebar: {
		      '/features/': [
		        {
		          title: 'App Features',
		          collapsable: false,
		          children: [
		            '',
		            «FOR feature : model.featureContainers SEPARATOR ',' AFTER ''»
		            '«feature.title.cleanFileOrFolderName»/'
		            «ENDFOR»
		          ]
		        }
		      ],
		    }
		  },
		
		  /**
		   * Apply plugins，ref：https://v1.vuepress.vuejs.org/zh/plugin/
		   */
		  plugins: [
		    '@vuepress/plugin-back-to-top',
		    '@vuepress/plugin-medium-zoom',
		  ]
		}	
		'''
	}
	
}