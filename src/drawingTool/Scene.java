package drawingTool;
import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;

import drawingTool.RandomNumber;
import drawingTool.TestDrawingTool;

public class Scene  {
	private ArrayList<LocatedRectangle> objects = new ArrayList<LocatedRectangle>();
	
	/*private ArrayList<Rocket> manyRockets = new ArrayList<Rocket>();
	private int numOfRockets = RandomNumber.between(1,4);
	
	private ArrayList<Planet> manyPlanets = new ArrayList<Planet>();
    private int numOfPlanets = 1;
    
    private ArrayList<Star> manyStars = new ArrayList<Star>();
    private int numOfStars = 1;*/
	
	public Scene() {
		System.out.println("Scene");
		addRockets();
		addPlanets();
		addStars();
		/*for (int rocket = 0; rocket < numOfRockets; rocket++) {
			int locationX = RandomNumber.between(10,1000);
			int locationY = RandomNumber.between(10,600);
			int width = RandomNumber.between(50,100);
			int height = RandomNumber.between(50,200);
			//Rocket aRocket = new Rocket(locationX, locationY, width, height);
			//addARocket(aRocket);
			objects.add(new Rocket(locationX, locationY, width, height));
			//addANewRocket(locationX, locationY, width, height);
			//manyRockets.add(new Rocket(700, 100, 150, 200));
			//manyRockets.add(new Rocket(400, 200, 50, 200));
		}
		
		for (int planet = 0; planet < numOfPlanets; planet++) {
			manyPlanets.add(new Planet(500, 700, 200, 200, false));
		}
		
		for (int star = 0; star < numOfStars; star++) {
			manyStars.add(new Star(200, 400, 100));
		}*/
	}
	
	/*public void drawRockets() {
		for (Rocket rocket : manyRockets) {
			rocket.drawAt(rocket.address().x, rocket.address().y);
		}
	}

	public void addANewRocket(int locationX, int locationY, int width, int height) {
		Rocket rocket = new Rocket(locationX, locationY, width, height);
		if (availableSpace(rocket)) {
			manyRockets.add(rocket);
		}
	}*/
	
	public void addRockets() {
		int numOfRockets = 5;
		for (int rocket = 0; rocket < numOfRockets; rocket++) {
			int locationX = RandomNumber.between(10,1000);
			int locationY = RandomNumber.between(20,800);
			int width = RandomNumber.between(50,100);
			int height = RandomNumber.between(50,200);
			Rocket nextRocket = new Rocket(locationX, locationY, width, height);
			addAnObject(nextRocket);
		}
	}
	
	public void addPlanets() {
		int numOfPlanets = 5;
		for (int planet = 0; planet < numOfPlanets; planet++) {
			int locationX = RandomNumber.between(10,1000);
			int locationY = RandomNumber.between(20,800);
			int width = RandomNumber.between(150,200);
			int height = width;
			int hasRing = RandomNumber.between(0,1);
			Planet nextPlanet = new Planet(locationX, locationY, width, height, hasRing);
			addAnObject(nextPlanet);
		}
	}
	
	public void addStars() {
		int numOfStars = 5;
		for (int star = 0; star < numOfStars; star++) {
			int locationX = RandomNumber.between(10,1000);
			int locationY = RandomNumber.between(20,800);
			int width = RandomNumber.between(50,100);
			int height = width;
			Star nextStar = new Star(locationX, locationY, width, height);
			addAnObject(nextStar);
		}
	}
	
	private void addAnObject(LocatedRectangle newObj) {
		if (anySpaceLeft(newObj)) {
			objects.add(newObj);
		}
	}

	/*public boolean availableSpace(Rocket other) {
		for (Rocket rocket : manyRockets) {
			int margin = rocket.width() + rocket.height() + 50;
			if (rocket.intersects(other, margin)) return false;
		}
		return true;
	}*/
	
	private boolean anySpaceLeft(LocatedRectangle other) {
		for (LocatedRectangle anObj : objects) {
			int margin = anObj.width() + anObj.height() + 50;
			if (anObj.intersects(other, margin)) return false;
		}
		return true;
	}
	
	public void drawBackground() {
		Drawing.pen().setColor(Color.black);
		Drawing.pen().fillRect(0, 0, 1500, 1000);
	}
	
	public void draw() {
		drawBackground();
		for (LocatedRectangle eachObj : objects) {
			eachObj.draw();
		}
		/*drawRockets();
		for (Planet eachPlanet : manyPlanets) {
			eachPlanet.draw();
		}
		
		for (Star eachStar : manyStars) {
			eachStar.draw();
		}*/
		/*SpaceObject eachSpaceObj = new SpaceObject();
		eachSpaceObj.draw();*/
	}
}
