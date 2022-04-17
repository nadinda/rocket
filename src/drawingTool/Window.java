package drawingTool;

public class Window {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	
	public Window(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		Drawing.pen().drawOval((locationX + 10), (locationY + 10), 30, 30);
	}
}
