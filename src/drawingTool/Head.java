package drawingTool;

import java.awt.Color;
import java.awt.Point;

public class Head {
	private int width;
	private int height;

	public Head(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void drawAt(Point point) {
		Drawing.pen().setColor(Color.gray);
		Drawing.pen().fillPolygon(new int[] { point.x, point.x + (width / 2), point.x + width },
				new int[] { point.y, (point.y - height / 3), point.y }, 3);
	}
}
