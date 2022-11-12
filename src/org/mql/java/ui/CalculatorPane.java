/**
 * 
 */
package org.mql.java.ui;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;

import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;


/**
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public class CalculatorPane extends Pane {
	private static final long serialVersionUID = 1l;
	GridLayout layout;
	public CalculatorPane() {
		super("Calculator");
		layout = new GridLayout(testsFailedCount + 2, 2);
		
		layout.setHgap(25);
		layout.setVgap(25);
		setLayout(layout);
		
		generateReport();
	}
	
	public void generateReport(){
		JLabel l1 = new JLabel("Total Tests count : "+ testsFoundCount);
		JLabel l2 = new JLabel("Tests succeded : "+ testsSuccededCount);
		JLabel l3 = new JLabel("Tests failed : "+ testsFailedCount);
		JLabel l4 = new JLabel("Tests skipped : "+ testsSkippedCount);

		l1.setForeground(Color.BLACK);
		l2.setForeground(Color.GREEN);
		l3.setForeground(Color.RED);
		l4.setForeground(Color.GRAY);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		for(Failure failure : testRunner.getSummary().getFailures()) {
			
			JLabel left = new JLabel(failure.getTestIdentifier().getDisplayName());
			JLabel right = new JLabel(failure.getException().getMessage());
			
			left.setForeground(Color.RED);
			right.setForeground(Color.RED);
			
			add(left);
			add(right);
		}
	}
}
