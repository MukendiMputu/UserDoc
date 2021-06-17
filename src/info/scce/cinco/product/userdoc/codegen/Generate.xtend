package info.scce.cinco.product.userdoc.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.userdoc.mglid.userdoc.UserDocGraphModel

class Generate implements IGenerator<UserDocGraphModel>{

	IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot();

	override generate(UserDocGraphModel model, IPath targetDir, IProgressMonitor monitor){
		val model_name = model.modelName
		
		if (model_name.nullOrEmpty)
			throw new RuntimeException("Model's name cannot be empty!")

		// generate model information files  
		val modelInfo = generateModelInfo(model)
		val modelInfoTextFile = root.getFileForLocation(targetDir.append( model_name + ".txt"))
		EclipseFileUtils.writeToFile(modelInfoTextFile, modelInfo)
	}

	private def generateModelInfo(UserDocGraphModel model) '''
		=== «model.modelName» ===

		The model contains «model.allNodes.size» nodes. Here's some general information about them:

		«FOR node : model.allNodes»
			* node «node.id» of type '«node.eClass.name»' with «node.successors.size» successors and «node.predecessors.size» predecessors
		«ENDFOR»
	'''
}