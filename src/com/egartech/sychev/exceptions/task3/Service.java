/**
 * 
 */
package com.egartech.sychev.exceptions.task3;

// TODO: Auto-generated Javadoc
/**
 * The Class Service.
 *
 * @author Sychev Evgenii
 */
public class Service {

	/**
	 * Close.
	 *
	 * @throws CloseException the close exception
	 */
	public static void close() throws CloseException {
		// TODO Auto-generated method stub
		throw new CloseException("Ошибка CloseException");
	}

	/**
	 * Do something.
	 *
	 * @throws ServiceException the service exception
	 */
	public static void doSomething() throws ServiceException {
		// TODO Auto-generated method stub
		try {
			Dao.doSomething();
		} catch (DaoException ex) {
			System.out.println(ex.toString());
			throw new ServiceException("Проброс далее ошибки ApplicationException");
		}

	}

}
