package drawingTool;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Drawing {

	private static Graphics2D pen = null;
	
	public static void set(Graphics pen) {
		Drawing.pen = (Graphics2D) pen;
	}
	
	public static Graphics2D pen() {
		return Drawing.pen;
	}
}