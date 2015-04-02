import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Demo2 {
	private JFrame frame;
	
	public Demo2() {
		frame = new JFrame("Demo2");
		
		/*
		 * Challenge: Make a JFrame of size 400x300 appear.
		 */
		
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
		new Demo2();
	}
}
