/*
@startuml
skinparam classAttributeIconSize 0
skinparam groupInheritance 1

Class Scene {
	-Rocket rocket
  	-AstronomicalObject
  	+OuterSpace(int locationX, int locationY, int width, int height)
  	+draw()
}

class RoundObject {
	#width: int
	#height: int
	+RoundObject(width: int, height: int)
	+drawAt(left: int, bottom: int, color: Color): void
}

Interface LocatedRectangle {
	+address(): Point
	+width(): int
	+height(): int 
	+draw(): void
	+intersects(other: LocatedRectangle): boolean 
	+intersects(other: LocatedRectangle, margin: int): boolean
	-doesNotIntersect(other: LocatedRectangle, margin: int): boolean
	+leftOf(other: LocatedRectangle, margin: int): boolean 
	+rightOf(other: LocatedRectangle, margin: int): boolean
	-above(other: LocatedRectangle, margin: int): boolean
	-below(other: LocatedRectangle, margin: int): boolean
}    

Class Rocket implements LocatedRectangle {
	-Body body
	-Head head 
	+Rocket(int locationX, int locationY, int width, int height)
	+drawAt(int left, int bottom): void
	+Point address()
	+int width()
	+int height()
}
Class Head{
	-int width
	-int height
	+Head(int width, int height)
	+drawAt(int left, int bottom): void
}
Class Body{
	-int width
	-int height
	+Body(int width, int height)
	+drawAt(int left, int bottom): void
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
	-int width
	-int height
	+Window(int width, int height)
	+drawAt(int left, int bottom): void
}

Class AstronomicalObject implements LocatedRectangle {
  -Planet planet
  -Star star
}

Class Planet extends RoundObject {
  -PlanetBody planetBody
  -PlanetPattern planetPattern
	+Planet(int locationX, int locationY, int width, int height)
	+drawAt(int left, int bottom): void
}

Class PlanetPattern{
	-int locationX
	-int locationY
	-int width
	-int height
	+PlanetPattern(int locationX, int locationY, int width, int height)
	+draw():void
}

Class PlanetRing{
	-int locationX
	-int locationY
	-int width
	-int height
	+PlanetRing(int locationX, int locationY, int width, int height)
	+draw():void
}

Class Moon extends RoundObject {
  	-MoonBody planetBody
  	-MoonPattern planetPattern
	+Moon(int locationX, int locationY, int width, int height)
	+draw():void
}

Class MoonPattern{
	-int locationX
	-int locationY
	-int width
	-int height
	+PlanetPattern(int locationX, int locationY, int width, int height)
	+draw():void
}

Class Star{
  -StarBody body
  -StarPattern pattern
	+Star(int locationX, int locationY, int width, int height)
	+draw():void
}

Scene o-- Rocket : has >
Scene o-- AstronomicalObject : has >
AstronomicalObject *-- Planet : part of <
Planet *-- PlanetPattern : part of < 
Planet *-- PlanetRing : part of < 
Moon *-- MoonPattern : part of < 
AstronomicalObject *-- Star : part of <

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

import java.awt.Graphics;
import javax.swing.JPanel;

import drawingTool.Scene;

public class DrawingArea extends JPanel {
	private static final long serialVersionUID = 1L;

	protected void paintComponent(Graphics pen) {
		super.paintComponent(pen);
		Drawing.set(pen);
		
		Scene scene = new Scene();
		scene.draw();
	}
}
