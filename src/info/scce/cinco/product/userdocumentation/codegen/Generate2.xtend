package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.ResourcesPlugin
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.usersequence.main.usersequence.UserSequenceGraphModel

class Generate2 implements IGenerator<UserSequenceGraphModel> {

	override generate(UserSequenceGraphModel model, IPath targetDir, IProgressMonitor monitor) {

		if (model.modelName.nullOrEmpty)
			throw new RuntimeException("Model's name must be set.")

		val code = generateCode(model);
		val targetFile = ResourcesPlugin.workspace.root.getFileForLocation(targetDir.append(model.modelName + ".txt"))

		EclipseFileUtils.writeToFile(targetFile, code)

	}
	
	// TODO: implement correct template methods
	private def generateCode(UserSequenceGraphModel model) '''
		=== «model.modelName» ===

		The model contains «model.allNodes.size» nodes. Here's some general information about them:

		«FOR node : model.allNodes»
			* node «node.id» of type '«node.eClass.name»' with «node.successors.size» successors and «node.predecessors.size» predecessors
		«ENDFOR»
	'''

}
