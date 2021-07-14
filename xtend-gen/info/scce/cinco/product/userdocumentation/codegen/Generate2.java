package info.scce.cinco.product.userdocumentation.codegen;

import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import graphmodel.Node;
import info.scce.cinco.product.userdocumentation.codegen.MavenStructureGenerator;
import info.scce.cinco.product.userdocumentation.codegen.PackageGenerator;
import info.scce.cinco.product.userdocumentation.codegen.PomXMLGenerator;
import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class Generate2 implements IGenerator<UserSequenceGraphModel> {
  private IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
  
  private IProject project;
  
  @Override
  public void generate(final UserSequenceGraphModel model, final IPath targetDir, final IProgressMonitor monitor) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(model.getModelName());
    if (_isNullOrEmpty) {
      throw new RuntimeException("Model\'s name cannot be empty!");
    }
    final String modelName = model.getModelName();
    this.project = this.root.getContainerForLocation(targetDir).getProject();
    PomXMLGenerator.generateCode(this.project);
    final CharSequence modelInfo = this.generateModelInfo(model);
    final IFile modelInfoTextFile = this.root.getFileForLocation(targetDir.append((modelName + ".txt")));
    EclipseFileUtils.writeToFile(modelInfoTextFile, modelInfo);
    MavenStructureGenerator.generateMavenStructure(this.project, monitor);
    final String[] pkgs = { "config", "main", "pages", "site", "tool", "test" };
    final String mainPackagePrefix = "/src/main/java/com/example/";
    final String testPackagePrefix = "/src/test/java/com/example/";
    for (final String pkg : pkgs) {
      PackageGenerator.generatePkg((mainPackagePrefix + pkg), this.project, monitor);
    }
    String _get = pkgs[5];
    String _plus = (testPackagePrefix + _get);
    PackageGenerator.generatePkg(_plus, this.project, monitor);
    IFile _file = this.project.getFile((mainPackagePrefix + "main/Start.java"));
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package com.example.main;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import com.example.site.Site;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Start {");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main() throws InterruptedException {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Site site = new Site();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("site.Login();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Thread.sleep(3000);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    EclipseFileUtils.writeToFile(_file, _builder);
    IFile _file_1 = this.project.getFile((mainPackagePrefix + "pages/Page.java"));
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package com.example.pages;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("import com.example.tool.AutomationClass;");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("public class Page {");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public static AutomationClass driverTool;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("protected String sPageURL, sBrowserName;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public Boolean OpenPage() {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("return true;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("public Boolean ClosePage() {");
    _builder_1.newLine();
    _builder_1.append("\t\t");
    _builder_1.append("return true;");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("}");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    EclipseFileUtils.writeToFile(_file_1, _builder_1);
    IFile _file_2 = this.project.getFile((mainPackagePrefix + "site/Site.java"));
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("package com.example.site;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("import java.io.FileInputStream;");
    _builder_2.newLine();
    _builder_2.append("import java.io.FileNotFoundException;");
    _builder_2.newLine();
    _builder_2.append("import java.util.Properties;");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("public class Site {");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("public String sBrowserName, sSiteURL, sUserName, sPassword;");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("public Properties props;");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("public Site() {");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("try {");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("// Try loading the properties from config.properties file");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("props = new Properties();");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("FileInputStream fis = new FileInputStream(\"/home/mukendi/eclipse-workspace/login-doc/src/main/java/com/example/config/config.properties\");");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("props.load(fis);");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("sBrowserName = props.getProperty(\"browser\");");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("sSiteURL = props.getProperty(\"url\");");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("sUserName = props.getProperty(\"user\");");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("sPassword = props.getProperty(\"password\");");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("} catch (FileNotFoundException e) {");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("e.printStackTrace();");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("} catch (Exception e) {");
    _builder_2.newLine();
    _builder_2.append("\t\t\t");
    _builder_2.append("e.printStackTrace();");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.append("\t\t\t\t\t");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("public Boolean Login() {");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("return true;");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("public String getsBrowserName() {");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("return sBrowserName;");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("public String getsSiteURL() {");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("return sSiteURL;");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("public String getsUserName() {");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("return sUserName;");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("public String getsPassword() {");
    _builder_2.newLine();
    _builder_2.append("\t\t");
    _builder_2.append("return sPassword;");
    _builder_2.newLine();
    _builder_2.append("\t");
    _builder_2.append("}");
    _builder_2.newLine();
    _builder_2.append("}");
    _builder_2.newLine();
    EclipseFileUtils.writeToFile(_file_2, _builder_2);
    final CharSequence config = this.generateConfigurationFile();
    final IFile configFile = this.project.getFile((mainPackagePrefix + "config/config.properties"));
    EclipseFileUtils.writeToFile(configFile, config);
    IFile _file_3 = this.project.getFile((mainPackagePrefix + "tool/AutomationClass.java"));
    StringConcatenation _builder_3 = new StringConcatenation();
    _builder_3.append("package com.example.tool;");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("import java.io.File;");
    _builder_3.newLine();
    _builder_3.append("import java.io.IOException;");
    _builder_3.newLine();
    _builder_3.append("import org.openqa.selenium.By;");
    _builder_3.newLine();
    _builder_3.append("import org.openqa.selenium.Keys;");
    _builder_3.newLine();
    _builder_3.append("import org.openqa.selenium.WebDriver;");
    _builder_3.newLine();
    _builder_3.append("import org.openqa.selenium.WebElement;");
    _builder_3.newLine();
    _builder_3.append("import org.openqa.selenium.OutputType;");
    _builder_3.newLine();
    _builder_3.append("import org.apache.commons.io.FileUtils;");
    _builder_3.newLine();
    _builder_3.append("import org.openqa.selenium.TakesScreenshot;");
    _builder_3.newLine();
    _builder_3.append("import org.openqa.selenium.JavascriptExecutor;");
    _builder_3.newLine();
    _builder_3.append("import org.openqa.selenium.firefox.FirefoxDriver;");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("public class AutomationClass {");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("protected WebDriver driver;");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("protected String sBrowserName;");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("protected WebElement element;");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("public AutomationClass() {");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("driver = null;");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("sBrowserName = null;");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("element = null;");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("public Boolean OpenBrowser(String sBrowserType) {");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("// Set path to driver executable as system path");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("if (sBrowserType.equalsIgnoreCase(\"firefox\")) {");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("System.setProperty(\"webdriver.gecko.driver\", \"/home/mukendi/opt/WebDriver/bin/geckodriver\");");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("driver = new FirefoxDriver();");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("driver.manage().window().maximize();");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("return true;");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("public Boolean GoToPage(String sSiteURL) {");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("driver.get(sSiteURL);");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("return true;");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("public Boolean TakeScreenshot(String folderName, String pictureName) {");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("//Use TakesScreenshot method to capture screenshot");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("TakesScreenshot screenshot = (TakesScreenshot)driver;");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("File source = screenshot.getScreenshotAs(OutputType.FILE);");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("try {");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("FileUtils.copyFile(source, new File(\"./\"+folderName+\"/\" + pictureName + \".png\"));");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("} catch (IOException e) {");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("e.printStackTrace();");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("return true;");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("public void highlightElement(WebElement elem) {");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("JavascriptExecutor jsExec = (JavascriptExecutor) driver;");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("jsExec.executeScript(\"arguments[0].setAttribute(\'style\',\'border: 2px solid red;\');\", elem);");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("public Boolean enterCredentials(String sUserName, String sPassword) {");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("WebElement inputEmail = driver.findElement(By.id(\"email\"));");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("WebElement inputPwd = driver.findElement(By.id(\"pass\"));");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("highlightElement(inputEmail);");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("inputEmail.sendKeys(sUserName + Keys.TAB);");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("highlightElement(inputPwd);");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("try {");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("Thread.sleep(5000);");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("} catch (InterruptedException e) {");
    _builder_3.newLine();
    _builder_3.append("\t\t\t");
    _builder_3.append("e.printStackTrace();");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("inputPwd.sendKeys(sPassword + Keys.ENTER);");
    _builder_3.newLine();
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("return true;");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("public void CloseBrowser() {");
    _builder_3.newLine();
    _builder_3.append("\t\t");
    _builder_3.append("driver.quit();");
    _builder_3.newLine();
    _builder_3.append("\t");
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.append("}");
    _builder_3.newLine();
    _builder_3.newLine();
    EclipseFileUtils.writeToFile(_file_3, _builder_3);
    IFile _file_4 = this.project.getFile((testPackagePrefix + "test/SmokeTest.java"));
    StringConcatenation _builder_4 = new StringConcatenation();
    _builder_4.append("package com.example.test;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("import org.testng.Assert;");
    _builder_4.newLine();
    _builder_4.append("import org.testng.annotations.AfterMethod;");
    _builder_4.newLine();
    _builder_4.append("import org.testng.annotations.BeforeMethod;");
    _builder_4.newLine();
    _builder_4.append("import org.testng.annotations.Test;");
    _builder_4.newLine();
    _builder_4.append("import com.example.site.Site;");
    _builder_4.newLine();
    _builder_4.newLine();
    _builder_4.append("public class SmokeTest {");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("Boolean bResult = false;");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("Site site; ");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("@BeforeMethod");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("public void beforeMethod() {");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("site = new Site();");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("@Test");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("public void testCallFunction() throws InterruptedException {");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("bResult =  site.Login();");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("Thread.sleep(3000);");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.append("Assert.assertTrue(bResult, \"Login failed\");");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("@AfterMethod");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("public void afterMethode() {");
    _builder_4.newLine();
    _builder_4.append("\t\t");
    _builder_4.newLine();
    _builder_4.append("\t");
    _builder_4.append("}");
    _builder_4.newLine();
    _builder_4.append("}");
    _builder_4.newLine();
    EclipseFileUtils.writeToFile(_file_4, _builder_4);
    IFile _file_5 = this.project.getFile(".classpath");
    StringConcatenation _builder_5 = new StringConcatenation();
    _builder_5.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
    _builder_5.newLine();
    _builder_5.append("<classpath>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("<classpathentry kind=\"src\" output=\"target/classes\" path=\"src/main/java\">");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("<attributes>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"optional\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"maven.pomderived\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("</attributes>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("</classpathentry>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("<classpathentry excluding=\"**\" kind=\"src\" output=\"target/classes\" path=\"src/main/resources\">");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("<attributes>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"maven.pomderived\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("</attributes>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("</classpathentry>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("<classpathentry kind=\"src\" output=\"target/test-classes\" path=\"src/test/java\">");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("<attributes>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"test\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"optional\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"maven.pomderived\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("</attributes>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("</classpathentry>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("<classpathentry excluding=\"**\" kind=\"src\" output=\"target/test-classes\" path=\"src/test/resources\">");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("<attributes>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"test\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"maven.pomderived\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("</attributes>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("</classpathentry>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("<classpathentry kind=\"con\" path=\"org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-1.8\">");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("<attributes>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"module\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"maven.pomderived\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("</attributes>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("</classpathentry>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("<classpathentry kind=\"con\" path=\"org.eclipse.m2e.MAVEN2_CLASSPATH_CONTAINER\">");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("<attributes>");
    _builder_5.newLine();
    _builder_5.append("\t\t\t");
    _builder_5.append("<attribute name=\"maven.pomderived\" value=\"true\"/>");
    _builder_5.newLine();
    _builder_5.append("\t\t");
    _builder_5.append("</attributes>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("</classpathentry>");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.newLine();
    _builder_5.append("\t");
    _builder_5.append("<classpathentry kind=\"output\" path=\"target/classes\"/>");
    _builder_5.newLine();
    _builder_5.append("</classpath>");
    _builder_5.newLine();
    EclipseFileUtils.writeToFile(_file_5, _builder_5);
  }
  
  private CharSequence generateModelInfo(final UserSequenceGraphModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("=== ");
    String _modelName = model.getModelName();
    _builder.append(_modelName);
    _builder.append(" ===");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("The model contains ");
    int _size = model.getAllNodes().size();
    _builder.append(_size);
    _builder.append(" nodes. Here\'s some general information about them:");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Node> _allNodes = model.getAllNodes();
      for(final Node node : _allNodes) {
        _builder.append("* node ");
        String _id = node.getId();
        _builder.append(_id);
        _builder.append(" of type \'");
        String _name = node.eClass().getName();
        _builder.append(_name);
        _builder.append("\' with ");
        int _size_1 = node.<Node>getSuccessors().size();
        _builder.append(_size_1);
        _builder.append(" successors and ");
        int _size_2 = node.<Node>getPredecessors().size();
        _builder.append(_size_2);
        _builder.append(" predecessors");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    return _builder;
  }
  
  private CharSequence generateConfigurationFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("url = https://archmukki-localnet.de");
    _builder.newLine();
    _builder.append("user = mputustella@yahoo.de");
    _builder.newLine();
    _builder.append("password = Asdfjklö");
    _builder.newLine();
    _builder.append("browser = firefox");
    _builder.newLine();
    return _builder;
  }
}