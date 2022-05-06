package drawingTool;

import java.awt.Color;

public class Star {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	
	public Star(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.red);
		Drawing.pen().fillPolygon(new int[]{250,150,0,150,100,250,400,350,500,350}, new int[]{100,200,200,300,400,300,400,300,200,200}, 10);
	}
}
