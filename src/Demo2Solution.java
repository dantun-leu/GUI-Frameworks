import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;

public class Demo2Solution {
	private JFrame frame;
	
	public Demo2Solution() {
		frame = new JFrame("Demo2");
		
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
		new Demo2Solution();
	}
}
