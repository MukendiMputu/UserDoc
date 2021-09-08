package info.scce.cinco.product.userdocumentation.codegen

import de.jabc.cinco.meta.plugin.template.ProjectTemplate
import info.scce.cinco.product.features.main.feature.FeatureGraphModel
import de.jabc.cinco.meta.core.utils.projects.ProjectCreator

class UserDocProjectGenerator extends ProjectTemplate {
	val FeatureGraphModel model
	
	new(FeatureGraphModel model) {
		this.model = model
	}
	
	override protected _projectDescription() {
		project(ProjectCreator.getProject(model.eResource).name) [
			
			deleteIfExistent = false
			
			natures = #[
			'org.eclipse.m2e.core.maven2Nature',
			'org.eclipse.jdt.core.javanature',
			'org.eclipse.xtext.ui.shared.xtextNature'
			]
			
			requiredBundles = #[
				'com.google.guava',
				'org.eclipse.xtext.xbase.lib',
				'org.eclipse.xtend.lib',
				'org.eclipse.xtend.lib.macro'
			]
			
			folder('src2') [
				deleteIfExistent = false
				isSourceFolder = true
				
				pkg('com.test.main')[
					file(new MainGenerator(model)/*,overwrite=false*/)
				]
			]
		]
	}
	
	override protected _projectName() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}