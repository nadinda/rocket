/*
@startuml
skinparam classAttributeIconSize 0

Class Scene

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

Class Planet{
	-int locationX
	-int locationY
	-int width
	-int height
	+Shape(int locationX, int locationY, int width, int height)
	+Pattern
	+draw():void
}

Scene o-- Rocket : >
Scene o-- Planet : >

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