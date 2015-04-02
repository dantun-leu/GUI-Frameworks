import javax.swing.*;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Demo3 {
	private JFrame frame;
	private JButton myButton;
	private JButton yourButton;
	
	public Demo3() {
		frame = new JFrame("Demo3");
		frame.setLayout(new FlowLayout());
		
		myButton = new JButton("My Button");
		frame.add(myButton);
		
		/*
		 * Challenge: Display youButton and make it say "Your Button".
		 */
		
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
		new Demo3();
	}
}
