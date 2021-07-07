package info.scce.cinco.product.userdoc.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.ResourcesPlugin
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.function.mglid.function.FunctionGraphModel

class GenerateFunction implements IGenerator<FunctionGraphModel> {
	
	IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot();
	IProject project
	
	override generate(FunctionGraphModel model, IPath targetDir, IProgressMonitor monitor) {
		if (model.functionGraphModelView.modelName.nullOrEmpty)
			throw new RuntimeException("Model's name cannot be empty!")
		
		val modelName = model.functionGraphModelView.modelName
		
		// get the containing folder of the target directory, which is the project directory
		this.project = root.getContainerForLocation(targetDir).getProject()
		
		// generate model information files  
		val modelInfo = generateModelInfo(model)
		val modelInfoTextFile = root.getFileForLocation(targetDir.append( modelName + ".txt"))
		EclipseFileUtils.writeToFile(modelInfoTextFile, modelInfo)
	}

	private def generateModelInfo(FunctionGraphModel model) '''
		=== «model.functionGraphModelView.modelName» ===

		The model contains «model.allNodes.size» nodes. Here's some general information about them:

		«FOR node : model.allNodes»
			* node «node.id» of type '«node.eClass.name»' with «node.successors.size» successors and «node.predecessors.size» predecessors
				«IF node.eContainingFeature.EType.equals("container")»
					Contains object(s):
					«FOR containedObj : node.eContents»
						- '«containedObj.eClass.name»'
					«ENDFOR»
				«ENDIF»
		«ENDFOR»
	'''
}