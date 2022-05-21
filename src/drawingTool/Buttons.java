package drawingTool;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Buttons {
	private JButton planetsButton = new JButton("Change Planets Color");
	private JButton rocketsButton = new JButton("Change Rockets Color");

	public void addActionListener(ActionListener listener) {
		planetsButton.addActionListener(listener);
		rocketsButton.addActionListener(listener);
	}

	public void addButtonsToAPanel(JFrame frame) {
		JPanel menu = new JPanel();
		menu.setLayout(new GridLayout(18, 1, 15, 20));

		menu.add(planetsButton);
		menu.add(rocketsButton);

		menu.setBorder(BorderFactory.createRaisedBevelBorder());
		frame.add(menu, BorderLayout.WEST);
	}

	public JButton getPlanetsButton() {
		return planetsButton;
	}
	
	public JButton getRocketsButton() {
		return rocketsButton;
	}
}
