package graphicState;

import drawingTool.Scene;

public abstract class State {
	protected static Scene context;
	
	protected static SceneState scene;
	protected static RocketState onlyRocket;
	protected static FireState fireLevel;
	protected static BackgroundState bgColor;
	
	public abstract State setRocket();
	public abstract State setFireLevel();
	public abstract State setBgColor();
	public abstract State setScene();
}
