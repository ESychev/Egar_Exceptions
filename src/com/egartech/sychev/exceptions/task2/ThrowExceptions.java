/**
 * 
 */
package com.egartech.sychev.exceptions.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

// TODO: Auto-generated Javadoc
/**
 * The Class ThrowExceptions.
 *
 * @author Sychev Evgenii
 */
public class ThrowExceptions {

	/**
	 * Arithmetic exception.
	 */
	public static void arithmeticException() {
		try {
			throw new ArithmeticException();
		} catch (ArithmeticException ex) {
			throw ex;
		}
	}

	/**
	 * Array index out of bound exception.
	 */
	public static void arrayIndexOutOfBoundException() {
		try {
			throw new ArrayIndexOutOfBoundsException();
		} catch (ArrayIndexOutOfBoundsException ex) {
			throw ex;
		}
	}

	/**
	 * Class not found exception 1.
	 *
	 * @throws ClassNotFoundException the class not found exception
	 */
	public static void classNotFoundException1() throws ClassNotFoundException {
		try {
			throw new ClassNotFoundException();
		} catch (ClassNotFoundException ex) {
			throw ex;
		}

	}

	/**
	 * File not found exception.
	 *
	 * @throws FileNotFoundException the file not found exception
	 */
	public static void fileNotFoundException() throws FileNotFoundException {
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException ex) {
			throw ex;
		}

	}

	/**
	 * I O exception.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public static void iOException() throws IOException {
		try {
			throw new IOException();
		} catch (IOException ex) {
			throw ex;
		}

	}

	/**
	 * No such field exception.
	 *
	 * @throws NoSuchFieldException the no such field exception
	 */
	public static void noSuchFieldException() throws NoSuchFieldException {
		try {
			throw new NoSuchFieldException();
		} catch (NoSuchFieldException ex) {
			throw ex;
		}

	}

	/**
	 * No such method exception.
	 *
	 * @throws NoSuchMethodException the no such method exception
	 */
	public static void noSuchMethodException() throws NoSuchMethodException {
		try {
			throw new NoSuchMethodException();
		} catch (NoSuchMethodException ex) {
			throw ex;
		}

	}

	/**
	 * Null pointer exception.
	 */
	public static void nullPointerException() {
		try {
			throw new NullPointerException();
		} catch (NullPointerException ex) {
			throw ex;
		}

	}

	/**
	 * Number format exception.
	 */
	public static void numberFormatException() {
		try {
			throw new NumberFormatException();
		} catch (NumberFormatException ex) {
			throw ex;
		}

	}

	/**
	 * Runtime exception.
	 */
	public static void runtimeException() {
		try {
			throw new RuntimeException();
		} catch (RuntimeException ex) {
			throw ex;
		}

	}

	/**
	 * String index out of bounds exception.
	 */
	public static void stringIndexOutOfBoundsException() {
		try {
			throw new StringIndexOutOfBoundsException();
		} catch (StringIndexOutOfBoundsException ex) {
			throw ex;
		}

	}

}
