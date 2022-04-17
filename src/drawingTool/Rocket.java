package drawingTool;

public class Rocket {
	private Body body;
	private Head head;

	public Rocket(int locationX, int locationY, int width, int height, int headHeight) {
		body = new Body(locationX, locationY, width, height);
		head = new Head(locationX, locationY, width, headHeight);
	}

	public void draw() {
		body.draw();
		head.draw();
	}
}
