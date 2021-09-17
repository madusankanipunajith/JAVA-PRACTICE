
public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicle_1 = new Vehicle("BMW I8", "purple", 1600.99);
		Vehicle vehicle_2 = new Vehicle("Toyota V8", "White", 5000.00);
		Customer cust_1 = new Customer("Pathum Chiratha", "168/A, Oruthota, Gampaha", 16000);
		Employee emp_1 = new Employee("Madusanka", 1100);
		
		boolean value = vehicle_1.equals(vehicle_2);
		System.out.println(value);
		
		cust_1.purchaseCar(vehicle_1, emp_1, false);
	}
	
}
