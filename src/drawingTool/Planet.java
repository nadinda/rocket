package drawingTool;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Point;

public class Planet implements LocatedRectangle {
	Point point;
	private int width;
	private int height;
	private int hasRing;
	PlanetPattern planetPattern;
	PlanetRing planetRing;
	
	
	public Planet(int locationX, int locationY, int width, int height, int hasRing) {
		this.point = new Point(locationX, locationY);
		this.width = width;
		this.height = height;
		this.hasRing = hasRing;
		planetPattern = new PlanetPattern(locationX, locationY, width, height);
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

	@Override
	public void draw() {
		if (hasRing == 1) {
			planetRing.draw();
			Drawing.pen().setColor(Color.orange);
			Drawing.pen().fillOval(this.point.x, this.point.y, width, height);
			planetPattern.draw();
		} else {
			Drawing.pen().setColor(Color.orange);
			Drawing.pen().fillOval(this.point.x, this.point.y, width, height);
			planetPattern.draw();
		}
	}
}
