package info.scce.cinco.product.features.factory;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Type;
import graphmodel.internal.InternalEdge;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalNode;
import graphmodel.internal.InternalType;
import info.scce.cinco.product.features.adapter.DocNodeEContentAdapter;
import info.scce.cinco.product.features.adapter.EdgeEContentAdapter;
import info.scce.cinco.product.features.adapter.EndNodeEContentAdapter;
import info.scce.cinco.product.features.adapter.FeatureContainerEContentAdapter;
import info.scce.cinco.product.features.adapter.FeaturesGraphModelEContentAdapter;
import info.scce.cinco.product.features.adapter.LabeledEdgeEContentAdapter;
import info.scce.cinco.product.features.adapter.StartNodeEContentAdapter;
import info.scce.cinco.product.features.features.DocNode;
import info.scce.cinco.product.features.features.Edge;
import info.scce.cinco.product.features.features.EndNode;
import info.scce.cinco.product.features.features.FeatureContainer;
import info.scce.cinco.product.features.features.FeaturesGraphModel;
import info.scce.cinco.product.features.features.FeaturesPackage;
import info.scce.cinco.product.features.features.LabeledEdge;
import info.scce.cinco.product.features.features.StartNode;
import info.scce.cinco.product.features.features.impl.FeaturesFactoryImpl;
import info.scce.cinco.product.features.features.internal.InternalDocNode;
import info.scce.cinco.product.features.features.internal.InternalEndNode;
import info.scce.cinco.product.features.features.internal.InternalFactory;
import info.scce.cinco.product.features.features.internal.InternalFeatureContainer;
import info.scce.cinco.product.features.features.internal.InternalFeaturesGraphModel;
import info.scce.cinco.product.features.features.internal.InternalLabeledEdge;
import info.scce.cinco.product.features.features.internal.InternalStartNode;
import java.io.IOException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class FeaturesFactory extends FeaturesFactoryImpl {
  @Extension
  private final InternalFactory _internalFactory = InternalFactory.eINSTANCE;
  
  public static FeaturesFactory eINSTANCE = FeaturesFactory.init();
  
  @Extension
  private WorkbenchExtension _workbenchExtension = new WorkbenchExtension();
  
  public static FeaturesFactory init() {
    FeaturesFactory _xblockexpression = null;
    {
      try {
        EFactory _eFactory = EPackage.Registry.INSTANCE.getEFactory(FeaturesPackage.eNS_URI);
        final FeaturesFactory fct = ((FeaturesFactory) _eFactory);
        boolean _notEquals = (!Objects.equal(fct, null));
        if (_notEquals) {
          return ((FeaturesFactory) fct);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exception = (Exception)_t;
          EcorePlugin.INSTANCE.log(exception);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = new FeaturesFactory();
    }
    return _xblockexpression;
  }
  
  /**
   * This method creates an FeaturesGraphModel with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public FeaturesGraphModel createFeaturesGraphModel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    FeaturesGraphModel _createFeaturesGraphModel = super.createFeaturesGraphModel();
    final Procedure1<FeaturesGraphModel> _function = (FeaturesGraphModel it) -> {
      EcoreUtil.setID(it, ID);
      InternalIdentifiableElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalFeaturesGraphModel _createInternalFeaturesGraphModel = this._internalFactory.createInternalFeaturesGraphModel();
        _elvis = _createInternalFeaturesGraphModel;
      }
      final Procedure1<InternalIdentifiableElement> _function_1 = (InternalIdentifiableElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        FeaturesGraphModelEContentAdapter _featuresGraphModelEContentAdapter = new FeaturesGraphModelEContentAdapter();
        _eAdapters.add(_featuresGraphModelEContentAdapter);
      };
      InternalIdentifiableElement _doubleArrow = ObjectExtensions.<InternalIdentifiableElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<FeaturesGraphModel>operator_doubleArrow(_createFeaturesGraphModel, _function);
  }
  
  /**
   * This method creates an FeaturesGraphModel with the given id. Post create hook won't be triggered.
   */
  public FeaturesGraphModel createFeaturesGraphModel(final String ID) {
    return this.createFeaturesGraphModel(ID, null, null, false);
  }
  
  /**
   * This method creates an FeaturesGraphModel with the given id. Post create hook will be triggered.
   */
  public FeaturesGraphModel createFeaturesGraphModel(final InternalModelElementContainer parent) {
    return this.createFeaturesGraphModel(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an FeaturesGraphModel with the given id. Post create hook will be triggered.
   */
  public FeaturesGraphModel createFeaturesGraphModel(final String ID, final InternalModelElementContainer parent) {
    return this.createFeaturesGraphModel(ID, null, parent, true);
  }
  
  public FeaturesGraphModel createFeaturesGraphModel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createFeaturesGraphModel(ID, ime, parent, true);
  }
  
  /**
   * This method creates an FeaturesGraphModel with the given id. Post create hook won't be triggered.
   */
  public FeaturesGraphModel createFeaturesGraphModel(final InternalModelElement ime) {
    return this.createFeaturesGraphModel(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public FeaturesGraphModel createFeaturesGraphModel() {
    return this.createFeaturesGraphModel(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an FeatureContainer with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public FeatureContainer createFeatureContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    FeatureContainer _createFeatureContainer = super.createFeatureContainer();
    final Procedure1<FeatureContainer> _function = (FeatureContainer it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalFeatureContainer _createInternalFeatureContainer = this._internalFactory.createInternalFeatureContainer();
        _elvis = _createInternalFeatureContainer;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        FeatureContainerEContentAdapter _featureContainerEContentAdapter = new FeatureContainerEContentAdapter();
        _eAdapters.add(_featureContainerEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<FeatureContainer>operator_doubleArrow(_createFeatureContainer, _function);
  }
  
  /**
   * This method creates an FeatureContainer with the given id. Post create hook won't be triggered.
   */
  public FeatureContainer createFeatureContainer(final String ID) {
    return this.createFeatureContainer(ID, null, null, false);
  }
  
  /**
   * This method creates an FeatureContainer with the given id. Post create hook will be triggered.
   */
  public FeatureContainer createFeatureContainer(final InternalModelElementContainer parent) {
    return this.createFeatureContainer(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an FeatureContainer with the given id. Post create hook will be triggered.
   */
  public FeatureContainer createFeatureContainer(final String ID, final InternalModelElementContainer parent) {
    return this.createFeatureContainer(ID, null, parent, true);
  }
  
  public FeatureContainer createFeatureContainer(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createFeatureContainer(ID, ime, parent, true);
  }
  
  /**
   * This method creates an FeatureContainer with the given id. Post create hook won't be triggered.
   */
  public FeatureContainer createFeatureContainer(final InternalModelElement ime) {
    return this.createFeatureContainer(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public FeatureContainer createFeatureContainer() {
    return this.createFeatureContainer(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an DocNode with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public DocNode createDocNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    DocNode _createDocNode = super.createDocNode();
    final Procedure1<DocNode> _function = (DocNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalDocNode _createInternalDocNode = this._internalFactory.createInternalDocNode();
        _elvis = _createInternalDocNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        DocNodeEContentAdapter _docNodeEContentAdapter = new DocNodeEContentAdapter();
        _eAdapters.add(_docNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<DocNode>operator_doubleArrow(_createDocNode, _function);
  }
  
  /**
   * This method creates an DocNode with the given id. Post create hook won't be triggered.
   */
  public DocNode createDocNode(final String ID) {
    return this.createDocNode(ID, null, null, false);
  }
  
  /**
   * This method creates an DocNode with the given id. Post create hook will be triggered.
   */
  public DocNode createDocNode(final InternalModelElementContainer parent) {
    return this.createDocNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an DocNode with the given id. Post create hook will be triggered.
   */
  public DocNode createDocNode(final String ID, final InternalModelElementContainer parent) {
    return this.createDocNode(ID, null, parent, true);
  }
  
  public DocNode createDocNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createDocNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an DocNode with the given id. Post create hook won't be triggered.
   */
  public DocNode createDocNode(final InternalModelElement ime) {
    return this.createDocNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public DocNode createDocNode() {
    return this.createDocNode(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an EndNode with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public EndNode createEndNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    EndNode _createEndNode = super.createEndNode();
    final Procedure1<EndNode> _function = (EndNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalEndNode _createInternalEndNode = this._internalFactory.createInternalEndNode();
        _elvis = _createInternalEndNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        EndNodeEContentAdapter _endNodeEContentAdapter = new EndNodeEContentAdapter();
        _eAdapters.add(_endNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<EndNode>operator_doubleArrow(_createEndNode, _function);
  }
  
  /**
   * This method creates an EndNode with the given id. Post create hook won't be triggered.
   */
  public EndNode createEndNode(final String ID) {
    return this.createEndNode(ID, null, null, false);
  }
  
  /**
   * This method creates an EndNode with the given id. Post create hook will be triggered.
   */
  public EndNode createEndNode(final InternalModelElementContainer parent) {
    return this.createEndNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an EndNode with the given id. Post create hook will be triggered.
   */
  public EndNode createEndNode(final String ID, final InternalModelElementContainer parent) {
    return this.createEndNode(ID, null, parent, true);
  }
  
  public EndNode createEndNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createEndNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an EndNode with the given id. Post create hook won't be triggered.
   */
  public EndNode createEndNode(final InternalModelElement ime) {
    return this.createEndNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public EndNode createEndNode() {
    return this.createEndNode(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an StartNode with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public StartNode createStartNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    StartNode _createStartNode = super.createStartNode();
    final Procedure1<StartNode> _function = (StartNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalStartNode _createInternalStartNode = this._internalFactory.createInternalStartNode();
        _elvis = _createInternalStartNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        StartNodeEContentAdapter _startNodeEContentAdapter = new StartNodeEContentAdapter();
        _eAdapters.add(_startNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<StartNode>operator_doubleArrow(_createStartNode, _function);
  }
  
  /**
   * This method creates an StartNode with the given id. Post create hook won't be triggered.
   */
  public StartNode createStartNode(final String ID) {
    return this.createStartNode(ID, null, null, false);
  }
  
  /**
   * This method creates an StartNode with the given id. Post create hook will be triggered.
   */
  public StartNode createStartNode(final InternalModelElementContainer parent) {
    return this.createStartNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an StartNode with the given id. Post create hook will be triggered.
   */
  public StartNode createStartNode(final String ID, final InternalModelElementContainer parent) {
    return this.createStartNode(ID, null, parent, true);
  }
  
  public StartNode createStartNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createStartNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an StartNode with the given id. Post create hook won't be triggered.
   */
  public StartNode createStartNode(final InternalModelElement ime) {
    return this.createStartNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public StartNode createStartNode() {
    return this.createStartNode(EcoreUtil.generateUUID());
  }
  
  public LabeledEdge createLabeledEdge(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    LabeledEdge _createLabeledEdge = super.createLabeledEdge();
    final Procedure1<LabeledEdge> _function = (LabeledEdge it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalLabeledEdge _createInternalLabeledEdge = this._internalFactory.createInternalLabeledEdge();
        _elvis = _createInternalLabeledEdge;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        LabeledEdgeEContentAdapter _labeledEdgeEContentAdapter = new LabeledEdgeEContentAdapter();
        _eAdapters.add(_labeledEdgeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<LabeledEdge>operator_doubleArrow(_createLabeledEdge, _function);
  }
  
  /**
   * This method creates an LabeledEdge with the given id. Post create hook will be triggered.
   */
  public LabeledEdge createLabeledEdge(final String ID, final InternalNode source, final InternalNode target) {
    return this.createLabeledEdge(ID, null, source, target, true);
  }
  
  /**
   * This method creates an LabeledEdge with generated id. Post create hook will be triggered.
   */
  public LabeledEdge createLabeledEdge(final InternalNode source, final InternalNode target) {
    return this.createLabeledEdge(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an LabeledEdge with the given id. Post create hook won't be triggered.
   */
  public LabeledEdge createLabeledEdge(final String ID) {
    return this.createLabeledEdge(ID, null, null, null, false);
  }
  
  /**
   * This method creates an LabeledEdge with a generated id. Post create hook won't be triggered.
   */
  @Override
  public LabeledEdge createLabeledEdge() {
    return this.createLabeledEdge(EcoreUtil.generateUUID());
  }
  
  public Edge createEdge(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    Edge _createEdge = super.createEdge();
    final Procedure1<Edge> _function = (Edge it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        info.scce.cinco.product.features.features.internal.InternalEdge _createInternalEdge = this._internalFactory.createInternalEdge();
        _elvis = _createInternalEdge;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        ((InternalEdge) it_1).set_sourceElement(source);
        ((InternalEdge) it_1).set_targetElement(target);
        InternalGraphModel _elvis_1 = null;
        InternalGraphModel _rootElement = null;
        if (source!=null) {
          _rootElement=source.getRootElement();
        }
        if (_rootElement != null) {
          _elvis_1 = _rootElement;
        } else {
          InternalGraphModel _rootElement_1 = null;
          if (target!=null) {
            _rootElement_1=target.getRootElement();
          }
          _elvis_1 = _rootElement_1;
        }
        it_1.setContainer(_elvis_1);
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        EdgeEContentAdapter _edgeEContentAdapter = new EdgeEContentAdapter();
        _eAdapters.add(_edgeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Edge>operator_doubleArrow(_createEdge, _function);
  }
  
  /**
   * This method creates an Edge with the given id. Post create hook will be triggered.
   */
  public Edge createEdge(final String ID, final InternalNode source, final InternalNode target) {
    return this.createEdge(ID, null, source, target, true);
  }
  
  /**
   * This method creates an Edge with generated id. Post create hook will be triggered.
   */
  public Edge createEdge(final InternalNode source, final InternalNode target) {
    return this.createEdge(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an Edge with the given id. Post create hook won't be triggered.
   */
  public Edge createEdge(final String ID) {
    return this.createEdge(ID, null, null, null, false);
  }
  
  /**
   * This method creates an Edge with a generated id. Post create hook won't be triggered.
   */
  @Override
  public Edge createEdge() {
    return this.createEdge(EcoreUtil.generateUUID());
  }
  
  private <T extends IdentifiableElement> T setInternal(final T elm, final InternalIdentifiableElement internal) {
    final Procedure1<T> _function = (T it) -> {
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(it.getId());
      if (_isNullOrEmpty) {
        EcoreUtil.setID(it, EcoreUtil.generateUUID());
      }
      boolean _matched = false;
      if (elm instanceof GraphModel) {
        _matched=true;
        ((GraphModel)elm).setInternalElement(((InternalGraphModel) internal));
      }
      if (!_matched) {
        if (elm instanceof ModelElement) {
          _matched=true;
          ((ModelElement)elm).setInternalElement(((InternalModelElement) internal));
        }
      }
      if (!_matched) {
        if (elm instanceof Type) {
          _matched=true;
          ((Type)elm).setInternalElement(((InternalType) internal));
        }
      }
    };
    return ObjectExtensions.<T>operator_doubleArrow(elm, _function);
  }
  
  /**
   * This method creates a new FeaturesGraphModel object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can
   * simply call the FeaturesGraphModel's save method to save your changes.
   */
  public FeaturesGraphModel createFeaturesGraphModel(final String path, final String fileName) {
    IPath filePath = new Path(path).append(fileName).addFileExtension("featuresgraphmodel");
    URI uri = URI.createPlatformResourceURI(filePath.toOSString(), true);
    Resource res = new ResourceSetImpl().createResource(uri);
    FeaturesGraphModel graph = FeaturesFactory.eINSTANCE.createFeaturesGraphModel();
    EcoreUtil.setID(graph, EcoreUtil.generateUUID());
    res.getContents().add(graph.getInternalElement());
    try {
      res.save(null);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return graph;
  }
}
