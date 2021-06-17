package info.scce.cinco.product.userdoc.codegen

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor

class PackageGenerator {
	
	def static generateJavaPackages(String pkgName, IProject projectDir, IProgressMonitor monitor) {
		val mainJavaFolder = '/src/main/java'
		val String[] pkgPath = pkgName.split(".")
		for (pkg : pkgPath) {
			println(pkgPath)
		}
		/* For 0 to legnth of pkgPath:
		 * 		create directory
		 * 		fetch that directory and
		 *  	create another one in it
		 */
		 for (var i=0; i < pkgPath.length; i++) {
			/* create package folders */
			try {
				
				projectDir.getFolder(mainJavaFolder + pkgPath.remove(i)).create(true, true, monitor)
				
			} catch (Exception exception) {
				
				exception.printStackTrace()
				
			}
		 	
		 }
		
	}
		
	def static generateTestPackages(String pkgName, IProject projectDir, IProgressMonitor monitor) {
		val testJavaFolder = '/src/test/java'
		
		/* create package folders */
		try {
			
			projectDir.getFolder(testJavaFolder).create(true, true, monitor)
			
		} catch (Exception exception) {
			
			exception.printStackTrace()
			
		}
		
	}
	
}