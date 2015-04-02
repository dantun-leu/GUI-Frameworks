import javax.swing.*;
import java.awt.*;

public class Demo7 {
	private JFrame frame;
	private JButton button;
	
	public Demo7() {
		frame = new JFrame("Demo7");
		frame.setLayout(new FlowLayout());
		button = new JButton(
				"<html><img src=\"http://www.picturesnew.com/media/images/picture-wallpaper.jpg\" width=\"124\" height=\"93\"></html>");
		frame.add(button);
		frame.setSize(frame.getPreferredSize());
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Demo7();
	}
}
