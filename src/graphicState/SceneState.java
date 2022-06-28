package graphicState;

import drawingTool.Scene;

public class SceneState extends State {
	private static SceneState instance;
	
	private SceneState(Scene context) {
		this.context = context;
		scene = this;
	}
	
	public static SceneState getInstance(Scene context) {
		if(instance == null) {
			instance = new SceneState(context);
		}
		return instance;
	}

	@Override
	public State setRocket() {
		return RocketState.getInstance(context);
	}

	@Override
	public State setFireLevel() {
		return FireState.getInstance(context);
	}

	@Override
	public State setBgColor() {
		return BackgroundState.getInstance(context);
	}

	@Override
	public State setScene() {
		context.showScene();
		return this;
	}
}
