/**
 * 
 */
package org.mql.java.tests;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mql.java.model.Calculator;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public class CalculatorTest {
	// Our system under test
	private Calculator calculator;
	@BeforeEach
	void setUp() {
		calculator = new Calculator();
	}
	
	@Test
	void shouldAddTwoIntegers() {
		assertEquals(5, calculator.add(3, 2));
		assertEquals(-1, calculator.add(-3, 2));
		assertEquals(11, calculator.add(14, -3));
	}
	
	@Test
	void shouldAddTwoDoubles() {
		assertEquals(6.1, calculator.add(3.3, 2.8));
		assertEquals(-1.1, calculator.add(-3.5, 2.4));
		assertEquals(10.6, calculator.add(14.2, -3.6));
	}
	
	@Test
	void shouldSubstructIntegerFromAnother() {
		assertEquals(1, calculator.substruct(3, 2));
		assertEquals(-5, calculator.substruct(-3, 2));
		assertEquals(17, calculator.substruct(14, -3));
	}
	
	@Test
	void shouldMultiplyTwoIntegers() {
		assertEquals(12, calculator.multiply(2, 6));
		assertEquals(0, calculator.multiply(3, 0));
		assertEquals(42, calculator.multiply(14, 3));
	}
	
	@Test
	void shouldDivideIntegerByAnother() {
		assertAll(
				() -> assertEquals(2.5, calculator.divide(5, 2)),
				() -> assertEquals(0.75, calculator.divide(3, 4)),
				() -> assertThrows(Exception.class, ()->{
					calculator.divide(3, 0);
				})
			);
	}
	
	@Test
	void shouldReturnReciprocalOfAFraction() {
		assertAll(
				() -> assertEquals(0.4, calculator.reciprocal(5, 2)),
				() -> assertEquals(3, calculator.reciprocal(5, 15)),
				() -> assertThrows(Exception.class, ()->{
					calculator.reciprocal(0, 3);
				})
			);
	}
	
	@AfterEach
	void tearDown() {
		calculator = null;
	}
}
