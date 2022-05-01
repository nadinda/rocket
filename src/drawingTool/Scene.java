package drawingTool;
import java.util.ArrayList;

import drawingTool.RandomNumber;

public class Scene {
	private ArrayList<Rocket> manyRockets = new ArrayList<Rocket>();
	private int numOfRockets = RandomNumber.between(1, 4);
	
	private ArrayList<Planet> manyPlanets = new ArrayList<Planet>();
    private int numOfPlanets = 1;
	
	public Scene() {
		for (int rocket = 0; rocket < numOfRockets; rocket++) {
			int locationX = RandomNumber.between(100,1000);
			int locationY = RandomNumber.between(100,600);
			int width = RandomNumber.between(50,200);
			int height = RandomNumber.between(100,400);
			manyRockets.add(new Rocket(locationX, locationY, width, height));
			//manyRockets.add(new Rocket(700, 100, 150, 200));
			//manyRockets.add(new Rocket(400, 200, 50, 200));
		}
		
		for (int planet = 0; planet < numOfPlanets; planet++) {
			manyPlanets.add(new Planet(500, 700, 200, 200));
		}
	}

	
	public void draw() {
		//Rocket rocket = new Rocket(700, 100, 50, 100);
		//rocket.draw();
		
		//Rocket rocket2 = new Rocket(200, 400, 150, 200);
		//rocket2.draw();
		
		for (Rocket eachRocket : manyRockets) {
			boolean isIntersect = eachRocket.intersects(eachRocket,9);
			
			// TODO: draw with additional spaces between each rocket if it intersects
			if (isIntersect) {
				eachRocket.draw();
			}
		}
		
		for (Planet eachPlanet : manyPlanets) {
			eachPlanet.draw();
		}

	}
}
