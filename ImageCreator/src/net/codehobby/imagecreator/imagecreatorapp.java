package net.codehobby.imagecreator;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class imagecreatorapp
{
	static public void main( String args[] ) throws Exception
	{
		int width = 200;
		int height = 200;
		
		BufferedImage image = new BufferedImage( width, height, BufferedImage.TYPE_INT_ARGB );
		Graphics2D graphics = image.createGraphics();
		
		graphics.setColor( Color.BLACK );
		graphics.setBackground( Color.WHITE );
		graphics.drawRect( 50, 50, 10, 10 );
		
		ImageIO.write( image, "PNG", new File("testImage.png") );
	}
}
