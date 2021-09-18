package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.usersequence.main.doc.DocGraphModel

class DocMglGenerator implements IGenerator<DocGraphModel> {
	
	override generate(DocGraphModel arg0, IPath arg1, IProgressMonitor arg2) {
		throw new RuntimeException("No Generator available for this type of model.")
	}
		
}
