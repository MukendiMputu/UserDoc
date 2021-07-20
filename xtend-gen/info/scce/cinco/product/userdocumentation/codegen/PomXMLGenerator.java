package info.scce.cinco.product.userdocumentation.codegen;

import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function0;

@SuppressWarnings("all")
public class PomXMLGenerator {
  private static String code = new Function0<String>() {
    @Override
    public String apply() {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("<project xmlns=\"http://maven.apache.org/POM/4.0.0\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xsi:schemaLocation=\"http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd\">");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<modelVersion>4.0.0</modelVersion>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<groupId>info.scce.cinco.product</groupId>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<artifactId>userdocumentation</artifactId>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<version>0.0.1-SNAPSHOT</version>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<name>User Documentation Generator</name>");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<properties>");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("<maven.compiler.source>1.8</maven.compiler.source>");
      _builder.newLine();
      _builder.append("\t  ");
      _builder.append("<maven.compiler.target>1.8</maven.compiler.target>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("</properties>");
      _builder.newLine();
      _builder.append("  ");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<dependencies>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<dependency>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<groupId>commons-io</groupId>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<artifactId>commons-io</artifactId>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<version>2.4</version>");
      _builder.newLine();
      _builder.append("</dependency>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<dependency>");
      _builder.newLine();
      _builder.append("  \t");
      _builder.append("<groupId>org.seleniumhq.selenium</groupId>");
      _builder.newLine();
      _builder.append("  \t");
      _builder.append("<artifactId>selenium-java</artifactId>");
      _builder.newLine();
      _builder.append("  \t");
      _builder.append("<version>3.141.59</version>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("</dependency>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("<dependency>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<groupId>org.testng</groupId>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<artifactId>testng</artifactId>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<version>6.14.3</version>");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("<scope>compile</scope>");
      _builder.newLine();
      _builder.append("</dependency>");
      _builder.newLine();
      _builder.append("  ");
      _builder.append("</dependencies>");
      _builder.newLine();
      _builder.append("</project>");
      _builder.newLine();
      return _builder.toString();
    }
  }.apply();
  
  public static void generateCode(final IProject project) {
    try {
      final IFile pomXML = project.getFile("pom.xml");
      EclipseFileUtils.writeToFile(pomXML, PomXMLGenerator.code);
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
