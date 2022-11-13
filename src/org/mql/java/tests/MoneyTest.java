package org.mql.java.tests;
import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mql.java.model.Money;
public class MoneyTest {
	private Money m12USD, m14USD;
	
	@BeforeEach void setUp() {
		m12USD= new Money(12, "USD");
		m14USD= new Money(14, "USD");
	}
	@Test void testEquals() {
		assertTrue(!m12USD.equals(null));
		assertEquals(m12USD, m12USD);
		assertEquals(m12USD, new Money(12, "USD"));
		assertTrue(!m12USD.equals(m14USD));
	}
	@AfterEach void tearDown() {
		m12USD = null;
		m14USD = null;
	}
}
