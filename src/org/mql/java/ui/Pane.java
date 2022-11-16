/**
 * 
 */
package org.mql.java.ui;

import java.awt.Color;
import java.sql.Date;
import java.sql.Timestamp;

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
	protected float testTime;
	
	public Pane(String sut) {
		setBackground(new Color(255, 248, 240));
		testRunner = new TestRunner(sut + "Test");
		testsFoundCount = (int) testRunner.getSummary().getTestsFoundCount();
		testsFailedCount = (int) testRunner.getSummary().getTestsFailedCount();
		testsSkippedCount = (int) testRunner.getSummary().getTestsSkippedCount();
		testsSuccededCount = (int) testRunner.getSummary().getTestsSucceededCount();
		Date t1 = new Date(new Timestamp(testRunner.getSummary().getTimeStarted()).getTime());
		Date t2 = new Date(new Timestamp(testRunner.getSummary().getTimeFinished()).getTime());
		testTime = (t2.getTime() - t1.getTime()) / 1000;
	}
}
