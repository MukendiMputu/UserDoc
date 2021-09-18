package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.features.main.feature.FeatureGraphModel
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IPath

/**
 * @author Mukendi Mputu
 */
class Generate implements IGenerator<FeatureGraphModel> {

	/*	*/
	override generate(FeatureGraphModel model, IPath srcGenPath, IProgressMonitor arg2) {
		new UserDocProjectGenerator(model).createProject
	}
	
}
