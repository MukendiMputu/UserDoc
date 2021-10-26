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
					folder(mainPackage)[
						folder('java')[
							pkg(applicationPackage)[
								file(new SeleniumScriptGenerator(model), true)
							]
						]
						folder('resources')[]						
					]
					
					folder(testPackage)[
						folder('java')[]
						folder('resources')[]
					]
					
				]
					
				folder('documentation')[
					folder('docs') [
						folder('src') [
							folder('.vuepress')[
								folder('components')[]
								folder('theme')[]
								folder('public')[
									file(new SVGGenerator(), true)
								]
								folder('styles')[
									file(new IndexStylusFileGenerator(), true)
									file(new PaletteStylusFileGenerator(), true)
								]
								folder('templates ')[]
								file(new ConfigJSGenerator(model), true)
							]
							folder('assets/img')[
							]
							folder('features') [
								forEachOf(model.featureContainers) [ f |
									folder(f.title.cleanFileOrFolderName)[
										file(new IndexMDGenerator(f), true)
										forEachOf(f.docNodes) [doc |
											forEachOf(doc.mgl.screenshots) [ shot |
												file(new ImagePlaceholder(shot.pictureName.cleanFileOrFolderName), true)
											]
										]
									]
								]
								file(new FeaturesIndexMDGenerator(model), true)
							]
							file(new HomeIndexMDGenerator(), true)
						]
						file(new PackageJSONGenerator(), true)
						// file(new GitIgnore(), true)
					]
				]					
				
				file(new PomXMLGenerator(), true)
				file(new ClassPathFileGenerator(), true)
				file(new ProjectFileGenerator(model), true)
			]
		]
	}
	
	override projectSuffix() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}

