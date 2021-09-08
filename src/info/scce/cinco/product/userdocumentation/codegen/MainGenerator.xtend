package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate
import info.scce.cinco.product.features.main.feature.PropertyContainer
import info.scce.cinco.product.features.main.feature.FeatureGraphModel
import info.scce.cinco.product.usersequence.main.doc.DocGraphModel
import info.scce.cinco.product.features.main.feature.Browser
import info.scce.cinco.product.features.main.feature.Username
import info.scce.cinco.product.features.main.feature.Password
import info.scce.cinco.product.features.main.feature.Property
import info.scce.cinco.product.features.main.feature.BaseURL
import info.scce.cinco.product.features.main.feature.Email
import java.util.Set
import java.util.List

class MainGenerator extends UserDocFileTemplate {
	
	val FeatureGraphModel featureModel
	val Set<DocGraphModel> docModels
	var List<Property> properties 
	var List<PropertyContainer> propsContainer
	var List<BaseURL> urls 
	var List<Browser> browsers
	var List<Username> userNames 
	var List<Email> emails 
	var List<Password> passwords
	val String importStatement
	
	new(FeatureGraphModel ftModel) {
		this.featureModel = ftModel
		this.docModels = featureModel.docNodes.map[mgl].toSet
		this.propsContainer = featureModel.propertyContainers
		this.browsers = propsContainer.head.browsers
		this.importStatement = switch browsers.get(0).name {
								case "firefox":  "import org.openqa.selenium.firefox.FirefoxDriver;"
								case "chrome": "import org.openqa.selenium.chrome.ChromeDriver;"
								case "edge": "import org.openqa.selenium.edge.EdgeDriver;"
								case "safari": "import org.openqa.selenium.safari.SafariDriver;"
								case "ie": "import org.openqa.selenium.ie.InternetExplorerDriver;"
								case "opera": "import org.openqa.selenium.opera.OperaDriver;"
							}
	}
	
	override fileName() {
		'''«className».java'''
	}
	
	def className() {
		'''Main'''
	}
	
	override fileTemplate() {
		val classTemplateResult = classTemplate
		'''
			«IF !packageName.nullOrEmpty»
				package «packageName»
			«ENDIF»
			«IF true»
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
			«ENDIF»
			
			«classTemplateResult»
		'''
	}
	
	def classTemplate() '''
		/**
		 * 
		 * 
		 */
		class «className» {
			
			def static void main(String[] args) {
				
				}
			
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
	
	def String packageName() '''info.scce.cinco.product.userdocgenerator.app'''
	
}