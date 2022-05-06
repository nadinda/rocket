package drawingTool;
import java.util.ArrayList;

import drawingTool.RandomNumber;

public class Scene {
	private ArrayList<LocatedRectangle> objects = new ArrayList<LocatedRectangle>();
	
	private ArrayList<Rocket> manyRockets = new ArrayList<Rocket>();
	private int numOfRockets = RandomNumber.between(1,4);
	
	private ArrayList<Planet> manyPlanets = new ArrayList<Planet>();
    private int numOfPlanets = 1;
	
	public Scene() {
		for (int rocket = 0; rocket < numOfRockets; rocket++) {
			int locationX = RandomNumber.between(10,1000);
			int locationY = RandomNumber.between(10,600);
			int width = RandomNumber.between(50,100);
			int height = RandomNumber.between(50,200);
			//Rocket aRocket = new Rocket(locationX, locationY, width, height);
			//addARocket(aRocket);
			//manyRockets.add(new Rocket(locationX, locationY, width, height));
			addANewRocket(locationX, locationY, width, height);
			//manyRockets.add(new Rocket(700, 100, 150, 200));
			//manyRockets.add(new Rocket(400, 200, 50, 200));
		}
		
		for (int planet = 0; planet < numOfPlanets; planet++) {
			manyPlanets.add(new Planet(500, 700, 200, 200));
		}
	}
	
	public void drawRockets() {
		for (Rocket rocket : manyRockets) {
			rocket.drawAt(rocket.address().x, rocket.address().y);
		}
	}

	public void addANewRocket(int locationX, int locationY, int width, int height) {
		Rocket rocket = new Rocket(locationX, locationY, width, height);
		if (availableSpace(rocket)) {
			manyRockets.add(rocket);
		}
	}

	public boolean availableSpace(Rocket other) {
		for (Rocket rocket : manyRockets) {
			int margin = rocket.width() + rocket.height() + 50;
			if (rocket.intersects(other, margin)) return false;
		}
		return true;
	}

	
	public void draw() {
		//Rocket rocket = new Rocket(700, 100, 50, 100);
		//rocket.draw();
		
		//Rocket rocket2 = new Rocket(200, 400, 150, 200);
		//rocket2.draw();
		drawRockets();
		/*boolean isIntersect = false;
		for (Rocket eachRocket : manyRockets) {
			isIntersect = isIntersect || eachRocket.intersects(manyRockets);
			int	xOffset = 100;
			int	yOffset = 200;
			// TODO: draw with additional spaces between each rocket if it intersects
			if (isIntersect) {
				eachRocket.drawAt(eachRocket.address().x + xOffset, eachRocket.address().y + yOffset);
				int rocketWidth = eachRocket.width();
				int rocketHeight = eachRocket.height();
				xOffset += rocketWidth;
				yOffset += rocketHeight;
			}
		}*/
		
		for (Planet eachPlanet : manyPlanets) {
			eachPlanet.draw();
		}

	}
}
