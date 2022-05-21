package drawingTool;

import java.awt.Color;
import java.awt.Point;

public class Head {
	private int width;
	private int height;
	private Color headColor;

	public Head(int width, int height) {
		this.width = width;
		this.height = height;
		this.headColor = new Color(RandomNumber.between(0, 255), RandomNumber.between(154, 255), RandomNumber.between(180, 255));
	}
	
	public void drawAt(Point point) {
		Drawing.pen().setColor(headColor);
		Drawing.pen().fillPolygon(new int[] { point.x, point.x + (width / 2), point.x + width },
				new int[] { point.y, (point.y - height / 3), point.y }, 3);
	}
}
