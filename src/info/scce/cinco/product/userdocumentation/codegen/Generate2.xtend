package info.scce.cinco.product.userdoc.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.userdoc.codegen.PomXMLGenerator
import info.scce.cinco.product.userdoc.codegen.PackageGenerator
import info.scce.cinco.product.userdoc.mglid.userdoc.UserDocGraphModel
import info.scce.cinco.product.userdoc.codegen.MavenStructureGenerator

class Generate implements IGenerator<UserDocGraphModel> {
	
	IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot();
	IProject project
	
	override generate(UserDocGraphModel model, IPath targetDir, IProgressMonitor monitor) {
		if (model.modelName.nullOrEmpty)
			throw new RuntimeException("Model's name cannot be empty!")
		
		val modelName = model.modelName
		
		// get the containing folder of the target directory, which is the project directory
		project = root.getContainerForLocation(targetDir).getProject()
		
		/* generate pom.xml file */
		PomXMLGenerator.generateCode(project)
		
		// generate model information files
		val modelInfo = generateModelInfo(model)
		val modelInfoTextFile = root.getFileForLocation(targetDir.append( modelName + ".txt"))
		EclipseFileUtils.writeToFile(modelInfoTextFile, modelInfo)
		
		/* generate maven project structure */
		MavenStructureGenerator.generateMavenStructure(project, monitor)
		
		val String[] pkgs = #["config", "main", "pages", "site", "tool", "test"]
		val mainPackagePrefix = "/src/main/java/com/example/"
		val testPackagePrefix = "/src/test/java/com/example/"
		for (pkg : pkgs) {
			PackageGenerator.generatePkg(mainPackagePrefix + pkg, project, monitor)
		}
			PackageGenerator.generatePkg(testPackagePrefix + pkgs.get(5), project, monitor)

		// generate Main class
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "main/Start.java"),
			'''
				package com.example.main;
				
				import com.example.site.Site;
				
				public class Start {
					
					
					public static void main() throws InterruptedException {
						Site site = new Site();
						
						site.Login();
						Thread.sleep(3000);
						
					}
				}
			'''
		)
		// generatePage()
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "pages/Page.java"),
			'''
				package com.example.pages;
				
				import com.example.tool.AutomationClass;
				
				public class Page {
					
					public static AutomationClass driverTool;
					protected String sPageURL, sBrowserName;
					
					public Boolean OpenPage() {
						return true;
					}
				
					public Boolean ClosePage() {
						return true;
					}
				}
			'''
		)
		
		// generateSite()
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "site/Site.java"),
			'''
				package com.example.site;
				
				import java.io.FileInputStream;
				import java.io.FileNotFoundException;
				import java.util.Properties;
				
				public class Site {
					
					public String sBrowserName, sSiteURL, sUserName, sPassword;
					public Properties props;
					
					public Site() {
						try {
							// Try loading the properties from config.properties file
							props = new Properties();
							FileInputStream fis = new FileInputStream("/home/mukendi/eclipse-workspace/login-doc/src/main/java/com/example/config/config.properties");
							props.load(fis);
							
							sBrowserName = props.getProperty("browser");
							sSiteURL = props.getProperty("url");
							sUserName = props.getProperty("user");
							sPassword = props.getProperty("password");
							
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
									
					public Boolean Login() {
						return true;
					}
				
					public String getsBrowserName() {
						return sBrowserName;
					}
				
					public String getsSiteURL() {
						return sSiteURL;
					}
				
					public String getsUserName() {
						return sUserName;
					}
				
					public String getsPassword() {
						return sPassword;
					}
				}
			'''
		)

		// generateConfig()
		val config = generateConfigurationFile()
		val configFile = project.getFile(mainPackagePrefix + "config/config.properties")
		EclipseFileUtils.writeToFile(configFile, config)
		
		
		// generateAutomationClass()
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "tool/AutomationClass.java"),
			'''
			package com.example.tool;
			
			import java.io.File;
			import java.io.IOException;
			import org.openqa.selenium.By;
			import org.openqa.selenium.Keys;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
			import org.openqa.selenium.OutputType;
			import org.apache.commons.io.FileUtils;
			import org.openqa.selenium.TakesScreenshot;
			import org.openqa.selenium.JavascriptExecutor;
			import org.openqa.selenium.firefox.FirefoxDriver;
			
			public class AutomationClass {
				protected WebDriver driver;
				protected String sBrowserName;
				protected WebElement element;
				
				public AutomationClass() {
					driver = null;
					sBrowserName = null;
					element = null;
				}
				
				public Boolean OpenBrowser(String sBrowserType) {
			
					// Set path to driver executable as system path
					if (sBrowserType.equalsIgnoreCase("firefox")) {
						System.setProperty("webdriver.gecko.driver", "/home/mukendi/opt/WebDriver/bin/geckodriver");
						driver = new FirefoxDriver();
						driver.manage().window().maximize();
					}
					
					return true;
				}
				
				public Boolean GoToPage(String sSiteURL) {
					driver.get(sSiteURL);
					return true;
				}
				
				public Boolean TakeScreenshot(String folderName, String pictureName) {
					//Use TakesScreenshot method to capture screenshot
					TakesScreenshot screenshot = (TakesScreenshot)driver;
			
					File source = screenshot.getScreenshotAs(OutputType.FILE);
			
					try {
						FileUtils.copyFile(source, new File("./"+folderName+"/" + pictureName + ".png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					return true;
				}
				
				public void highlightElement(WebElement elem) {
					JavascriptExecutor jsExec = (JavascriptExecutor) driver;
					jsExec.executeScript("arguments[0].setAttribute('style','border: 2px solid red;');", elem);
				}
			
				public Boolean enterCredentials(String sUserName, String sPassword) {
					WebElement inputEmail = driver.findElement(By.id("email"));
					WebElement inputPwd = driver.findElement(By.id("pass"));
					highlightElement(inputEmail);
					inputEmail.sendKeys(sUserName + Keys.TAB);
					highlightElement(inputPwd);
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					inputPwd.sendKeys(sPassword + Keys.ENTER);
			
					return true;
				}
				
				public void CloseBrowser() {
					driver.quit();
				}
			}

			'''
		)
		
		
		// generateSmokeTest()
		EclipseFileUtils.writeToFile(
			project.getFile(testPackagePrefix + "test/SmokeTest.java"),
			'''
				package com.example.test;
				
				import org.testng.Assert;
				import org.testng.annotations.AfterMethod;
				import org.testng.annotations.BeforeMethod;
				import org.testng.annotations.Test;
				import com.example.site.Site;
				
				public class SmokeTest {
					
					Boolean bResult = false;
					Site site; 
					
					@BeforeMethod
					public void beforeMethod() {
						site = new Site();
					}
					
					@Test
					public void testCallFunction() throws InterruptedException {
						bResult =  site.Login();
						Thread.sleep(3000);
						
						Assert.assertTrue(bResult, "Login failed");
					}
					
					@AfterMethod
					public void afterMethode() {
						
					}
				}
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
					
					<classpathentry excluding="**" kind="src" output="target/classes" path="src/main/resources">
						<attributes>
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
					
					<classpathentry excluding="**" kind="src" output="target/test-classes" path="src/test/resources">
						<attributes>
							<attribute name="test" value="true"/>
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
	}

	private def generateModelInfo(UserDocGraphModel model) '''
		=== «model.userDocGraphModelView.modelName» ===
		
		The model contains «model.allNodes.size» nodes. Here's some general information about them:

		«FOR node : model.allNodes»
			* node «node.id» of type '«node.eClass.name»' with «node.successors.size» successors and «node.predecessors.size» predecessors
		«ENDFOR»
		«model.navigations.get(0).url»
		
	'''
	
	private def generateConfigurationFile() '''
		url = https://archmukki-localnet.de
		user = mputustella@yahoo.de
		password = Asdfjklö
		browser = firefox
	'''
	
}