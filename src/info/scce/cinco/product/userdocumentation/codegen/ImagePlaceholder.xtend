package info.scce.cinco.product.userdocumentation.codegen

import info.scce.cinco.product.userdocumentation.codegen.UserDocFileTemplate
import java.awt.image.BufferedImage
import java.awt.Graphics2D
import java.awt.Font
import javax.imageio.ImageIO
import java.io.File
import java.awt.FontMetrics
import java.awt.Color

class ImagePlaceholder extends UserDocFileTemplate {
	var String imageName
	
	val width = 200
	val height = 200
	var BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)
	Graphics2D g2 = buffImg.createGraphics
	Font textFont = new Font("TimesRoman", Font.BOLD, 20)
  	FontMetrics fontMetrics = g2.getFontMetrics
  	val int stringWidth
  	val int stringHeight 
	
	new (String fName) {
		imageName = fName
		g2.setFont(textFont)
		g2.setPaint(Color.black)
		stringWidth = fontMetrics.stringWidth(imageName)
		stringHeight = fontMetrics.getAscent
		g2.drawString(imageName, (width - stringWidth) / 2, height / 2 + stringHeight / 4)
	}
	
	override fileName() {
		'''«imageName».png'''
	}
	
	override fileTemplate() {
		if(!ImageIO.write(buffImg, "PNG", new File("./"+imageName+".png"))){			
		'''

		'''
		}
	}
	
	
}