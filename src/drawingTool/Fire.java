package drawingTool;

import java.awt.Color;

public class Fire {
	private int locationX;
	private int locationY;
	private int width;
	private int height;
	private int heightNozzle;
	private int widthNozzle;
	
	public Fire(int locationX, int locationY, int width, int height, int widthNozzle, int heightNozzle) {
		this.locationX = locationX;
		this.locationY = locationY;
		this.width = width;
		this.height = height;
		this.heightNozzle = heightNozzle;
		this.widthNozzle = widthNozzle;
	}

	public void draw() {
		//int xCoords[] = { locationX + 5, locationX + 5, locationX + 5 + (1/3 *widthNozzle), locationX + 5 + (1/2 *widthNozzle), locationX + 5 + widthNozzle -(1/3 *widthNozzle), locationX + 5 + widthNozzle, locationX + 5 + widthNozzle};
		//int yCoords[] = { locationY + height + 20, locationY + height + 30, locationY + height + 25, locationY + height + 50, locationY + height + 25,locationY + height + 30 ,locationY + height + 20};
		
		Drawing.pen().setColor(Color.red);
		Drawing.pen().drawLine(locationX + width/10, locationY + height + heightNozzle, locationX , locationY + height + 2 * heightNozzle);
		Drawing.pen().drawLine(locationX + widthNozzle / 2 , locationY + height + heightNozzle, locationX, locationY + height + 2 * heightNozzle);
		
		Drawing.pen().drawLine(locationX +  widthNozzle / 2, locationY + height + heightNozzle, locationX + ((heightNozzle * 3)/2), locationY + height + 2 * heightNozzle);
		Drawing.pen().drawLine(locationX +  widthNozzle, locationY + height + heightNozzle, locationX + ((heightNozzle * 3)/2), locationY + height + 2 * heightNozzle);
		
		//Drawing.pen().drawLine(locationX + 20, locationY + height + 40, locationX + 20, locationY + height + 60);
		//Drawing.pen().drawLine(locationX + 35, locationY + height + 40, locationX + 20, locationY + height + 60);
		
		//int xCoords[] = { locationX + 5, locationX + 5 + widthNozzle, locationX + 5 + widthNozzle, locationX + 5 + widthNozzle -(1/3 *widthNozzle), locationX + 5 + (1/2 *widthNozzle), locationX + 5 + (1/3 *widthNozzle), locationX + 5};
		//int yCoords[] = { locationY + height + 20, locationY + height + 20, locationY + height + 30, locationY + height + 25, locationY + height + 50,locationY + height + 25 ,locationY + height + 30};
		//Drawing.pen().drawLine(locationX + 5, locationY + height + 15, locationX, locationY + height + heightNozzle);
		//Drawing.pen().drawLine(locationX + 10, locationY + height + 15, locationX, locationY + height + heightNozzle);
		//Drawing.pen().drawPolygon(xCoords, yCoords, 7);
	}
}
