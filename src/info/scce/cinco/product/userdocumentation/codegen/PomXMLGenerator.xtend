package info.scce.cinco.product.userdocumentation.codegen


class PomXMLGenerator extends UserDocFileTemplate {
	
	override fileName() {
		'''pom.xml'''
	}
	
	override fileTemplate() {
		'''
		<project 
			xmlns="http://maven.apache.org/POM/4.0.0"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
			<modelVersion>4.0.0</modelVersion>
			<groupId>info.scce.cinco.product.userdoc</groupId>
			<artifactId>login-doc</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			<name>Login UserDoc </name>
			<dependencies>
				<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
				<dependency>
					<groupId>commons-io</groupId>
					<artifactId>commons-io</artifactId>
					<version>2.11.0</version>
				</dependency>
				
				<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
				<dependency>
					<groupId>org.seleniumhq.selenium</groupId>
					<artifactId>selenium-java</artifactId>
					<version>4.0.0-rc-1</version>
				</dependency>
				
				<!-- https://mvnrepository.com/artifact/org.testng/testng -->
				<dependency>
					<groupId>org.testng</groupId>
					<artifactId>testng</artifactId>
					<version>7.4.0</version>
					<scope>test</scope>
				</dependency>
			</dependencies>
		</project>
		'''
	}
	
}