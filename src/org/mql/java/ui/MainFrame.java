package org.mql.java.ui;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1l;
	
	public MainFrame() {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		setTitle("UNIT TEST RUNNER!");
		add(new CalculatorTabbedPane());
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		pack();
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
