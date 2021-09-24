package lesson1;

import java.util.ArrayList;
import java.util.Collections;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(new Vehicle("Honda", "Camery", 1200));
		vehicles.add(new Vehicle("Toyota", "Wrangler", 2500));
		vehicles.add(new Vehicle("Nissan", "Sunny", 1000));
		vehicles.add(new Vehicle("Volvo", "Wrangler", 25000));
		vehicles.add(new Vehicle("BMW", "I8", 11200));
		vehicles.add(new Vehicle("Peugeot", "GT3008", 30000));
		
		for(Vehicle vehicle : vehicles) {
			System.out.println(vehicle.getName()+" "+vehicle.getVersion()+" "+vehicle.getPrice());
		}
		
		System.out.println("Custom data types sorting");
		Collections.sort(vehicles);
		System.out.println(vehicles);
	}
	

}
