package info.scce.cinco.product.userdocumentation.appearance;

import style.Color;
import style.Appearance;
import style.StyleFactory;
import org.eclipse.emf.ecore.util.EcoreUtil;
import info.scce.cinco.product.usersequence.usersequence.WebElement;


import de.jabc.cinco.meta.core.ge.style.generator.runtime.appearance.StyleAppearanceProvider;

/**
 * @author mukendi
 *
 */
@SuppressWarnings("all")
public class HighlightedNodeAppearance implements StyleAppearanceProvider<WebElement> {
	
	final Color red = StyleFactory.eINSTANCE.createColor();
	final Color black = StyleFactory.eINSTANCE.createColor();
	
	@Override
	public Appearance getAppearance(WebElement node, String innerElement) {
		red.setR(255);red.setG(32);red.setB(32);
		black.setR(0);black.setG(0);black.setB(0);
		
		final Appearance appearance = StyleFactory.eINSTANCE.createAppearance();
		if(node.isIsHighlighted()) {
			appearance.setLineWidth(2);
			appearance.setForeground(EcoreUtil.<Color>copy(this.red));
		} else {
			appearance.setLineWidth(1);
			appearance.setForeground(EcoreUtil.<Color>copy(this.black));
			
		}
		
		return appearance;
	}


}
