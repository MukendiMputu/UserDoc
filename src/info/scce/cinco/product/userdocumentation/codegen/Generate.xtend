package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.CoreException
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator

import info.scce.cinco.product.features.features.FeaturesGraphModel
import info.scce.cinco.product.userdocumentation.codegen.PackageGenerator

/**
 *  Example class that generates code for a given FlowGraph model. As different
 *  feature examples might or might not be included (e.g. the external component
 *  library or swimlanes), this generator only does stupidly enumerate all
 *  nodes and prints some general information about them.
 */
class Generate implements IGenerator<FeaturesGraphModel> {

	IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot();
	IProject project

	override generate(FeaturesGraphModel model, IPath targetDir, IProgressMonitor monitor) {

		if (model.name.nullOrEmpty)
			throw new RuntimeException("Model's name cannot be empty!")

		// get the containing folder of the target directory, which is the project directory
		project = root.getContainerForLocation(targetDir).getProject()


		/* generate maven project structure */
		var mainFolder = '/src/main'
		var testFolder = '/src/test'
		var targetFolder = '/target'
		try {
			// first generate main folders
			project.getFolder(targetFolder).create(true, true, monitor)
			project.getFolder(mainFolder).create(true, true, monitor)
			project.getFolder(testFolder).create(true, true, monitor)
	
			// then the subfolders
			project.getFolder(mainFolder + "/java").create(true, true, monitor)
			project.getFolder(testFolder + "/java").create(true, true, monitor)
			
			project.getFolder(mainFolder + '/resources').create(true, true, monitor)
			project.getFolder(testFolder + '/resources').create(true, true, monitor)

		} catch (CoreException exception) {
			
			exception.printStackTrace()
			
		} catch (Exception exception) {
			
			exception.printStackTrace()
			
		}

		/*
		 * First, define the packages for the Selenium project
		 * then create them within the source folders.
		 */
		val String[] pkgs = #["config", "main", "tool"]
		val mainPackagePrefix = "/src/main/java/info/scce/cinco/product/userdocgenerator/"
		// All main packages
		for (pkg : pkgs) {
			PackageGenerator.generatePkg(mainPackagePrefix + pkg, project, monitor)
		}
		// and one test package
		val testPackagePrefix = "/src/test/java/info/scce/cinco/product/userdocgenerator/"
		PackageGenerator.generatePkg(testPackagePrefix + "test", project, monitor)

		// Generate configuration file
		val configFile = project.getFile(mainPackagePrefix + "config/config.properties")
		EclipseFileUtils.writeToFile(configFile,
			'''
				# Here come all the configuration necessary to run the sequences in the browser
				«FOR node : model.keyValues»
				«node.key» = «node.value»
				«ENDFOR»
			'''
		)
		
		// Generate pom.xml file
		EclipseFileUtils.writeToFile(
			project.getFile("pom.xml"),
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
			project.getFile(".classpath"),
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
			project.getFile(".project"),
			'''
			<?xml version="1.0" encoding="UTF-8"?>
			<projectDescription>
				<name>«project.name.split("/").last»</name>
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
		
		// Generate Main.java
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "main/Main.java"),
			'''
				package info.scce.cinco.product.userdocgenerator.main;
				
				import java.io.IOException; 
				import info.scce.cinco.product.userdocgenerator.tool.AutomationClass;
				
				public class Main {
					private static AutomationClass driverTool;
					
					public static void main (String[] args){
						driverTool = new AutomationClass();
						try {
							driverTool.openBrowser("firefox");
							driverTool.goToPage("http://localhost:8080");
							Login("peter", "pwd");
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
					public static Boolean Login(String sUserName, String sPassword) {
						Boolean bResult = true;
						String sequenceName = "Login";
						try {
				
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
				
							driverTool.closeBrowser();
						}
				
						return bResult;
					}
				}
			'''
		)

		
		// generate AutomationClass.java
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "tool/AutomationClass.java"),
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
				protected String sBrowserName, sSiteURL, sUserName, sPassword;
				protected WebElement element;
				protected Properties props;
				
				public AutomationClass() {
					try {
						// Try loading the properties from config.properties file
						props = new Properties();
						FileInputStream fis = new FileInputStream("«configFile.rawLocation»");
						props.load(fis);
						
						sBrowserName = props.getProperty("browser");
						sSiteURL = props.getProperty("url");
						sUserName = props.getProperty("user");
						sPassword = props.getProperty("password");
						driver = null;
						element = null;
						
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					} catch (Exception e) {
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
		)
		
		// Generate SmokeTest.java
		EclipseFileUtils.writeToFile(
			project.getFile(testPackagePrefix + "test/SmokeTest.java"),
			'''
				package info.scce.cinco.product.userdocgenerator.test;
				
				import org.testng.Assert;
				import org.testng.annotations.AfterMethod;
				import org.testng.annotations.BeforeMethod;
				import org.testng.annotations.Test;
				
				import info.scce.cinco.product.userdocgenerator.main.Main;
				
				public class SmokeTest {
					
					Boolean loggedIn = false;
					Main site; 
					
					@BeforeMethod
					public void beforeMethod() {
					}
					
					@Test
					public void testCallFunction() throws InterruptedException {
						loggedIn = Main.Login("peter", "pwd");
						Thread.sleep(3000);
						
						Assert.assertTrue(loggedIn, "Login failed");
					}
					
					@AfterMethod
					public void afterMethode() {
						
					}
				}
			'''
		)
	}

}
