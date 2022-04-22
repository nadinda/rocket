package drawingTool;

import java.awt.Color;

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
		Drawing.pen().setColor(Color.gray);
		Drawing.pen().fillPolygon(new int[] {(locationX + width + height / 3), (locationX + width), (locationX + width)}, new int[] {(locationY + height + height / 5), (locationY + height / 2), (locationY + height)}, 3);
		//Drawing.pen().drawLine(locationX + width, (locationY + height), (locationX + width + height / 3), (locationY + height + height / 5));
		//Drawing.pen().drawLine(locationX + width, (locationY + height / 2), (locationX + width + height / 3), (locationY + height + height / 5 ));
	}
}
