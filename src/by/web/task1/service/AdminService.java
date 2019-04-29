package by.web.task1.service;

import by.web.task1.bean.Room;
import by.web.task1.bean.SizeOfToy;
import by.web.task1.bean.Toy;

public interface AdminService {
	void addNewRoom(int ageType);
	void addNewToy(SizeOfToy size, int price);
	void deleteRoom(Room room);
	void deleteToy(Toy toy);
}
