package by.web.task1.bean;

import java.util.List;

public class Room {
	private int price;
	private List <Toy> toys;
	private int age;

	
	public Room(int price, int age) {
		this.price = price;
		this.age = age;
	}
	

	public int getPrice() {
		return price;
	}


	public List<Toy> getToys() {
		return toys;
	}


	public int getAge() {
		return age;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public void setToys(List<Toy> toys) {
		this.toys = toys;
	}


	public void setAge(int age) {
		this.age = age;
	}





	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [price=");
		builder.append(price);
		builder.append(", toys=");
		builder.append(toys);
		builder.append(", age=");
		builder.append(age);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + price;
		result = prime * result + ((toys == null) ? 0 : toys.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		if (age != other.age)
			return false;
		if (price != other.price)
			return false;
		if (toys == null) {
			if (other.toys != null)
				return false;
		} else if (!toys.equals(other.toys))
			return false;
		return true;
	}
	
	
	
}
