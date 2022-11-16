/**
 * 
 */
package org.mql.java.ui;

import java.awt.Color;
import java.sql.Date;
import java.sql.Timestamp;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import org.mql.java.runner.TestRunner;
import org.mql.java.util.Reportable;

/** Each pane can have its own representation
 * They will forced to loadTheir data at least in the user interface
 * and they all generate a report of the corresponding test case 
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public abstract class Pane extends JPanel implements Reportable {
	private static final long serialVersionUID = 1L;
	
	protected TestRunner testRunner;
	protected int testsFoundCount;
	protected int testsFailedCount;
	protected int testsSuccededCount;
	protected int testsSkippedCount;
	protected float testTime;
	private String sut;
	
	public Pane(String sut) {
		setBackground(new Color(225, 224, 224));
		setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		this.sut = sut;
		generateReport();
	}

	@Override
	public void generateReport() {
		testRunner = new TestRunner( sut + "Test");
		testsFoundCount = (int) testRunner.getSummary().getTestsFoundCount();
		testsFailedCount = (int) testRunner.getSummary().getTestsFailedCount();
		testsSkippedCount = (int) testRunner.getSummary().getTestsSkippedCount();
		testsSuccededCount = (int) testRunner.getSummary().getTestsSucceededCount();
		Date t1 = new Date(new Timestamp(testRunner.getSummary().getTimeStarted()).getTime());
		Date t2 = new Date(new Timestamp(testRunner.getSummary().getTimeFinished()).getTime());
		testTime = (t2.getTime() - t1.getTime());
	}
	
	protected abstract void loadResultsInUI();
}
