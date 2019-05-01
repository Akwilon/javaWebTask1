package by.web.task1.DAO;

import by.web.task1.DAO.exception.DAOException;

public interface AdminDAO {
	boolean signIn(String login, String pass) throws DAOException;
}
