package graphicState;

import drawingTool.Scene;

public class RocketState extends State {
	private static RocketState instance;
	
	private RocketState(Scene context) {
		this.context = context;
		onlyRocket = this;
	}
	
	public static RocketState getInstance(Scene context) {
		if(instance == null) {
			instance = new RocketState(context);
		}
		return instance;
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
	public State setRocket() {
		context.showOnlyRockets();
		return this;
	}

	@Override
	public State setScene() {
		return SceneState.getInstance(context);
	}

}
