package drawingTool;

import java.awt.Point;

public class Rocket implements LocatedRectangle {
	private Body body;
	private Head head;
	
	private Point point;
	private int width;
	private int height;

	public Rocket(int locationX, int locationY, int width, int height) {
		body = new Body(width, height);
		head = new Head(width, height);
		this.point = new Point(locationX, locationY);
		this.width = width;
		this.height = width;
	}

	public void drawAt(int left, int bottom) {
		body.drawAt(left, bottom);
		head.drawAt(left, bottom);
	}

	public Point address() {
		return this.point;
	}

	public int width() {
		return this.width;
	}

	public int height() {
		return this.height;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
}
