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

		l1.setForeground(Color.black);
		l2.setForeground(Color.green);
		l3.setForeground(Color.red);
		l4.setForeground(Color.lightGray);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		for(Failure failure : testRunner.getSummary().getFailures()) {
			add(new JLabel(failure.getTestIdentifier().getDisplayName()));
			add(new JLabel(failure.getException().getMessage()));
		}
	}
}
