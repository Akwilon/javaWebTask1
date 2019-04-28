package by.web.task1.bean;

public class Child {
	private int years;
	private int money;
	private char sex;
	
	
	
	public Child(int years, int money, char sex) {
		this.years = years;
		this.money = money;
		this.sex = sex;
	}


	public int getYears() {
		return years;
	}
	
	
	public int getMoney() {
		return money;
	}
	
	
	public char getSex() {
		return sex;
	}
	
	
	public void setYears(int years) {
		this.years = years;
	}
	
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	public void setSex(char sex) {
		this.sex = sex;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + sex;
		result = prime * result + years;
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
		Child other = (Child) obj;
		if (money != other.money)
			return false;
		if (sex != other.sex)
			return false;
		if (years != other.years)
			return false;
		return true;
	}
	
	
}
