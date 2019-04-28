package by.web.task1.bean;

public class Toy {
	private SizeOfToy size;
	private TypeOfToy type;
	/**
	 * @param size
	 * @param type
	 */
	public Toy(SizeOfToy size, TypeOfToy type) {
		this.size = size;
		this.type = type;
	}
	
	
	
	
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		if (size != other.size)
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Toy [size=");
		builder.append(size);
		builder.append(", type=");
		builder.append(type);
		builder.append("]");
		return builder.toString();
	}

	
	
}
