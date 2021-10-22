package info.scce.cinco.product.userdocumentation.hooks

import de.jabc.cinco.meta.runtime.action.CincoPostAttributeChangeHook
import org.eclipse.emf.ecore.EStructuralFeature
import info.scce.cinco.product.usersequence.main.doc.WebElement
import info.scce.cinco.product.usersequence.main.doc.Highlight

class HighlightOnAttributeChanged<T> extends CincoPostAttributeChangeHook<WebElement> {
	
	override canHandleChange(WebElement element, EStructuralFeature arg1) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override handleChange(WebElement element, EStructuralFeature arg1) {
		if (element.highlighted){
			val Highlight highlighter = element.rootElement.newHighlight(element.x+100, element.y)
			element.newTransition(highlighter, highlighter.id)
			element.rootElement.updateModelElements
			
		}
	}
	
}