package drawingTool;

import java.awt.Color;
import java.awt.Point;

public class Rocket implements LocatedRectangle {
	private Body body; // composite
	private Head head; // composite
	
	private Point point;
	private int width;
	private int height;

	public Rocket(int locationX, int locationY, int width, int height) {
		head = new Head(width, height);
		body = new Body(width, height);
		this.point = new Point(locationX, locationY);
		this.width = width;
		this.height = width;
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
		body.drawAt(this.point);
		head.drawAt(this.point);
	}

	public void setHeadColor(Color color) {
		head.setHeadColor(color);
	}
	
	public void setHeadShape(int currentShape) {
		head.setHeadShape(currentShape);
	}
	
	public int getHeadShape() {
		return head.getHeadShape();
	}

	public void setFireLevel(int level) {
		body.setFireLevel(level);
	}
}
