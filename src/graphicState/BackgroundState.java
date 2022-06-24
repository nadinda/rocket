package graphicState;

import drawingTool.Scene;

public class BackgroundState extends State {
	private static BackgroundState instance;
	
	private BackgroundState(Scene context) {
		this.context = context;
		bgColor = this;
	}
	
	public static BackgroundState getInstance(Scene context) {
		if(instance == null) {
			instance = new BackgroundState(context);
		}
		return instance;
	}

	@Override
	public State setBgColor() {
		context.changeBgColor();
		return BackgroundState.getInstance(context);
	}

	@Override
	public State setFireLevel() {
	
		return FireState.getInstance(context);
	}
}
