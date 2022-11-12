/**
 * 
 */
package org.mql.java.model;

/**
 * @author MOUKHAFI Anass
 *
 * Nov 12, 2022
 */
public class Calculator {
	
	public int add(int x, int y) {
		return x+y;
	}
	
	public double add(double x, double y) {
		return x+y;
	}
	
	public double substruct(int x, int y) {
		return x-y;
	}
	
	public int multiply(int x, int y) {
		return x*y;
	}
	
	public double divide(int x, int y) throws Exception {
		if(y==0)
			throw new Exception("Oups, Division by 0 !");
		return (double)x/y;
	}
	
	/* For integrity :
	 * 	Reciprocal of the fraction x/y is y/x, in order to make sure
	 * our methods behave the same way, this method will call divide.
	 * */
	public double reciprocal(int x, int y) throws Exception {
		return divide(y, x);
	}
}
