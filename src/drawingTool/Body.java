package drawingTool;

import java.awt.Color;

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
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(Color.blue);
		Drawing.pen().fillRect(left, bottom, width, height);
		window.drawAt(left + (width/3), bottom + (width/3));
		leftFin.drawAt(left, bottom);
		rightFin.drawAt(left, bottom);
		nozzle.drawAt(left, bottom);
	}
	
}
