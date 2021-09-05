package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.IProgressMonitor
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.usersequence.main.usersequence.Navigation
import info.scce.cinco.product.usersequence.main.usersequence.Input
import info.scce.cinco.product.usersequence.main.usersequence.Screenshot
import info.scce.cinco.product.usersequence.main.usersequence.Button
import info.scce.cinco.product.usersequence.main.usersequence.SelectBox
import info.scce.cinco.product.usersequence.main.usersequence.UserSequenceGraphModel
import java.util.List
import graphmodel.Node
import java.util.LinkedList

class Generate2 implements IGenerator<UserSequenceGraphModel> {

	def generate(UserSequenceGraphModel model)'''
			«FOR node : model.allNodes»
			«switch (node.eClass.name) {
					case "Navigation": 
						"goToPage();"
					case "Input": 
						"typeIn();"
					case "Screenshot": 
						"takeScreenshot();"
					case "Button": 
						"click();"
					case "SelectBox": 
						"select();"
			}
			»
			«ENDFOR»
	''' 
	
	
	override generate(UserSequenceGraphModel arg0, IPath arg1, IProgressMonitor arg2) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
