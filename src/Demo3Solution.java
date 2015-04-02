import javax.swing.*;

import java.awt.*;

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
	}

	public static void main(String[] args) {
		new Demo3Solution();
	}
}
