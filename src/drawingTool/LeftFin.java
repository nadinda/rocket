package drawingTool;

public class LeftFin {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	
	public LeftFin(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
	}
	
	public void draw() {
		Drawing.pen().drawLine(700, 200, 650, 220);
		Drawing.pen().drawLine(700, 150, 650, 220);
	}
}
