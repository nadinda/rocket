package drawingTool;

public class RightFin {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	
	public RightFin(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		Drawing.pen().drawLine(750, 200, 800, 220);
		Drawing.pen().drawLine(750, 150, 800, 220);
	}
}
