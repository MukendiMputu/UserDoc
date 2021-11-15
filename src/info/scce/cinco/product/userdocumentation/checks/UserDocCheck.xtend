package info.scce.cinco.product.userdocumentation.checks

import de.jabc.cinco.meta.plugin.mcam.runtime.core._CincoAdapter
import de.jabc.cinco.meta.plugin.mcam.runtime.core._CincoId
import info.scce.mcam.framework.modules.CheckModule
import graphmodel.GraphModel

/**
 * Copied from info.scce.minidime.checks.AbstractCheck
 */
abstract class UserDocCheck<T1 extends _CincoId, T2 extends _CincoAdapter<T1, ? extends GraphModel>> extends CheckModule<T1, T2> {
	
	override final void execute(T2 adapter) {
		try {
			adapter.doExecute
		}
		catch(Exception e) {
			addError(adapter.getIdByString(adapter.model.id), 'check execution failed')
			System.err.println(e)
			System.err.println(e.message)
			e.printStackTrace
		}
	}
	
	def void doExecute(T2 adapter)
	
}