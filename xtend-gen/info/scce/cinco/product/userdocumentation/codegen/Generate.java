package info.scce.cinco.product.userdocumentation.codegen;

import de.jabc.cinco.meta.core.utils.EclipseFileUtils;
import de.jabc.cinco.meta.plugin.generator.runtime.IGenerator;
import graphmodel.Node;
import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * Example class that generates code for a given FlowGraph model. As different
 *  feature examples might or might not be included (e.g. the external component
 *  library or swimlanes), this generator only does stupidly enumerate all
 *  nodes and prints some general information about them.
 */
@SuppressWarnings("all")
public class Generate implements IGenerator<UserSequenceGraphModel> {
  @Override
  public void generate(final UserSequenceGraphModel model, final IPath targetDir, final IProgressMonitor monitor) {
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(model.getModelName());
    if (_isNullOrEmpty) {
      throw new RuntimeException("Model\'s name must be set.");
    }
    final CharSequence code = this.generateCode(model);
    String _modelName = model.getModelName();
    String _plus = (_modelName + ".txt");
    final IFile targetFile = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation(targetDir.append(_plus));
    EclipseFileUtils.writeToFile(targetFile, code);
  }
  
  private CharSequence generateCode(final UserSequenceGraphModel model) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("=== ");
    String _modelName = model.getModelName();
    _builder.append(_modelName);
    _builder.append(" ===");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("The model contains ");
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
      }
    }
    return _builder;
  }
}
