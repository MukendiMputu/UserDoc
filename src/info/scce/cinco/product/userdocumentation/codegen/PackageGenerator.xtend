package info.scce.cinco.product.userdocumentation.codegen

import org.eclipse.core.resources.IFolder
import org.eclipse.core.resources.IContainer
import org.eclipse.core.runtime.IProgressMonitor
import org.eclipse.core.runtime.Path

class PackageGenerator {
	static IFolder pkgFolder
	static IContainer parent

	def static void generatePkg(String pkgName, IContainer srcGenDir, IProgressMonitor monitor) {
		
		// pkgName = /info/scce/cinco/product/userdocgenerator/main
		// srcGenDir = F/UserDocGenerator/src-gen/src/main
		var pkgPath = new Path(pkgName)
		pkgFolder = srcGenDir.getFolder(pkgPath)
		/* create package folders */
		if (!pkgFolder.exists()) {
			parent = pkgFolder.parent
			while ((parent instanceof IFolder) && !parent.exists()) {
				println("Parent project rel path: " + parent.projectRelativePath.toString())
				generatePkg(parent.projectRelativePath.toString(), srcGenDir, monitor)
				pkgFolder = srcGenDir.getFolder(pkgPath)
				parent = pkgFolder.parent
			}
			pkgFolder.create(true, true, monitor)
		}
	}
}