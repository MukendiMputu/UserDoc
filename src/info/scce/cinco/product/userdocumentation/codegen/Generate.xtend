package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.runtime.IPath
import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.resources.IWorkspaceRoot
import org.eclipse.core.resources.ResourcesPlugin
import de.jabc.cinco.meta.core.utils.EclipseFileUtils
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator
import info.scce.cinco.product.site.site.SiteGraphModel

/**
 *  Example class that generates code for a given FlowGraph model. As different
 *  feature examples might or might not be included (e.g. the external component
 *  library or swimlanes), this generator only does stupidly enumerate all
 *  nodes and prints some general information about them.
 */
class Generate implements IGenerator<SiteGraphModel> {

	IWorkspaceRoot root = ResourcesPlugin.workspace.getRoot();
	IProject project

	override generate(SiteGraphModel model, IPath targetDir, IProgressMonitor monitor) {

		if (model.modelName.nullOrEmpty)
			throw new RuntimeException("Model's name cannot be empty!")

		val modelName = model.modelName

		// get the containing folder of the target directory, which is the project directory
		project = root.getContainerForLocation(targetDir).getProject()

		/* generate pom.xml file */
		PomXMLGenerator.generateCode(project)

		/* generate maven project structure */
		MavenStructureGenerator.generateMavenStructure(project, monitor)

		/*
		 * First, define the packages corresponding the the selenium
		 * page object model, then create them within the source folders.
		 */
		val String[] pkgs = #["config", "main", "pages", "site", "tool"]
		val mainPackagePrefix = "/src/main/java/info/scce/cinco/product/userdocgenerator/"
		// All main packages
		for (pkg : pkgs) {
			PackageGenerator.generatePkg(mainPackagePrefix + pkg, project, monitor)
		}
		// and one test package
		val testPackagePrefix = "/src/test/java/info/scce/cinco/product/userdocgenerator/"
		PackageGenerator.generatePkg(testPackagePrefix + "test", project, monitor)

		// generateConfig()
		val config = generateConfigurationFile(model)
		val configFile = project.getFile(mainPackagePrefix + "config/config.properties")
		EclipseFileUtils.writeToFile(configFile, config)
		
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
		
		// Generate Page()
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "pages/Page.java"),
			'''
				package info.scce.cinco.product.userdocgenerator.pages;
				
				import info.scce.cinco.product.userdocgenerator.tool.AutomationClass;
				
				public class Page {
					
					public static AutomationClass driverTool;
					protected String sPageURL, sBrowserName, sClassName;
					
					public Boolean openPage() {
						return true;
					}
				
					public Boolean closePage() {
						return true;
					}
				}

			'''
		)
		
		// Generate Site()
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "site/Site.java"),
			'''
				package info.scce.cinco.product.userdocgenerator.site;
				
				import java.io.FileInputStream;
				import java.io.FileNotFoundException;
				import java.util.Properties;
				
				public class Site {
					
					«FOR node : model.nodes»
					public String s«node.eClass.name.toFirstUpper»;
					«ENDFOR»
					public Properties props;
					
					public Site() {
						try {
							// Try loading the properties from config.properties file
							props = new Properties();
							FileInputStream fis = new FileInputStream("«configFile.fullPath»");
							props.load(fis);
												
							«FOR node : model.nodes»
							s«node.eClass.name.toFirstUpper» = props.getProperty("«node.eClass.name.toLowerCase»");
							«ENDFOR»
							
						} catch (FileNotFoundException e) {
							e.printStackTrace();
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
					
					«FOR node : model.nodes»
					public String gets«node.eClass.name.toFirstUpper»() {
						return s«node.eClass.name.toFirstUpper»;
					}
					
					«ENDFOR»
				}
			'''
		)
		
		// Generate CustomUserSite()
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "site/" +modelName+ ".java"),
			'''
			package info.scce.cinco.product.userdocgenerator.site;
			
			import java.io.FileInputStream;
			import java.io.FileNotFoundException;
			import java.util.Properties;
			
			public class «modelName» extends Site {
			
				// The pages of our website
				«FOR page : model.pages»
				public «page.eClass.name» «page.eClass.name.toFirstLower»;
				«ENDFOR»
			
				public «modelName»() {
					«FOR page : model.pages»
					«page.eClass.name.toFirstUpper» = new «page.eClass.name»(sBrowserName, sSiteURL);
					«ENDFOR»
				}
			
				public Boolean Login() {
					return loginPage.login(this.getsUserName(), this.getsPassword());
				}
			
				public void closeSite() {
					«FOR page : model.pages»
					«page.eClass.name.toFirstLower».closePage();
					«ENDFOR»
				}
			}
		'''
		)
		
		// generate AutomationClass()
		EclipseFileUtils.writeToFile(
			project.getFile(mainPackagePrefix + "tool/AutomationClass.java"),
			'''
			package info.scce.cinco.product.userdocgenerator.tool;
			
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
		
		// Generate SmokeTest()
		EclipseFileUtils.writeToFile(
			project.getFile(testPackagePrefix + "test/SmokeTest.java"),
			'''
				package info.scce.cinco.product.userdocgenerator.test;
				
				import org.testng.Assert;
				import org.testng.annotations.AfterMethod;
				import org.testng.annotations.BeforeMethod;
				import org.testng.annotations.Test;
				
				import info.scce.cinco.product.userdocgenerator.site.«modelName»;
				
				public class SmokeTest {
					
					Boolean bResult = false;
					«modelName» site; 
					
					@BeforeMethod
					public void beforeMethod() {
						site = new «modelName»();
					}
					
					@Test
					public void testCallFunction() throws InterruptedException {
						bResult =  site.login();
						Thread.sleep(3000);
						
						Assert.assertTrue(bResult, "Login failed");
					}
					
					@AfterMethod
					public void afterMethode() {
						
					}
				}
			'''
		)
	}

	private def generateConfigurationFile(SiteGraphModel model) '''
		«FOR node : model.nodes»
			«node.eClass.name.toLowerCase» = «node.eAllContents.toString»
		«ENDFOR»
	'''
	
	private def generatePageJavaClasses(SiteGraphModel model, String pkgPrefix){
		for (page : model.pages) {
			EclipseFileUtils.writeToFile(
				project.getFile(pkgPrefix + "pages/"+page.eClass.name.toFirstUpper+".java"),
				'''
					package info.scce.cinco.product.userdocgenerator.pages;

					public class «page.eClass.name.toFirstUpper» extends Page {
					
						public «page.eClass.name.toFirstUpper»(String sBrowserName, String sSiteURL) {
							driverTool.openBrowser(sBrowserName);
						}
					
						@Override
						public Boolean openPage() {
							driverTool.goToPage(sPageURL);
							return true;
						}
					
						@Override
						public Boolean closePage() {
							driverTool.closeBrowser();
							return true;
						}
					}
				'''
			)
		}
	}
}
