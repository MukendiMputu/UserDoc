package info.scce.cinco.product.userdocumentation.checks

import de.jabc.cinco.meta.plugin.mcam.runtime.core.CincoCheckModule.Check
import info.scce.cinco.product.usersequence.main.doc.DocGraphModel
import de.jabc.cinco.meta.plugin.mcam.runtime.core.CincoCheckModule
import org.eclipse.xtext.xbase.lib.Functions.Function1

class CheckCycles extends Check<DocGraphModel> {
	
	new(CincoCheckModule<?, ?, ?> check, DocGraphModel elm, Function1<? super DocGraphModel, ? extends Boolean> test) {
		super(check, elm, test)
	}
	
}