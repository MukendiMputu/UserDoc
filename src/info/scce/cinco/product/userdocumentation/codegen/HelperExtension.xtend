package info.scce.cinco.product.userdocumentation.codegen

import graphmodel.Node
import info.scce.cinco.product.features.main.feature.DocNode
import info.scce.cinco.product.features.main.feature.FeatureContainer
import info.scce.cinco.product.features.main.feature.Stop
import info.scce.cinco.product.features.main.feature.WebDriver
import info.scce.cinco.product.usersequence.main.doc.Button
import info.scce.cinco.product.usersequence.main.doc.Div
import info.scce.cinco.product.usersequence.main.doc.DocGraphModel
import info.scce.cinco.product.usersequence.main.doc.EndNode
import info.scce.cinco.product.usersequence.main.doc.Form
import info.scce.cinco.product.usersequence.main.doc.H
import info.scce.cinco.product.usersequence.main.doc.Highlight
import info.scce.cinco.product.usersequence.main.doc.Input
import info.scce.cinco.product.usersequence.main.doc.Label
import info.scce.cinco.product.usersequence.main.doc.Navigation
import info.scce.cinco.product.usersequence.main.doc.P
import info.scce.cinco.product.usersequence.main.doc.Screenshot
import info.scce.cinco.product.usersequence.main.doc.SectionNode
import info.scce.cinco.product.usersequence.main.doc.SelectBox
import info.scce.cinco.product.usersequence.main.doc.Span
import info.scce.cinco.product.usersequence.main.doc.SubDoc
import info.scce.cinco.product.usersequence.main.doc.Table
import info.scce.cinco.product.usersequence.main.doc.TableBody
import info.scce.cinco.product.usersequence.main.doc.TableData
import info.scce.cinco.product.usersequence.main.doc.TableHead
import info.scce.cinco.product.usersequence.main.doc.TableRow
import info.scce.cinco.product.usersequence.main.doc.Textarea
import info.scce.cinco.product.usersequence.main.doc.Th
import info.scce.cinco.product.usersequence.main.doc.UnHighlight
import java.util.LinkedList
import java.util.List
import info.scce.cinco.product.usersequence.main.doc.Timer

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
	
	static def String getMainPackage()			{ 'main'		}
	
	/*** Application Package ***/
	
	static def String getApplicationPackage() 	{ 'info.scce.cinco.product.userdoc' }
	
	/*** Test Packages ***/
	
	static def String getTestPackage()			{ 'test'		}
	static def String getTestJavaPackage()		{ testPackage +"." +'java'		}
	static def String getTestResourcePackage()	{ testPackage +"." +'resources'	}
	
	/*** Selenium Drivers ***/
	
	// Drivers
	static def String getDriverName(WebDriver driver) {
		switch (driver.name.getName.toLowerCase) {
						case "firefox":  					'firefoxDriver'
						case "chrome":  					'chromeDriver'
						case "edge" :  						'edgeDriver'
						case "safari" :  					'safariDriver'
						case "ie" :  						'ieDriver'
						case "internet_explorer" :  		'ieDriver'
						case "opera" :  					'operaDriver'
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
	
	static def String getCleanFileOrFolderName(String fname) {
		return fname.trim
					.replaceAll(" ","")
					.replaceAll("\\.", "_")
					.escape
	}
	
	static def String escape(String s){
		 return s.replace("\\", "\\\\")
		          .replace("\t", "\\t")
		          .replace("\b", "\\b")
		          .replace("\n", "\\n")
		          .replace("\r", "\\r")
		          .replace("\f", "\\f")
		          //.replace("\'", "\\'")
		          .replace("\"", "\\\"");
	}
	
	/* Extracts in sequence order all Doc model container in a feature container */
	static def extractSequence(FeatureContainer container) {
		val List<DocNode> singleSequence = new LinkedList<DocNode>;
		val firstDocNode = container.starts.head.docNodeSuccessors.head
		singleSequence.add(firstDocNode)			// get first DocNode
		var succ = firstDocNode.successors.head		// and its successor
		while (!(succ instanceof Stop) && !(succ instanceof EndNode)) {		// if it's and end node
			singleSequence.add(succ as DocNode)
			succ = succ.successors.head				// or else get its successor
		}
		return singleSequence						// return the sequence
	}
	
	/* Retrieves the element method following the sequence or queue in the model*/
	static def String getLinesOfCode(DocGraphModel model, String featureTitle, Boolean createsScreenshots){
		var StringBuilder codeText = new StringBuilder
		for(start : model.startNodes){
			var succ = start.successors.head
			while (!(succ instanceof EndNode)) {
					codeText.append(succ.getNodeCode(featureTitle, createsScreenshots))
					succ = succ.successors.head
				}
		}
		'''
		«codeText.toString»
	   	'''
	}
	
	/* Depending on the node type a template method for the Selenium Script is chosen. */
	static def String getNodeCode(Node node, String featureTitle, Boolean createsScreenshots)'''
		«switch (node.eClass.name) {
				case "Navigation": 		'''this.goToPage("«(node as Navigation).link.escape»");'''
				case "Div": 			'''«IF createsScreenshots && (node as Div).highlighted»this.highlightElement("«(node as Div).selector.escape»"); «ENDIF»'''
				case "H": 				'''«IF createsScreenshots && (node as H).highlighted»this.highlightElement("«(node as H).selector.escape»"); «ENDIF»'''
				case "P": 				'''«IF createsScreenshots && (node as P).highlighted»this.highlightElement("«(node as P).selector.escape»"); «ENDIF»'''
				case "Span": 			'''«IF createsScreenshots && (node as Span).highlighted»this.highlightElement("«(node as Span).selector.escape»"); «ENDIF»'''
				case "Label": 			'''«IF createsScreenshots && (node as Label).highlighted»this.highlightElement("«(node as Label).selector.escape»"); «ENDIF»'''
				case "Textarea": 		'''«IF createsScreenshots && (node as Textarea).highlighted»this.highlightElement("«(node as Textarea).selector.escape»"); «ENDIF»'''
				case "Table": 			'''«IF createsScreenshots && (node as Table).highlighted»this.highlightElement("«(node as Table).selector.escape»"); «ENDIF»'''
				case "TableHead": 		'''«IF createsScreenshots && (node as TableHead).highlighted»this.highlightElement("«(node as TableHead).selector.escape»"); «ENDIF»'''
				case "Th": 				'''«IF createsScreenshots && (node as Th).highlighted»this.highlightElement("«(node as Th).selector.escape»"); «ENDIF»'''
				case "TableRow": 		'''«IF createsScreenshots && (node as TableRow).highlighted»this.highlightElement("«(node as TableRow).selector.escape»"); «ENDIF»'''
				case "TableBody": 		'''«IF createsScreenshots && (node as TableBody).highlighted»this.highlightElement("«(node as TableBody).selector.escape»"); «ENDIF»'''
				case "TableData": 		'''«IF createsScreenshots && (node as TableData).highlighted»this.highlightElement("«(node as TableData).selector.escape»"); «ENDIF»'''
				case "Timer": 			'''«IF createsScreenshots »wait.until(«(node as Timer).condition»(By.cssSelector("«(node as Timer).cssSelector.escape»")));«ENDIF»'''
				
				case "Input": 			'''
										«IF createsScreenshots && (node as Input).highlighted»this.highlightElement("«(node as Input).selector.escape»"); «ENDIF»
										this.typeIn("«(node as Input).selector.escape»", "«(node as Input).content.escape»");
										'''
				case "Highlight":		'''«IF createsScreenshots »this.highlightElement("«(node as Highlight).target.selector.escape»");«ENDIF»'''
				case "UnHighlight":		'''«IF createsScreenshots »this.undoHighlightElement("«(node as UnHighlight).target.selector.escape»");«ENDIF»'''
				case "Screenshot": 		'''«IF createsScreenshots »this.takePageScreenshot("«featureTitle.escape.cleanFileOrFolderName»", "«(node as Screenshot).pictureName.cleanFileOrFolderName»");«ENDIF»'''
				case "Button": 			'''
										«IF createsScreenshots && (node as Button).highlighted»this.highlightElement("«(node as Button).selector.escape»"); «ENDIF»
										this.clickBtn("«(node as Button).selector.escape»");
										'''
				case "SelectBox": 		'''
										«IF createsScreenshots && (node as SelectBox).highlighted»this.highlightElement("«(node as SelectBox).selector.escape»"); «ENDIF»
										this.select("«(node as SelectBox).selector.escape»", "«(node as SelectBox).option.escape»");
										'''
				case "SectionNode": 	'''«(node as SectionNode).allNodes.forEach[getNodeCode(featureTitle, createsScreenshots)]»'''
				case "Form": 			'''
										«IF createsScreenshots && (node as Form).highlighted»this.highlightElement("«(node as Form).selector.escape»"); «ENDIF»
										«FOR input : (node as Form).inputs»
										«input.getNodeCode(featureTitle, createsScreenshots)»
										«ENDFOR»
										«FOR button : (node as Form).buttons»
										«button.getNodeCode(featureTitle, createsScreenshots)»
										«ENDFOR»
										 '''
				case "SubDoc": 			'''«(node as SubDoc).subDoc.getLinesOfCode(featureTitle, (node as SubDoc).createScreenshots)»'''
		}
		»
	'''

	
	static def String getDocumentationText(DocGraphModel model, Boolean createScreenshot){
		var StringBuilder documentationText = new StringBuilder
		for(start : model.startNodes){
			var succ = start.successors.head
			while (!(succ instanceof EndNode)) {
					documentationText.append(succ.getDocumentationLine(createScreenshot))
					succ = succ.successors.head
				}
		}
		'''«documentationText.toString»''' 
	}
	
	
	static def String getDocumentationLine(Node node){
		node.getDocumentationLine(false)
	}
	
	
	static def String getDocumentationLine(Node node, Boolean createScreenshot)'''
		«switch (node.eClass.name) {
				case "Navigation": 		'''«(node as Navigation).documentation»'''
				case "Div": 			'''«(node as Div).documentation»'''
				case "H": 				'''«(node as H).documentation»'''
				case "P": 				'''«(node as P).documentation»'''
				case "Span": 			'''«(node as Span).documentation»'''
				case "Label": 			'''«(node as Label).documentation»'''
				case "Textarea": 		'''«(node as Textarea).documentation»'''
				case "Table": 			'''«(node as Table).documentation»'''
				case "TableHead": 		'''«(node as TableHead).documentation»'''
				case "Th": 				'''«(node as Th).documentation»'''
				case "TableRow": 		'''«(node as TableRow).documentation»'''
				case "TableBody": 		'''«(node as TableBody).documentation»'''
				case "TableData": 		'''«(node as TableData).documentation»'''
				case "Input": 			'''«(node as Input).documentation»'''
				case "Screenshot": 		'''
				«IF createScreenshot»
				
				| ![«(node as Screenshot).pictureName.cleanFileOrFolderName»](./«(node as Screenshot).pictureName.cleanFileOrFolderName».png "«(node as Screenshot).pictureName.escape»") |
				| :--: |
				«IF (node as Screenshot).description !== null»
				| «(node as Screenshot).description.content.nullOrEmpty? '': (node as Screenshot).description.content.replaceAll("\n", " ")» |
				«ENDIF»
				
				«ENDIF»
				'''
				case "Button": 			'''«(node as Button).documentation»'''
				case "SelectBox": 		'''«(node as SelectBox).documentation»'''
				case "SectionNode": 	'''«(node as SectionNode).documentation»'''
				case "Form": 			'''«(node as Form).documentation»'''
				case "SubDoc": 			'''
				«(node as SubDoc).subDoc.getDocumentationText((node as SubDoc).createScreenshots)»
				'''
		}
		»
	'''
		
	

}