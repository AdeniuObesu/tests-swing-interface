/**
 * 
 */
package org.mql.java.runner;

import org.junit.platform.engine.discovery.DiscoverySelectors;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public class TestRunner {
	TestExecutionSummary summary;
	/* 	The constructor takes as parameter
	 *  the class name to test (sut) : System Under Test
	 *  assuming the tests base package by default is known.
	 * */
	public TestRunner(String sut) {
		
		LauncherDiscoveryRequest request = null;
		try {
			request = LauncherDiscoveryRequestBuilder
					.request()
					.selectors(
							DiscoverySelectors.selectClass(Class.forName("org.mql.java.tests."+sut))
					)
					.build();
		} catch (ClassNotFoundException e) {
			e.getMessage();
		}
		Launcher launcher = LauncherFactory.create();
		SummaryGeneratingListener listener = new SummaryGeneratingListener();
		launcher.registerTestExecutionListeners(listener);
		launcher.execute(request);
		
		summary = listener.getSummary();
	}
	
	public TestExecutionSummary getSummary() {
		return summary;
	}
}
