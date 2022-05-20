package drawingTool;

import java.awt.Color;

public class PlanetPattern extends RoundObject {
	public PlanetPattern(int width, int height) {
		super(width, height);
	}
	
	public void drawAt(int locationX, int locationY) {
		drawOval(Color.black, locationX + getWidth()/4, locationY + getHeight()/4, getWidth()/8, getHeight()/8);
		drawOval(Color.red, locationX + getWidth()/4, locationY + getHeight()/4, getWidth()/9, getHeight()/9);
		
		drawOval(Color.black, locationX + getWidth()/2, locationY + getHeight()/3, getWidth()/4, getHeight()/4);
		drawOval(Color.red, locationX + getWidth()/2, locationY + getHeight()/3, getWidth()/5, getHeight()/5);
		
		drawOval(Color.black, locationX + getWidth()/6, locationY + getHeight()/2, getWidth()/9, getHeight()/9);
		drawOval(Color.red, locationX + getWidth()/6, locationY + getHeight()/2, getWidth()/10, getHeight()/10);
		
		drawOval(Color.black, locationX + getWidth()/2, locationY + getHeight()/9 , getWidth()/9, getHeight()/9);
		drawOval(Color.red, locationX + getWidth()/2, locationY + getHeight()/9, getWidth()/10, getHeight()/10);
	}
	
	private void drawOval(Color c, int x, int y, int width, int height) {
		Drawing.pen().setColor(c);
		Drawing.pen().fillOval(x, y, width, height);
	}
	
}
