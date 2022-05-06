package drawingTool;

import java.awt.BasicStroke;
import java.awt.Color;

public class Planet {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	
	public Planet(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {

		Drawing.pen().setColor(Color.black);
		Drawing.pen().setStroke(new BasicStroke(30));
		Drawing.pen().drawOval(locationX + 400, locationY - 100, 2*width, height/4);
	    Drawing.pen().setColor(Color.blue);
		Drawing.pen().fillOval(locationX + 500, locationY - 200, width, height);
		
		
		Drawing.pen().setColor(Color.orange);
		Drawing.pen().fillOval(locationX, locationY, width, height);
		Drawing.pen().setColor(new Color(252, 218, 178, 10));
		Drawing.pen().fillOval(locationX, locationY, width+10, height+10);
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
