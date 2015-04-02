import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Demo4 {
	private JFrame frame;
	private JPanel buttonPanel;
	private JPanel labelPanel;
	private JButton myButton;
	private JButton yourButton;
	private JLabel label;

	public Demo4() {
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

		/*
		 * Challenge: Add an ActionListener that changes label to say
		 * "Your Click" whenever the button is pressed.
		 */

		frame.add(buttonPanel);
		frame.add(labelPanel);
		frame.setSize(400, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Demo4();
	}
}
