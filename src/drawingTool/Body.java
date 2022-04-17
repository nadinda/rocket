package drawingTool;

public class Body {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	private Window window;
	private LeftFin leftFin;
	private RightFin rightFin;
	private Nozzle nozzle;
	
	public Body(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
		window = new Window(locationX, locationY, width, height);
		leftFin = new LeftFin(locationX, locationY, width, height);
		rightFin = new RightFin(locationX, locationY, width, height);
		nozzle = new Nozzle(locationX, locationY, width, height);
	}
	
	public void draw() {
		Drawing.pen().drawRect(locationX, locationY, width, height);
		window.draw();
		leftFin.draw();
		rightFin.draw();
		nozzle.draw();
	}
	
}
