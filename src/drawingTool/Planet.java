package drawingTool;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Point;

public class Planet implements LocatedRectangle {
	private Point point;
	private int width;
	private int height;
	private int hasRing;
	private PlanetPattern planetPattern; // composite
	private PlanetRing planetRing; // aggregate
	
	
	public Planet(int locationX, int locationY, int width, int height, int hasRing) {
		this.point = new Point(locationX, locationY);
		this.width = width;
		this.height = height;
		this.hasRing = hasRing;
		planetPattern = new PlanetPattern(width, height);
		planetRing = new PlanetRing(locationX, locationY, width, height);
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
	
	private void drawOval(Color c, int x, int y, int width, int height) {
		Drawing.pen().setColor(c);
		Drawing.pen().fillOval(x, y, width, height);
	}
	
	@Override
	public void draw() {
		if (hasRing == 1) {
			planetRing.draw();
			drawOval(Color.orange, this.point.x, this.point.y, width, height);
			planetPattern.drawAt(this.point.x, this.point.y);
		} else {
			drawOval(Color.orange, this.point.x, this.point.y, width, height);
			planetPattern.drawAt(this.point.x, this.point.y);
		}
	}
}
