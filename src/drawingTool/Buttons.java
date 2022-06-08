package drawingTool;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JSlider;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons {
	private JButton planetsColorButton = new JButton("Change Planets Color");
	private JButton rocketsHeadColorButton = new JButton("Change Rocket Head Color");
	private JButton rocketsHeadShapeButton = new JButton("Change Rocket Head Shape");
	private JButton rocketsFireLevelButton = new JButton("Change Rocket Fire Level");

	public void addActionListener(ActionListener listener) {
		planetsColorButton.addActionListener(listener);
		rocketsHeadColorButton.addActionListener(listener);
		rocketsHeadShapeButton.addActionListener(listener);
	    rocketsFireLevelButton.addActionListener(listener);
	}

	public void addButtonsToAPanel(JFrame frame) {
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(18, 1, 15, 20));

		menu.add(planetsColorButton);
		menu.add(rocketsHeadColorButton);
		menu.add(rocketsHeadShapeButton);
		menu.add(rocketsFireLevelButton);

		menu.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.add(menu, BorderLayout.WEST);
	}

	public JButton getPlanetsColorButton() {
		return planetsColorButton;
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
}
