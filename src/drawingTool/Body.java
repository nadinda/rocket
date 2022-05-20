package drawingTool;

import java.awt.Color;
import java.awt.Point;

public class Body {
	private int width;
	private int height;
	private Window window; // composite
	private LeftFin leftFin; // composite
	private RightFin rightFin; // composite
	private Nozzle nozzle; // composite
	
	public Body(int width, int height) {
		this.width = width;
		this.height = height;
		window = new Window(width/3, height/4);
		leftFin = new LeftFin(width, height);
		rightFin = new RightFin(width, height);
		nozzle = new Nozzle(width, height);
	}
	
	public void drawAt(Point point) {
		Drawing.pen().setColor(Color.blue);
		Drawing.pen().fillRect(point.x, point.y, width, height);
		window.drawAt(point.x + (width/3), point.y + (width/5));
		leftFin.drawAt(point.x, point.y);
		rightFin.drawAt(point.x, point.y);
		nozzle.drawAt(point.x, point.y);
	}
	
}
