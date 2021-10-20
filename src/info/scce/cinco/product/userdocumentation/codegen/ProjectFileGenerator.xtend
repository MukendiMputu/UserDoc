package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.features.main.feature.FeatureGraphModel

class ProjectFileGenerator extends UserDocFileTemplate {
	
	val FeatureGraphModel featureModel
	
	new (FeatureGraphModel model) {
		featureModel = model
	}
	
	override fileName() {
		'''.project'''
	}
	
	override fileTemplate() {
		'''
		<?xml version="1.0" encoding="UTF-8"?>
		<projectDescription>
			<name>«featureModel.project.name»</name>
			<comment></comment>
			<projects>
			</projects>
			<buildSpec>
				<buildCommand>
					<name>org.eclipse.jdt.core.javabuilder</name>
					<arguments>
					</arguments>
				</buildCommand>
				<buildCommand>
					<name>org.eclipse.m2e.core.maven2Builder</name>
					<arguments>
					</arguments>
				</buildCommand>
			</buildSpec>
			<natures>
				<nature>org.eclipse.jdt.core.javanature</nature>
				<nature>org.eclipse.m2e.core.maven2Nature</nature>
			</natures>
		</projectDescription>
		'''
	}
	
}