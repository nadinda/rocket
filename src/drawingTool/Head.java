package drawingTool;

import java.awt.Color;
import java.awt.Point;

public class Head {
	private int width;
	private int height;
	private Color headColor;
	private int headShape;
	
	public Head(int width, int height) {
		this.width = width;
		this.height = height;
		this.headShape = RandomNumber.between(1, 2);
		this.headColor = Color.gray;
	}
	
	public void drawAt(Point point) {
		Drawing.pen().setColor(headColor);
		if(headShape == 1) {
			Drawing.pen().fillPolygon(new int[] {point.x, point.x + (width / 2), point.x + width}, new int[] {point.y, (point.y - height/3), point.y}, 3);
		} else if (headShape == 2) {
			Drawing.pen().fillArc(point.x, point.y - height / 2, width, height, 0, 180);
		}
	}

	public void setHeadColor(Color newColor) {
		this.headColor = newColor;
	}
	
	public void setHeadShape(int headShape) {
		if (headShape == 1)
			this.headShape = 2;
		else if (headShape == 2)
			this.headShape = 1;
	}

	public int getHeadShape() {
		return this.headShape;
	}
}
