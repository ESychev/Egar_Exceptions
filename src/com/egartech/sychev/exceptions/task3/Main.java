/**
 * 
 */
package com.egartech.sychev.exceptions.task3;

// TODO: Auto-generated Javadoc
/**
 * The Class Main.
 *
 * @author Sychev Evgenii
 */
public class Main {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Controller.doController();
		} catch (ApplicationException ex) {
			System.out.println(ex.toString());
		}
	}

}
