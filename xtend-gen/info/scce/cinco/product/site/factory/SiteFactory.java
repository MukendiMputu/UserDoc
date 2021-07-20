package info.scce.cinco.product.site.factory;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.runtime.xapi.WorkbenchExtension;
import graphmodel.GraphModel;
import graphmodel.IdentifiableElement;
import graphmodel.ModelElement;
import graphmodel.Type;
import graphmodel.internal.InternalGraphModel;
import graphmodel.internal.InternalIdentifiableElement;
import graphmodel.internal.InternalModelElement;
import graphmodel.internal.InternalModelElementContainer;
import graphmodel.internal.InternalType;
import info.scce.cinco.product.site.adapter.DomainEContentAdapter;
import info.scce.cinco.product.site.adapter.EmailEContentAdapter;
import info.scce.cinco.product.site.adapter.PageEContentAdapter;
import info.scce.cinco.product.site.adapter.PasswordEContentAdapter;
import info.scce.cinco.product.site.adapter.SiteConfigurationGraphModelEContentAdapter;
import info.scce.cinco.product.site.adapter.UrlEContentAdapter;
import info.scce.cinco.product.site.adapter.UsernameEContentAdapter;
import info.scce.cinco.product.site.site.Domain;
import info.scce.cinco.product.site.site.Email;
import info.scce.cinco.product.site.site.Page;
import info.scce.cinco.product.site.site.Password;
import info.scce.cinco.product.site.site.SiteConfigurationGraphModel;
import info.scce.cinco.product.site.site.SitePackage;
import info.scce.cinco.product.site.site.Url;
import info.scce.cinco.product.site.site.Username;
import info.scce.cinco.product.site.site.impl.SiteFactoryImpl;
import info.scce.cinco.product.site.site.internal.InternalDomain;
import info.scce.cinco.product.site.site.internal.InternalEmail;
import info.scce.cinco.product.site.site.internal.InternalFactory;
import info.scce.cinco.product.site.site.internal.InternalPage;
import info.scce.cinco.product.site.site.internal.InternalPassword;
import info.scce.cinco.product.site.site.internal.InternalSiteConfigurationGraphModel;
import info.scce.cinco.product.site.site.internal.InternalUrl;
import info.scce.cinco.product.site.site.internal.InternalUsername;
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
public class SiteFactory extends SiteFactoryImpl {
  @Extension
  private final InternalFactory _internalFactory = InternalFactory.eINSTANCE;
  
  public static SiteFactory eINSTANCE = SiteFactory.init();
  
  @Extension
  private WorkbenchExtension _workbenchExtension = new WorkbenchExtension();
  
  public static SiteFactory init() {
    SiteFactory _xblockexpression = null;
    {
      try {
        EFactory _eFactory = EPackage.Registry.INSTANCE.getEFactory(SitePackage.eNS_URI);
        final SiteFactory fct = ((SiteFactory) _eFactory);
        boolean _notEquals = (!Objects.equal(fct, null));
        if (_notEquals) {
          return ((SiteFactory) fct);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception exception = (Exception)_t;
          EcorePlugin.INSTANCE.log(exception);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = new SiteFactory();
    }
    return _xblockexpression;
  }
  
  /**
   * This method creates an SiteConfigurationGraphModel with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public SiteConfigurationGraphModel createSiteConfigurationGraphModel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    SiteConfigurationGraphModel _createSiteConfigurationGraphModel = super.createSiteConfigurationGraphModel();
    final Procedure1<SiteConfigurationGraphModel> _function = (SiteConfigurationGraphModel it) -> {
      EcoreUtil.setID(it, ID);
      InternalIdentifiableElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalSiteConfigurationGraphModel _createInternalSiteConfigurationGraphModel = this._internalFactory.createInternalSiteConfigurationGraphModel();
        _elvis = _createInternalSiteConfigurationGraphModel;
      }
      final Procedure1<InternalIdentifiableElement> _function_1 = (InternalIdentifiableElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        EList<Adapter> _eAdapters = it_1.eAdapters();
        SiteConfigurationGraphModelEContentAdapter _siteConfigurationGraphModelEContentAdapter = new SiteConfigurationGraphModelEContentAdapter();
        _eAdapters.add(_siteConfigurationGraphModelEContentAdapter);
      };
      InternalIdentifiableElement _doubleArrow = ObjectExtensions.<InternalIdentifiableElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<SiteConfigurationGraphModel>operator_doubleArrow(_createSiteConfigurationGraphModel, _function);
  }
  
  /**
   * This method creates an SiteConfigurationGraphModel with the given id. Post create hook won't be triggered.
   */
  public SiteConfigurationGraphModel createSiteConfigurationGraphModel(final String ID) {
    return this.createSiteConfigurationGraphModel(ID, null, null, false);
  }
  
  /**
   * This method creates an SiteConfigurationGraphModel with the given id. Post create hook will be triggered.
   */
  public SiteConfigurationGraphModel createSiteConfigurationGraphModel(final InternalModelElementContainer parent) {
    return this.createSiteConfigurationGraphModel(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an SiteConfigurationGraphModel with the given id. Post create hook will be triggered.
   */
  public SiteConfigurationGraphModel createSiteConfigurationGraphModel(final String ID, final InternalModelElementContainer parent) {
    return this.createSiteConfigurationGraphModel(ID, null, parent, true);
  }
  
  public SiteConfigurationGraphModel createSiteConfigurationGraphModel(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createSiteConfigurationGraphModel(ID, ime, parent, true);
  }
  
  /**
   * This method creates an SiteConfigurationGraphModel with the given id. Post create hook won't be triggered.
   */
  public SiteConfigurationGraphModel createSiteConfigurationGraphModel(final InternalModelElement ime) {
    return this.createSiteConfigurationGraphModel(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public SiteConfigurationGraphModel createSiteConfigurationGraphModel() {
    return this.createSiteConfigurationGraphModel(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Page with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Page createPage(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Page _createPage = super.createPage();
    final Procedure1<Page> _function = (Page it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPage _createInternalPage = this._internalFactory.createInternalPage();
        _elvis = _createInternalPage;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PageEContentAdapter _pageEContentAdapter = new PageEContentAdapter();
        _eAdapters.add(_pageEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Page>operator_doubleArrow(_createPage, _function);
  }
  
  /**
   * This method creates an Page with the given id. Post create hook won't be triggered.
   */
  public Page createPage(final String ID) {
    return this.createPage(ID, null, null, false);
  }
  
  /**
   * This method creates an Page with the given id. Post create hook will be triggered.
   */
  public Page createPage(final InternalModelElementContainer parent) {
    return this.createPage(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Page with the given id. Post create hook will be triggered.
   */
  public Page createPage(final String ID, final InternalModelElementContainer parent) {
    return this.createPage(ID, null, parent, true);
  }
  
  public Page createPage(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPage(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Page with the given id. Post create hook won't be triggered.
   */
  public Page createPage(final InternalModelElement ime) {
    return this.createPage(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Page createPage() {
    return this.createPage(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Username with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Username createUsername(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Username _createUsername = super.createUsername();
    final Procedure1<Username> _function = (Username it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalUsername _createInternalUsername = this._internalFactory.createInternalUsername();
        _elvis = _createInternalUsername;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        UsernameEContentAdapter _usernameEContentAdapter = new UsernameEContentAdapter();
        _eAdapters.add(_usernameEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Username>operator_doubleArrow(_createUsername, _function);
  }
  
  /**
   * This method creates an Username with the given id. Post create hook won't be triggered.
   */
  public Username createUsername(final String ID) {
    return this.createUsername(ID, null, null, false);
  }
  
  /**
   * This method creates an Username with the given id. Post create hook will be triggered.
   */
  public Username createUsername(final InternalModelElementContainer parent) {
    return this.createUsername(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Username with the given id. Post create hook will be triggered.
   */
  public Username createUsername(final String ID, final InternalModelElementContainer parent) {
    return this.createUsername(ID, null, parent, true);
  }
  
  public Username createUsername(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createUsername(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Username with the given id. Post create hook won't be triggered.
   */
  public Username createUsername(final InternalModelElement ime) {
    return this.createUsername(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Username createUsername() {
    return this.createUsername(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Url with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Url createUrl(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Url _createUrl = super.createUrl();
    final Procedure1<Url> _function = (Url it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalUrl _createInternalUrl = this._internalFactory.createInternalUrl();
        _elvis = _createInternalUrl;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        UrlEContentAdapter _urlEContentAdapter = new UrlEContentAdapter();
        _eAdapters.add(_urlEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Url>operator_doubleArrow(_createUrl, _function);
  }
  
  /**
   * This method creates an Url with the given id. Post create hook won't be triggered.
   */
  public Url createUrl(final String ID) {
    return this.createUrl(ID, null, null, false);
  }
  
  /**
   * This method creates an Url with the given id. Post create hook will be triggered.
   */
  public Url createUrl(final InternalModelElementContainer parent) {
    return this.createUrl(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Url with the given id. Post create hook will be triggered.
   */
  public Url createUrl(final String ID, final InternalModelElementContainer parent) {
    return this.createUrl(ID, null, parent, true);
  }
  
  public Url createUrl(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createUrl(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Url with the given id. Post create hook won't be triggered.
   */
  public Url createUrl(final InternalModelElement ime) {
    return this.createUrl(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Url createUrl() {
    return this.createUrl(EcoreUtil.generateUUID());
  }
  
  /**
   * This method creates an Password with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Password createPassword(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Password _createPassword = super.createPassword();
    final Procedure1<Password> _function = (Password it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalPassword _createInternalPassword = this._internalFactory.createInternalPassword();
        _elvis = _createInternalPassword;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        PasswordEContentAdapter _passwordEContentAdapter = new PasswordEContentAdapter();
        _eAdapters.add(_passwordEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Password>operator_doubleArrow(_createPassword, _function);
  }
  
  /**
   * This method creates an Password with the given id. Post create hook won't be triggered.
   */
  public Password createPassword(final String ID) {
    return this.createPassword(ID, null, null, false);
  }
  
  /**
   * This method creates an Password with the given id. Post create hook will be triggered.
   */
  public Password createPassword(final InternalModelElementContainer parent) {
    return this.createPassword(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Password with the given id. Post create hook will be triggered.
   */
  public Password createPassword(final String ID, final InternalModelElementContainer parent) {
    return this.createPassword(ID, null, parent, true);
  }
  
  public Password createPassword(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createPassword(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Password with the given id. Post create hook won't be triggered.
   */
  public Password createPassword(final InternalModelElement ime) {
    return this.createPassword(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Password createPassword() {
    return this.createPassword(EcoreUtil.generateUUID());
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
   * This method creates an Email with the given id.
   * 
   * @param ID: The id for the new element
   * @param ime: The internal model element {@link graphmodel.internal.InternalModelElement}
   * @param parent: The parent element of the newly created element. Needed if a post create hook accesses the parent
   * element of the created element
   * @param hook: Indicates, if the post create hook should be executed
   */
  public Email createEmail(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent, final boolean hook) {
    Email _createEmail = super.createEmail();
    final Procedure1<Email> _function = (Email it) -> {
      EcoreUtil.setID(it, ID);
      InternalModelElement _elvis = null;
      if (ime != null) {
        _elvis = ime;
      } else {
        InternalEmail _createInternalEmail = this._internalFactory.createInternalEmail();
        _elvis = _createInternalEmail;
      }
      final Procedure1<InternalModelElement> _function_1 = (InternalModelElement it_1) -> {
        EcoreUtil.setID(it_1, (ID + "_INTERNAL"));
        it_1.setContainer(parent);
        EList<Adapter> _eAdapters = it_1.eAdapters();
        EmailEContentAdapter _emailEContentAdapter = new EmailEContentAdapter();
        _eAdapters.add(_emailEContentAdapter);
      };
      InternalModelElement _doubleArrow = ObjectExtensions.<InternalModelElement>operator_doubleArrow(_elvis, _function_1);
      this.setInternal(it, _doubleArrow);
    };
    return ObjectExtensions.<Email>operator_doubleArrow(_createEmail, _function);
  }
  
  /**
   * This method creates an Email with the given id. Post create hook won't be triggered.
   */
  public Email createEmail(final String ID) {
    return this.createEmail(ID, null, null, false);
  }
  
  /**
   * This method creates an Email with the given id. Post create hook will be triggered.
   */
  public Email createEmail(final InternalModelElementContainer parent) {
    return this.createEmail(EcoreUtil.generateUUID(), null, parent, true);
  }
  
  /**
   * This method creates an Email with the given id. Post create hook will be triggered.
   */
  public Email createEmail(final String ID, final InternalModelElementContainer parent) {
    return this.createEmail(ID, null, parent, true);
  }
  
  public Email createEmail(final String ID, final InternalModelElement ime, final InternalModelElementContainer parent) {
    return this.createEmail(ID, ime, parent, true);
  }
  
  /**
   * This method creates an Email with the given id. Post create hook won't be triggered.
   */
  public Email createEmail(final InternalModelElement ime) {
    return this.createEmail(EcoreUtil.generateUUID(), ime, null, false);
  }
  
  @Override
  public Email createEmail() {
    return this.createEmail(EcoreUtil.generateUUID());
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
   * This method creates a new SiteConfigurationGraphModel object with an underlying org.eclipse.emf.ecore.resource.Resource. Thus you can
   * simply call the SiteConfigurationGraphModel's save method to save your changes.
   */
  public SiteConfigurationGraphModel createSiteConfigurationGraphModel(final String path, final String fileName) {
    IPath filePath = new Path(path).append(fileName).addFileExtension("siteconfigurationgraphmodel");
    URI uri = URI.createPlatformResourceURI(filePath.toOSString(), true);
    Resource res = new ResourceSetImpl().createResource(uri);
    SiteConfigurationGraphModel graph = SiteFactory.eINSTANCE.createSiteConfigurationGraphModel();
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
