package info.scce.cinco.product.userdocumentation.codegen

import de.jabc.cinco.meta.plugin.template.ProjectTemplate
import de.jabc.cinco.meta.core.utils.projects.ProjectCreator
import info.scce.cinco.product.features.main.feature.FeatureGraphModel
import static extension info.scce.cinco.product.userdocumentation.codegen.NameExtension.*

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
			
			folder('src-gen') [
				deleteIfExistent = true
				isSourceFolder = true
				folder('src') [
					pkg(mainJavaPackage)[
						file(new SeleniumScriptGenerator(model), true)
					]
					pkg(mainResourcePackage)[]
					
					pkg(testJavaPackage)[
					]
					
					folder(ProjectCreator.getProject(model.eResource).name)[
						forEachOf(model.featureContainers) [ f |
							file(new MarkdownGenerator(f), true)
						]
					]					
				]
				
				file(new PomXMLGenerator(), true)
				file(new ClassPathFileGenerator(), true)
				file(new ProjectFileGenerator(), true)
			]
		]
	}
	
	override protected _projectName() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}