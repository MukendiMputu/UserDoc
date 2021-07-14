package info.scce.cinco.product.userdoc.codegen

import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IProject
import org.eclipse.core.resources.IContainer
import org.eclipse.core.runtime.IProgressMonitor

class PackageGenerator {
	static IFolder pkgFolder
	static IContainer parent

	def static void generatePkg(String pkgName, IProject projectDir, IProgressMonitor monitor) {
		pkgFolder = projectDir.getFolder(pkgName)
		/* create package folders */
		try {
			if (!pkgFolder.exists()) {
				parent = pkgFolder.parent
				while ((parent instanceof IFolder) && !parent.exists()) {
					generatePkg(parent.projectRelativePath.toString(), projectDir, monitor)
					pkgFolder = projectDir.getFolder(pkgName)
					parent = pkgFolder.parent
				}
				pkgFolder.create(true, true, monitor)
			}
		} catch (Exception exception) {
			
			exception.printStackTrace()
			
		}
	}
}