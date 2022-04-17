package drawingTool;

public class Nozzle {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	private int heightNozzle = 40;
	private int widthNozzle = 20;
	private Fire fire;
	
	public Nozzle(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
		fire = new Fire(locationX, locationY, width, height, widthNozzle, heightNozzle);
	}
	
	public void draw() {
		Drawing.pen().drawRect(locationX + 5, locationY + height, heightNozzle, widthNozzle);
		fire.draw();
	}
}
