package drawingTool;

import java.awt.Color;

public class Nozzle {
	private int width;
	private int height;
	private int heightNozzle;
	private int widthNozzle;
	private Fire fire; // aggregate
	
	public Nozzle(int width, int height) {
		this.width = width;
		this.height = height;
		this.heightNozzle = height / 5;
		this.widthNozzle = width - width / 5;
		fire = new Fire(width, height, widthNozzle, heightNozzle);
	}
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(Color.darkGray);
		Drawing.pen().fillRect(left + width / 10, bottom + height, widthNozzle, heightNozzle);
		fire.drawAt(left, bottom);
	}
	
	public void setFireLevel( int fireLevel){
		fire.setFireLevel(fireLevel);
	}
}
