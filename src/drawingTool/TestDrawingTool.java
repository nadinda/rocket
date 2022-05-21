/*
 * Provides a test application window with a panel.
 */

package drawingTool;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class TestDrawingTool extends JFrame implements ActionListener {
	private DrawingArea drawing;
	private Buttons buttons = new Buttons();

	public TestDrawingTool(String title) {
		super(title);

		setLayout(new BorderLayout());

		constructButtonMenu();
		constructDrawingArea();

		Dimension screenSize = getToolkit().getScreenSize();
		setBounds(0, 0, screenSize.width, screenSize.height);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void constructButtonMenu() {
		buttons.addButtonsToAPanel(this);
		buttons.addActionListener(this);
	}
	
	public Dimension getDimension() {
		return getToolkit().getScreenSize();
	}

	private void constructDrawingArea() {
		drawing = new DrawingArea(getDimension());
		add(drawing, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttons.getPlanetsButton()) {
			tidyUpDrawingArea();
			drawing.getScene().changePlanetColor();
		} else if (e.getSource() == buttons.getRocketsButton()) {
			tidyUpDrawingArea();
			drawing.getScene();
		}
	}

	private void tidyUpDrawingArea() {
		drawing.removeAll();
		drawing.revalidate();
		drawing.repaint();
	}

	public static void main(String[] args) {
		new TestDrawingTool("Draw cool Rockets");
	}
}