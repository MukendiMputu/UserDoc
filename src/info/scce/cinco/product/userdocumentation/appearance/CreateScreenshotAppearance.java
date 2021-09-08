package info.scce.cinco.product.userdocumentation.appearance;

import org.eclipse.emf.ecore.util.EcoreUtil;

import de.jabc.cinco.meta.core.ge.style.generator.runtime.appearance.StyleAppearanceProvider;
import info.scce.cinco.product.features.main.feature.DocNode;
import style.Appearance;
import style.Color;
import style.StyleFactory;

/**
 * @author mukendi
 *
 */
@SuppressWarnings("all")
public class CreateScreenshotAppearance implements StyleAppearanceProvider<DocNode> {
	
	final Color red = StyleFactory.eINSTANCE.createColor();
	final Color black = StyleFactory.eINSTANCE.createColor();
	
	@Override
	public Appearance getAppearance(DocNode node, String innerElement) {
		// Define the colors
		red.setR(255);red.setG(32);red.setB(32);
		black.setR(0);black.setG(0);black.setB(0);
		
		// Create different appearances
		final Appearance redBorder = StyleFactory.eINSTANCE.createAppearance();
		redBorder.setLineWidth(2);
		redBorder.setForeground(EcoreUtil.<Color>copy(this.red));
		
		if(node.isCreateScreenshots()) {
			if("outer".equals(innerElement))
				return redBorder;
		}
		return null;

	}
}
