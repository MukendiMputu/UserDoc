package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.runtime.IPath
//import org.eclipse.core.resources.IFolder
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator

import info.scce.cinco.product.features.main.features.FeaturesGraphModel
import info.scce.cinco.product.features.main.features.KeyValue
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.core.runtime.Path
import org.eclipse.core.runtime.CoreException

/**
 *  Example class that generates code for a given FlowGraph model. As different
 *  feature examples might or might not be included (e.g. the external component
 *  library or swimlanes), this generator only does stupidly enumerate all
 *  nodes and prints some general information about them.
 */
class Generate implements IGenerator<FeaturesGraphModel> {

	IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot();

	override generate(FeaturesGraphModel model, IPath targetDir, IProgressMonitor monitor) {

		if (model.name.nullOrEmpty)
			throw new RuntimeException("Model's name cannot be empty!")
		
		// get the IPath of the target directory
		val srcGen = root.getContainerForLocation(targetDir)
				
		// append the maven project source folder to it
		// and make an IPath of the last string segment
		var src = new Path(targetDir.append('/src').lastSegment)

		try {
			srcGen.getFolder(src).create(true, true, monitor)
		} catch (Exception exception) {
			(exception.cause + ": while creating src folder")
		}
		
		// Construct the subfolder paths
		var srcMainPath = src.append('/main')
		var srcTestPath = src.append('/test')
		var targetPath = src.append('/target')

		// Get the IFolder classes
		val mainFolder = srcGen.getFolder(srcMainPath)
		val testFolder = srcGen.getFolder(srcTestPath)
		val targetFolder = srcGen.getFolder(targetPath)
		
		try {
			// first create main folders
			mainFolder.create(true, true, monitor)
			testFolder.create(true, true, monitor)
			targetFolder.create(true, true, monitor)
	
			// then the subfolders
			srcGen.getFolder(new Path(srcMainPath + "/java")).create(true, true, monitor)
			srcGen.getFolder(new Path(srcTestPath + "/java")).create(true, true, monitor)
			
			srcGen.getFolder(new Path(srcMainPath + '/resources')).create(true, true, monitor)
			srcGen.getFolder(new Path(srcTestPath + '/resources')).create(true, true, monitor)

		} catch (CoreException exception) {
			
			exception.printStackTrace()
			
		} catch (Exception exception) {
			
			exception.printStackTrace()
			
		}
		
		println(mainFolder)
		println(testFolder)
		
		/*
		 * First, define the packages for the Selenium project
		 * then create them within the source folders.
		 */
		val String[] pkgs = #["config", "main", "tool"]
		val packagePrefix = "/info/scce/cinco/product/userdocgenerator/"

		try {
			// All main packages
			for (pkg : pkgs) {
				PackageGenerator.generatePkg(packagePrefix + pkg, mainFolder, monitor)
			}
			// and one test package
			PackageGenerator.generatePkg(packagePrefix + "test", testFolder, monitor)
			
		} catch (Throwable exception) {
			println("Caught " + exception.toString + " while creating packages!")
		}
		
		 
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
		
		// Generate Main.java
		EclipseFileUtils.writeToFile(
			root.getFileForLocation(targetDir.append('Main.java')),
			'''
				package info.scce.cinco.product.userdocgenerator.main;
				
				import java.io.IOException; 
				import info.scce.cinco.product.userdocgenerator.tool.AutomationClass;
				
				public class Main {
					private static AutomationClass driverTool;
					// Here come all the configuration necessary to run the sequences in the browser
					
					public static void main (String[] args){
						driverTool = new AutomationClass();
						try {
							driverTool.openBrowser("firefox");
							driverTool.goToPage("http://localhost:8080");

							String sequenceName = "Login";
				
							driverTool.goToPage("http://localhost:8080/home");
							driverTool.takePageScreenshot(sequenceName, "LoginPage");
							driverTool.typeIn("username", sUserName);
							driverTool.takePageScreenshot(sequenceName, "userCredentials");
							driverTool.typeIn("password", sPassword);
							Thread.sleep(5000);
							driverTool.pressEnter();
							driverTool.takePageScreenshot(sequenceName, "UserDashboard");
				
						} catch (InterruptedException e) {
							e.printStackTrace();
						} catch (IOException e) {
							e.printStackTrace();
						} finally {
				
						}
				
					}
				}
			'''
		)
		
		// generate AutomationClass.java
		EclipseFileUtils.writeToFile(
			root.getFileForLocation(targetDir.append('AutomationClass.java')),
			'''
			package info.scce.cinco.product.userdocgenerator.tool;
			
			import java.io.File;
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
			
			public class AutomationClass {
				protected WebDriver driver;
			
			«var EList<KeyValue> keyValPairs = new BasicEList<KeyValue> »
			«IF !model.configurationContainers.isEmpty»
				«FOR configContainer : model.configurationContainers»
					// «configContainer.title»
					«FOR keyVal : configContainer.keyValues SEPARATOR ',' AFTER ',\n'»
					«var res = keyValPairs.add(keyVal)»
						protected String s«keyVal.key.toFirstUpper»
					«ENDFOR»
				«ENDFOR»
			«ENDIF»
				protected WebElement element;

				public AutomationClass() {
			
					// Loading configuratiion properties
					«IF !keyValPairs.nullOrEmpty»
					«FOR keyVal : keyValPairs»
					s«keyVal.key.toFirstUpper» = "«keyVal.value»";
					«ENDFOR»
					«ENDIF»

					driver = null;
					element = null;
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
 
 
 
 		val code = generateCode(model);
		val targetFile = ResourcesPlugin.workspace.root.getFileForLocation(targetDir.append(model.name + ".txt"))

		EclipseFileUtils.writeToFile(targetFile, code)
	}

	private def generateCode(FeaturesGraphModel model) '''
		=== «model.name» ===

		The model contains «model.allNodes.size» nodes. Here's some general information about them:

		«FOR node : model.allNodes»
			* node «node.id» of type '«node.eClass.name»' with «node.successors.size» successors and «node.predecessors.size» predecessors
		«ENDFOR»
	'''

}
