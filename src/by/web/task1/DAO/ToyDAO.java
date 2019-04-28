package by.web.task1.DAO;

import java.util.List;

import by.web.task1.DAO.service.ToySpecification;
import by.web.task1.bean.Toy;

public interface ToyDAO {
	void addToy(Toy toy);
	void deleteToy (Toy toy);
	void udpateToy (Toy toy);
	
	List query(ToySpecification specification);
}
