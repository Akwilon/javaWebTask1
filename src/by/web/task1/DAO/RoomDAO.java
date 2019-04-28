package by.web.task1.DAO;

import java.util.List;

import by.web.task1.DAO.service.RoomSpecification;
import by.web.task1.bean.Room;

public interface RoomDAO {
	void addRoom(Room room);
	void deleteRoom (Room room);
	void udpateRoom (Room room);
	
	List query(RoomSpecification specification);
}
