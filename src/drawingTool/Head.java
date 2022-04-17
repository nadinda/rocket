package drawingTool;

public class Head {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	
	public Head(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		Drawing.pen().drawLine(locationX + (width / 2), locationY - 30, locationX + width, locationY);
		Drawing.pen().drawLine(locationX + (width / 2), locationY - 30, locationX, locationY);
	}
}
