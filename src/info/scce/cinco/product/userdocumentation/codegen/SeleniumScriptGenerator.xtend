package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate
import info.scce.cinco.product.features.main.feature.PropertyContainer
import info.scce.cinco.product.features.main.feature.FeatureGraphModel
import info.scce.cinco.product.features.main.feature.WebDriver
import info.scce.cinco.product.features.main.feature.Username
import info.scce.cinco.product.features.main.feature.Password
import info.scce.cinco.product.features.main.feature.Property
import info.scce.cinco.product.features.main.feature.Email
import java.util.List
import java.util.HashMap
import java.util.Map
import static extension info.scce.cinco.product.userdocumentation.codegen.HelperExtension.*

class SeleniumScriptGenerator extends UserDocFileTemplate {
	
	val FeatureGraphModel featureModel
	var List<Property> properties 
	var List<PropertyContainer> propsContainers
	var List<Username> usernameList 
	var List<Email> emailList
	var List<Password> passwordList
	
	var HashMap<WebDriver, Map<String, String>> drivers = new HashMap<WebDriver, Map<String, String>>
	var HashMap<String, String> concreteDriver = new HashMap<String, String>
	
	new(FeatureGraphModel ftModel) {
		this.featureModel = ftModel
		this.propsContainers = featureModel.propertyContainers
		this.properties = propsContainers.map[propertys].flatten.toList
		this.usernameList = propsContainers.map[usernames].flatten.toList
		this.emailList = propsContainers.map[emails].flatten.toList
		this.passwordList = propsContainers.map[passwords].flatten.toList
		
		if (!propsContainers.empty) {
			for (driver : propsContainers.map[webDrivers].flatten.toList) {
				this.concreteDriver.putIfAbsent("driverName", driver.driverName)
				this.concreteDriver.putIfAbsent("fullyQN", driver.driverFqn)
				this.concreteDriver.putIfAbsent("className", driver.driverClass)
				this.concreteDriver.putIfAbsent("driverProp", driver.driverProperty)
				this.drivers.putIfAbsent(driver, this.concreteDriver)
			}
		}
		
		
	}

	override fileName() {
		'''«className».java'''
	}
	
	def className() {
		'''GetSeleniumScreenshots'''
	}
	
	override fileTemplate() {
		if (drivers.empty)
			throw new RuntimeException("No WebDriver has been specified.")
		'''
		// Generated by «this.class.name»
		«IF !packageName.nullOrEmpty»
			package «packageName»;
		«ENDIF»
		
		«IF true»
			import java.io.File;
			import java.time.Duration;
			import java.io.IOException;
			import org.openqa.selenium.By;
			import org.openqa.selenium.Keys;
			import org.openqa.selenium.WebDriver;
			import org.openqa.selenium.WebElement;
			import org.openqa.selenium.OutputType;
			import org.apache.commons.io.FileUtils;
			import org.openqa.selenium.TakesScreenshot;
			import org.openqa.selenium.support.ui.Select;
			import org.openqa.selenium.JavascriptExecutor;
			«IF !drivers.empty»
				«FOR driver : drivers.entrySet»
				import «driver.value.get("fullyQN")»;
				«ENDFOR»
			«ELSE»
			// No Selenium Driver were specified
			«ENDIF»
			import org.openqa.selenium.support.ui.WebDriverWait;
			import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
		«ENDIF»
		
		«classTemplate»
		'''
	}
	
	def classTemplate() '''
		/**
		 * This class is the main entry point of the model-based generated application.
		 * Whenever you make some changes to your model and click generate, this class will be
		 * automatically regenerated.
		 * 
		 * It is discouraged to edit this class, since any changes made will be overwritten.
		 *
		 * @author Mukendi Mputu
		 */
		
		@SuppressWarnings("unused")
		class «className» implements Runnable{
			// User Credentials
			private static String username;
			private static String password;
			private static String email;
			«IF !drivers.empty»
			«FOR driver : drivers.entrySet»
			private static WebDriver «driver.value.get("driverName")»;
			private static WebDriverWait wait;
			«ENDFOR»
			«ELSE»
			// No Selenium Driver were specified
			«ENDIF»
			«IF !properties.empty»
			«FOR prop : properties»
			«IF !prop.equals(null)»
			«prop.name» «prop.value»;
			«ENDIF»
			«ENDFOR»
			«ELSE»
			// No Selenium Property were specified
			«ENDIF»
			private static WebElement element;
			private static Long DEFAULT_TIMEOUT = 10L;
		
			private «className»() {
				username = "«usernameList.head !== null ? usernameList.head.value : ""»";
				email = "«emailList.head !== null ? emailList.head.value : ""»";
				password = "«passwordList.head !== null ? passwordList.head.value : ""»";
				«FOR driver : drivers.entrySet»
				System.setProperty("«driver.key.driverProperty»", "«driver.key.path»");
				«driver.value.get("driverName")» = new «driver.key.driverClass»();
				wait = new WebDriverWait(«driver.value.get("driverName")», Duration.ofSeconds(DEFAULT_TIMEOUT));
				«ENDFOR»
				element = null;
			}
		
			public static void main(String[] args) {
				«className» app = new «className»();
				app.run();
			}
		
			@Override
			public void run() {
				// For every feature container in the MGL generate a sequence of methods
				this.openBrowser();
				«FOR featureCont : featureModel.begins.head.extractFeatureSequence»
				{
					// Start of sequence «featureCont.title»
					try {
						«FOR docNode : featureCont.extractSequence»
							// DocNode «docNode.mgl.modelName»
							«docNode.getMgl().getLinesOfCode(featureCont.title)»
						«ENDFOR»
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
				«ENDFOR»
				this.closeBrowser();
			}
		
			/*================== Selenium Methods ==================*/
		
			public Boolean openBrowser()
			{
				«className».«this.concreteDriver.get("driverName")».manage().window().maximize();
				return true;
			}
			public Boolean goToPage(String sSiteURL)
			{
				«className».«this.concreteDriver.get("driverName")».get(sSiteURL);
				return true;
			}
			public Boolean takePageScreenshot(String folderName, String pictureName) throws IOException
			{
				try {
			        Thread.sleep(1000);
			    } catch (InterruptedException e) {
			        e.printStackTrace();
			    }
				//Use TakesScreenshot method to capture screenshot
				TakesScreenshot screenshot = (TakesScreenshot)«className».«this.concreteDriver.get("driverName")»;
				File source = screenshot.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("documentation/docs/src/features/"+folderName+"/" + pictureName + ".png"));
				return true;
			}
			public WebElement findPageElement(String selector)
			{
				return «className».«this.concreteDriver.get("driverName")».findElement(By.cssSelector(selector));
			}
			public void highlightElement(String selector)
			{
				JavascriptExecutor jsExec = (JavascriptExecutor)«className».«this.concreteDriver.get("driverName")»;
				jsExec.executeScript("arguments[0].setAttribute('style','border: 4px solid red;');", findPageElement(selector));
			}
			public void undoHighlightElement(String selector)
			{
				JavascriptExecutor jsExec = (JavascriptExecutor)«className».«this.concreteDriver.get("driverName")»;
				jsExec.executeScript("arguments[0].setAttribute('style','border: 4px solid red;');", findPageElement(selector));
			}
			public Boolean typeIn(String selector, String contentText)
			{
				findPageElement(selector).sendKeys(contentText + Keys.TAB);
				return true;
			}
			public Boolean waitUntilElementPresent(String selector) {
				return wait.until(presenceOfElementLocated(By.cssSelector(selector)))!= null;
			}
			public Boolean clickBtn(String selector)
			{
				findPageElement(selector).click();
				return true;
			}
			public Boolean select(String selector, String option)
			{
				Select selectBox = new Select(findPageElement(selector));
				selectBox.selectByVisibleText(option);
				return true;
			}
			public Boolean pressEnter()
			{
				findPageElement("button[type='submit']").click();
				return true;
			}
			public void closeBrowser()
			{
				«className».«this.concreteDriver.get("driverName")».close();
			}
		}
	'''
	
	def String packageName() {
		applicationPackage
	}
	
	
}