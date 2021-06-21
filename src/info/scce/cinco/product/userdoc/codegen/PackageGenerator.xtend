package info.scce.cinco.product.userdoc.codegen

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor

class PackageGenerator {
	
	def static generateJavaPackages(String pkgName, IProject projectDir, IProgressMonitor monitor) {
		val mainJavaFolder = '/src/main/java/'

		/* create package folders */
		try {
			
			projectDir.getFolder(mainJavaFolder + pkgName).create(true, true, monitor)
			
		} catch (Exception exception) {

			exception.printStackTrace()
		}
	}

	def static generateTestPackages(String pkgName, IProject projectDir, IProgressMonitor monitor) {
		val testJavaFolder = '/src/test/java/'
		
		/* create package folders */
		try {

			projectDir.getFolder(testJavaFolder + pkgName).create(true, true, monitor)

		} catch (Exception exception) {

			exception.printStackTrace()

		}
		
	}
	
}