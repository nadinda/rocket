package drawingTool;

import java.awt.Color;

public class RoundObject {
	protected int width;
	protected int height;
	
	public RoundObject(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void drawAt(int left, int bottom, Color color) {
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(left, bottom, width, height);
	}
}
