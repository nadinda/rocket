/*
@startuml
skinparam classAttributeIconSize 0
skinparam groupInheritance 1

Class Scene {
  	-ArrayList<LocatedRectangle> objects
  	+Scene()
  	+addRockets(): void
  	+addPlanets(): void
  	+addStars(): void
  	-addAnObject(LocatedRectangle newObj): void
  	-anySpaceLeft(LocatedRectangle other): boolean
  	+drawBackground(Dimension dimension): void
  	+draw(Dimension dimension): void 
}


class RoundObject {
	-int width
	-int height
	+RoundObject(int width, int height)
	+drawAt(int left, int bottom, Color color): void
        +getWidth(): int
	+getHeight(): int
}

Interface LocatedRectangle {
	+Point address()
	+int width()
	+int height()
	+draw(): void
	+intersects(LocatedRectangle other): boolean 
	+intersects(LocatedRectangle other, int margin): boolean
	-doesNotIntersect(LocatedRectangle other, int margin): boolean
	+leftOf(LocatedRectangle other, int margin): boolean 
	+rightOf(LocatedRectangle other, int margin): boolean
	-above(LocatedRectangle other, int margin): boolean
	-below(LocatedRectangle other, int margin): boolean
}    

Class Rocket implements LocatedRectangle {
	-Body body
	-Head head 
	-Point point
	-int width
	-int height
	+Rocket(int locationX, int locationY, int width, int height)
	+draw(): void
	+address():Point 
	+width():int
	+height():int
}
Class Head{
	-int width
	-int height
	+Head(int width, int height)
	+drawAt(Point point): void
}
Class Body{
	-int width
	-int height
	-Window window
	-LeftFin leftFin
	-RightFin rightFin
	-Nozzle nozzle
	+Body(int width, int height)
	+drawAt(Point point): void
}
Class Nozzle{
	-int width
	-int height
	-int heightNozzle
	-int widthNozzle
	-Fire fire
	+Nozzle(int width, int height)
	+drawAt(int left, int bottom): void
}
Class LeftFin{
	-int width
	-int height
	+LeftFin(int width, int height)
	+drawAt(int left, int bottom): void
}
Class RightFin{
	-int width
	-int height
	+RightFin(int width, int height)
	+drawAt(int left, int bottom): void
}
Class Fire{
	-int width
	-int height
	-int heightNozzle
	-int widthNozzle
	+Fire(int widthNozzle, int heightNozzle)
	+drawAt(int left, int bottom): void
}
Class Window extends RoundObject{
	+Window(int width, int height)
	+drawAt(int left, int bottom): void
}

Class Planet implements LocatedRectangle {
  	-Point point
	-int width
	-int height
	-int hasRing
	-PlanetPattern planetPattern
	-PlanetRing planetRing
	+Planet(int locationX, int locationY, int width, int height, int hasRing)
    +address(): Point 
	+width(): int
	+height(): int
	+draw(): void
        -drawOval(c: Color, x: int, y: int, width: int, height: int): void
}
Class PlanetPattern extends RoundObject{
	+PlanetPattern (int width, int height)
	+drawAt(locationX: int, locationY: int): void
        -drawOval(c: Color, x: int, y: int, width: int, height: int): void
}

Class PlanetRing{
	-int locationX
	-int locationY
	-int width
	-int height
	+PlanetRing(int locationX, int locationY, int width, int height)
	+draw(): void
}

Class Star implements LocatedRectangle{
	-Point point
	-int width
	-int height
	+Star(int locationX, int locationY, int width, int height)
	-createStar(centerX: double, centerY: double, innerRadius: double, outerRadius: double, 
				numRays: int, startAngleRad: double): Shape
	+address():Point 
	+width():int
	+height():int
	+draw(): void
}

Scene o-- Rocket : has >
Scene o-- Planet : has >
Scene o-- Star : has >
Planet *-- PlanetPattern : part of < 
Planet o-- PlanetRing : has >
Rocket *-- Head : part of < 
Rocket *-- Body : part of <  
Body *-- Nozzle : part of < 
Body o-- Window : has >
Body *-- LeftFin : part of <
Body *-- RightFin : part of <
Nozzle o-- Fire : has >
@enduml
*/

package drawingTool;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

import drawingTool.Scene;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;
	private Dimension dimension;
	private Scene scene;
	
	public DrawingArea(Dimension dimension) {
		super();
		this.dimension = dimension;
	}
	
	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		Drawing.set(pen);
		
		scene = new Scene();
		scene.draw(this.dimension);
	}
	
	public Scene getScene() {
		return scene;
	}
}
