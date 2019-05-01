package by.web.task1.bean;

public abstract class Toy {
	private final SizeOfToy size;
	private final Color color;
	private int price;

	public Toy(Color color, SizeOfToy size, int price ) {
		this.color = color;
		this.size = size;
		// this.size = Optional.of(size).isPresent() ? size:SizeOfToy.MIDDLE ;
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public SizeOfToy getSize() {
		return size;
	}
	
	
	public Color getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		Toy other = (Toy) obj;
		if (price != other.price)
			return false;
		if (size != other.size)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Toy [size=");
		builder.append(size);
		builder.append(", price=");
		builder.append(price);
		builder.append("]");
		return builder.toString();
	}
}
