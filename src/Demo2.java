import javax.swing.*;

public class Demo2 {
	private JFrame frame;
	
	public Demo2() {
		frame = new JFrame("Demo2");
		
		/*
		 * Challenge: Make a JFrame of size 400x300 appear.
		 */
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Demo2();
	}
}
