package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IContainer
import org.eclipse.core.runtime.IProgressMonitor

class PackageGenerator {
	static IFolder pkgFolder
	static IContainer parent

	def static void generatePkg(String pkgName, IFolder srcGenDir, IProgressMonitor monitor) {
		pkgFolder = srcGenDir.getFolder(pkgName)
		/* create package folders */
		try {
			if (!pkgFolder.exists()) {
				parent = pkgFolder.parent
				while ((parent instanceof IFolder) && !parent.exists()) {
					generatePkg(parent.projectRelativePath.toString(), srcGenDir, monitor)
					pkgFolder = srcGenDir.getFolder(pkgName)
					parent = pkgFolder.parent
				}
				pkgFolder.create(true, true, monitor)
			}
		} catch (Exception exception) {
			
			exception.printStackTrace()
			
		}
	}
}