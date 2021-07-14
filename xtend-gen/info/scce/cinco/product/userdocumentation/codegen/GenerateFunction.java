package info.scce.cinco.product.userdocumentation.codegen;

import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import graphmodel.Node;
import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class GenerateFunction implements IGenerator<UserSequenceGraphModel> {
  private IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
  
  private IProject project;
  
  @Override
  public void generate(final UserSequenceGraphModel model, final IPath targetDir, final IProgressMonitor monitor) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(model.getModelName());
    if (_isNullOrEmpty) {
      throw new RuntimeException("Model\'s name cannot be empty!");
    }
    final String modelName = model.getModelName();
    this.project = this.root.getContainerForLocation(targetDir).getProject();
    final CharSequence modelInfo = this.generateModelInfo(model);
    final IFile modelInfoTextFile = this.root.getFileForLocation(targetDir.append((modelName + ".txt")));
    EclipseFileUtils.writeToFile(modelInfoTextFile, modelInfo);
  }
  
  private CharSequence generateModelInfo(final UserSequenceGraphModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("=== ");
    String _modelName = model.getModelName();
    _builder.append(_modelName);
    _builder.append(" ===");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("The model has ");
    int _size = model.getAllNodes().size();
    _builder.append(_size);
    _builder.append(" nodes. Here\'s some general information about them:");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<Node> _allNodes = model.getAllNodes();
      for(final Node node : _allNodes) {
        _builder.append("* node ");
        String _id = node.getId();
        _builder.append(_id);
        _builder.append(" of type \'");
        String _name = node.eClass().getName();
        _builder.append(_name);
        _builder.append("\' with ");
        int _size_1 = node.<Node>getSuccessors().size();
        _builder.append(_size_1);
        _builder.append(" successors and ");
        int _size_2 = node.<Node>getPredecessors().size();
        _builder.append(_size_2);
        _builder.append(" predecessors");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t\t\t\t");
        _builder.append("Contains object(s):");
        _builder.newLine();
        _builder.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        String _name_1 = node.getInternalElement().eClass().getName();
        _builder.append(_name_1, "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
}
