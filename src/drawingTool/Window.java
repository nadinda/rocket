package drawingTool;

import java.awt.Color;

public class Window extends RoundObject {
	
	public Window(int width, int height) {
		super(width, height);
	}
	
	public void drawAt(int left, int bottom) {
		super.drawAt(left, bottom, Color.cyan);
	}
}