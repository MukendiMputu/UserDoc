package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.ResourcesPlugin
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel

class GenerateFunction implements IGenerator<UserSequenceGraphModel> {
	
	IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot();
	IProject project
	
	override generate(UserSequenceGraphModel model, IPath targetDir, IProgressMonitor monitor) {
		if (model.modelName.nullOrEmpty)
			throw new RuntimeException("Model's name cannot be empty!")
		
		val modelName = model.modelName
		
		// get the containing folder of the target directory, which is the project directory
		this.project = root.getContainerForLocation(targetDir).getProject()
		
		// generate model information files  
		val modelInfo = generateModelInfo(model)
		val modelInfoTextFile = root.getFileForLocation(targetDir.append( modelName + ".txt"))
		EclipseFileUtils.writeToFile(modelInfoTextFile, modelInfo)
	}

	private def generateModelInfo(UserSequenceGraphModel model) '''
		=== «model.modelName» ===

		The model has «model.allNodes.size» nodes. Here's some general information about them:

		«FOR node : model.allNodes»
			* node «node.id» of type '«node.eClass.name»' with «node.successors.size» successors and «node.predecessors.size» predecessors
			««« 	«FOR el : »
					Contains object(s):
					««« «FOR containedObj : node.eContents»
					«««	- '«containedObj.eClass.name»'
					««« «ENDFOR»»»»
					«node.internalElement.eClass.name»
			««« 	«ENDFOR»
		«ENDFOR»
	'''
}