package drawingTool;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buttons {
	private JButton bgColorButton = new JButton("Change Background Color");
	private JButton planetsColorButton = new JButton("Change Planets Color");
	private JButton rocketsHeadColorButton = new JButton("Change Rocket Head Color");
	private JButton rocketsHeadShapeButton = new JButton("Change Rocket Head Shape");
	private JButton rocketsFireLevelButton = new JButton("Change Rocket Fire Level");
	private JButton onlyRocketsButton = new JButton("Show Only Rockets");
	private JButton showSceneButton = new JButton("Show Scene");
	private JLabel planetSizeLabel = new JLabel("Change Planet Size");
	private JSlider planetSizeSlider = new JSlider(-1, 1, 0);
	
	public void addActionListener(ActionListener listener) {
		bgColorButton.addActionListener(listener);
		planetsColorButton.addActionListener(listener);
		rocketsHeadColorButton.addActionListener(listener);
		rocketsHeadShapeButton.addActionListener(listener);
	    rocketsFireLevelButton.addActionListener(listener);
	    onlyRocketsButton.addActionListener(listener);
	    showSceneButton.addActionListener(listener);
	    planetSizeSlider.addChangeListener((ChangeListener) listener);
	}

	public void addButtonsToAPanel(JFrame frame) {
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(12, 1, 15, 30));
		menu.setBackground(new Color(90, 150, 110));

		menu.add(bgColorButton);
		menu.add(planetsColorButton);
		menu.add(onlyRocketsButton);
		menu.add(showSceneButton);
		menu.add(rocketsHeadColorButton);
		menu.add(rocketsHeadShapeButton);
		menu.add(rocketsFireLevelButton);
		menu.add(planetSizeLabel);
		menu.add(planetSizeSlider);

		menu.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.add(menu, BorderLayout.WEST);
	}
	
	public JButton getBgColorButton() {
		return bgColorButton;
	}

	public JButton getPlanetsColorButton() {
		return planetsColorButton;
	}
	
	public JButton getShowSceneButton() {
		return showSceneButton;
	}
	
	public JButton getOnlyRocketsButton() {
		return onlyRocketsButton;
	}

	public JButton getRocketsHeadColorButton() {
		return rocketsHeadColorButton;
	}
	
	public JButton getRocketsHeadShapeButton() {
		return rocketsHeadShapeButton;
	}
	
	public JButton getRocketsFireLevelButton() {
		return rocketsFireLevelButton;
	}
	
	public JSlider getPlanetSizeSlider() {
		return planetSizeSlider;
	} 
}
