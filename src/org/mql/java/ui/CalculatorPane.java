/**
 * 
 */
package org.mql.java.ui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public class CalculatorPane extends JPanel {
	private static final long serialVersionUID = 1l;
	
	public CalculatorPane() {
		setLayout(new GridLayout(3, 2));
		add(new JLabel("Test"));
		add(new JLabel("it's result"));
		add(new JLabel("Test"));
		add(new JLabel("it's result"));
		add(new JLabel("Test"));
		add(new JLabel("it's result"));
	}
}
