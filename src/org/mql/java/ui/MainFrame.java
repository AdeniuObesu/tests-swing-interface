package org.mql.java.ui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1l;
	
	public MainFrame() {
//		try { // set Windows Look and feel
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
		setTitle("Unit Testing Results Browser...");
		add(new CalculatorTabbedPane());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(600, 400));
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
