import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Demo6 {
	private JFrame jFrame;
	private JPanel jButtonPanel;
	private JPanel jTextPanel;
	private JPanel jProgressPanel;
	private ButtonGroup jButtonGroup;
	private JRadioButton[] jRadioButtons;
	private JCheckBox jCheckBox;
	private JButton jButton;
	private JTextField jTtextField;
	private JPasswordField jPasswordField;
	private JProgressBar jProgressBar;
	private JLabel jLabel;
	
	private Frame frame;
	private Panel buttonPanel;
	private Panel textPanel;
	private Panel progressPanel;
	private CheckboxGroup checkboxGroup;
	private Checkbox[] radioButtons;
	private Checkbox checkbox;
	private Button button;
	private TextField textField;
	private TextField passwordField;
	private Label progressBar;
	private Label label;
	
	public Demo6() {
		makeSwingWindow();
		makeAWTWindow();
	}

	private void makeSwingWindow() {
		jFrame = new JFrame("Demo6 Swing Window");
		jFrame.setLayout(new GridLayout(2, 6, 10, 10));
		jButtonPanel = new JPanel(new GridLayout(3, 1));
		jTextPanel = new JPanel();
		jProgressPanel = new JPanel();
		jButtonGroup = new ButtonGroup();
		
		jRadioButtons = new JRadioButton[3];
		for (int i = 0; i < jRadioButtons.length; i++) {
			jRadioButtons[i] = new JRadioButton("JRadioButton " + (i + 1));
			jButtonGroup.add(jRadioButtons[i]);
			jButtonPanel.add(jRadioButtons[i]);
		}
		
		jFrame.add(jButtonPanel);
		jCheckBox = new JCheckBox("JCheckBox");
		
		jFrame.add(jCheckBox);
		jButton = new JButton("JButton");
		
		jFrame.add(jButton);
		jTtextField = new JTextField("JTextField", 10);
		jTtextField.setPreferredSize(jTtextField.getPreferredSize());
		jTextPanel.add(jTtextField);
		jPasswordField = new JPasswordField("JPasswordField", 10);
		jPasswordField.setPreferredSize(jPasswordField.getPreferredSize());
		jTextPanel.add(jPasswordField);
		jFrame.add(jTextPanel);
		
		jProgressBar = new JProgressBar();
		jProgressPanel.add(jProgressBar);
		jFrame.add(jProgressPanel);
		// @formatter:off
		jLabel = new JLabel("<html><ol>"
				+ "<li>Radio Buttons</li>"
				+ "<li>Check Box</li>"
				+ "<li>Button</li>"
				+ "<li>Text and Password Fields</li>"
				+ "<li>Progress Bar</li>"
				+ "<li>Label</li>" 
				+ "</ol></html>");
		// @formatter:on
		jFrame.add(jLabel);
		
		jFrame.setSize(500, 300);
		jFrame.setResizable(false);
		jFrame.setVisible(true);
		jFrame.addWindowListener(new WindowListener() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				jFrame.dispose();
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
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					if (jProgressBar.getValue() >= jProgressBar.getMaximum()) {
						jProgressBar.setValue(0);
					} else {
						jProgressBar.setValue(jProgressBar.getValue() + 1);
					}
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
					}
				}
			}
		}).start();
		
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jProgressBar.setValue(0);
			}
		});
	}
	
	private void makeAWTWindow() {
		frame = new Frame("Demo6 AWT Window");
		frame.setLayout(new GridLayout(2, 6, 10, 10));
		buttonPanel = new Panel(new GridLayout(3, 1));
		textPanel = new Panel();
		progressPanel = new Panel();
		checkboxGroup = new CheckboxGroup();
		
		radioButtons = new Checkbox[3];
		for (int i = 0; i < jRadioButtons.length; i++) {
			radioButtons[i] = new Checkbox("RadioButton " + (i + 1), checkboxGroup, false);
			buttonPanel.add(radioButtons[i]);
		}
		
		frame.add(buttonPanel);
		checkbox = new Checkbox("Checkbox");
		
		frame.add(checkbox);
		button = new Button("Button");
		
		frame.add(button);
		textField = new TextField("TextField", 10);
		textField.setPreferredSize(textField.getPreferredSize());
		textPanel.add(textField);
		passwordField = new TextField("PasswordField", 10);
		passwordField.setPreferredSize(passwordField.getPreferredSize());
		passwordField.setEchoChar('*');
		textPanel.add(passwordField);
		frame.add(textPanel);
		
		progressBar = new Label("AWT has no progress bar.");
		progressPanel.add(progressBar);
		frame.add(progressPanel);
		// @formatter:off
		jLabel = new JLabel("<html><ol>"
				+ "<li>Radio Buttons</li>"
				+ "<li>Check Box</li>"
				+ "<li>Button</li>"
				+ "<li>Text and Password Fields</li>"
				+ "<li>Progress Bar</li>"
				+ "<li>Label</li>" 
				+ "</ol></html>");
		// @formatter:on
		frame.add(jLabel);
		
		frame.setSize(500, 300);
		frame.setResizable(false);
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
		new Demo6();
	}
}
