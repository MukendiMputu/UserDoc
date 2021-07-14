package info.scce.cinco.product.userdocumentation.codegen;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class PackageGenerator {
  private static IFolder pkgFolder;
  
  private static IContainer parent;
  
  public static void generatePkg(final String pkgName, final IProject projectDir, final IProgressMonitor monitor) {
    PackageGenerator.pkgFolder = projectDir.getFolder(pkgName);
    try {
      boolean _exists = PackageGenerator.pkgFolder.exists();
      boolean _not = (!_exists);
      if (_not) {
        PackageGenerator.parent = PackageGenerator.pkgFolder.getParent();
        while (((PackageGenerator.parent instanceof IFolder) && (!PackageGenerator.parent.exists()))) {
          {
            PackageGenerator.generatePkg(PackageGenerator.parent.getProjectRelativePath().toString(), projectDir, monitor);
            PackageGenerator.pkgFolder = projectDir.getFolder(pkgName);
            PackageGenerator.parent = PackageGenerator.pkgFolder.getParent();
          }
        }
        PackageGenerator.pkgFolder.create(true, true, monitor);
      }
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception exception = (Exception)_t;
        exception.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
