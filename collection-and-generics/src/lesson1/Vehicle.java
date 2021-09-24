package lesson1;

public class Vehicle implements Comparable<Vehicle>{
	
	private String name;
	private String version;
	private int price;
	
	
	
	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", version=" + version + ", price=" + price + "]";
	}

	public Vehicle(String name, String version, int price) {
		super();
		this.name = name;
		this.version = version;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Vehicle o) {
		if(this.price < o.price) {
			return -1;
		}
		if(this.price > o.price) {
			return 1;
		}
		return 0;
	}
	
	
	
	
}
