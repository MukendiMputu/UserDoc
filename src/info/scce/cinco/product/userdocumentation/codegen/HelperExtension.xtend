package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.features.main.feature.WebDriver
import graphmodel.Node
import java.util.List
import java.util.LinkedList
import info.scce.cinco.product.usersequence.main.doc.DocGraphModel
import info.scce.cinco.product.usersequence.main.doc.SubDoc
import info.scce.cinco.product.usersequence.main.doc.Navigation
import info.scce.cinco.product.usersequence.main.doc.Input
import info.scce.cinco.product.usersequence.main.doc.Button
import graphmodel.GraphModel
import info.scce.cinco.product.features.main.feature.FeatureContainer
import info.scce.cinco.product.usersequence.main.doc.EndNode
import info.scce.cinco.product.features.main.feature.DocNode
import info.scce.cinco.product.usersequence.main.doc.Form
import info.scce.cinco.product.usersequence.main.doc.SectionNode
import info.scce.cinco.product.usersequence.main.doc.Screenshot

//import java.util.ArrayList

class HelperExtension {
	
	// Fully Quallified Names (Fqn)
	val static firefoxDriverFqn		= 'org.openqa.selenium.firefox.FirefoxDriver'
	val static chromeDriverFqn		= 'org.openqa.selenium.chrome.ChromeDriver'
	val static edgeDriverFqn		= 'org.openqa.selenium.edge.EdgeDriver'
	val static safariDriverFqn		= 'org.openqa.selenium.safari.SafariDriver'
	val static ieDriverFqn			= 'org.openqa.selenium.ie.InternetExplorerDriver'
	val static operaDriverFqn		= 'org.openqa.selenium.opera.OperaDriver'
	
	// System Properties
	val static firefoxDriverProperty	= 'webdriver.gecko.driver'
	val static chromeDriverProperty		= 'webdriver.chrome.driver'
	val static edgeDriverProperty		= 'webdriver.edge.driver'
	val static safariDriverProperty		= 'webdriver.safari.driver'
	val static ieDriverProperty			= 'webdriver.ie.driver'
	val static operaDriverProperty		= 'webdriver.opera.driver'
	
	/*** Main Packages ***/
	
	static def String getMainPackage()			{ 'main' }
	static def String getMainJavaPackage()		{ mainPackage + '.java'			   }
	static def String getMainResourcePackage()	{ mainPackage + '.resources'	   }
	static def String getTestPackage()			{ 'test' }
	static def String getTestJavaPackage()		{ testPackage + '.java'			   }
	static def String getTestResourcePackage()	{ testPackage + '.resources'	   }
	
	/*** Selenium Drivers ***/
	
	// Drivers
	static def String getDriverName(WebDriver driver) {
		switch (driver.name.getName.toLowerCase) {
						case "firefox":  	'firefoxDriver'
						case "chrome":  	'chromeDriver'
						case "edge" :  		'edgeDriver'
						case "safari" :  	'safariDriver'
						case "ie" :  		'ieDriver'
						case "opera" :  	'operaDriver'
						default:   			throw new RuntimeException('''Could not identify "«driver.name.getName.toLowerCase»"''')
		}
	}
	
	// Driver Fully Qalified Names
	static def String getDriverFqn(WebDriver driver) {
		switch (driver.name.getName.toLowerCase) {
						case "firefox":  	firefoxDriverFqn 
						case "chrome":  	chromeDriverFqn 
						case "edge" :  		edgeDriverFqn 
						case "safari" :  	safariDriverFqn 
						case "ie" :  		ieDriverFqn 
						case "opera" :  	operaDriverFqn 
						default:   			throw new RuntimeException('''Could not import "«driver.name.getName.toLowerCase»"''')
		}
	}
	
	// System Properties
	static def String getDriverProperty(WebDriver driver)	{ 
		switch (driver.name.getName.toLowerCase) {
						case "firefox":		firefoxDriverProperty
						case "chrome":  	chromeDriverProperty
						case "edge" :  		edgeDriverProperty
						case "safari" :  	safariDriverProperty
						case "ie" :  		ieDriverProperty
						case "opera" :  	operaDriverProperty
						default: 			throw new RuntimeException('''Could not import "«driver.name.getName.toLowerCase»"''')
		} 
	}
	
	// Driver Class Name
	static def String getDriverClass(WebDriver driver) {
		switch (driver.name.getName.toLowerCase) {
						case "firefox":		firefoxDriverFqn.classFromFqn
						case "chrome":  	chromeDriverFqn.classFromFqn
						case "edge" :  		edgeDriverFqn.classFromFqn 
						case "safari" :  	safariDriverFqn.classFromFqn
						case "ie" :  		ieDriverFqn.classFromFqn 
						case "opera" :  	operaDriverFqn.classFromFqn 
						default: 			throw new RuntimeException('''Could not find "«driver.name.getName.toLowerCase»" class''')
		} 
	}
	
	static def String getClassFromFqn(String fqn) {
		fqn.split("\\.", -1).last
	}
	
	static def extractSequence(FeatureContainer container) {
		val List<DocNode> singleSequence = new LinkedList<DocNode>;
		val firstDocNode = container.starts.head.docNodeSuccessors.head
		singleSequence.add(firstDocNode)			// get first DocNode
		var succ = firstDocNode.successors.head		// and its successor
		while (!(succ instanceof EndNode)) {		// if it's and end node
			singleSequence.add(succ as DocNode)
			succ = succ.successors.head				// or else get its successor
		}
		return singleSequence						// return the sequence
	}

	static def String getLinesOfCode(DocGraphModel model){
		var StringBuilder codeText = new StringBuilder
		for(start : model.starts){
		var succ = start.successors.head
		while (!(succ instanceof EndNode)) {
				codeText.append(succ.nodeCode)
				succ = succ.successors.head
			}
		}
		'''
		«codeText.toString»
	   	'''
	}

	static def String getNodeCode(Node node)'''
		«switch (node.eClass.name) {
				case "StartNode" : '''this.openBrowser();'''
				case "EndNode" : '''this.closeBrowser();'''
				case "Navigation": '''this.goToPage("«(node as Navigation).link»");'''
				case "Div": ''''''
				case "H": ''''''
				case "P": ''''''
				case "Span": ''''''
				case "Label": ''''''
				case "Textarea": ''''''
				case "Table": ''''''
				case "TableHead": ''''''
				case "Th": ''''''
				case "TableRow": ''''''
				case "TableBody": ''''''
				case "TableData": ''''''
				case "Input": '''this.typeIn("«(node as Input).selector»", "«(node as Input).value»", "«(node as Input).content»");'''
				case "Screenshot": '''
				this.takePageScreenshot("«»", "«(node as Screenshot).pictureName.trim.replaceAll("\\.", "_")»"); 
				'''
				case "Button": '''this.clickBtn("«(node as Button).selector»", "«(node as Button).value»");'''
				case "SelectBox": '''this.select();'''
				case "SelectBoxOption": ''''''
				case "SectionNode": '''«(node as SectionNode).allNodes.forEach[nodeCode]»'''
				case "Form": '''
								«FOR input : (node as Form).inputs»
								«input.nodeCode»
								«ENDFOR»
								«FOR button : (node as Form).buttons»
								«button.nodeCode»
								«ENDFOR»
							 '''
				case "SubDoc": '''«(node as SubDoc).subDoc.linesOfCode»'''
		}
		»
	'''
	
	static def String getProjectName(GraphModel model){
		return ''''''
	}
}