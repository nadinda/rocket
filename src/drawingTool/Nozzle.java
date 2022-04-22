package drawingTool;

import java.awt.Color;

public class Nozzle {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	private int heightNozzle;
	private int widthNozzle;
	private Fire fire;
	
	public Nozzle(int locationX, int locationY, int width, int height) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
		this.heightNozzle = height / 5;
		this.widthNozzle = width - width / 5;
		fire = new Fire(locationX, locationY, width, height, widthNozzle, heightNozzle);
	}
	
	public void draw() {
		Drawing.pen().setColor(Color.darkGray);
		Drawing.pen().fillRect(locationX + width / 10, locationY + height, widthNozzle, heightNozzle);
		fire.draw();
	}
}
