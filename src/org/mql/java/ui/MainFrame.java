package org.mql.java.ui;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1l;
	
	public MainFrame() {
		setTitle("Test Launcher");
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
