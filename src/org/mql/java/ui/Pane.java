/**
 * 
 */
package org.mql.java.ui;

import javax.swing.JPanel;

import org.mql.java.runner.TestRunner;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public class Pane extends JPanel {
	private static final long serialVersionUID = 1L;
	
	protected TestRunner testRunner;
	protected int testsFoundCount;
	protected int testsFailedCount;
	protected int testsSuccededCount;
	protected int testsSkippedCount;
	
	public Pane(TestRunner testRunner) {
		this.testRunner = testRunner;
		testsFoundCount = (int) testRunner.getSummary().getTestsFoundCount();
		testsFailedCount = (int) testRunner.getSummary().getTestsFailedCount();
		testsSkippedCount = (int) testRunner.getSummary().getTestsSkippedCount();
		testsSuccededCount = (int) testRunner.getSummary().getTestsSucceededCount();
	}
}
