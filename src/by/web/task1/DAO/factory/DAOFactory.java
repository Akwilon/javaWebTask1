package by.web.task1.DAO.factory;

import by.web.task1.DAO.RoomDAO;
import by.web.task1.DAO.ToyDAO;
import by.web.task1.DAO.impl.ListRoomDAO;
import by.web.task1.DAO.impl.ListToyDAO;

public class DAOFactory {
	private static DAOFactory instance;
	private final RoomDAO listRoomDAO = new ListRoomDAO();
	private final ToyDAO listToyDAO = new ListToyDAO();
	
	private DAOFactory(){
		
	}
	
	public static DAOFactory getInstance(){
		if (instance == null) {
			instance = new DAOFactory();
		} 
		return instance;
	}
	public RoomDAO getRoomDAO(){
		return listRoomDAO;
	}
	public ToyDAO getToyDAO(){
		return listToyDAO;
	}
}
