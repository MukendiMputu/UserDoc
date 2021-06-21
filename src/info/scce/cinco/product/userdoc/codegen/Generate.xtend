package info.scce.cinco.product.userdoc.codegen

import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.userdoc.mglid.userdoc.UserDocGraphModel
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IPath
import org.eclipse.core.resources.ResourcesPlugin
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import info.scce.cinco.product.userdoc.codegen.PomXMLGenerator
import info.scce.cinco.product.userdoc.codegen.MavenStructureGenerator
import info.scce.cinco.product.userdoc.codegen.PackageGenerator 

class Generate implements IGenerator<UserDocGraphModel> {
	
    IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot();
    IProject project
	
	override generate(UserDocGraphModel model, IPath targetDir, IProgressMonitor monitor) {
		if (model.userDocGraphModelView.modelName.nullOrEmpty)
			throw new RuntimeException("Model's name cannot be empty!")
		
		val modelName = model.userDocGraphModelView.modelName
		
		// get the containing folder of the target directory, which is the project directory
		project = root.getContainerForLocation(targetDir).getProject()
		
		/* generate pom.xml file */
		PomXMLGenerator.generateCode(project)
		
		// generate model information files
		val modelInfo = generateModelInfo(model)
		val modelInfoTextFile = root.getFileForLocation(targetDir.append( modelName + ".txt"))
		EclipseFileUtils.writeToFile(modelInfoTextFile, modelInfo)
		
		/* generate maven project structure */
		MavenStructureGenerator.generateMavenStructure(project, monitor)
		
		PackageGenerator.generateJavaPackages("com/example/config", project, monitor)
		// generateTestPackages("/com/example/test", project, monitor)
		
		// generatePages()
		
		
		// generateSite()
		
		// generateConfig()
		
		// generateAutomationClass()
		
	}
	
	private def generateModelInfo(UserDocGraphModel model) '''
		=== «model.userDocGraphModelView.modelName» ===

		The model contains «model.allNodes.size» nodes. Here's some general information about them:

		«FOR node : model.allNodes»
			* node «node.id» of type '«node.eClass.name»' with «node.successors.size» successors and «node.predecessors.size» predecessors
		«ENDFOR»
	'''
	
}