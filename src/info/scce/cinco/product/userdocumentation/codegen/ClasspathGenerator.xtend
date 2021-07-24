package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.resources.IProject
import de.jabc.cinco.meta.core.utils.EclipseFileUtils

class ClasspathGenerator {
	
	static var code = '''
		<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
		  <modelVersion>4.0.0</modelVersion>
		  <groupId>info.scce.cinco.product</groupId>
		  <artifactId>userdoc</artifactId>
		  <version>0.0.1-SNAPSHOT</version>
		  <name>User Documentation</name>
		  
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
	
	def static generateCode(IProject project) {
		/* generate pom.xml content, create pom.xml file and write content to file */
		try {
			val pomXML = project.getFile("pom.xml")
			EclipseFileUtils.writeToFile(pomXML, code)
		} catch (Exception exception) {
			exception.printStackTrace()
		} 
	}
}