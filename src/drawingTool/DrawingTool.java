package drawingTool;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class DrawingTool extends JFrame implements ActionListener {
	private DrawingArea drawing;
	private Buttons buttons = new Buttons();
	
	private JButton b1, b2, b3;
	
	public DrawingTool(String title) {
		super(title);
		setLayout(new BorderLayout());
		setLayout(new GridLayout(2, 8, 10, 8));
		
		b1 = new JButton("");
		b1.addActionListener(this);
		add(b1);
		
		b2 = new JButton("");
		b2.addActionListener(this);
		add(b2);
		
		b3 = new JButton("");
		b3.addActionListener(this);
		add(b3);
	}
	
	private void constructDrawingArea() {
		drawing = new DrawingArea();
		add(drawing, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//
	}
}
