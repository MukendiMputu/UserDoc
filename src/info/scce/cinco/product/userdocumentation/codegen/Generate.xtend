package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.usersequence.main.usersequence.UserSequenceGraphModel
import info.scce.cinco.product.features.main.features.FeaturesGraphModel
import info.scce.cinco.product.userdocumentation.codegen.Generate2
import info.scce.cinco.product.features.main.features.StartNode
import info.scce.cinco.product.features.main.features.Property
import info.scce.cinco.product.features.main.features.DocNode
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.core.resources.IContainer
import org.eclipse.core.resources.IProject
import org.eclipse.emf.common.util.EList
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import graphmodel.Container
import java.util.LinkedList
import graphmodel.Node
import java.util.List

/**
 * 
 */
class Generate implements IGenerator<FeaturesGraphModel> {

	IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot()
	IProject project
	IPath tmpPath
	Generate2 sequenceGen

	override generate(FeaturesGraphModel model, IPath targetDir, IProgressMonitor monitor) {
		project = root.getContainerForLocation(targetDir).project

		if (model.name.nullOrEmpty)
			throw new RuntimeException("Model's name cannot be empty!")
		
		// get the IPath of the target directory
		val srcGen = root.getContainerForLocation(targetDir)
				
		// append the maven project source folder to it
		// and make an IPath of the last string segment
		val srcPath = new Path(targetDir.append('/src').lastSegment)
		var src = srcGen.getFolder(srcPath)

		try {
			src.create(true, true, monitor)
		} catch (Exception exception) {
			printException(exception, "creating src folder")
		}
		
		// Construct the subfolder paths
		var srcMainPath = srcPath.append('/main')
		var srcTestPath = srcPath.append('/test')
		var targetPath = srcPath.append('/target')
		
		val mainJavaFolder = src.getFolder(new Path("/main/java"))
		val testJavaFolder = src.getFolder(new Path("/test/java"))

		try {
			// first create main folders
			srcGen.getFolder(srcMainPath).create(true, true, monitor)
			srcGen.getFolder(srcTestPath).create(true, true, monitor)
			srcGen.getFolder(targetPath).create(true, true, monitor)
	
			// then the subfolders
			mainJavaFolder.create(true, true, monitor)
			testJavaFolder.create(true, true, monitor)
			
			srcGen.getFolder(new Path(srcMainPath + '/resources')).create(true, true, monitor)
			srcGen.getFolder(new Path(srcTestPath + '/resources')).create(true, true, monitor)

		} catch (Exception exception) {
			printException(exception, "creating main, test and target folders")			
		}

		// main package
		createPackageFolders(new Path("/info/scce/cinco/product/userdocgenerator/app"), mainJavaFolder, monitor)
		
		// and test package
		createPackageFolders(new Path("/info/scce/cinco/product/userdocgenerator/test"), testJavaFolder, monitor)
			
		try {	
			
			// Generate Main.java
			// write java file to correct location
			val appPkg = new Path("/info/scce/cinco/product/userdocgenerator/app")
			EclipseFileUtils.writeToFile(mainJavaFolder.getFile(appPkg+'/Main.java'), mainJavaCode(model))
			
			// Generate pom.xml file into the targetDir src-gen
			EclipseFileUtils.writeToFile(
				root.getFileForLocation(targetDir.append("pom.xml")),
				'''
					<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
					  <modelVersion>4.0.0</modelVersion>
					  <groupId>info.scce.cinco.product</groupId>
					  <artifactId>userdocumentation</artifactId>
					  <version>0.0.1-SNAPSHOT</version>
					  <name>User Documentation Generator</name>
					
					  <properties>
						  <maven.compiler.source>1.8</maven.compiler.source>
						  <maven.compiler.target>1.8</maven.compiler.target>
					  </properties>
					
					  <dependencies>
					  <dependency>
					    <groupId>commons-io</groupId>
					    <artifactId>commons-io</artifactId>
					    <version>2.4</version>
					</dependency>
					  <dependency>
					  	<groupId>org.seleniumhq.selenium</groupId>
					  	<artifactId>selenium-java</artifactId>
					  	<version>3.141.59</version>
					  </dependency>
					  <dependency>
					    <groupId>org.testng</groupId>
					    <artifactId>testng</artifactId>
					    <version>6.14.3</version>
					    <scope>compile</scope>
					</dependency>
					  </dependencies>
					</project>
				'''
			)
			
			// Generate .classpath file
			EclipseFileUtils.writeToFile(
				root.getFileForLocation(targetDir.append(".classpath")),
				'''
					<?xml version="1.0" encoding="UTF-8"?>
					<classpath>
						<classpathentry kind="src" output="target/classes" path="src/main/java">
							<attributes>
								<attribute name="optional" value="true"/>
								<attribute name="maven.pomderived" value="true"/>
							</attributes>
						</classpathentry>
						
						<classpathentry kind="src" output="target/test-classes" path="src/test/java">
							<attributes>
								<attribute name="test" value="true"/>
								<attribute name="optional" value="true"/>
								<attribute name="maven.pomderived" value="true"/>
							</attributes>
						</classpathentry>
						
						<classpathentry kind="con" path="org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8">
							<attributes>
								<attribute name="module" value="true"/>
								<attribute name="maven.pomderived" value="true"/>
							</attributes>
						</classpathentry>
						
						<classpathentry kind="con" path="org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER">
							<attributes>
								<attribute name="maven.pomderived" value="true"/>
							</attributes>
						</classpathentry>
						
						<classpathentry kind="output" path="target/classes"/>
					</classpath>
				'''
			)
			
			// Generate .project file
			EclipseFileUtils.writeToFile(
				root.getFileForLocation(targetDir.append(".project")),
				'''
				<?xml version="1.0" encoding="UTF-8"?>
				<projectDescription>
					<name>«root.getContainerForLocation(targetDir).project.name.split("/").last»</name>
					<comment></comment>
					<projects>
					</projects>
					<buildSpec>
						<buildCommand>
							<name>org.eclipse.jdt.core.javabuilder</name>
							<arguments>
							</arguments>
						</buildCommand>
						<buildCommand>
							<name>org.eclipse.m2e.core.maven2Builder</name>
							<arguments>
							</arguments>
						</buildCommand>
					</buildSpec>
					<natures>
						<nature>org.eclipse.jdt.core.javanature</nature>
						<nature>org.eclipse.m2e.core.maven2Nature</nature>
					</natures>
				</projectDescription>
				'''
			)
			
		} catch (Exception exception) {
			printException(exception, "writing contents to files")
		}
		
			EclipseFileUtils.writeToFile(root.getFileForLocation(targetDir.append(model.name + "Feature.txt")),
				generateModelInfo(model)
			)
		
		// for every DocNode, inject generate code her
		for (node : extractAllNodes(model).filter(DocNode)) {
			if (node.eClass.name.equalsIgnoreCase("docnode"))
				sequenceGen = new Generate2()
				sequenceGen.generate(node.getMgl(), targetDir, monitor)
		}
	 
	}
	
	private def mainJavaCode(FeaturesGraphModel model) {
	'''
		package info.scce.cinco.product.userdocgenerator.app;
		
		import java.io.File;
		import java.io.IOException;
		import java.io.IOException;
		import java.util.Properties;
		import org.openqa.selenium.By;
		import java.io.FileInputStream;
		import org.openqa.selenium.Keys;
		import java.io.FileNotFoundException;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.OutputType;
		import org.apache.commons.io.FileUtils;
		import org.openqa.selenium.TakesScreenshot;
		import org.openqa.selenium.JavascriptExecutor;
		import org.openqa.selenium.firefox.FirefoxDriver;
		
		public class Main implements Runnable {
			protected static WebDriver driver;
			«var EList<Property> props = new BasicEList<Property> »
			«IF !model.propertyContainers.isEmpty»
				«FOR configContainer : model.propertyContainers»
					// «configContainer.title»
					«FOR property : configContainer.propertys SEPARATOR ';'»
					«var res = props.add(property)»
					protected static String «property.name»
					«ENDFOR»
				«ENDFOR»
			«ENDIF»
			protected static WebElement element;
			
			public static void main (String[] args){
				// Loading configuratiion properties
				«IF !props.nullOrEmpty»
				«FOR property : props»
				«property.name» = "«property.value»";
				«ENDFOR»
				«ENDIF»
				driver = null;
				element = null;
				Main main = new Main();
				main.run();
			}
		
			@Override
			public void run() {
				AutomationClass seleniumTool = new AutomationClass();
				// Start of sequence
				«FOR startNode : model.startNodes»
				{
				«startSequence(startNode)»
				}
				«ENDFOR»
				// For every doc in MGL generate a method with model name as signature
				seleniumTool.gotostart();
				try {
					seleniumTool.takePageScreenshot(this.getClass().toString(), "LoginPage");
					seleniumTool.typeIn("«»", "peter");
					seleniumTool.takePageScreenshot(this.getClass().toString(), "userCredentials");
					seleniumTool.typeIn("password", "pwd");
					seleniumTool.pressEnter();
					seleniumTool.takePageScreenshot(this.getClass().toString(), "UserDashboard");
					
					seleniumTool.closeBrowser();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			public Boolean openBrowser(String sBrowserType) {
				// Set path to driver executable as system path
				if (sBrowserType.equalsIgnoreCase("firefox")) {
					System.setProperty("webdriver.gecko.driver", "/home/mukendi/opt/WebDriver/bin/geckodriver");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
				}
				return true;
			}
			public Boolean goToPage(String sSiteURL) {
				driver.get(sSiteURL);
				return true;
			}
			public Boolean takePageScreenshot(String folderName, String pictureName) throws IOException {
				//Use TakesScreenshot method to capture screenshot
				TakesScreenshot screenshot = (TakesScreenshot)driver;
				File source = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./"+folderName+"/" + pictureName + ".png"));
				return true;
			}
			public Boolean takeElementScreenshot(WebElement pElement, String folderName, String pictureName) throws IOException {
				//Capture single element screenshot
				File source = pElement.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./"+folderName+"/" + pictureName + ".png"));
				return true;
			}
			public void highlightElement(WebElement elem) {
				JavascriptExecutor jsExec = (JavascriptExecutor) driver;
				jsExec.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');", elem);
			}
			public Boolean typeIn(String elementID, String contentText) {
				WebElement inputField = driver.findElement(By.id(elementID));
				highlightElement(inputField);
				inputField.sendKeys(contentText + Keys.TAB);
				return true;
			}
			public Boolean pressEnter(){
				WebElement enterBtn = driver.findElement(By.xpath("//button[@type='submit']"));
				highlightElement(enterBtn);
				enterBtn.click();;
				return true;
			}
			public void closeBrowser() {
				driver.quit();
			}
		}
	'''
	}
		
	def startSequence(StartNode node) {
		return '''
		«FOR successor : node.successors»
		«successor.eClass.name»
		«ENDFOR»
		«node.code»
		'''
	}
	
	private def extractAllNodes(FeaturesGraphModel model) {
		val List<Node> nodeList = new LinkedList<Node>;
		for (node : model.allNodes) {
			nodeList.add(node)
		}
		return nodeList
	}
	
	private def void createPackageFolders(IPath pkgPath, IContainer rootDir, IProgressMonitor monitor) {
		tmpPath = Path.EMPTY
		for (String segment : pkgPath.segments) {
			tmpPath = tmpPath.append(segment)
			var pkgFolder = rootDir.getFolder(tmpPath)
			if(!pkgFolder.exists())
				pkgFolder.create(true, true, monitor)
		}
	}
	
	private def printException(Exception e, String action){
		println("Caught " + e + " while "+ action +".")
		println("Cause: " + e.cause)
		println("Message: " + e.message)
	}

	private def generateModelInfo(FeaturesGraphModel model) '''
		=== «model.name» ===
		
		The model contains «model.allNodes.size» nodes. Here's some general information about them:

		«FOR node : model.allNodes»
			* node «node.id» of type '«node.eClass.name»' with «node.successors.size» successors and «node.predecessors.size» predecessors
			«IF model.allContainers.contains(node)»
				«FOR containedNode : Container.cast(node).nodes»
					- sub node «containedNode.id» of type '«containedNode.eClass.name»'
				«ENDFOR»
			«ENDIF»
			«IF model.docNodes.contains(node)»
				
			«ENDIF»
		«ENDFOR»
	'''
	
}
