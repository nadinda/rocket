package graphicState;

import drawingTool.Scene;

public class FireState extends State {
	//private static final FireState instance = new FireState(context);
	private static FireState instance;
	
	private FireState(Scene context) {
		this.context = context;
		fireLevel = this;
	}
	
	/*public static FireState getInstance() {
		return instance;
	}*/
	
	public static FireState getInstance(Scene context) {
		if(instance == null) {
			instance = new FireState(context);
		}
		return instance;
	}

	@Override
	public State setFireLevel() {
		context.changeRocketFireLevel();
		return this;
	}

	@Override
	public State setBgColor() {
		return BackgroundState.getInstance(context);
	}

	@Override
	public State setRocket() {
		return RocketState.getInstance(context);
	}
	
	@Override
	public State setScene() {
		return SceneState.getInstance(context);
	}

}
