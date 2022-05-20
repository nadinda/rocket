package drawingTool;

import java.awt.Color;
import java.awt.Point;
import java.awt.RadialGradientPaint;
import java.awt.Shape;
import java.awt.geom.Path2D;

public class Star implements LocatedRectangle {
	private Point point;
	private int width;
	private int height;
	
	public Star(int locationX, int locationY, int width, int height) {
		this.point = new Point(locationX, locationY);
		this.width = width;
		this.height = height;
	}
	
	// reference: https://stackoverflow.com/a/39808564
	private static Shape createStar(double centerX, double centerY, double innerRadius, double outerRadius, int numRays, double startAngleRad) {
        Path2D path = new Path2D.Double();
        double deltaAngleRad = Math.PI / numRays;
        for (int i = 0; i < numRays * 2; i++) {
	        double angleRad = startAngleRad + i * deltaAngleRad;
	        double ca = Math.cos(angleRad);
	        double sa = Math.sin(angleRad);
	        double relX = ca;
	        double relY = sa;
	        if ((i & 1) == 0) {
	            relX *= outerRadius;
	            relY *= outerRadius;
	        }
	        else {
	            relX *= innerRadius;
	            relY *= innerRadius;
	        }
	        if (i == 0) {
	            path.moveTo(centerX + relX, centerY + relY);
	        }
	        else {
	        	path.lineTo(centerX + relX, centerY + relY);
	        }
        }
        path.closePath();
        return path;
    }

	public Point address() {
		return this.point;
	}
	
	public int width() {
		return this.width;
	}

	public int height() {
		return this.height;
	}

	@Override
	public void draw() {
		Drawing.pen().setPaint(new RadialGradientPaint(
	            new Point(this.point.x, this.point.y), width, new float[] { 0, 0.3f, 1 }, 
	            new Color[] { Color.RED, Color.YELLOW, Color.ORANGE }));
		Drawing.pen().fill(createStar(this.point.x, this.point.y, width/3, width, 20, 0));
	}
}
