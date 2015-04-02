import javax.swing.*;

public class Demo2Solution {
	private JFrame frame;
	
	public Demo2Solution() {
		frame = new JFrame("Demo2");
		
		frame.setSize(400, 300);
		frame.setVisible(true);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Demo2Solution();
	}
}
