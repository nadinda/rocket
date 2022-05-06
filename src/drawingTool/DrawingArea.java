/*
@startuml
skinparam classAttributeIconSize 0

Class OuterSpace{
  -Rocket rocket
  -AstronomicalObject
  +OuterSpace(int locationX, int locationY, int width, int height)
  +draw()
}

Class Rocket{
	-Body body
	-Head head 
	+Rocket(int locationX, int locationY, int width, int height)
	+draw(): void
}
Class Head{
  -int locationX
	-int locationY
	-int width
	-int height
	+Head(int locationX, int locationY, int width, int height)
	+draw():void
}
Class Body{
	-int locationX
	-int locationY
	-int width
	-int height
	+Body(int locationX,  int locationY, int width, int height)
	+draw(): void
}
Class Nozzle{
	-int locationX
	-int locationY
	-int width
	-int height
	-int heightNozzle
	-int widthNozzle
	-Fire fire
	+Nozzle(int locationX, int locationY, int width, int height)
	+draw(): void
}
Class LeftFin{
	-int locationX
	-int locationY
	-int width
	-int height
	+LeftFin(int locationX, int locationY, int width, int height)
	+draw(): void
}
Class RightFin{
	-int locationX
	-int locationY
	-int width
	-int height
	+RightFin(int locationX, int locationY, int width, int height)
	+draw(): void
}
Class Fire{
	-int locationX
	-int locationY
	-int width
	-int height
	-int heightNozzle
	-int widthNozzle
	+Fire(int locationX, int locationY, int width, int height, int widthNozzle, int heightNozzle)
	+draw(): void
}
Class Window{
	-int locationX
	-int locationY
	-int width
	-int height
	+Window(int locationX, int locationY, int width, int height)
	+draw(): void
}



Class AstronomicalObject {
  -Planet planet
  -Star star
  -Asteroid asteroid
}

Class Planet{
  -PlanetBody planetBody
  -PlanetPattern planetPattern
	+Planet(int locationX, int locationY, int width, int height)
	+draw():void
}

Class PlanetBody{
	-int locationX
	-int locationY
	-int width
	-int height
	+PlanetBody(int locationX, int locationY, int width, int height)
	+PlanetPattern(int locationX, int locationY, int width, int height)
	+draw():void
}

Class PlanetPattern{
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

Class StarBody{
	-int locationX
	-int locationY
	-int width
	-int height
	+StarBody(int locationX, int locationY, int width, int height)
	+StarPattern(int locationX, int locationY, int width, int height)
	+draw():void
}

Class StarPattern{
	-int locationX
	-int locationY
	-int width
	-int height
	+StarPattern(int locationX, int locationY, int width, int height)
	+draw():void
}

Class Asteroid{
  -AsteroidBody starBody
  -AsteroidPattern pattern
	+Asteroid(int locationX, int locationY, int width, int height)
	+draw():void
}

Class AsteroidBody{
	-int locationX
	-int locationY
	-int width
	-int height
	+AsteroidBody(int locationX, int locationY, int width, int height)
	+AsteroidPattern(int locationX, int locationY, int width, int height)
	+draw():void
}

Class AsteroidPattern{
	-int locationX
	-int locationY
	-int width
	-int height
	+AsteroidPattern(int locationX, int locationY, int width, int height)
	+draw():void
}

OuterSpace *-- Rocket : >
OuterSpace o-- AstronomicalObject : >
AstronomicalObject o-- Planet : >
Planet o-- PlanetBody : >
PlanetBody o-- PlanetPattern : >
AstronomicalObject o-- Star : >
Star o-- StarBody : >
StarBody o-- StarPattern : >
AstronomicalObject o-- Asteroid : >
Asteroid o-- AsteroidBody : >
AsteroidBody o-- AsteroidPattern : >

Rocket o-- Head : has > 
Rocket o-- Body : has > 
Body o-- Nozzle : has >
Body o-- Window : has >
Body o-- LeftFin : has >
Body o-- RightFin : has >
Nozzle *-- Fire : has >

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
