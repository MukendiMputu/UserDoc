package info.scce.cinco.product.userdocumentation.codegen

import de.jabc.cinco.meta.plugin.template.ProjectTemplate
import de.jabc.cinco.meta.core.utils.projects.ProjectCreator
import info.scce.cinco.product.features.main.feature.FeatureGraphModel
import static extension info.scce.cinco.product.userdocumentation.codegen.HelperExtension.*

class UserDocProjectGenerator extends ProjectTemplate {
	val FeatureGraphModel model
	new(FeatureGraphModel model) {
		this.model = model
	}
	
	override projectDescription() {
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
					folder(mainJavaPackage)[						
						pkg(applicationPackage)[
							file(new SeleniumScriptGenerator(model), true)
						]
					]
					folder(mainResourcePackage)[]
					
					folder(testJavaPackage)[
					]
					
					folder(testJavaPackage)[
					]
					
					folder(ProjectCreator.getProject(model.eResource).name)[
						forEachOf(model.featureContainers) [ f |
							folder(f.title)[
								file(new MarkdownGenerator(f), true)
							]
						]
					]					
				]
				file(new PomXMLGenerator(), true)
				file(new ClassPathFileGenerator(), true)
				file(new ProjectFileGenerator(), true)
			]
		]
	}
	
	def projectName() {
		model.projectName
	}
	
	override projectSuffix() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}