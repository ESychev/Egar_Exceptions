/**
 * 
 */
package com.egartech.sychev.exceptions.task3;

// TODO: Auto-generated Javadoc
/**
 * The Class Controller.
 *
 * @author Sychev Evgenii
 */
public class Controller {

	/**
	 * Do controller.
	 *
	 * @throws ApplicationException the application exception
	 */
	public static void doController() throws ApplicationException {
		try {
			Service.doSomething(); // вызов бизнес логики, выбрасывает ServiceException
		} catch (ServiceException ex) {
			System.out.println(ex.toString());
			throw new ApplicationException("Проброс далее ошибки ApplicationException");
		} catch (RuntimeException ex) {
			System.out.println(ex.toString());
		} finally {
			try {
				Service.close(); // финализирует обработку. Выбрасывает CloseException, которую также нужно
									// обработать (try/catch)
			} catch (CloseException ex) {
				System.out.println(ex.toString());
			}
		}

	}

}
