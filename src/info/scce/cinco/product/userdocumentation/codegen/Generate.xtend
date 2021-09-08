package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.features.main.feature.FeatureGraphModel
import info.scce.cinco.product.features.main.feature.StartNode
import info.scce.cinco.product.features.main.feature.DocNode
import info.scce.cinco.product.features.main.feature.EndNode
import info.scce.cinco.product.features.main.feature.BaseURL
import info.scce.cinco.product.features.main.feature.BrowserName
import info.scce.cinco.product.features.main.feature.UserName
import info.scce.cinco.product.features.main.feature.Email
import info.scce.cinco.product.features.main.feature.Password
import info.scce.cinco.product.features.main.feature.Property
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.IContainer
import org.eclipse.core.runtime.IPath
import org.eclipse.core.runtime.Path
import graphmodel.Container
import java.util.LinkedList
import graphmodel.Node
import java.util.List
import org.eclipse.emf.common.util.BasicEList
import org.eclipse.core.resources.IProject

/**
 * @author Mukendi Mputu
 */
class Generate implements IGenerator<FeatureGraphModel> {

	static IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot()
	static IPath tmpPath
	static IProject project
	/*
	override generate(FeatureGraphModel model, IPath targetDir, IProgressMonitor monitor) {
		project = root.getContainerForLocation(targetDir).project

		if (model.modelName.nullOrEmpty)
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
		//createPackageFolders(new Path("/info/scce/cinco/product/userdocgenerator/test"), testJavaFolder, monitor)
			
		// Generate Main.java
		// write java file to correct location
		val appPkg = new Path("/info/scce/cinco/product/userdocgenerator/app")
		EclipseFileUtils.writeToFile(mainJavaFolder.getFile(appPkg+'/Main.java'),model.generateMainJavaCode)
		
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
		
		EclipseFileUtils.writeToFile(root.getFileForLocation(targetDir.append(model.modelName + "Feature.txt")),
			model.generateModelInfo
		)
	}
	*/
	private static def generateMainJavaCode(FeatureGraphModel model) {
		var List<Property> properties 
		var List<BaseURL> urls 
		var List<BrowserName> browserNames
		var List<UserName> userNames 
		var List<Email> emails 
		var List<Password> passwords
		// Lists of configuration nodes
		if (!model.propertyContainers.isEmpty) {
			for (propsContainer : model.propertyContainers) {
				properties = new BasicEList(propsContainer.propertys)
				urls = new BasicEList(propsContainer.baseURLs)
				browserNames = new BasicEList(propsContainer.browserNames)
				userNames = new BasicEList(propsContainer.userNames)
				emails = new BasicEList(propsContainer.emails)
				passwords = new BasicEList(propsContainer.passwords)
			}
		}

		// At least on property has to be defined
		if(browserNames.isEmpty)
			throw new RuntimeException("You have to define at least the browser property.\nUse the property container to contain it.")
		// At least on property has to be defined
		val importStatement = switch browserNames.head.name {
								case "firefox":  "import org.openqa.selenium.firefox.FirefoxDriver;"
								case "chrome": "import org.openqa.selenium.chrome.ChromeDriver;"
								case "edge": "import org.openqa.selenium.edge.EdgeDriver;"
								case "safari": "import org.openqa.selenium.safari.SafariDriver;"
								case "ie": "import org.openqa.selenium.ie.InternetExplorerDriver;"
								case "opera": "import org.openqa.selenium.opera.OperaDriver;"
							}
		return 	'''
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
		«importStatement»
		import org.openqa.selenium.support.ui.WebDriverWait;
		
		public class Main implements Runnable {
			protected static WebDriver driver;
			«FOR prop : properties»
			protected static String «prop.name» = "«prop.value»"
			«ENDFOR»
			«FOR url : urls»
			protected static String «url.eClass.name.toFirstLower» = "«url.content»"
			«ENDFOR»
			«FOR browser : browserNames»
			protected static String «browser.eClass.name.toFirstLower» = "«browser.name»"
			«ENDFOR»
			«FOR uName : userNames»
			protected static String «uName.eClass.name.toFirstLower» = "«uName.value»"
			«ENDFOR»
			«FOR email : emails»
			protected static String «email.eClass.name.toFirstLower» = "«email.value»"
			«ENDFOR»
			«FOR pword : passwords»
			protected static String «pword.eClass.name.toFirstLower» = "«pword.value»"
			«ENDFOR»
			
			protected static WebElement element;
			
			public static void main (String[] args){
				// Set path to driver executable as system path
				switch («browserNames.head.eClass.name.toFirstLower») {
					case "firefox": 
						System.setProperty("webdriver.gecko.driver", "/home/mukendi/opt/WebDriver/bin/geckodriver");
						driver = new FirefoxDriver();
						break;
					case "chrome": 
						System.setProperty("webdriver.chrome.driver", "/home/mukendi/opt/WebDriver/bin/chromedriver");
						driver = new ChromeDriver();
						break;
					case "safari": 
						// Run the following command from the terminal for the first time and type your password at the prompt to authorise WebDriver
						// High Sierra: safaridriver --enable
						// El Capitan and Sierra:
						//		- Enable the Developer menu from Safari preferences
						//		- Check the Allow Remote Automation option from with the Develop menu
						// 		- run the following command '/usr/bin/safaridriver -p 1337</' and type your password 
						driver = new SafariDriver();
						break;
					case "edge": 
						System.setProperty("webdriver.edge.driver", "C:/path/to/MicrosoftWebDriver.exe");
						driver = new EdgeDriver();
						break;
					case "ie": 
						System.setProperty("webdriver.ie.driver", "C:/path/to/IEDriver.exe");
						driver = new InternetExplorerDriver();
						break;
					case "opera": 
						System.setProperty("webdriver.opera.driver", "/home/mukendi/opt/WebDriver/bin/operadriver");
						driver = new OperaDriver();
						break;
				}
		
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				element = null;
				Main main = new Main();
				main.run();
			}
		
			@Override
			public void run() {
				«FOR startNode : model.startNodes»
				// Start of sequence «startNode.id»
				{
					this.openBrowser();
					«FOR node : startNode.extractSequence»
					«IF node instanceof DocNode »
					//------- DocNode Code
					this.«new Generate2().generate(node.getMgl())»
					//------- END DocNode Code
					«ELSEIF node instanceof EndNode»
					this.closeBrowser();	
					«ENDIF»
					«ENDFOR»
				}	
				«ENDFOR»
			}
			
			/*================== Selenium Methods ==================*/
		
			public Boolean openBrowser(String sBrowserType)
			{
				this.driver.manage().window().maximize();
				return true;
			}
			public Boolean goToPage(String sSiteURL)
			{
				this.driver.get(sSiteURL);
				return true;
			}
			public Boolean takePageScreenshot(String folderName, String pictureName) throws IOException
			{
				//Use TakesScreenshot method to capture screenshot
				TakesScreenshot screenshot = (TakesScreenshot)this.driver;
				File source = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./"+folderName+"/" + pictureName + ".png"));
				return true;
			}
			public Boolean takeElementScreenshot(WebElement pElement, String folderName, String pictureName) throws IOException
			{
				//Capture single element screenshot
				File source = pElement.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./"+folderName+"/" + pictureName + ".png"));
				return true;
			}
			public void highlightElement()
			{
				JavascriptExecutor jsExec = (JavascriptExecutor)this.driver;
				jsExec.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');", this.element);
			}
			public Boolean typeIn(String elementID, String contentText)
			{
				WebElement inputField = this.driver.findElement(By.id(elementID));
				highlightElement(inputField);
				inputField.sendKeys(contentText + Keys.TAB);
				return true;
			}
			public Boolean pressEnter()
			{
				WebElement enterBtn = this.driver.findElement(By.xpath("//button[@type='submit']"));
				highlightElement(enterBtn);
				enterBtn.click();;
				return true;
			}
			public void closeBrowser()
			{
				this.driver.quit();
			}
		}
	'''
	}

	private static def extractSequence(StartNode start) {
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
	
	private static def void createPackageFolders(IPath pkgPath, IContainer rootDir, IProgressMonitor monitor) {
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

	private static def generateModelInfo(FeatureGraphModel model) '''
		=== «model.modelName» ===
		
		The model contains «model.allNodes.size» nodes. Here's some general information about them:

		«FOR node : model.allNodes»
			* node «node.id» of type '«node.eClass.name»' with «node.successors.size» successors and «node.predecessors.size» predecessors
			«IF model.allContainers.contains(node)»
				«FOR containedNode : Container.cast(node).nodes»
					- sub node «containedNode.id» of type '«containedNode.eClass.name»'
				«ENDFOR»
			«ENDIF»
		«ENDFOR»
	'''
	
	override generate(FeatureGraphModel model, IPath srcGenPath, IProgressMonitor arg2) {
		new UserDocProjectGenerator(model).createProject
	}
	
}
