import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Demo3Solution {
	private JFrame frame;
	private JButton myButton;
	private JButton yourButton;
	
	public Demo3Solution() {
		frame = new JFrame("Demo3");
		frame.setLayout(new FlowLayout());
		
		myButton = new JButton("My Button");
		frame.add(myButton);
		
		yourButton = new JButton("Your Button");
		frame.add(yourButton);
		
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
		new Demo3Solution();
	}
}
