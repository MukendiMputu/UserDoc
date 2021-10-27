package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.features.main.feature.FeatureGraphModel
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.IPath
import de.jabc.cinco.meta.core.utils.projects.ProjectCreator
import static extension info.scce.cinco.product.userdocumentation.codegen.HelperExtension.getCleanFileOrFolderName
import info.scce.cinco.product.usersequence.main.doc.SubDoc

/**
 * @author Mukendi Mputu
 */
class Generate implements IGenerator<FeatureGraphModel> {

	override generate(FeatureGraphModel model, IPath srcGenPath, IProgressMonitor arg2) {
		new UserDocProjectGenerator(model).createProject
		for (f : model.featureContainers) {
			val fPath = ProjectCreator.getProject(model.eResource).rawLocation+ "/src-gen/documentation/docs/src/features/"+f.title.cleanFileOrFolderName
			for (doc : f.docNodes) {
				for (sc : doc.mgl.screenshots) {
					new ImagePlaceholder(fPath, sc.pictureName.cleanFileOrFolderName).fileTemplate
				}
				for (subDocGraph : doc.mgl.subDocs){
					subDocGraph.getScreenshots(fPath)
				}
			}
		}
	}
	
	/*
	 * Gets screenshots of subdocgraph model recursively, if the createScreentshots attribute
	 * is set to true.
	 * 
	 * @params SuDoc subGraph, String path
	 */
	def void getScreenshots(SubDoc subGraph, String path) {
		if(subGraph.createScreenshots) {
			for(sc : subGraph.subDoc.screenshots) {
				new ImagePlaceholder(path, sc.pictureName.cleanFileOrFolderName).fileTemplate
			}
		}
		var subGraphIterator = subGraph.subDoc.subDocs.iterator
		while(subGraphIterator.hasNext){
			subGraphIterator.next.getScreenshots(path)
		}
	}
}
