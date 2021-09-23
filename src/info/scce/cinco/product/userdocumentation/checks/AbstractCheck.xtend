package info.scce.cinco.product.userdocumentation.checks

import de.jabc.cinco.meta.plugin.mcam.runtime.core._CincoAdapter
import de.jabc.cinco.meta.plugin.mcam.runtime.core._CincoId
import info.scce.mcam.framework.modules.CheckModule
import graphmodel.GraphModel
/**
 * Copied from info.scce.cinco.product.minidime.checks
 */
abstract class AbstractCheck<E extends _CincoId, M extends _CincoAdapter<E, ? extends GraphModel>> extends CheckModule<E, M> {
	
	override execute(M adapter) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override init() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}