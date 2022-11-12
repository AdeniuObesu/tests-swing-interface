/**
 * 
 */
package org.mql.java.ui;

import java.awt.GridLayout;

import javax.swing.JLabel;

import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.mql.java.runner.TestRunner;


/**
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public class CalculatorPane extends MainPane {
	private static final long serialVersionUID = 1l;
	
	public CalculatorPane() {
		super(new TestRunner("CalculatorTest"));
		GridLayout layout = new GridLayout(1, testsFoundCount);
		
		layout.setHgap(25);
		layout.setVgap(25);
		setLayout(layout);
		
		
		
		generateReport();
	}
	
	public void generateReport(){
		
		add(new JLabel("Tests succeded "+ testsSuccededCount));
		add(new JLabel("Tests failed "+ testsFailedCount));
		add(new JLabel("Tests skipped "+ testsSkippedCount));
		
		for(Failure failure : testRunner.getSummary().getFailures()) {
			add(new JLabel(
					failure.getTestIdentifier().getDisplayName()
					+ " - " + failure.getException().getMessage())
			);
		}
	}
}
