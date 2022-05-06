package drawingTool;

import java.awt.Color;

public class Head {
	private int width;
	private int height;

	public Head(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(Color.gray);
		Drawing.pen().fillPolygon(new int[] { left, left + (width / 2), left + width },
				new int[] { bottom, (bottom - height / 3), bottom }, 3);
	}
}
