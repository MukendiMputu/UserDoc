package info.scce.cinco.product.userdoc.codegen;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class MavenStructureGenerator {
  private static String mainFolder = "/src/main";
  
  private static String testFolder = "/src/test";
  
  private static String targetFolder = "/target";
  
  public static void generateMavenStructure(final IProject projectDir, final IProgressMonitor monitor) {
    try {
      projectDir.getFolder(MavenStructureGenerator.targetFolder).create(true, true, monitor);
      projectDir.getFolder(MavenStructureGenerator.mainFolder).create(true, true, monitor);
      projectDir.getFolder(MavenStructureGenerator.testFolder).create(true, true, monitor);
      MavenStructureGenerator.generateJavaFolders(projectDir, monitor);
      MavenStructureGenerator.generateResourceFolders(projectDir, monitor);
    } catch (final Throwable _t) {
      if (_t instanceof CoreException) {
        final CoreException exception = (CoreException)_t;
        exception.printStackTrace();
      } else if (_t instanceof Exception) {
        final Exception exception_1 = (Exception)_t;
        exception_1.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  private static void generateJavaFolders(final IProject projectDir, final IProgressMonitor monitor) {
    try {
      projectDir.getFolder((MavenStructureGenerator.mainFolder + "/java")).create(true, true, monitor);
      projectDir.getFolder((MavenStructureGenerator.testFolder + "/java")).create(true, true, monitor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private static void generateResourceFolders(final IProject projectDir, final IProgressMonitor monitor) {
    try {
      projectDir.getFolder((MavenStructureGenerator.mainFolder + "/resources")).create(true, true, monitor);
      projectDir.getFolder((MavenStructureGenerator.testFolder + "/resources")).create(true, true, monitor);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
