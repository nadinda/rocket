package drawingTool;

import java.awt.Color;

public class PlanetPattern {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	
	public PlanetPattern(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillOval(locationX + 50, locationY + 50, width/8, height/8);
		Drawing.pen().setColor(Color.red);
		Drawing.pen().fillOval(locationX + 50, locationY + 50, width/9, height/9);
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillOval(locationX + 80, locationY + 80, width/4, height/4);
		Drawing.pen().setColor(Color.red);
		Drawing.pen().fillOval(locationX + 80, locationY + 80, width/5, height/5);
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillOval(locationX + 40, locationY + 90, width/9, height/9);
		Drawing.pen().setColor(Color.red);
		Drawing.pen().fillOval(locationX + 40, locationY + 90, width/10, height/10);
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillOval(locationX + 90, locationY + 10, width/9, height/9);
		Drawing.pen().setColor(Color.red);
		Drawing.pen().fillOval(locationX + 90, locationY + 10, width/10, height/10);
	}
}
