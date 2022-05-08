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
		Drawing.pen().setColor(Color.black);
		Drawing.pen().setStroke(new BasicStroke(30));
		Drawing.pen().drawOval(locationX, locationY, 2*width, height/4);
	    //Drawing.pen().setColor(Color.blue);
		//Drawing.pen().fillOval(locationX + 500, locationY - 200, width, height);
	}
}
