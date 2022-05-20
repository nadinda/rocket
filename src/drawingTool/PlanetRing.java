package drawingTool;

import java.awt.BasicStroke;
import java.awt.Color;

public class PlanetRing {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	
	public PlanetRing(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.gray);
		Drawing.pen().setStroke(new BasicStroke(width/10));
		Drawing.pen().drawOval(locationX-width/2, locationY+height/2, 2*width, height/4);
	}
}
