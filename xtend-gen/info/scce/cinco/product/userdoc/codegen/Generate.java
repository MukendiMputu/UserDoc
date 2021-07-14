package info.scce.cinco.product.userdoc.codegen;

import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Generate /* implements IGenerator<UserDocGraphModel>  */{
  private IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
  
  private IProject project;
  
  @Override
  public void generate(final /* UserDocGraphModel */Object model, final IPath targetDir, final IProgressMonitor monitor) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method generateModelInfo(UserDocGraphModel) from the type Generate refers to the missing type UserDocGraphModel"
      + "\nmodelName cannot be resolved"
      + "\nnullOrEmpty cannot be resolved"
      + "\nmodelName cannot be resolved"
      + "\n+ cannot be resolved");
  }
  
  private CharSequence generateModelInfo(final /* UserDocGraphModel */Object model) {
    throw new Error("Unresolved compilation problems:"
      + "\nuserDocGraphModelView cannot be resolved"
      + "\nmodelName cannot be resolved"
      + "\nallNodes cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nallNodes cannot be resolved"
      + "\nid cannot be resolved"
      + "\neClass cannot be resolved"
      + "\nname cannot be resolved"
      + "\nsuccessors cannot be resolved"
      + "\nsize cannot be resolved"
      + "\npredecessors cannot be resolved"
      + "\nsize cannot be resolved"
      + "\nnavigations cannot be resolved"
      + "\nget cannot be resolved"
      + "\nurl cannot be resolved");
  }
  
  private CharSequence generateConfigurationFile() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("url = https://archmukki-localnet.de");
    _builder.newLine();
    _builder.append("user = mputustella@yahoo.de");
    _builder.newLine();
    _builder.append("password = Asdfjklö");
    _builder.newLine();
    _builder.append("browser = firefox");
    _builder.newLine();
    return _builder;
  }
}
