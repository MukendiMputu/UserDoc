package info.scce.cinco.product.usersequence.adapter;

import com.google.common.base.Objects;
import de.jabc.cinco.meta.runtime.contentadapter.CincoEContentAdapter;
import graphmodel.GraphModel;
import graphmodel.ModelElement;
import graphmodel.internal.InternalGraphModel;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalLabeledTransition;
import info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;

@SuppressWarnings("all")
public class LabeledTransitionEContentAdapter extends EContentAdapter implements CincoEContentAdapter {
  @Override
  public void notifyChanged(final Notification notification) {
    super.notifyChanged(notification);
    final Object o = notification.getNotifier();
    final Object feature = notification.getFeature();
    if ((o instanceof InternalLabeledTransition)) {
      if ((Objects.equal(((InternalLabeledTransition)o).eContainer(), null) && (!(o instanceof InternalGraphModel)))) {
        return;
      }
      boolean _matched = false;
      if (feature instanceof EStructuralFeature) {
        boolean _isRelevant = this.isRelevant(((EStructuralFeature)feature));
        if (_isRelevant) {
          _matched=true;
          ModelElement _element = ((InternalLabeledTransition)o).getElement();
          GraphModel _rootElement = null;
          if (_element!=null) {
            _rootElement=_element.getRootElement();
          }
          if (_rootElement!=null) {
            _rootElement.updateModelElements();
          }
        }
      }
    }
  }
  
  private boolean isRelevant(final EStructuralFeature ftr) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _eDeliver = ftr.eDeliver();
    if (!_eDeliver) {
      _and_1 = false;
    } else {
      EList<EClassifier> _eClassifiers = InternalPackage.eINSTANCE.getEClassifiers();
      EObject _eContainer = null;
      if (ftr!=null) {
        _eContainer=ftr.eContainer();
      }
      boolean _contains = _eClassifiers.contains(_eContainer);
      _and_1 = _contains;
    }
    if (!_and_1) {
      _and = false;
    } else {
      String _name = ftr.getName();
      boolean _notEquals = (!Objects.equal(_name, "libraryComponentUID"));
      _and = _notEquals;
    }
    return _and;
  }
}
