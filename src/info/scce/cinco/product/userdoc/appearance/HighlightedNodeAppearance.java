/**
 * 
 */
package info.scce.cinco.product.userdoc.appearance;


import style.Color;
import style.Appearance;
import style.StyleFactory;
import info.scce.cinco.product.userdoc.mglid.userdoc.Input;
import de.jabc.cinco.meta.core.ge.style.generator.runtime.appearance.StyleAppearanceProvider;

/**
 * @author mukendi
 *
 */
public class HighlightedNodeAppearance implements StyleAppearanceProvider<Input> {

	@Override
	public Appearance getAppearance(Input inputField, String innerElement) {
		// Highlight element in the model
		Appearance appearance = StyleFactory.eINSTANCE.createAppearance();
		Color red = StyleFactory.eINSTANCE.createColor();
		red.setR(255);red.setG(0);red.setB(0);
		if (inputField.isHighlighted()) {
			appearance.setForeground(red);
			inputField.update();
		} else {
			red.setR(0);red.setG(0);red.setB(0);
			inputField.resize(inputField.getWidth(), inputField.getHeight());
			appearance.setForeground(red);
		}
		return appearance;
		
	}

}
