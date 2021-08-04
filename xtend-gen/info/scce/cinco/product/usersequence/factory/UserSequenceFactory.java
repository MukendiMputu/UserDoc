package info.scce.cinco.product.usersequence.factory;

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
import info.scce.cinco.product.usersequence.adapter.AnchorEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.BaseURLEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.ButtonEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.CommentEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.DivEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.DomainEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.FormEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.HEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.InputEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.KeyValueEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.LabelEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.LabeledTransitionEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.NavigationEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.PEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.ScreenshotEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.SectionEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.SectionNodeEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.SelectBoxEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.SelectBoxOptionEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.SpanEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.StartEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.StopEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.SubSequenceEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.TableBodyEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.TableDataEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.TableEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.TableHeadEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.TableRowEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.TextareaEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.ThEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.TransitionEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.UserSequenceGraphModelEContentAdapter;
import info.scce.cinco.product.usersequence.adapter.WebElementEContentAdapter;
import info.scce.cinco.product.usersequence.usersequence.Anchor;
import info.scce.cinco.product.usersequence.usersequence.BaseURL;
import info.scce.cinco.product.usersequence.usersequence.Button;
import info.scce.cinco.product.usersequence.usersequence.Comment;
import info.scce.cinco.product.usersequence.usersequence.Div;
import info.scce.cinco.product.usersequence.usersequence.Domain;
import info.scce.cinco.product.usersequence.usersequence.Form;
import info.scce.cinco.product.usersequence.usersequence.H;
import info.scce.cinco.product.usersequence.usersequence.Input;
import info.scce.cinco.product.usersequence.usersequence.KeyValue;
import info.scce.cinco.product.usersequence.usersequence.Label;
import info.scce.cinco.product.usersequence.usersequence.LabeledTransition;
import info.scce.cinco.product.usersequence.usersequence.Navigation;
import info.scce.cinco.product.usersequence.usersequence.P;
import info.scce.cinco.product.usersequence.usersequence.Screenshot;
import info.scce.cinco.product.usersequence.usersequence.Section;
import info.scce.cinco.product.usersequence.usersequence.SectionNode;
import info.scce.cinco.product.usersequence.usersequence.SelectBox;
import info.scce.cinco.product.usersequence.usersequence.SelectBoxOption;
import info.scce.cinco.product.usersequence.usersequence.Span;
import info.scce.cinco.product.usersequence.usersequence.Start;
import info.scce.cinco.product.usersequence.usersequence.Stop;
import info.scce.cinco.product.usersequence.usersequence.SubSequence;
import info.scce.cinco.product.usersequence.usersequence.Table;
import info.scce.cinco.product.usersequence.usersequence.TableBody;
import info.scce.cinco.product.usersequence.usersequence.TableData;
import info.scce.cinco.product.usersequence.usersequence.TableHead;
import info.scce.cinco.product.usersequence.usersequence.TableRow;
import info.scce.cinco.product.usersequence.usersequence.Textarea;
import info.scce.cinco.product.usersequence.usersequence.Th;
import info.scce.cinco.product.usersequence.usersequence.Transition;
import info.scce.cinco.product.usersequence.usersequence.UserSequenceGraphModel;
import info.scce.cinco.product.usersequence.usersequence.UsersequencePackage;
import info.scce.cinco.product.usersequence.usersequence.WebElement;
import info.scce.cinco.product.usersequence.usersequence.impl.UsersequenceFactoryImpl;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalAnchor;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalBaseURL;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalButton;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalComment;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalDiv;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalDomain;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalFactory;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalForm;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalH;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalInput;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalKeyValue;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalLabel;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalLabeledTransition;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalNavigation;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalP;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalScreenshot;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalSection;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalSectionNode;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBox;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalSelectBoxOption;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalSpan;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalStart;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalStop;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalSubSequence;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalTable;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableBody;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableData;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableHead;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalTableRow;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalTextarea;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalTh;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalTransition;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalWebElement;
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
public class UserSequenceFactory extends UsersequenceFactoryImpl {
  @Extension
  private final InternalFactory _internalFactory = InternalFactory.eINSTANCE;
  
  public static UserSequenceFactory eINSTANCE = UserSequenceFactory.init();
  
  @Extension
  private WorkbenchExtension _workbenchExtension = new WorkbenchExtension();
  
  public static UserSequenceFactory init() {
    UserSequenceFactory _xblockexpression = null;
    {
      try {
        EFactory _eFactory = EPackage.Registry.INSTANCE.getEFactory(UsersequencePackage.eNS_URI);
        final UserSequenceFactory fct = ((UserSequenceFactory) _eFactory);
        boolean _notEquals = (!Objects.equal(fct, null));
        if (_notEquals) {
          return ((UserSequenceFactory) fct);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exception = (Exception)_t;
          EcorePlugin.INSTANCE.log(exception);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = new UserSequenceFactory();
    }
    return _xblockexpression;
  }
  
  /**
   * This method creates an UserSequenceGraphModel with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public UserSequenceGraphModel createUserSequenceGraphModel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    UserSequenceGraphModel _createUserSequenceGraphModel = super.createUserSequenceGraphModel();
    final Procedure1<UserSequenceGraphModel> _function = (UserSequenceGraphModel it) -> {
      EcoreUtil.setID(it, ID);
      InternalIdentifiableElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalUserSequenceGraphModel _createInternalUserSequenceGraphModel = this._internalFactory.createInternalUserSequenceGraphModel();
        _elvis = _createInternalUserSequenceGraphModel;
      }
      final Procedure1<InternalIdentifiableElement> _function_1 = (InternalIdentifiableElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        UserSequenceGraphModelEContentAdapter _userSequenceGraphModelEContentAdapter = new UserSequenceGraphModelEContentAdapter();
        _eAdapters.add(_userSequenceGraphModelEContentAdapter);
      };
      InternalIdentifiableElement _doubleArrow = ObjectExtensions.<InternalIdentifiableElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<UserSequenceGraphModel>operator_doubleArrow(_createUserSequenceGraphModel, _function);
  }
  
  /**
   * This method creates an UserSequenceGraphModel with the given id. Post create hook won't be triggered.
   */
  public UserSequenceGraphModel createUserSequenceGraphModel(final String ID) {
    return this.createUserSequenceGraphModel(ID, null, null, false);
  }
  
  /**
   * This method creates an UserSequenceGraphModel with the given id. Post create hook will be triggered.
   */
  public UserSequenceGraphModel createUserSequenceGraphModel(final InternalModelElementContainer parent) {
    return this.createUserSequenceGraphModel(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an UserSequenceGraphModel with the given id. Post create hook will be triggered.
   */
  public UserSequenceGraphModel createUserSequenceGraphModel(final String ID, final InternalModelElementContainer parent) {
    return this.createUserSequenceGraphModel(ID, null, parent, true);
  }
  
  public UserSequenceGraphModel createUserSequenceGraphModel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createUserSequenceGraphModel(ID, ime, parent, true);
  }
  
  /**
   * This method creates an UserSequenceGraphModel with the given id. Post create hook won't be triggered.
   */
  public UserSequenceGraphModel createUserSequenceGraphModel(final InternalModelElement ime) {
    return this.createUserSequenceGraphModel(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public UserSequenceGraphModel createUserSequenceGraphModel() {
    return this.createUserSequenceGraphModel(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Span with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Span createSpan(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Span _createSpan = super.createSpan();
    final Procedure1<Span> _function = (Span it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSpan _createInternalSpan = this._internalFactory.createInternalSpan();
        _elvis = _createInternalSpan;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SpanEContentAdapter _spanEContentAdapter = new SpanEContentAdapter();
        _eAdapters.add(_spanEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Span>operator_doubleArrow(_createSpan, _function);
  }
  
  /**
   * This method creates an Span with the given id. Post create hook won't be triggered.
   */
  public Span createSpan(final String ID) {
    return this.createSpan(ID, null, null, false);
  }
  
  /**
   * This method creates an Span with the given id. Post create hook will be triggered.
   */
  public Span createSpan(final InternalModelElementContainer parent) {
    return this.createSpan(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Span with the given id. Post create hook will be triggered.
   */
  public Span createSpan(final String ID, final InternalModelElementContainer parent) {
    return this.createSpan(ID, null, parent, true);
  }
  
  public Span createSpan(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSpan(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Span with the given id. Post create hook won't be triggered.
   */
  public Span createSpan(final InternalModelElement ime) {
    return this.createSpan(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Span createSpan() {
    return this.createSpan(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Table with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Table createTable(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Table _createTable = super.createTable();
    final Procedure1<Table> _function = (Table it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTable _createInternalTable = this._internalFactory.createInternalTable();
        _elvis = _createInternalTable;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TableEContentAdapter _tableEContentAdapter = new TableEContentAdapter();
        _eAdapters.add(_tableEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Table>operator_doubleArrow(_createTable, _function);
  }
  
  /**
   * This method creates an Table with the given id. Post create hook won't be triggered.
   */
  public Table createTable(final String ID) {
    return this.createTable(ID, null, null, false);
  }
  
  /**
   * This method creates an Table with the given id. Post create hook will be triggered.
   */
  public Table createTable(final InternalModelElementContainer parent) {
    return this.createTable(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Table with the given id. Post create hook will be triggered.
   */
  public Table createTable(final String ID, final InternalModelElementContainer parent) {
    return this.createTable(ID, null, parent, true);
  }
  
  public Table createTable(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createTable(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Table with the given id. Post create hook won't be triggered.
   */
  public Table createTable(final InternalModelElement ime) {
    return this.createTable(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Table createTable() {
    return this.createTable(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an TableBody with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public TableBody createTableBody(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    TableBody _createTableBody = super.createTableBody();
    final Procedure1<TableBody> _function = (TableBody it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTableBody _createInternalTableBody = this._internalFactory.createInternalTableBody();
        _elvis = _createInternalTableBody;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TableBodyEContentAdapter _tableBodyEContentAdapter = new TableBodyEContentAdapter();
        _eAdapters.add(_tableBodyEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<TableBody>operator_doubleArrow(_createTableBody, _function);
  }
  
  /**
   * This method creates an TableBody with the given id. Post create hook won't be triggered.
   */
  public TableBody createTableBody(final String ID) {
    return this.createTableBody(ID, null, null, false);
  }
  
  /**
   * This method creates an TableBody with the given id. Post create hook will be triggered.
   */
  public TableBody createTableBody(final InternalModelElementContainer parent) {
    return this.createTableBody(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an TableBody with the given id. Post create hook will be triggered.
   */
  public TableBody createTableBody(final String ID, final InternalModelElementContainer parent) {
    return this.createTableBody(ID, null, parent, true);
  }
  
  public TableBody createTableBody(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createTableBody(ID, ime, parent, true);
  }
  
  /**
   * This method creates an TableBody with the given id. Post create hook won't be triggered.
   */
  public TableBody createTableBody(final InternalModelElement ime) {
    return this.createTableBody(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public TableBody createTableBody() {
    return this.createTableBody(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an TableHead with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public TableHead createTableHead(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    TableHead _createTableHead = super.createTableHead();
    final Procedure1<TableHead> _function = (TableHead it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTableHead _createInternalTableHead = this._internalFactory.createInternalTableHead();
        _elvis = _createInternalTableHead;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TableHeadEContentAdapter _tableHeadEContentAdapter = new TableHeadEContentAdapter();
        _eAdapters.add(_tableHeadEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<TableHead>operator_doubleArrow(_createTableHead, _function);
  }
  
  /**
   * This method creates an TableHead with the given id. Post create hook won't be triggered.
   */
  public TableHead createTableHead(final String ID) {
    return this.createTableHead(ID, null, null, false);
  }
  
  /**
   * This method creates an TableHead with the given id. Post create hook will be triggered.
   */
  public TableHead createTableHead(final InternalModelElementContainer parent) {
    return this.createTableHead(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an TableHead with the given id. Post create hook will be triggered.
   */
  public TableHead createTableHead(final String ID, final InternalModelElementContainer parent) {
    return this.createTableHead(ID, null, parent, true);
  }
  
  public TableHead createTableHead(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createTableHead(ID, ime, parent, true);
  }
  
  /**
   * This method creates an TableHead with the given id. Post create hook won't be triggered.
   */
  public TableHead createTableHead(final InternalModelElement ime) {
    return this.createTableHead(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public TableHead createTableHead() {
    return this.createTableHead(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Label with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Label createLabel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Label _createLabel = super.createLabel();
    final Procedure1<Label> _function = (Label it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalLabel _createInternalLabel = this._internalFactory.createInternalLabel();
        _elvis = _createInternalLabel;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        LabelEContentAdapter _labelEContentAdapter = new LabelEContentAdapter();
        _eAdapters.add(_labelEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Label>operator_doubleArrow(_createLabel, _function);
  }
  
  /**
   * This method creates an Label with the given id. Post create hook won't be triggered.
   */
  public Label createLabel(final String ID) {
    return this.createLabel(ID, null, null, false);
  }
  
  /**
   * This method creates an Label with the given id. Post create hook will be triggered.
   */
  public Label createLabel(final InternalModelElementContainer parent) {
    return this.createLabel(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Label with the given id. Post create hook will be triggered.
   */
  public Label createLabel(final String ID, final InternalModelElementContainer parent) {
    return this.createLabel(ID, null, parent, true);
  }
  
  public Label createLabel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createLabel(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Label with the given id. Post create hook won't be triggered.
   */
  public Label createLabel(final InternalModelElement ime) {
    return this.createLabel(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Label createLabel() {
    return this.createLabel(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Start with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Start createStart(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Start _createStart = super.createStart();
    final Procedure1<Start> _function = (Start it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalStart _createInternalStart = this._internalFactory.createInternalStart();
        _elvis = _createInternalStart;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        StartEContentAdapter _startEContentAdapter = new StartEContentAdapter();
        _eAdapters.add(_startEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Start>operator_doubleArrow(_createStart, _function);
  }
  
  /**
   * This method creates an Start with the given id. Post create hook won't be triggered.
   */
  public Start createStart(final String ID) {
    return this.createStart(ID, null, null, false);
  }
  
  /**
   * This method creates an Start with the given id. Post create hook will be triggered.
   */
  public Start createStart(final InternalModelElementContainer parent) {
    return this.createStart(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Start with the given id. Post create hook will be triggered.
   */
  public Start createStart(final String ID, final InternalModelElementContainer parent) {
    return this.createStart(ID, null, parent, true);
  }
  
  public Start createStart(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createStart(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Start with the given id. Post create hook won't be triggered.
   */
  public Start createStart(final InternalModelElement ime) {
    return this.createStart(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Start createStart() {
    return this.createStart(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Domain with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Domain createDomain(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Domain _createDomain = super.createDomain();
    final Procedure1<Domain> _function = (Domain it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalDomain _createInternalDomain = this._internalFactory.createInternalDomain();
        _elvis = _createInternalDomain;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        DomainEContentAdapter _domainEContentAdapter = new DomainEContentAdapter();
        _eAdapters.add(_domainEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Domain>operator_doubleArrow(_createDomain, _function);
  }
  
  /**
   * This method creates an Domain with the given id. Post create hook won't be triggered.
   */
  public Domain createDomain(final String ID) {
    return this.createDomain(ID, null, null, false);
  }
  
  /**
   * This method creates an Domain with the given id. Post create hook will be triggered.
   */
  public Domain createDomain(final InternalModelElementContainer parent) {
    return this.createDomain(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Domain with the given id. Post create hook will be triggered.
   */
  public Domain createDomain(final String ID, final InternalModelElementContainer parent) {
    return this.createDomain(ID, null, parent, true);
  }
  
  public Domain createDomain(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createDomain(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Domain with the given id. Post create hook won't be triggered.
   */
  public Domain createDomain(final InternalModelElement ime) {
    return this.createDomain(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Domain createDomain() {
    return this.createDomain(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an SectionNode with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SectionNode createSectionNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SectionNode _createSectionNode = super.createSectionNode();
    final Procedure1<SectionNode> _function = (SectionNode it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSectionNode _createInternalSectionNode = this._internalFactory.createInternalSectionNode();
        _elvis = _createInternalSectionNode;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SectionNodeEContentAdapter _sectionNodeEContentAdapter = new SectionNodeEContentAdapter();
        _eAdapters.add(_sectionNodeEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<SectionNode>operator_doubleArrow(_createSectionNode, _function);
  }
  
  /**
   * This method creates an SectionNode with the given id. Post create hook won't be triggered.
   */
  public SectionNode createSectionNode(final String ID) {
    return this.createSectionNode(ID, null, null, false);
  }
  
  /**
   * This method creates an SectionNode with the given id. Post create hook will be triggered.
   */
  public SectionNode createSectionNode(final InternalModelElementContainer parent) {
    return this.createSectionNode(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SectionNode with the given id. Post create hook will be triggered.
   */
  public SectionNode createSectionNode(final String ID, final InternalModelElementContainer parent) {
    return this.createSectionNode(ID, null, parent, true);
  }
  
  public SectionNode createSectionNode(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSectionNode(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SectionNode with the given id. Post create hook won't be triggered.
   */
  public SectionNode createSectionNode(final InternalModelElement ime) {
    return this.createSectionNode(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SectionNode createSectionNode() {
    return this.createSectionNode(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an BaseURL with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public BaseURL createBaseURL(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    BaseURL _createBaseURL = super.createBaseURL();
    final Procedure1<BaseURL> _function = (BaseURL it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalBaseURL _createInternalBaseURL = this._internalFactory.createInternalBaseURL();
        _elvis = _createInternalBaseURL;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        BaseURLEContentAdapter _baseURLEContentAdapter = new BaseURLEContentAdapter();
        _eAdapters.add(_baseURLEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<BaseURL>operator_doubleArrow(_createBaseURL, _function);
  }
  
  /**
   * This method creates an BaseURL with the given id. Post create hook won't be triggered.
   */
  public BaseURL createBaseURL(final String ID) {
    return this.createBaseURL(ID, null, null, false);
  }
  
  /**
   * This method creates an BaseURL with the given id. Post create hook will be triggered.
   */
  public BaseURL createBaseURL(final InternalModelElementContainer parent) {
    return this.createBaseURL(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an BaseURL with the given id. Post create hook will be triggered.
   */
  public BaseURL createBaseURL(final String ID, final InternalModelElementContainer parent) {
    return this.createBaseURL(ID, null, parent, true);
  }
  
  public BaseURL createBaseURL(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createBaseURL(ID, ime, parent, true);
  }
  
  /**
   * This method creates an BaseURL with the given id. Post create hook won't be triggered.
   */
  public BaseURL createBaseURL(final InternalModelElement ime) {
    return this.createBaseURL(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public BaseURL createBaseURL() {
    return this.createBaseURL(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an SelectBox with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SelectBox createSelectBox(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SelectBox _createSelectBox = super.createSelectBox();
    final Procedure1<SelectBox> _function = (SelectBox it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSelectBox _createInternalSelectBox = this._internalFactory.createInternalSelectBox();
        _elvis = _createInternalSelectBox;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SelectBoxEContentAdapter _selectBoxEContentAdapter = new SelectBoxEContentAdapter();
        _eAdapters.add(_selectBoxEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<SelectBox>operator_doubleArrow(_createSelectBox, _function);
  }
  
  /**
   * This method creates an SelectBox with the given id. Post create hook won't be triggered.
   */
  public SelectBox createSelectBox(final String ID) {
    return this.createSelectBox(ID, null, null, false);
  }
  
  /**
   * This method creates an SelectBox with the given id. Post create hook will be triggered.
   */
  public SelectBox createSelectBox(final InternalModelElementContainer parent) {
    return this.createSelectBox(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SelectBox with the given id. Post create hook will be triggered.
   */
  public SelectBox createSelectBox(final String ID, final InternalModelElementContainer parent) {
    return this.createSelectBox(ID, null, parent, true);
  }
  
  public SelectBox createSelectBox(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSelectBox(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SelectBox with the given id. Post create hook won't be triggered.
   */
  public SelectBox createSelectBox(final InternalModelElement ime) {
    return this.createSelectBox(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SelectBox createSelectBox() {
    return this.createSelectBox(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an SelectBoxOption with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SelectBoxOption createSelectBoxOption(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SelectBoxOption _createSelectBoxOption = super.createSelectBoxOption();
    final Procedure1<SelectBoxOption> _function = (SelectBoxOption it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSelectBoxOption _createInternalSelectBoxOption = this._internalFactory.createInternalSelectBoxOption();
        _elvis = _createInternalSelectBoxOption;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SelectBoxOptionEContentAdapter _selectBoxOptionEContentAdapter = new SelectBoxOptionEContentAdapter();
        _eAdapters.add(_selectBoxOptionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<SelectBoxOption>operator_doubleArrow(_createSelectBoxOption, _function);
  }
  
  /**
   * This method creates an SelectBoxOption with the given id. Post create hook won't be triggered.
   */
  public SelectBoxOption createSelectBoxOption(final String ID) {
    return this.createSelectBoxOption(ID, null, null, false);
  }
  
  /**
   * This method creates an SelectBoxOption with the given id. Post create hook will be triggered.
   */
  public SelectBoxOption createSelectBoxOption(final InternalModelElementContainer parent) {
    return this.createSelectBoxOption(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SelectBoxOption with the given id. Post create hook will be triggered.
   */
  public SelectBoxOption createSelectBoxOption(final String ID, final InternalModelElementContainer parent) {
    return this.createSelectBoxOption(ID, null, parent, true);
  }
  
  public SelectBoxOption createSelectBoxOption(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSelectBoxOption(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SelectBoxOption with the given id. Post create hook won't be triggered.
   */
  public SelectBoxOption createSelectBoxOption(final InternalModelElement ime) {
    return this.createSelectBoxOption(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SelectBoxOption createSelectBoxOption() {
    return this.createSelectBoxOption(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Stop with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Stop createStop(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Stop _createStop = super.createStop();
    final Procedure1<Stop> _function = (Stop it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalStop _createInternalStop = this._internalFactory.createInternalStop();
        _elvis = _createInternalStop;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        StopEContentAdapter _stopEContentAdapter = new StopEContentAdapter();
        _eAdapters.add(_stopEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Stop>operator_doubleArrow(_createStop, _function);
  }
  
  /**
   * This method creates an Stop with the given id. Post create hook won't be triggered.
   */
  public Stop createStop(final String ID) {
    return this.createStop(ID, null, null, false);
  }
  
  /**
   * This method creates an Stop with the given id. Post create hook will be triggered.
   */
  public Stop createStop(final InternalModelElementContainer parent) {
    return this.createStop(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Stop with the given id. Post create hook will be triggered.
   */
  public Stop createStop(final String ID, final InternalModelElementContainer parent) {
    return this.createStop(ID, null, parent, true);
  }
  
  public Stop createStop(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createStop(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Stop with the given id. Post create hook won't be triggered.
   */
  public Stop createStop(final InternalModelElement ime) {
    return this.createStop(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Stop createStop() {
    return this.createStop(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an TableRow with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public TableRow createTableRow(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    TableRow _createTableRow = super.createTableRow();
    final Procedure1<TableRow> _function = (TableRow it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTableRow _createInternalTableRow = this._internalFactory.createInternalTableRow();
        _elvis = _createInternalTableRow;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TableRowEContentAdapter _tableRowEContentAdapter = new TableRowEContentAdapter();
        _eAdapters.add(_tableRowEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<TableRow>operator_doubleArrow(_createTableRow, _function);
  }
  
  /**
   * This method creates an TableRow with the given id. Post create hook won't be triggered.
   */
  public TableRow createTableRow(final String ID) {
    return this.createTableRow(ID, null, null, false);
  }
  
  /**
   * This method creates an TableRow with the given id. Post create hook will be triggered.
   */
  public TableRow createTableRow(final InternalModelElementContainer parent) {
    return this.createTableRow(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an TableRow with the given id. Post create hook will be triggered.
   */
  public TableRow createTableRow(final String ID, final InternalModelElementContainer parent) {
    return this.createTableRow(ID, null, parent, true);
  }
  
  public TableRow createTableRow(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createTableRow(ID, ime, parent, true);
  }
  
  /**
   * This method creates an TableRow with the given id. Post create hook won't be triggered.
   */
  public TableRow createTableRow(final InternalModelElement ime) {
    return this.createTableRow(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public TableRow createTableRow() {
    return this.createTableRow(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Div with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Div createDiv(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Div _createDiv = super.createDiv();
    final Procedure1<Div> _function = (Div it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalDiv _createInternalDiv = this._internalFactory.createInternalDiv();
        _elvis = _createInternalDiv;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        DivEContentAdapter _divEContentAdapter = new DivEContentAdapter();
        _eAdapters.add(_divEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Div>operator_doubleArrow(_createDiv, _function);
  }
  
  /**
   * This method creates an Div with the given id. Post create hook won't be triggered.
   */
  public Div createDiv(final String ID) {
    return this.createDiv(ID, null, null, false);
  }
  
  /**
   * This method creates an Div with the given id. Post create hook will be triggered.
   */
  public Div createDiv(final InternalModelElementContainer parent) {
    return this.createDiv(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Div with the given id. Post create hook will be triggered.
   */
  public Div createDiv(final String ID, final InternalModelElementContainer parent) {
    return this.createDiv(ID, null, parent, true);
  }
  
  public Div createDiv(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createDiv(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Div with the given id. Post create hook won't be triggered.
   */
  public Div createDiv(final InternalModelElement ime) {
    return this.createDiv(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Div createDiv() {
    return this.createDiv(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an WebElement with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public WebElement createWebElement(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    WebElement _createWebElement = super.createWebElement();
    final Procedure1<WebElement> _function = (WebElement it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalWebElement _createInternalWebElement = this._internalFactory.createInternalWebElement();
        _elvis = _createInternalWebElement;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        WebElementEContentAdapter _webElementEContentAdapter = new WebElementEContentAdapter();
        _eAdapters.add(_webElementEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<WebElement>operator_doubleArrow(_createWebElement, _function);
  }
  
  /**
   * This method creates an WebElement with the given id. Post create hook won't be triggered.
   */
  public WebElement createWebElement(final String ID) {
    return this.createWebElement(ID, null, null, false);
  }
  
  /**
   * This method creates an WebElement with the given id. Post create hook will be triggered.
   */
  public WebElement createWebElement(final InternalModelElementContainer parent) {
    return this.createWebElement(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an WebElement with the given id. Post create hook will be triggered.
   */
  public WebElement createWebElement(final String ID, final InternalModelElementContainer parent) {
    return this.createWebElement(ID, null, parent, true);
  }
  
  public WebElement createWebElement(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createWebElement(ID, ime, parent, true);
  }
  
  /**
   * This method creates an WebElement with the given id. Post create hook won't be triggered.
   */
  public WebElement createWebElement(final InternalModelElement ime) {
    return this.createWebElement(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public WebElement createWebElement() {
    return this.createWebElement(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Textarea with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Textarea createTextarea(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Textarea _createTextarea = super.createTextarea();
    final Procedure1<Textarea> _function = (Textarea it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTextarea _createInternalTextarea = this._internalFactory.createInternalTextarea();
        _elvis = _createInternalTextarea;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TextareaEContentAdapter _textareaEContentAdapter = new TextareaEContentAdapter();
        _eAdapters.add(_textareaEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Textarea>operator_doubleArrow(_createTextarea, _function);
  }
  
  /**
   * This method creates an Textarea with the given id. Post create hook won't be triggered.
   */
  public Textarea createTextarea(final String ID) {
    return this.createTextarea(ID, null, null, false);
  }
  
  /**
   * This method creates an Textarea with the given id. Post create hook will be triggered.
   */
  public Textarea createTextarea(final InternalModelElementContainer parent) {
    return this.createTextarea(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Textarea with the given id. Post create hook will be triggered.
   */
  public Textarea createTextarea(final String ID, final InternalModelElementContainer parent) {
    return this.createTextarea(ID, null, parent, true);
  }
  
  public Textarea createTextarea(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createTextarea(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Textarea with the given id. Post create hook won't be triggered.
   */
  public Textarea createTextarea(final InternalModelElement ime) {
    return this.createTextarea(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Textarea createTextarea() {
    return this.createTextarea(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Comment with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Comment createComment(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Comment _createComment = super.createComment();
    final Procedure1<Comment> _function = (Comment it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalComment _createInternalComment = this._internalFactory.createInternalComment();
        _elvis = _createInternalComment;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        CommentEContentAdapter _commentEContentAdapter = new CommentEContentAdapter();
        _eAdapters.add(_commentEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Comment>operator_doubleArrow(_createComment, _function);
  }
  
  /**
   * This method creates an Comment with the given id. Post create hook won't be triggered.
   */
  public Comment createComment(final String ID) {
    return this.createComment(ID, null, null, false);
  }
  
  /**
   * This method creates an Comment with the given id. Post create hook will be triggered.
   */
  public Comment createComment(final InternalModelElementContainer parent) {
    return this.createComment(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Comment with the given id. Post create hook will be triggered.
   */
  public Comment createComment(final String ID, final InternalModelElementContainer parent) {
    return this.createComment(ID, null, parent, true);
  }
  
  public Comment createComment(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createComment(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Comment with the given id. Post create hook won't be triggered.
   */
  public Comment createComment(final InternalModelElement ime) {
    return this.createComment(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Comment createComment() {
    return this.createComment(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Form with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Form createForm(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Form _createForm = super.createForm();
    final Procedure1<Form> _function = (Form it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalForm _createInternalForm = this._internalFactory.createInternalForm();
        _elvis = _createInternalForm;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        FormEContentAdapter _formEContentAdapter = new FormEContentAdapter();
        _eAdapters.add(_formEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Form>operator_doubleArrow(_createForm, _function);
  }
  
  /**
   * This method creates an Form with the given id. Post create hook won't be triggered.
   */
  public Form createForm(final String ID) {
    return this.createForm(ID, null, null, false);
  }
  
  /**
   * This method creates an Form with the given id. Post create hook will be triggered.
   */
  public Form createForm(final InternalModelElementContainer parent) {
    return this.createForm(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Form with the given id. Post create hook will be triggered.
   */
  public Form createForm(final String ID, final InternalModelElementContainer parent) {
    return this.createForm(ID, null, parent, true);
  }
  
  public Form createForm(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createForm(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Form with the given id. Post create hook won't be triggered.
   */
  public Form createForm(final InternalModelElement ime) {
    return this.createForm(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Form createForm() {
    return this.createForm(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Button with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Button createButton(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Button _createButton = super.createButton();
    final Procedure1<Button> _function = (Button it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalButton _createInternalButton = this._internalFactory.createInternalButton();
        _elvis = _createInternalButton;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ButtonEContentAdapter _buttonEContentAdapter = new ButtonEContentAdapter();
        _eAdapters.add(_buttonEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Button>operator_doubleArrow(_createButton, _function);
  }
  
  /**
   * This method creates an Button with the given id. Post create hook won't be triggered.
   */
  public Button createButton(final String ID) {
    return this.createButton(ID, null, null, false);
  }
  
  /**
   * This method creates an Button with the given id. Post create hook will be triggered.
   */
  public Button createButton(final InternalModelElementContainer parent) {
    return this.createButton(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Button with the given id. Post create hook will be triggered.
   */
  public Button createButton(final String ID, final InternalModelElementContainer parent) {
    return this.createButton(ID, null, parent, true);
  }
  
  public Button createButton(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createButton(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Button with the given id. Post create hook won't be triggered.
   */
  public Button createButton(final InternalModelElement ime) {
    return this.createButton(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Button createButton() {
    return this.createButton(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an H with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public H createH(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    H _createH = super.createH();
    final Procedure1<H> _function = (H it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalH _createInternalH = this._internalFactory.createInternalH();
        _elvis = _createInternalH;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        HEContentAdapter _hEContentAdapter = new HEContentAdapter();
        _eAdapters.add(_hEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<H>operator_doubleArrow(_createH, _function);
  }
  
  /**
   * This method creates an H with the given id. Post create hook won't be triggered.
   */
  public H createH(final String ID) {
    return this.createH(ID, null, null, false);
  }
  
  /**
   * This method creates an H with the given id. Post create hook will be triggered.
   */
  public H createH(final InternalModelElementContainer parent) {
    return this.createH(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an H with the given id. Post create hook will be triggered.
   */
  public H createH(final String ID, final InternalModelElementContainer parent) {
    return this.createH(ID, null, parent, true);
  }
  
  public H createH(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createH(ID, ime, parent, true);
  }
  
  /**
   * This method creates an H with the given id. Post create hook won't be triggered.
   */
  public H createH(final InternalModelElement ime) {
    return this.createH(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public H createH() {
    return this.createH(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an KeyValue with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public KeyValue createKeyValue(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    KeyValue _createKeyValue = super.createKeyValue();
    final Procedure1<KeyValue> _function = (KeyValue it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalKeyValue _createInternalKeyValue = this._internalFactory.createInternalKeyValue();
        _elvis = _createInternalKeyValue;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        KeyValueEContentAdapter _keyValueEContentAdapter = new KeyValueEContentAdapter();
        _eAdapters.add(_keyValueEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<KeyValue>operator_doubleArrow(_createKeyValue, _function);
  }
  
  /**
   * This method creates an KeyValue with the given id. Post create hook won't be triggered.
   */
  public KeyValue createKeyValue(final String ID) {
    return this.createKeyValue(ID, null, null, false);
  }
  
  /**
   * This method creates an KeyValue with the given id. Post create hook will be triggered.
   */
  public KeyValue createKeyValue(final InternalModelElementContainer parent) {
    return this.createKeyValue(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an KeyValue with the given id. Post create hook will be triggered.
   */
  public KeyValue createKeyValue(final String ID, final InternalModelElementContainer parent) {
    return this.createKeyValue(ID, null, parent, true);
  }
  
  public KeyValue createKeyValue(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createKeyValue(ID, ime, parent, true);
  }
  
  /**
   * This method creates an KeyValue with the given id. Post create hook won't be triggered.
   */
  public KeyValue createKeyValue(final InternalModelElement ime) {
    return this.createKeyValue(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public KeyValue createKeyValue() {
    return this.createKeyValue(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an TableData with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public TableData createTableData(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    TableData _createTableData = super.createTableData();
    final Procedure1<TableData> _function = (TableData it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTableData _createInternalTableData = this._internalFactory.createInternalTableData();
        _elvis = _createInternalTableData;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        TableDataEContentAdapter _tableDataEContentAdapter = new TableDataEContentAdapter();
        _eAdapters.add(_tableDataEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<TableData>operator_doubleArrow(_createTableData, _function);
  }
  
  /**
   * This method creates an TableData with the given id. Post create hook won't be triggered.
   */
  public TableData createTableData(final String ID) {
    return this.createTableData(ID, null, null, false);
  }
  
  /**
   * This method creates an TableData with the given id. Post create hook will be triggered.
   */
  public TableData createTableData(final InternalModelElementContainer parent) {
    return this.createTableData(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an TableData with the given id. Post create hook will be triggered.
   */
  public TableData createTableData(final String ID, final InternalModelElementContainer parent) {
    return this.createTableData(ID, null, parent, true);
  }
  
  public TableData createTableData(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createTableData(ID, ime, parent, true);
  }
  
  /**
   * This method creates an TableData with the given id. Post create hook won't be triggered.
   */
  public TableData createTableData(final InternalModelElement ime) {
    return this.createTableData(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public TableData createTableData() {
    return this.createTableData(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Navigation with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Navigation createNavigation(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Navigation _createNavigation = super.createNavigation();
    final Procedure1<Navigation> _function = (Navigation it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalNavigation _createInternalNavigation = this._internalFactory.createInternalNavigation();
        _elvis = _createInternalNavigation;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        NavigationEContentAdapter _navigationEContentAdapter = new NavigationEContentAdapter();
        _eAdapters.add(_navigationEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Navigation>operator_doubleArrow(_createNavigation, _function);
  }
  
  /**
   * This method creates an Navigation with the given id. Post create hook won't be triggered.
   */
  public Navigation createNavigation(final String ID) {
    return this.createNavigation(ID, null, null, false);
  }
  
  /**
   * This method creates an Navigation with the given id. Post create hook will be triggered.
   */
  public Navigation createNavigation(final InternalModelElementContainer parent) {
    return this.createNavigation(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Navigation with the given id. Post create hook will be triggered.
   */
  public Navigation createNavigation(final String ID, final InternalModelElementContainer parent) {
    return this.createNavigation(ID, null, parent, true);
  }
  
  public Navigation createNavigation(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createNavigation(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Navigation with the given id. Post create hook won't be triggered.
   */
  public Navigation createNavigation(final InternalModelElement ime) {
    return this.createNavigation(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Navigation createNavigation() {
    return this.createNavigation(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an P with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public P createP(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    P _createP = super.createP();
    final Procedure1<P> _function = (P it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalP _createInternalP = this._internalFactory.createInternalP();
        _elvis = _createInternalP;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PEContentAdapter _pEContentAdapter = new PEContentAdapter();
        _eAdapters.add(_pEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<P>operator_doubleArrow(_createP, _function);
  }
  
  /**
   * This method creates an P with the given id. Post create hook won't be triggered.
   */
  public P createP(final String ID) {
    return this.createP(ID, null, null, false);
  }
  
  /**
   * This method creates an P with the given id. Post create hook will be triggered.
   */
  public P createP(final InternalModelElementContainer parent) {
    return this.createP(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an P with the given id. Post create hook will be triggered.
   */
  public P createP(final String ID, final InternalModelElementContainer parent) {
    return this.createP(ID, null, parent, true);
  }
  
  public P createP(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createP(ID, ime, parent, true);
  }
  
  /**
   * This method creates an P with the given id. Post create hook won't be triggered.
   */
  public P createP(final InternalModelElement ime) {
    return this.createP(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public P createP() {
    return this.createP(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Section with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Section createSection(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Section _createSection = super.createSection();
    final Procedure1<Section> _function = (Section it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSection _createInternalSection = this._internalFactory.createInternalSection();
        _elvis = _createInternalSection;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SectionEContentAdapter _sectionEContentAdapter = new SectionEContentAdapter();
        _eAdapters.add(_sectionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Section>operator_doubleArrow(_createSection, _function);
  }
  
  /**
   * This method creates an Section with the given id. Post create hook won't be triggered.
   */
  public Section createSection(final String ID) {
    return this.createSection(ID, null, null, false);
  }
  
  /**
   * This method creates an Section with the given id. Post create hook will be triggered.
   */
  public Section createSection(final InternalModelElementContainer parent) {
    return this.createSection(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Section with the given id. Post create hook will be triggered.
   */
  public Section createSection(final String ID, final InternalModelElementContainer parent) {
    return this.createSection(ID, null, parent, true);
  }
  
  public Section createSection(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSection(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Section with the given id. Post create hook won't be triggered.
   */
  public Section createSection(final InternalModelElement ime) {
    return this.createSection(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Section createSection() {
    return this.createSection(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Input with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Input createInput(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Input _createInput = super.createInput();
    final Procedure1<Input> _function = (Input it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalInput _createInternalInput = this._internalFactory.createInternalInput();
        _elvis = _createInternalInput;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        InputEContentAdapter _inputEContentAdapter = new InputEContentAdapter();
        _eAdapters.add(_inputEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Input>operator_doubleArrow(_createInput, _function);
  }
  
  /**
   * This method creates an Input with the given id. Post create hook won't be triggered.
   */
  public Input createInput(final String ID) {
    return this.createInput(ID, null, null, false);
  }
  
  /**
   * This method creates an Input with the given id. Post create hook will be triggered.
   */
  public Input createInput(final InternalModelElementContainer parent) {
    return this.createInput(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Input with the given id. Post create hook will be triggered.
   */
  public Input createInput(final String ID, final InternalModelElementContainer parent) {
    return this.createInput(ID, null, parent, true);
  }
  
  public Input createInput(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createInput(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Input with the given id. Post create hook won't be triggered.
   */
  public Input createInput(final InternalModelElement ime) {
    return this.createInput(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Input createInput() {
    return this.createInput(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an SubSequence with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SubSequence createSubSequence(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SubSequence _createSubSequence = super.createSubSequence();
    final Procedure1<SubSequence> _function = (SubSequence it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSubSequence _createInternalSubSequence = this._internalFactory.createInternalSubSequence();
        _elvis = _createInternalSubSequence;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SubSequenceEContentAdapter _subSequenceEContentAdapter = new SubSequenceEContentAdapter();
        _eAdapters.add(_subSequenceEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<SubSequence>operator_doubleArrow(_createSubSequence, _function);
  }
  
  /**
   * This method creates an SubSequence with the given id. Post create hook won't be triggered.
   */
  public SubSequence createSubSequence(final String ID) {
    return this.createSubSequence(ID, null, null, false);
  }
  
  /**
   * This method creates an SubSequence with the given id. Post create hook will be triggered.
   */
  public SubSequence createSubSequence(final InternalModelElementContainer parent) {
    return this.createSubSequence(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SubSequence with the given id. Post create hook will be triggered.
   */
  public SubSequence createSubSequence(final String ID, final InternalModelElementContainer parent) {
    return this.createSubSequence(ID, null, parent, true);
  }
  
  public SubSequence createSubSequence(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSubSequence(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SubSequence with the given id. Post create hook won't be triggered.
   */
  public SubSequence createSubSequence(final InternalModelElement ime) {
    return this.createSubSequence(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SubSequence createSubSequence() {
    return this.createSubSequence(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Th with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Th createTh(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Th _createTh = super.createTh();
    final Procedure1<Th> _function = (Th it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTh _createInternalTh = this._internalFactory.createInternalTh();
        _elvis = _createInternalTh;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ThEContentAdapter _thEContentAdapter = new ThEContentAdapter();
        _eAdapters.add(_thEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Th>operator_doubleArrow(_createTh, _function);
  }
  
  /**
   * This method creates an Th with the given id. Post create hook won't be triggered.
   */
  public Th createTh(final String ID) {
    return this.createTh(ID, null, null, false);
  }
  
  /**
   * This method creates an Th with the given id. Post create hook will be triggered.
   */
  public Th createTh(final InternalModelElementContainer parent) {
    return this.createTh(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Th with the given id. Post create hook will be triggered.
   */
  public Th createTh(final String ID, final InternalModelElementContainer parent) {
    return this.createTh(ID, null, parent, true);
  }
  
  public Th createTh(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createTh(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Th with the given id. Post create hook won't be triggered.
   */
  public Th createTh(final InternalModelElement ime) {
    return this.createTh(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Th createTh() {
    return this.createTh(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Screenshot with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Screenshot createScreenshot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Screenshot _createScreenshot = super.createScreenshot();
    final Procedure1<Screenshot> _function = (Screenshot it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalScreenshot _createInternalScreenshot = this._internalFactory.createInternalScreenshot();
        _elvis = _createInternalScreenshot;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        ScreenshotEContentAdapter _screenshotEContentAdapter = new ScreenshotEContentAdapter();
        _eAdapters.add(_screenshotEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Screenshot>operator_doubleArrow(_createScreenshot, _function);
  }
  
  /**
   * This method creates an Screenshot with the given id. Post create hook won't be triggered.
   */
  public Screenshot createScreenshot(final String ID) {
    return this.createScreenshot(ID, null, null, false);
  }
  
  /**
   * This method creates an Screenshot with the given id. Post create hook will be triggered.
   */
  public Screenshot createScreenshot(final InternalModelElementContainer parent) {
    return this.createScreenshot(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Screenshot with the given id. Post create hook will be triggered.
   */
  public Screenshot createScreenshot(final String ID, final InternalModelElementContainer parent) {
    return this.createScreenshot(ID, null, parent, true);
  }
  
  public Screenshot createScreenshot(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createScreenshot(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Screenshot with the given id. Post create hook won't be triggered.
   */
  public Screenshot createScreenshot(final InternalModelElement ime) {
    return this.createScreenshot(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Screenshot createScreenshot() {
    return this.createScreenshot(EcoreUtil.generateUUID());
  }
  
  public Anchor createAnchor(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    Anchor _createAnchor = super.createAnchor();
    final Procedure1<Anchor> _function = (Anchor it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalAnchor _createInternalAnchor = this._internalFactory.createInternalAnchor();
        _elvis = _createInternalAnchor;
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
        AnchorEContentAdapter _anchorEContentAdapter = new AnchorEContentAdapter();
        _eAdapters.add(_anchorEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Anchor>operator_doubleArrow(_createAnchor, _function);
  }
  
  /**
   * This method creates an Anchor with the given id. Post create hook will be triggered.
   */
  public Anchor createAnchor(final String ID, final InternalNode source, final InternalNode target) {
    return this.createAnchor(ID, null, source, target, true);
  }
  
  /**
   * This method creates an Anchor with generated id. Post create hook will be triggered.
   */
  public Anchor createAnchor(final InternalNode source, final InternalNode target) {
    return this.createAnchor(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an Anchor with the given id. Post create hook won't be triggered.
   */
  public Anchor createAnchor(final String ID) {
    return this.createAnchor(ID, null, null, null, false);
  }
  
  /**
   * This method creates an Anchor with a generated id. Post create hook won't be triggered.
   */
  @Override
  public Anchor createAnchor() {
    return this.createAnchor(EcoreUtil.generateUUID());
  }
  
  public Transition createTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    Transition _createTransition = super.createTransition();
    final Procedure1<Transition> _function = (Transition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalTransition _createInternalTransition = this._internalFactory.createInternalTransition();
        _elvis = _createInternalTransition;
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
        TransitionEContentAdapter _transitionEContentAdapter = new TransitionEContentAdapter();
        _eAdapters.add(_transitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Transition>operator_doubleArrow(_createTransition, _function);
  }
  
  /**
   * This method creates an Transition with the given id. Post create hook will be triggered.
   */
  public Transition createTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an Transition with generated id. Post create hook will be triggered.
   */
  public Transition createTransition(final InternalNode source, final InternalNode target) {
    return this.createTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an Transition with the given id. Post create hook won't be triggered.
   */
  public Transition createTransition(final String ID) {
    return this.createTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an Transition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public Transition createTransition() {
    return this.createTransition(EcoreUtil.generateUUID());
  }
  
  public LabeledTransition createLabeledTransition(final String ID, final InternalModelElement ime, final InternalNode source, final InternalNode target, final boolean hook) {
    LabeledTransition _createLabeledTransition = super.createLabeledTransition();
    final Procedure1<LabeledTransition> _function = (LabeledTransition it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalLabeledTransition _createInternalLabeledTransition = this._internalFactory.createInternalLabeledTransition();
        _elvis = _createInternalLabeledTransition;
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
        LabeledTransitionEContentAdapter _labeledTransitionEContentAdapter = new LabeledTransitionEContentAdapter();
        _eAdapters.add(_labeledTransitionEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<LabeledTransition>operator_doubleArrow(_createLabeledTransition, _function);
  }
  
  /**
   * This method creates an LabeledTransition with the given id. Post create hook will be triggered.
   */
  public LabeledTransition createLabeledTransition(final String ID, final InternalNode source, final InternalNode target) {
    return this.createLabeledTransition(ID, null, source, target, true);
  }
  
  /**
   * This method creates an LabeledTransition with generated id. Post create hook will be triggered.
   */
  public LabeledTransition createLabeledTransition(final InternalNode source, final InternalNode target) {
    return this.createLabeledTransition(EcoreUtil.generateUUID(), null, source, target, true);
  }
  
  /**
   * This method creates an LabeledTransition with the given id. Post create hook won't be triggered.
   */
  public LabeledTransition createLabeledTransition(final String ID) {
    return this.createLabeledTransition(ID, null, null, null, false);
  }
  
  /**
   * This method creates an LabeledTransition with a generated id. Post create hook won't be triggered.
   */
  @Override
  public LabeledTransition createLabeledTransition() {
    return this.createLabeledTransition(EcoreUtil.generateUUID());
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
   * This method creates a new UserSequenceGraphModel object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can
   * simply call the UserSequenceGraphModel's save method to save your changes.
   */
  public UserSequenceGraphModel createUserSequenceGraphModel(final String path, final String fileName) {
    IPath filePath = new Path(path).append(fileName).addFileExtension("usersequencegraphmodel");
    URI uri = URI.createPlatformResourceURI(filePath.toOSString(), true);
    Resource res = new ResourceSetImpl().createResource(uri);
    UserSequenceGraphModel graph = UserSequenceFactory.eINSTANCE.createUserSequenceGraphModel();
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
