package by.web.task1.DAO.exception;

public class DAOException extends Throwable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DAOException(String message) {
		super(message);
	}
	
	public DAOException(String message, Exception e) {
		super(message);
	}
}
