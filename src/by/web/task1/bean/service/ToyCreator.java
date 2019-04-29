package by.web.task1.bean.service;

import java.util.Random;

import by.web.task1.bean.SizeOfToy;
import by.web.task1.bean.Toy;
import by.web.task1.bean.toy.Ball;

public class ToyCreator {
	Random ran = new Random();
	
	public Toy create() {
		Toy toy = new Ball(randomSize(),randomPrice());
		return toy;
	}
	
	private SizeOfToy randomSize() {
		int pickSize = ran.nextInt(SizeOfToy.values().length);
		return SizeOfToy.values()[pickSize];
	}
	
	private int randomPrice() {
		return ran.nextInt(15);
	}
}
