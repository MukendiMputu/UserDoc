package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.features.main.feature.WebDriver
import graphmodel.Node
import java.util.List
import info.scce.cinco.product.features.main.feature.StartNode
import java.util.LinkedList
import info.scce.cinco.product.features.main.feature.EndNode
import info.scce.cinco.product.usersequence.main.doc.DocGraphModel
import info.scce.cinco.product.usersequence.main.doc.SubDoc
import info.scce.cinco.product.usersequence.main.doc.Navigation
import info.scce.cinco.product.usersequence.main.doc.Input
import info.scce.cinco.product.usersequence.main.doc.Button
import info.scce.cinco.product.usersequence.main.doc.Start
import info.scce.cinco.product.usersequence.main.doc.Stop

class NameExtension {
	
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
	
	static def String getMainPackage()		{ 'main' }
	static def String getTestPackage()		{ 'test' }
	
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
	
	static def extractSequence(Start start) {
		val List<Node> singleSequence = new LinkedList<Node>;
		var cond = true
		singleSequence.add(start)			// get startNode
		var succ = start.successors.head	// and its successor
		singleSequence.add(succ)
 
		if(succ instanceof EndNode){		// if it's and end node
			return singleSequence			// return the sequence
		} else {							// or else get its successor
			// swapping
			var temp = succ					
			while(cond){
			// replace the current by its successor
				var current = temp.successors.head 
				temp = current
				if (current instanceof Stop){
					cond = false
				}
			}
		}
		return singleSequence
	}
	
	static def extractSequence(StartNode start) {
		val List<Node> singleSequence = new LinkedList<Node>;
		var cond = true
		singleSequence.add(start)			// get startNode
		var succ = start.successors.head	// and its successor
		singleSequence.add(succ)
 
		if(succ instanceof EndNode){		// if it's and end node
			return singleSequence			// return the sequence
		} else {
			// swapping
			var current = succ					// or else get its successor
			while(cond){						// while a certain condition still hold
				current = current.successors.head // replace the current by its successor
				singleSequence.add(current)		  // add that successor node
				if (current instanceof EndNode)
					cond = false
			}
		}
		return singleSequence
	}

	static def String getModelCode(DocGraphModel model)'''
	«FOR start : model.starts»
		«val nodeSeq = start.extractSequence»
		«FOR node : nodeSeq»
		«getNodeCode(node)»
		«ENDFOR»
	«ENDFOR»
	''' 
	
	static def String getNodeCode(Node node)'''
		«switch (node.eClass.name) {
						case "StartNode" : '''this.openBrowser();'''
						case "EndNode" : '''this.closeBrowser();'''
						case "SubDoc": (node as SubDoc).subDoc.modelCode
						case "Navigation": '''this.goToPage("«(node as Navigation).link»");'''
						case "Input": '''this.typeIn("«(node as Input).id»", "«(node as Input).content»");'''
						case "Screenshot": '''this.takePageScreenshot("«»", "«»"); // Screenshot'''
						case "Button": '''this.clickBtn("«(node as Button).selector»", "«(node as Button).value»");'''
						case "SelectBox": '''this.select();'''
					//	case "SectionNode": (node as SectionNode).allNodes.forEach[getNodeCode]
				}
				»
	'''
}