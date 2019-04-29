package by.web.task1.bean;

import java.util.List;

public abstract class Room {
	private List <? extends Toy> toys;
	private int age;

	
	public Room(int age) {
		this.age = age;
	}


	public List<? extends Toy> getToys() {
		return toys;
	}


	public int getAge() {
		return age;
	}


	public void setToys(List<? extends Toy> toys) {
		this.toys = toys;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [toys=");
		builder.append(toys);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}






}
