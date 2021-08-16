package info.scce.cinco.product.userdocumentation.appearance

import de.jabc.cinco.meta.core.ge.style.generator.runtime.appearance.StyleAppearanceProvider
import style.StyleFactory
import info.scce.cinco.product.usersequence.main.usersequence.WebElement

class HighlightInputNodeAppearance implements StyleAppearanceProvider<WebElement> {

	extension StyleFactory = StyleFactory.eINSTANCE

	val red = createColor => [
		r = 255
		g = 0
		b = 0
	]
	
	val black = createColor => [
		r = 0
		g = 0
		b = 0
	]

	
	override getAppearance(WebElement webElem, String elementName) {
		val foregroundColor = if (webElem.isIsHighlighted) {
			red
		} else {
			black
		}
		return createAppearance => [foreground = foregroundColor]
	}
	
}