package drawingTool;

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
		Drawing.pen().drawOval(locationX, locationY, width, height);
	}
}
