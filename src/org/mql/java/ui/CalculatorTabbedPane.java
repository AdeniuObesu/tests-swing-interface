/**
 * 
 */
package org.mql.java.ui;

import javax.swing.JTabbedPane;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public class CalculatorTabbedPane extends JTabbedPane{
	private static final long serialVersionUID = 1l;
	
	public CalculatorTabbedPane() {
		add("Calculator", new CalculatorPane());
	}
	
}
