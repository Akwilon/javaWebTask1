package by.web.task1.bean;

import java.util.List;

public abstract class Room {
	private List <? extends Toy> toys;
	private int maxAge;

	
	public Room(int maxAge) {
		this.maxAge = maxAge;
	}


	public List<? extends Toy> getToys() {
		return toys;
	}


	public int getMaxAge() {
		return maxAge;
	}


	public void setToys(List<? extends Toy> toys) {
		this.toys = toys;
	}


	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [toys=");
		builder.append(toys);
		builder.append(", maxAge=");
		builder.append(maxAge);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
