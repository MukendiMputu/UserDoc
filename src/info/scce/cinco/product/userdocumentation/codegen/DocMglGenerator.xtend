package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.usersequence.main.doc.*
import graphmodel.Node
import info.scce.cinco.product.usersequence.main.doc.DocGraphModel
import static extension info.scce.cinco.product.userdocumentation.codegen.NameExtension.*

class DocMglGenerator implements IGenerator<DocGraphModel> {
	def static String getCode(DocGraphModel model)'''
	«FOR start : model.starts»
		«val nodeSeq = start.extractSequence»
		«FOR node : nodeSeq»
		«getNodeCode(node)»
		«ENDFOR»
	«ENDFOR»
	''' 
	
	def static String getNodeCode(Node node)'''
		«switch (node.eClass.name) {
						case "StartNode" : '''openBrowser();'''
						case "EndNode" : '''closeBrowser();'''
						case "SubDoc": getCode((node as SubDoc).subDoc)
						case "Navigation": '''goToPage("«(node as Navigation).link»");'''
						case "Input": '''typeIn("«(node as Input).id»", ""«(node as Input).content»");'''
						case "Screenshot": '''takePageScreenshot("«»", "«»"); // Screenshot'''
						case "Button": '''clickBtn("«(node as Button).selector»", "«(node as Button).value»");'''
						case "SelectBox": '''select();'''
					//	case "SectionNode": (node as SectionNode).allNodes.forEach[getNodeCode]
				}
				»
	'''
	
	override generate(DocGraphModel arg0, IPath arg1, IProgressMonitor arg2) {
		throw new RuntimeException("No Generator available for this type of model.")
	}
		
}
