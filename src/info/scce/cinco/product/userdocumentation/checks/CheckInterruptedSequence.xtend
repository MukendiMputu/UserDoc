package info.scce.cinco.product.userdocumentation.checks

import graphmodel.GraphModel
import de.jabc.cinco.meta.plugin.mcam.runtime.core.CincoCheckModule
import org.eclipse.xtext.xbase.lib.Functions.Function1

class CheckInterruptedSequence extends UserDocCheck<GraphModel> {
	
	new(CincoCheckModule<?, ?, ?> check, GraphModel elm, Function1<? super GraphModel, ? extends Boolean> test) {
		super(check, elm, test)
	}
	
}