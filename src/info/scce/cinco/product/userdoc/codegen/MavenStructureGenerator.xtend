package info.scce.cinco.product.userdoc.codegen

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException

class MavenStructureGenerator {
	
	def static generateMavenStructure(IProject projectDir, IProgressMonitor monitor) {
				
		val mainFolder = '/src/main'
		val testFolder = '/src/test'
		val targetFolder = '/target'
		
		/* create maven specific folder */
		try {
			
			projectDir.getFolder(targetFolder).create(true, true, monitor)
			projectDir.getFolder(mainFolder).create(true, true, monitor)
			projectDir.getFolder(testFolder).create(true, true, monitor)
			
			generateJavaFolders(projectDir, monitor)
			generateResourceFolders(projectDir, monitor)
			
		} catch (CoreException exception) {
			
			exception.printStackTrace()
			
		} catch (Exception exception) {
			
			exception.printStackTrace()
			
		}
	}
	
	private def static generateJavaFolders(IProject projectDir, IProgressMonitor monitor){
		
		val mainJavaFolder = '/src/main/java'
		val testJavaFolder = '/src/test/java'
		
		projectDir.getFolder(mainJavaFolder).create(true, true, monitor)
		projectDir.getFolder(testJavaFolder).create(true, true, monitor)
		
	}
	
	private def static generateResourceFolders(IProject projectDir, IProgressMonitor monitor){
		
		val mainResourceFolder = '/src/main/resources'
		val testResourceFolder = '/src/test/resources'
		
		projectDir.getFolder(mainResourceFolder).create(true, true, monitor)
		projectDir.getFolder(testResourceFolder).create(true, true, monitor)
		
	}
	
}