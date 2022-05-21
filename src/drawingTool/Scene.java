package drawingTool;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;

import drawingTool.RandomNumber;
import drawingTool.TestDrawingTool;

public class Scene  {
	private ArrayList<LocatedRectangle> objects = new ArrayList<LocatedRectangle>();
	private ArrayList<Planet> planets = new ArrayList<Planet>();
	
	public Scene() {
		addRockets();
		addPlanets();
		addStars();
	}
	
	public void changePlanetColor() {
		for (Planet planet : planets) {
			System.out.println("changePlanetColor");
			planet.setPlanetColor(Color.BLUE);
		}
	}
	
	public void addRockets() {
		int numOfRockets = 5;
		for (int rocket = 0; rocket < numOfRockets; rocket++) {
			int width = RandomNumber.between(30,100);
			int height = RandomNumber.between(30,100);
			int locationX = RandomNumber.between(width,1200);
			int locationY = RandomNumber.between(height,720);
			Rocket nextRocket = new Rocket(locationX, locationY, width, height);
			addAnObject(nextRocket);
		}
	}
	
	public void addPlanets() {
		int numOfPlanets = 5;
		for (int planet = 0; planet < numOfPlanets; planet++) {
			int width = RandomNumber.between(50,70);
			int height = width;
			int locationX = RandomNumber.between(width,1200);
			int locationY = RandomNumber.between(height,720);
			int hasRing = RandomNumber.between(0,1);
			Planet nextPlanet = new Planet(locationX, locationY, width, height, hasRing);
			planets.add(nextPlanet);
			addAnObject(nextPlanet);
		}
	}
	
	public void addStars() {
		int numOfStars = 10;
		for (int star = 0; star < numOfStars; star++) {
			int width = RandomNumber.between(20,30);
			int height = width;
			int locationX = RandomNumber.between(width,1200);
			int locationY = RandomNumber.between(height,720);
			Star nextStar = new Star(locationX, locationY, width, height);
			addAnObject(nextStar);
		}
	}
	
	private void addAnObject(LocatedRectangle newObj) {
		if (anySpaceLeft(newObj)) {
			objects.add(newObj);
		}
	}
	
	private boolean anySpaceLeft(LocatedRectangle other) {
		for (LocatedRectangle anObj : objects) {
			int margin = anObj.width() + anObj.height() + 60;
			if (anObj.intersects(other, margin)) 
				return false;
		}
		return true;
	}
	
	public void drawBackground(Dimension dimension) {
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillRect(0, 0, dimension.width, dimension.height);
	}
	
	public void draw(Dimension dimension) {
		drawBackground(dimension);
		for (LocatedRectangle eachObj : objects) {
			eachObj.draw();
		}
		/*for (Planet eachPlanet : planets) {
			eachPlanet.draw();
		}*/
	}
}
