import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Demo4Solution {
	private JFrame frame;
	private JPanel buttonPanel;
	private JPanel labelPanel;
	private JButton myButton;
	private JButton yourButton;
	private JLabel label;
	
	public Demo4Solution() {
		frame = new JFrame("Demo4");
		frame.setLayout(new GridLayout(2, 1));
		labelPanel = new JPanel();
		buttonPanel = new JPanel();
		
		label = new JLabel("JLabel");
		labelPanel.add(label);
		
		myButton = new JButton("My Button");
		buttonPanel.add(myButton);
		
		myButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("My Click");
			}
		});
		
		yourButton = new JButton("Your Button");
		buttonPanel.add(yourButton);
		
		yourButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("Your Click");
			}
		});
		
		frame.add(buttonPanel);
		frame.add(labelPanel);
		frame.setSize(400, 300);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowListener() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				frame.dispose();
				System.exit(0);
			}
			@Override
			public void windowActivated(WindowEvent arg0) {}
			@Override
			public void windowClosed(WindowEvent arg0) {}
			@Override
			public void windowDeactivated(WindowEvent e) {}
			@Override
			public void windowDeiconified(WindowEvent e) {}
			@Override
			public void windowIconified(WindowEvent e) {}
			@Override
			public void windowOpened(WindowEvent e) {}
		});
	}
	
	public static void main(String[] args) {
		new Demo4Solution();
	}
}
