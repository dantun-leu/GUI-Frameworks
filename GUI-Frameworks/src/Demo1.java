import javax.swing.*;
import java.awt.*;

public class Demo1 {
	JFrame frame;
	JPanel panel;
	ButtonGroup buttonGroup;
	JRadioButton[] radioButtons;
	JCheckBox checkBox;
	JButton button;
	JTextField textField;
	JPasswordField passwordField;

	public Demo1() {
		frame = new JFrame("Demo1");
		panel = new JPanel(new GridLayout());
		buttonGroup = new ButtonGroup();
		radioButtons = new JRadioButton[3];
		for (int i = 0; i < radioButtons.length; i++) {
			radioButtons[i] = new JRadioButton("JRadioButton " + i);
			buttonGroup.add(radioButtons[i]);
			panel.add(radioButtons[i]);
		}
		checkBox = new JCheckBox("JCheckBox");
		button = new JButton("JButton");
		textField = new JTextField();
		passwordField = new JPasswordField();
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Demo1();
	}
}
