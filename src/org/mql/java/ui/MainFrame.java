package org.mql.java.ui;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 1l;
	
	public MainFrame() {
		setTitle("Unit Testing Results Browser...");
		getContentPane().setLayout(new GridLayout(1, 1));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.add("Calculator", new CalculatorPane());
		// More you add test cases, the more tabs you add...
		
		//finally
		getContentPane().add(tabbedPane);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(new Dimension(600, 400));
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
