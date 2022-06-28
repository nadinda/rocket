package drawingTool;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;

import drawingTool.RandomNumber;
import drawingTool.TestDrawingTool;
import graphicState.SceneState;
import graphicState.State;

public class Scene  {
	private ArrayList<LocatedRectangle> objects = new ArrayList<LocatedRectangle>();
	
	private static State graphicState;
	private Color bgColor;
	
	public Scene() {
		graphicState = SceneState.getInstance(this);
		bgColor = Color.black;
		
		addRockets();
		addPlanets();
		addStars();
	}
	
	public void setFireLevel() {
		graphicState = graphicState.setFireLevel();
	}
	
	public void setBgColor() {
		graphicState = graphicState.setBgColor();
	}
	
	public void setRocket() {
		graphicState = graphicState.setRocket();
	}
	
	public void setScene() {
		graphicState = graphicState.setScene();
	}
	
	public void showOnlyRockets() {
		objects.clear();
		addRockets();
	}
	
	public void showScene() {
		objects.clear();
		addRockets();
		addPlanets();
		addStars();
	}
	
	public void changeBgColor() {
		this.bgColor = new Color(RandomNumber.between(3, 40), 3, RandomNumber.between(0, 40));
	}
	
	public void changePlanetColor() {
		for (LocatedRectangle anObj : objects) {
			if (anObj.getClass() == Planet.class) {
				Color newColor = new Color(232, RandomNumber.between(72, 232), 19);
				((Planet) anObj).setPlanetColor(newColor);
			}
		}
	}
	
	public void changeRocketHeadColor() {
		for (LocatedRectangle anObj : objects) {
			if (anObj.getClass() == Rocket.class) {
				Color newColor = new Color(RandomNumber.between(0, 255), RandomNumber.between(154, 255), RandomNumber.between(180, 255));
				((Rocket) anObj).setHeadColor(newColor);
			}
		}
	}
	
	public void changeRocketHeadShape() {
		for (LocatedRectangle anObj : objects) {
			if (anObj.getClass() == Rocket.class) {
				int currentHeadShape = ((Rocket) anObj).getHeadShape();
				((Rocket) anObj).setHeadShape(currentHeadShape);
			}
		}
	}
	
	public void changeRocketFireLevel() {
		for (LocatedRectangle anObj : objects) {
			if (anObj.getClass() == Rocket.class) {
				((Rocket) anObj).setFireLevel(RandomNumber.between(1,3));
			}
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
		Drawing.pen().setColor(this.bgColor);
		Drawing.pen().fillRect(0, 0, dimension.width, dimension.height);
	}
	
	public void draw(Dimension dimension) {
		drawBackground(dimension);
		for (LocatedRectangle eachObj : objects) {
			eachObj.draw();
		}
	}

	
}
