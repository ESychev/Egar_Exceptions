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
					"1. Вызов исключения ArithmeticException арифметическая ошибка деление на ноль " + ex.toString());
		}

		try {
			ThrowExceptions.arrayIndexOutOfBoundException();
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("2. Вызов исключения ArrayIndexOutOfBoundsException выход индекса за границу массива "
					+ ex.toString());
		}

		try {
			ThrowExceptions.classNotFoundException1();
		} catch (ClassNotFoundException ex) {
			System.out.println("3. Вызов исключения ClassNotFoundException класс не найден  " + ex.toString());
		}

		try {
			ThrowExceptions.fileNotFoundException();
		} catch (FileNotFoundException ex) {
			System.out.println(
					"4. Вызов исключения FileNotFoundException фаил с указаным путем не существует " + ex.toString());
		}

		try {
			ThrowExceptions.iOException();
		} catch (IOException ex) {
			System.out.println("5. Вызов исключения IOException  ошибка ввода-вывода" + ex.toString());
		}

		try {
			ThrowExceptions.noSuchFieldException();
		} catch (NoSuchFieldException ex) {
			System.out.println(
					"6. Вызов исключения NoSuchFieldException запращиваемое поле не существует " + ex.toString());
		}

		try {
			ThrowExceptions.noSuchMethodException();
		} catch (NoSuchMethodException ex) {
			System.out.println(
					"7. Вызов исключения NoSuchMethodException запрошенный метод не существует " + ex.toString());
		}

		try {
			ThrowExceptions.nullPointerException();
		} catch (NullPointerException ex) {
			System.out.println("8. Вызов исключения NullPointerException  попытка использовать ссылку содержащую NULL"
					+ ex.toString());
		}

		try {
			ThrowExceptions.numberFormatException();
		} catch (NumberFormatException ex) {
			System.out.println(
					"9. Вызов исключения NumberFormatException неверное преобразование строки в числовой формат "
							+ ex.toString());
		}

		try {
			ThrowExceptions.runtimeException();
		} catch (RuntimeException ex) {
			System.out.println("10. Вызов исключения RuntimeException " + ex.toString());
		}

		try {
			ThrowExceptions.stringIndexOutOfBoundsException();
		} catch (StringIndexOutOfBoundsException ex) {
			System.out.println(
					"11. Вызов исключения StringIndexOutOfBoundsException попытка извлечь символ лежащий за границей строки"
							+ ex.toString());
		}
	}

}
