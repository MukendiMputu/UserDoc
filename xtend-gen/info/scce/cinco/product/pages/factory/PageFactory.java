package info.scce.cinco.product.pages.factory;

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
import info.scce.cinco.product.pages.adapter.BeginEContentAdapter;
import info.scce.cinco.product.pages.adapter.ConnectionEContentAdapter;
import info.scce.cinco.product.pages.adapter.EndEContentAdapter;
import info.scce.cinco.product.pages.adapter.LabeledConnectionEContentAdapter;
import info.scce.cinco.product.pages.adapter.PageGraphModelEContentAdapter;
import info.scce.cinco.product.pages.adapter.SubPageEContentAdapter;
import info.scce.cinco.product.pages.adapter.UserSequenceEContentAdapter;
import info.scce.cinco.product.pages.page.Begin;
import info.scce.cinco.product.pages.page.Connection;
import info.scce.cinco.product.pages.page.End;
import info.scce.cinco.product.pages.page.LabeledConnection;
import info.scce.cinco.product.pages.page.PageGraphModel;
import info.scce.cinco.product.pages.page.PagePackage;
import info.scce.cinco.product.pages.page.SubPage;
import info.scce.cinco.product.pages.page.UserSequence;
import info.scce.cinco.product.pages.page.impl.PageFactoryImpl;
import info.scce.cinco.product.pages.page.internal.InternalBegin;
import info.scce.cinco.product.pages.page.internal.InternalConnection;
import info.scce.cinco.product.pages.page.internal.InternalEnd;
import info.scce.cinco.product.pages.page.internal.InternalFactory;
import info.scce.cinco.product.pages.page.internal.InternalLabeledConnection;
import info.scce.cinco.product.pages.page.internal.InternalPageGraphModel;
import info.scce.cinco.product.pages.page.internal.InternalSubPage;
import info.scce.cinco.product.pages.page.internal.InternalUserSequence;
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
public class PageFactory extends PageFactoryImpl {
  @Extension
  private final InternalFactory _internalFactory = InternalFactory.eINSTANCE;
  
  public static PageFactory eINSTANCE = PageFactory.init();
  
  @Extension
  private WorkbenchExtension _workbenchExtension = new WorkbenchExtension();
  
  public static PageFactory init() {
    PageFactory _xblockexpression = null;
    {
      try {
        EFactory _eFactory = EPackage.Registry.INSTANCE.getEFactory(PagePackage.eNS_URI);
        final PageFactory fct = ((PageFactory) _eFactory);
        boolean _notEquals = (!Objects.equal(fct, null));
        if (_notEquals) {
          return ((PageFactory) fct);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exception = (Exception)_t;
          EcorePlugin.INSTANCE.log(exception);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = new PageFactory();
    }
    return _xblockexpression;
  }
  
  /**
   * This method creates an PageGraphModel with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public PageGraphModel createPageGraphModel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    PageGraphModel _createPageGraphModel = super.createPageGraphModel();
    final Procedure1<PageGraphModel> _function = (PageGraphModel it) -> {
      EcoreUtil.setID(it, ID);
      InternalIdentifiableElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPageGraphModel _createInternalPageGraphModel = this._internalFactory.createInternalPageGraphModel();
        _elvis = _createInternalPageGraphModel;
      }
      final Procedure1<InternalIdentifiableElement> _function_1 = (InternalIdentifiableElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PageGraphModelEContentAdapter _pageGraphModelEContentAdapter = new PageGraphModelEContentAdapter();
        _eAdapters.add(_pageGraphModelEContentAdapter);
      };
      InternalIdentifiableElement _doubleArrow = ObjectExtensions.<InternalIdentifiableElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<PageGraphModel>operator_doubleArrow(_createPageGraphModel, _function);
  }
  
  /**
   * This method creates an PageGraphModel with the given id. Post create hook won't be triggered.
   */
  public PageGraphModel createPageGraphModel(final String ID) {
    return this.createPageGraphModel(ID, null, null, false);
  }
  
  /**
   * This method creates an PageGraphModel with the given id. Post create hook will be triggered.
   */
  public PageGraphModel createPageGraphModel(final InternalModelElementContainer parent) {
    return this.createPageGraphModel(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an PageGraphModel with the given id. Post create hook will be triggered.
   */
  public PageGraphModel createPageGraphModel(final String ID, final InternalModelElementContainer parent) {
    return this.createPageGraphModel(ID, null, parent, true);
  }
  
  public PageGraphModel createPageGraphModel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPageGraphModel(ID, ime, parent, true);
  }
  
  /**
   * This method creates an PageGraphModel with the given id. Post create hook won't be triggered.
   */
  public PageGraphModel createPageGraphModel(final InternalModelElement ime) {
    return this.createPageGraphModel(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public PageGraphModel createPageGraphModel() {
    return this.createPageGraphModel(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an UserSequence with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public UserSequence createUserSequence(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    UserSequence _createUserSequence = super.createUserSequence();
    final Procedure1<UserSequence> _function = (UserSequence it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalUserSequence _createInternalUserSequence = this._internalFactory.createInternalUserSequence();
        _elvis = _createInternalUserSequence;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        UserSequenceEContentAdapter _userSequenceEContentAdapter = new UserSequenceEContentAdapter();
        _eAdapters.add(_userSequenceEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<UserSequence>operator_doubleArrow(_createUserSequence, _function);
  }
  
  /**
   * This method creates an UserSequence with the given id. Post create hook won't be triggered.
   */
  public UserSequence createUserSequence(final String ID) {
    return this.createUserSequence(ID, null, null, false);
  }
  
  /**
   * This method creates an UserSequence with the given id. Post create hook will be triggered.
   */
  public UserSequence createUserSequence(final InternalModelElementContainer parent) {
    return this.createUserSequence(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an UserSequence with the given id. Post create hook will be triggered.
   */
  public UserSequence createUserSequence(final String ID, final InternalModelElementContainer parent) {
    return this.createUserSequence(ID, null, parent, true);
  }
  
  public UserSequence createUserSequence(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createUserSequence(ID, ime, parent, true);
  }
  
  /**
   * This method creates an UserSequence with the given id. Post create hook won't be triggered.
   */
  public UserSequence createUserSequence(final InternalModelElement ime) {
    return this.createUserSequence(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public UserSequence createUserSequence() {
    return this.createUserSequence(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Begin with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Begin createBegin(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Begin _createBegin = super.createBegin();
    final Procedure1<Begin> _function = (Begin it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalBegin _createInternalBegin = this._internalFactory.createInternalBegin();
        _elvis = _createInternalBegin;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        BeginEContentAdapter _beginEContentAdapter = new BeginEContentAdapter();
        _eAdapters.add(_beginEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Begin>operator_doubleArrow(_createBegin, _function);
  }
  
  /**
   * This method creates an Begin with the given id. Post create hook won't be triggered.
   */
  public Begin createBegin(final String ID) {
    return this.createBegin(ID, null, null, false);
  }
  
  /**
   * This method creates an Begin with the given id. Post create hook will be triggered.
   */
  public Begin createBegin(final InternalModelElementContainer parent) {
    return this.createBegin(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Begin with the given id. Post create hook will be triggered.
   */
  public Begin createBegin(final String ID, final InternalModelElementContainer parent) {
    return this.createBegin(ID, null, parent, true);
  }
  
  public Begin createBegin(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createBegin(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Begin with the given id. Post create hook won't be triggered.
   */
  public Begin createBegin(final InternalModelElement ime) {
    return this.createBegin(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Begin createBegin() {
    return this.createBegin(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an End with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public End createEnd(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    End _createEnd = super.createEnd();
    final Procedure1<End> _function = (End it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalEnd _createInternalEnd = this._internalFactory.createInternalEnd();
        _elvis = _createInternalEnd;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        EndEContentAdapter _endEContentAdapter = new EndEContentAdapter();
        _eAdapters.add(_endEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<End>operator_doubleArrow(_createEnd, _function);
  }
  
  /**
   * This method creates an End with the given id. Post create hook won't be triggered.
   */
  public End createEnd(final String ID) {
    return this.createEnd(ID, null, null, false);
  }
  
  /**
   * This method creates an End with the given id. Post create hook will be triggered.
   */
  public End createEnd(final InternalModelElementContainer parent) {
    return this.createEnd(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an End with the given id. Post create hook will be triggered.
   */
  public End createEnd(final String ID, final InternalModelElementContainer parent) {
    return this.createEnd(ID, null, parent, true);
  }
  
  public End createEnd(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createEnd(ID, ime, parent, true);
  }
  
  /**
   * This method creates an End with the given id. Post create hook won't be triggered.
   */
  public End createEnd(final InternalModelElement ime) {
    return this.createEnd(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public End createEnd() {
    return this.createEnd(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an SubPage with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SubPage createSubPage(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SubPage _createSubPage = super.createSubPage();
    final Procedure1<SubPage> _function = (SubPage it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSubPage _createInternalSubPage = this._internalFactory.createInternalSubPage();
        _elvis = _createInternalSubPage;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SubPageEContentAdapter _subPageEContentAdapter = new SubPageEContentAdapter();
        _eAdapters.add(_subPageEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<SubPage>operator_doubleArrow(_createSubPage, _function);
  }
  
  /**
   * This method creates an SubPage with the given id. Post create hook won't be triggered.
   */
  public SubPage createSubPage(final String ID) {
    return this.createSubPage(ID, null, null, false);
  }
  
  /**
   * This method creates an SubPage with the given id. Post create hook will be triggered.
   */
  public SubPage createSubPage(final InternalModelElementContainer parent) {
    return this.createSubPage(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SubPage with the given id. Post create hook will be triggered.
   */
  public SubPage createSubPage(final String ID, final InternalModelElementContainer parent) {
    return this.createSubPage(ID, null, parent, true);
  }
  
  public SubPage createSubPage(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSubPage(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SubPage with the given id. Post create hook won't be triggered.
   */
  public SubPage createSubPage(final InternalModelElement ime) {
    return this.createSubPage(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SubPage createSubPage() {
    return this.createSubPage(EcoreUtil.generateUUID());
  }
  
  public LabeledConnection createLabeledConnection(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    LabeledConnection _createLabeledConnection = super.createLabeledConnection();
    final Procedure1<LabeledConnection> _function = (LabeledConnection it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalLabeledConnection _createInternalLabeledConnection = this._internalFactory.createInternalLabeledConnection();
        _elvis = _createInternalLabeledConnection;
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
        LabeledConnectionEContentAdapter _labeledConnectionEContentAdapter = new LabeledConnectionEContentAdapter();
        _eAdapters.add(_labeledConnectionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<LabeledConnection>operator_doubleArrow(_createLabeledConnection, _function);
  }
  
  /**
   * This method creates an LabeledConnection with the given id. Post create hook will be triggered.
   */
  public LabeledConnection createLabeledConnection(final String ID, final InternalNode source, final InternalNode target) {
    return this.createLabeledConnection(ID, null, source, target, true);
  }
  
  /**
   * This method creates an LabeledConnection with generated id. Post create hook will be triggered.
   */
  public LabeledConnection createLabeledConnection(final InternalNode source, final InternalNode target) {
    return this.createLabeledConnection(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an LabeledConnection with the given id. Post create hook won't be triggered.
   */
  public LabeledConnection createLabeledConnection(final String ID) {
    return this.createLabeledConnection(ID, null, null, null, false);
  }
  
  /**
   * This method creates an LabeledConnection with a generated id. Post create hook won't be triggered.
   */
  @Override
  public LabeledConnection createLabeledConnection() {
    return this.createLabeledConnection(EcoreUtil.generateUUID());
  }
  
  public Connection createConnection(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    Connection _createConnection = super.createConnection();
    final Procedure1<Connection> _function = (Connection it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalConnection _createInternalConnection = this._internalFactory.createInternalConnection();
        _elvis = _createInternalConnection;
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
        ConnectionEContentAdapter _connectionEContentAdapter = new ConnectionEContentAdapter();
        _eAdapters.add(_connectionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Connection>operator_doubleArrow(_createConnection, _function);
  }
  
  /**
   * This method creates an Connection with the given id. Post create hook will be triggered.
   */
  public Connection createConnection(final String ID, final InternalNode source, final InternalNode target) {
    return this.createConnection(ID, null, source, target, true);
  }
  
  /**
   * This method creates an Connection with generated id. Post create hook will be triggered.
   */
  public Connection createConnection(final InternalNode source, final InternalNode target) {
    return this.createConnection(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an Connection with the given id. Post create hook won't be triggered.
   */
  public Connection createConnection(final String ID) {
    return this.createConnection(ID, null, null, null, false);
  }
  
  /**
   * This method creates an Connection with a generated id. Post create hook won't be triggered.
   */
  @Override
  public Connection createConnection() {
    return this.createConnection(EcoreUtil.generateUUID());
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
   * This method creates a new PageGraphModel object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can
   * simply call the PageGraphModel's save method to save your changes.
   */
  public PageGraphModel createPageGraphModel(final String path, final String fileName) {
    IPath filePath = new Path(path).append(fileName).addFileExtension("pagegraphmodel");
    URI uri = URI.createPlatformResourceURI(filePath.toOSString(), true);
    Resource res = new ResourceSetImpl().createResource(uri);
    PageGraphModel graph = PageFactory.eINSTANCE.createPageGraphModel();
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
