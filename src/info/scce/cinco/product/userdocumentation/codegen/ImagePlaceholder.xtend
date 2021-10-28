package info.scce.cinco.product.userdocumentation.codegen

import java.awt.Color
import java.awt.Font
import java.awt.Graphics2D
import java.awt.font.FontRenderContext
import java.awt.font.TextLayout
import java.awt.geom.Rectangle2D
import java.awt.image.BufferedImage
import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path
import javax.imageio.ImageIO

class ImagePlaceholder extends UserDocFileTemplate {
	var String imageName
	var String path
	val width = 400
	val height = 200
	
	var BufferedImage 		buffImg
	var Graphics2D 			g2 	
	var Font 				font 
	var FontRenderContext 	frc 
	var TextLayout 			layout 
	var Rectangle2D 		bounds 
	
	new (String fPath, String fName) {
		imageName = fName
		path = fPath
		
		
		buffImg 	= new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)
		g2 			= buffImg.createGraphics
		font 		= new Font("TimesRoman", Font.BOLD, 20)
		frc 		= g2.getFontRenderContext
		layout 		= new TextLayout(imageName, font, frc)
		bounds 		= layout.getBounds
		
		
		g2.fillRect(0, 0, width, height)
		g2.setPaint(Color.black);
		layout.draw(g2, (width - bounds.getWidth) as float /2 , (height + bounds.getHeight) as float /2);
	}
	
	override fileName() {
		'''«imageName».png'''
	}
	
	override fileTemplate() {
		Files.createDirectories(Path.of(path))
		try {
			ImageIO.write(buffImg, "PNG", new File(path + "/" + imageName+".png"))
		} catch (IOException e) {
			e.printStackTrace();
		}		
		''''''	
	}
	
	
}