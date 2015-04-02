import javax.swing.*;

import java.awt.*;

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
	}
	
	public static void main(String[] args) {
		new Demo3();
	}
}
