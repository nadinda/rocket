package drawingTool;

import java.awt.Color;

public class Fire {
	private int width;
	private int height;
	private int heightNozzle;
	private int widthNozzle;
	private int fireLevel;
	
	public Fire(int width, int height, int widthNozzle, int heightNozzle) {
		this.width = width;
		this.height = height;
		this.widthNozzle = widthNozzle;
		this.heightNozzle = heightNozzle;
	}
	
	public void drawAt(int left, int bottom) {
		if (fireLevel == 1) {
			createYellowFire(left, bottom);	
		} else if (fireLevel == 2) {
			createOrangeFire(left, bottom);
			createYellowFire(left, bottom);	
		} else if (fireLevel == 3) {
			createRedFire(left, bottom);
			createOrangeFire(left, bottom);
			createYellowFire(left, bottom);	
		}
	}
	
	private void createRedFire(int left, int bottom) {
		Drawing.pen().setColor(Color.red);
		Drawing.pen().fillPolygon(new int[] {left + width/10, left + width/10, left + width/10 + widthNozzle/4, left + width/10 + widthNozzle/2, left + width/10 + (3* widthNozzle)/4, left + width/10 + widthNozzle, left + width/10 + widthNozzle},
				new int[] {bottom + height + heightNozzle, bottom + height + (5*heightNozzle)/2, bottom + height + 2*heightNozzle, bottom + height + 4*heightNozzle, bottom + height + 2*heightNozzle, bottom + height + (5*heightNozzle)/2, bottom + height + heightNozzle}, 7);
	}
	
	private void createOrangeFire(int left, int bottom) {
		Drawing.pen().setColor(Color.orange);
		Drawing.pen().fillPolygon(new int[] {left + width/10 + widthNozzle/10, left + width/10 + widthNozzle/10, left + width/10 + widthNozzle/4, left + width/10 + widthNozzle/2, left + width/10 + (3* widthNozzle)/4, left + width/10 + (9*widthNozzle)/10, left + width/10 + (9*widthNozzle)/10},
				new int[] {bottom + height + heightNozzle, bottom + height + (5*heightNozzle)/2 - heightNozzle, bottom + height + 2*heightNozzle - heightNozzle, bottom + height + 4*heightNozzle - heightNozzle, bottom + height + 2*heightNozzle - heightNozzle, bottom + height + (5*heightNozzle)/2 - heightNozzle, bottom + height + heightNozzle}, 7);
	}
	
	private void createYellowFire(int left, int bottom) {
		Drawing.pen().setColor(Color.yellow);
		Drawing.pen().fillPolygon(new int[] {left + width/10 + widthNozzle/3, left + width/10 + widthNozzle/2, left + width/10 + (2*widthNozzle)/3}, 
				new int[] {bottom + height + heightNozzle, bottom + height + (5*heightNozzle)/2 - (8/10 *heightNozzle), bottom + height + heightNozzle}, 3);
	}
	
	public void setFireLevel(int fireLevel){
		this.fireLevel = fireLevel;
	}
}
