package info.scce.cinco.product.usersequence.adapter

class UserSequenceGraphModelEContentAdapter extends org.eclipse.emf.ecore.util.EContentAdapter implements de.jabc.cinco.meta.runtime.contentadapter.CincoEContentAdapter{

	override notifyChanged(org.eclipse.emf.common.notify.Notification notification) {
		super.notifyChanged(notification)
		val o = notification.notifier
		val feature = notification.feature
		if (o instanceof info.scce.cinco.product.usersequence.usersequence.internal.InternalUserSequenceGraphModel) {
			if (o.eContainer == null && !(o instanceof graphmodel.internal.InternalGraphModel)) return;
			switch feature {
				org.eclipse.emf.ecore.EStructuralFeature case feature.isRelevant: {
				}
			}
		}
	}
	
	private def isRelevant(org.eclipse.emf.ecore.EStructuralFeature ftr) {
		ftr.eDeliver 
			&& info.scce.cinco.product.usersequence.usersequence.internal.InternalPackage.eINSTANCE.EClassifiers.contains(ftr?.eContainer)
			&& ftr.name != "libraryComponentUID"
	}
}
