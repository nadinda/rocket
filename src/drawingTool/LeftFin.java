package drawingTool;

import java.awt.Color;

public class LeftFin {
	private int width;
	private int height;
	
	public LeftFin(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(Color.gray);
		Drawing.pen().fillPolygon(new int[] {(left - height / 3), left, left}, new int[] {(bottom + height + height / 5), (bottom + height / 2), (bottom + height)}, 3);
	}
}