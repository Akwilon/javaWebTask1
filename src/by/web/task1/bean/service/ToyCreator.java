package by.web.task1.bean.service;

import java.util.Random;

import by.web.task1.bean.SizeOfToy;
import by.web.task1.bean.Toy;
import by.web.task1.bean.TypeOfToy;

public class ToyCreator {
	Random ran = new Random();
	
	public Toy create() {
		Toy toy = new Toy(randomSize(),randomType());
		return toy;
	}
	
	private SizeOfToy randomSize() {
		int pickSize = ran.nextInt(SizeOfToy.values().length);
		return SizeOfToy.values()[pickSize];
	}
	
	private TypeOfToy randomType() {
		int pickToy = ran.nextInt(TypeOfToy.values().length);
		return TypeOfToy.values()[pickToy];
	}
}
