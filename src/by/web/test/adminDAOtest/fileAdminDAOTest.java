package by.web.test.adminDAOtest;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import by.web.task1.DAO.AdminDAO;
import by.web.task1.DAO.exception.DAOException;
import by.web.task1.DAO.factory.DAOFactory;

class fileAdminDAOTest {

	@Test
	void testRigth() {
	DAOFactory factory = DAOFactory.getInstance();
	AdminDAO dao = factory.getAdminDAO();
	
	String loggin ="qwerty";
	String pass = "qwerty123";
		
	boolean expected = true;
	boolean actual = false;
	try {
		actual = dao.signIn(loggin, pass);
	} catch (DAOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals(expected, actual);
	}
	
	@Test
	void testRight2() {
	DAOFactory factory = DAOFactory.getInstance();
	AdminDAO dao = factory.getAdminDAO();
	
	String loggin ="dagsgsa";
	String pass = "14";
		
	boolean expected = true;
	boolean actual = false;
	try {
		actual = dao.signIn(loggin, pass);
	} catch (DAOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals(expected, actual);
	}
	
	@Test
	void testWrong() {
	DAOFactory factory = DAOFactory.getInstance();
	AdminDAO dao = factory.getAdminDAO();
	
	String loggin ="15234";
	String pass = "sgdfhrtn";
		
	boolean expected = false;
	boolean actual = true;
	try {
		actual = dao.signIn(loggin, pass);
	} catch (DAOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertEquals(expected, actual);
	}

}
