/**
 * 
 */
package com.egartech.sychev.exceptions.task2;

import java.io.FileNotFoundException;
import java.io.IOException;

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

		try {
			ThrowExceptions.arithmeticException();
		} catch (ArithmeticException ex) {
			System.out.println(
					"1. ����� ���������� ArithmeticException �������������� ������ ������� �� ���� " + ex.toString());
		}

		try {
			ThrowExceptions.arrayIndexOutOfBoundException();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("2. ����� ���������� ArrayIndexOutOfBoundsException ����� ������� �� ������� ������� "
					+ ex.toString());
		}

		try {
			ThrowExceptions.classNotFoundException1();
		} catch (ClassNotFoundException ex) {
			System.out.println("3. ����� ���������� ClassNotFoundException ����� �� ������  " + ex.toString());
		}

		try {
			ThrowExceptions.fileNotFoundException();
		} catch (FileNotFoundException ex) {
			System.out.println(
					"4. ����� ���������� FileNotFoundException ���� � �������� ����� �� ���������� " + ex.toString());
		}

		try {
			ThrowExceptions.iOException();
		} catch (IOException ex) {
			System.out.println("5. ����� ���������� IOException  ������ �����-������" + ex.toString());
		}

		try {
			ThrowExceptions.noSuchFieldException();
		} catch (NoSuchFieldException ex) {
			System.out.println(
					"6. ����� ���������� NoSuchFieldException ������������� ���� �� ���������� " + ex.toString());
		}

		try {
			ThrowExceptions.noSuchMethodException();
		} catch (NoSuchMethodException ex) {
			System.out.println(
					"7. ����� ���������� NoSuchMethodException ����������� ����� �� ���������� " + ex.toString());
		}

		try {
			ThrowExceptions.nullPointerException();
		} catch (NullPointerException ex) {
			System.out.println("8. ����� ���������� NullPointerException  ������� ������������ ������ ���������� NULL"
					+ ex.toString());
		}

		try {
			ThrowExceptions.numberFormatException();
		} catch (NumberFormatException ex) {
			System.out.println(
					"9. ����� ���������� NumberFormatException �������� �������������� ������ � �������� ������ "
							+ ex.toString());
		}

		try {
			ThrowExceptions.runtimeException();
		} catch (RuntimeException ex) {
			System.out.println("10. ����� ���������� RuntimeException " + ex.toString());
		}

		try {
			ThrowExceptions.stringIndexOutOfBoundsException();
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println(
					"11. ����� ���������� StringIndexOutOfBoundsException ������� ������� ������ ������� �� �������� ������"
							+ ex.toString());
		}
	}

}
