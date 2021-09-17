
public class Vehicle {
	
	private String name;
	private String color;
	private double price;
	private boolean selledOut = false;
	
	
	
	public Vehicle(String name, String color, double price) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setSelledOut(boolean selledOut) {
		this.selledOut = selledOut;
	}
	
	
	public String getName() {
		return this.name;
	}
	public String getColor() {
		return this.color;
	}
	public double getPrice() {
		return this.price;
	}
	public boolean getSelledOut() {
		return this.selledOut;
	}
}
