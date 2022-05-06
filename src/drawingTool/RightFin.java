package drawingTool;

import java.awt.Color;

public class RightFin {
	private int width;
	private int height;
	
	public RightFin(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(Color.gray);
		Drawing.pen().fillPolygon(new int[] {(left + width + height / 3), (left + width), (left + width)}, new int[] {(bottom + height + height / 5), (bottom + height / 2), (bottom + height)}, 3);
	}
}
