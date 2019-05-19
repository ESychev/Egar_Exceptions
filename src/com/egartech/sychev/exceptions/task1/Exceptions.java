/**
 * 
 */
package com.egartech.sychev.exceptions.task1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// TODO: Auto-generated Javadoc
/**
 * The Class Exceptions.
 *
 * @author Sychev Evgenii
 */
public class Exceptions {

	/**
	 * Arithmetic exception.
	 */
	public static void arithmeticException() {

		int i = 0;
		try {
			i = 5 / i;
		} catch (Exception ex) {
			System.out.println("1. Обработка исключения  деления на 0 " + ex.toString());
		}
	}

	/**
	 * Array index out of bounds exception.
	 */
	public static void arrayIndexOutOfBoundsException() {

		int i = 0;
		int[] mass = new int[5];

		while (true) {
			try {
				mass[i] = i;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("2. Обработка исключения выход за пределы массива " + ex.toString());
				break;
			}
			i++;
		}
	}

	/**
	 * Class not found exception.
	 */
	public static void classNotFoundException() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ex) {
			System.out.println("3. Обработка исключения обращения к несуществующему классу " + ex.toString());

		}

	}

	/**
	 * File not found exception.
	 */
	public static void fileNotFoundException() {

		File file = new File("D:/Java.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException ex) {
			System.out.println("4 Обработка исключения фаил с указаным путем не существует " + ex.toString());
		}
	}

	/**
	 * I O exception.
	 */
	public static void iOException() {

		try {
			FileWriter fileWriter = new FileWriter("output.txt");
			fileWriter.close();
			fileWriter.write("Hello");
		} catch (IOException ex) {
			System.out.println("5 Обработка исключения Ошибка - Нельзя записать в закрытый файл!" + ex.toString());
		}
	}

	/**
	 * No such field exception.
	 */
	public static void noSuchFieldException() {

		Class<Car> carClass = Car.class;
		try {
			Field serialNumberField = carClass.getField("serialNumber");
		} catch (NoSuchFieldException ex) {
			System.out.println("6 Обработка исключения запращиваемое поле не существует" + ex.toString());
		}
	}

	/**
	 * No such method exception.
	 */
	public static void noSuchMethodException() {

		Class<Car> carClass = Car.class;
		try {
			Method getHorsepowerMethod = carClass.getMethod("notifyAll");
			Method printSerialNumberMethod = carClass.getMethod("printSerialNumber");
		} catch (NoSuchMethodException ex) {
			System.out.println("7 Обработка исключения запращиваемый метод не существует" + ex.toString());
		}
	}

	/**
	 * Null pointer exception.
	 */
	public static void nullPointerException() {

		int[] nNulArray = new int[5];
		nNulArray = null;

		try {
			int i = nNulArray.length;
		} catch (NullPointerException ex) {
			System.out.println("8 Обработка исключения попытка использовать ссылку содержащую NULL" + ex.toString());
		}

	}

	/**
	 * Number format exception.
	 */
	public static void numberFormatException() {

		try {
			String number = "11A";
			int result = Integer.parseInt(number);
			System.out.println(result);
		} catch (NumberFormatException ex) {
			System.out
					.println("9 Обработка исключения неверное преобразование строки в числовой формат" + ex.toString());
		}
	}

	/**
	 * Runtime exception.
	 *
	 * @throws RuntimeException the runtime exception
	 */
	public static void runtimeException() throws RuntimeException {

		try {
			throw new RuntimeException("demo");
		} catch (RuntimeException ex) {
			System.out.println("10 Обработка исключения " + ex.toString());

		}
	}

	/**
	 * String index out of bounds exception.
	 */
	public static void stringIndexOutOfBoundsException() {

		String szShortString = "123456";

		try {
			char chr = szShortString.charAt(10);
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println(
					"11 Обработка исключения попытка извлечь символ лежащий за границей строки " + ex.toString());
		}

	}
}
