/**
 * 
 */
package org.mql.java.ui;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.mql.java.runner.TestRunner;


/**
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public class CalculatorPane extends JPanel {
	private static final long serialVersionUID = 1l;
	TestRunner testRunner;
	
	public CalculatorPane() {
		testRunner = new TestRunner("CalculatorTest");
		
		GridLayout layout = new GridLayout(1, 3);
		layout.setHgap(25);
		layout.setVgap(25);
		setLayout(layout);
		
		
		
		generateReport();
	}
	
	public void generateReport(){
		add(new JLabel("Tests succeded "+testRunner.getSummary().getTestsSucceededCount()));
		add(new JLabel("Tests failed "+testRunner.getSummary().getTestsFailedCount()));
		add(new JLabel("Tests skipped "+testRunner.getSummary().getTestsSkippedCount()));
		
		for(Failure failure : testRunner.getSummary().getFailures()) {
			add(new JLabel(
					failure.getTestIdentifier().getDisplayName()
					+ " - " + failure.getException().getMessage())
			);
		}
	}
}
