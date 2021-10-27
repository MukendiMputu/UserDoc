package info.scce.cinco.product.userdocumentation.codegen

import java.awt.Color
import java.awt.Font
import java.awt.FontMetrics
import java.awt.Graphics2D
import java.awt.image.BufferedImage
import java.io.File
import java.nio.file.Files
import java.nio.file.Path
import javax.imageio.ImageIO

class ImagePlaceholder extends UserDocFileTemplate {
	var String imageName
	var String path
	val width = 200
	val height = 200
	var BufferedImage buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)
	Graphics2D g2 = buffImg.createGraphics
	Font textFont = new Font("TimesRoman", Font.BOLD, 20)
  	FontMetrics fontMetrics = g2.getFontMetrics
  	val int stringWidth
  	val int stringHeight 
	
	new (String fPath, String fName) {
		imageName = fName
		path = fPath
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
		// FIXME: Create placeholder for Screenshots in the right place
		Files.createDirectories(Path.of(path))
		println(path)
		val f = new File(path + "/" + imageName+".png")
		println(f.path)
		if(!ImageIO.write(buffImg, "PNG", new File(path + "/" + imageName+".png"))){			
		println(f.exists)
		'''

		'''
		}
	}
	
	
}