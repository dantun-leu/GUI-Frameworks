import javax.swing.*;
import java.awt.*;

public class Demo1 {
	JFrame frame;
	JPanel panel;
	JPanel buttonPanel;
	JPanel textPanel;
	JPanel progressPanel;
	ButtonGroup buttonGroup;
	JRadioButton[] radioButtons;
	JCheckBox checkBox;
	JButton button;
	JTextField textField;
	JPasswordField passwordField;
	JProgressBar progressBar;
	JLabel label;

	public Demo1() {
		frame = new JFrame("Demo1");
		panel = new JPanel(new GridLayout(2, 6, 10, 10));
		buttonPanel = new JPanel(new GridLayout(3, 1));
		textPanel = new JPanel();
		progressPanel = new JPanel();
		buttonGroup = new ButtonGroup();
		
		radioButtons = new JRadioButton[3];
		for (int i = 0; i < radioButtons.length; i++) {
			radioButtons[i] = new JRadioButton("JRadioButton " + (i + 1));
			buttonGroup.add(radioButtons[i]);
			buttonPanel.add(radioButtons[i]);
		}
		
		panel.add(buttonPanel);
		checkBox = new JCheckBox("JCheckBox");
		
		panel.add(checkBox);
		button = new JButton("JButton");
		
		panel.add(button);
		textField = new JTextField("JTextField", 10);
		textField.setPreferredSize(textField.getPreferredSize());
		textPanel.add(textField);
		passwordField = new JPasswordField("JPasswordField", 10);
		passwordField.setPreferredSize(passwordField.getPreferredSize());
		textPanel.add(passwordField);
		panel.add(textPanel);
		
		progressBar = new JProgressBar();
		progressPanel.add(progressBar);
		panel.add(progressPanel);
		
		label = new JLabel("<html><ol>" 
				+ "<li>Radio Buttons</li>"
				+ "<li>Check Box</li>"
				+ "<li>Button</li>" 
				+ "<li>Text and Password Fields</li>"
				+ "<li>Progress Bar</li>" 
				+ "<li>Label</li>" 
				+ "</ol></html>");
		panel.add(label);

		frame.add(panel);
		frame.setSize(500, 300);
		frame.setResizable(false);
		frame.setVisible(true);

		new Thread(new Runnable() {
			@Override
			public void run() {
				animateProgressBar();
			}
		}).run();
	}

	public void animateProgressBar() {
		while (true) {
			if (progressBar.getValue() >= progressBar.getMaximum()) {
				progressBar.setValue(0);
			} else {
				progressBar.setValue(progressBar.getValue() + 1);
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			}
		}
	}

	public static void main(String[] args) {
		new Demo1();
	}
}
/*
 * 
*/