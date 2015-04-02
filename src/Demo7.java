import javax.swing.*;
import java.awt.*;

public class Demo7 {
	private JFrame frame;
	private JButton button;
	private JCheckBox checkBox;
	private JRadioButton radioButton;
	private JComboBox<String> comboBox;
	private JLabel label;
	
	public Demo7() {
		frame = new JFrame("Demo7");
		frame.setLayout(new FlowLayout());
		
		button = new JButton(
				"<html><img src=\"https://31.media.tumblr.com/tumblr_mc2fpeCPVD1rf089no1_500.gif\" width=\"100\" height=\"88\"></html>");
		frame.add(button);
		
		radioButton = new JRadioButton("<html><code>Code format</code></html>");
		frame.add(radioButton);
		
		checkBox = new JCheckBox(
				"<html><p style=\"color:orange;\">CSS Coloured text</p></html>");
		frame.add(checkBox);
		
		comboBox = new JComboBox<String>(
				new String[] {
						"<html><img src=\"http://www.picturesnew.com/media/images/picture-wallpaper.jpg\" width=\"124\" height=\"93\"></html>",
						"Text, too." });
		frame.add(comboBox);
		
		label = new JLabel(
				"<html><i><b>Add your own HTML code here!</b></i></html>");
		frame.add(label);
		
		frame.setSize(300, 350);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Demo7();
	}
}
