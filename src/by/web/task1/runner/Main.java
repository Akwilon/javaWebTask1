package by.web.task1.runner;

import java.util.ArrayList;
import java.util.List;

import by.web.task1.bean.Room;
import by.web.task1.bean.Toy;
import by.web.task1.bean.service.ToyCreator;

public class Main {

	public static void main(String[] args) {
		List<Toy> toys = new ArrayList<Toy>();
		for(int i = 0; i < 5; i++) {
		toys.add(new ToyCreator().create());
		}
		
		Room room = new Room(55,15);
		room.setToys(toys);
		System.out.println(room);
	}

}
