package graphicState;

import drawingTool.Scene;

public abstract class State {
	protected static Scene context;
	
	protected static FireState fireLevel;
	protected static BackgroundState bgColor;
	
	public abstract State setFireLevel();
	public abstract State setBgColor();
}
