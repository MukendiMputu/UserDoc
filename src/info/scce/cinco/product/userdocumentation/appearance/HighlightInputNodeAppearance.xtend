package info.scce.cinco.product.userdocumentation.appearance

import de.jabc.cinco.meta.core.ge.style.generator.runtime.appearance.StyleAppearanceProvider
import style.StyleFactory
import info.scce.cinco.product.usersequence.main.doc.WebElement

class HighlightInputNodeAppearance implements StyleAppearanceProvider<WebElement> {

	extension StyleFactory = StyleFactory.eINSTANCE
	
	val red = createColor => [
		r = 255
		g = 0
		b = 0
	]
	
	val invisible = createColor => [
		r = 245
		g = 245 
		b = 245
	]

	override getAppearance(WebElement webElem, String shapeName) {
		val foregroundColor = if (webElem.isHighlighted) {
			red
		} else {
			invisible
		}
		if ("outer".equals(shapeName)) {
			return createAppearance => [
				foreground = foregroundColor
			]
		} else {
			return null
		}
	}
	
}