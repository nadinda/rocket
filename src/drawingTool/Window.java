package drawingTool;

import java.awt.Color;

public class Window {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	
	public Window(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.cyan);
		Drawing.pen().fillOval((locationX + (width/3)), (locationY + (width/3)), (width/3), (height/4));
	}
}
