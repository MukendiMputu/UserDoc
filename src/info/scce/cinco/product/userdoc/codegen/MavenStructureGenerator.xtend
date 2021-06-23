package info.scce.cinco.product.userdoc.codegen

import org.eclipse.core.resources.IProject
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.CoreException

class MavenStructureGenerator {
	static var mainFolder = '/src/main'
	static var testFolder = '/src/test'
	static var targetFolder = '/target'
	
	def static generateMavenStructure(IProject projectDir, IProgressMonitor monitor) {
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
		projectDir.getFolder(mainFolder + "/java").create(true, true, monitor)
		projectDir.getFolder(testFolder + "/java").create(true, true, monitor)
	}
	
	private def static generateResourceFolders(IProject projectDir, IProgressMonitor monitor){
		projectDir.getFolder(mainFolder + '/resources').create(true, true, monitor)
		projectDir.getFolder(testFolder + '/resources').create(true, true, monitor)
	}
	
}