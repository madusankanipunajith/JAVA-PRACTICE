package lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Application {
	
	// forEach loop in java
	// List - ArrayList and LinkedList => can have duplicates 
	// Set - HashSet and LinkedHashSet => cannot have duplicates
	// Map - HashMap , LinkedHashMap and TreeMap

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Animal> animals = new HashSet<Animal>();
		animals.add(new Animal("Dog", 12));
		animals.add(new Animal("Cat", 10));
		animals.add(new Animal("Rat", 5));
		animals.add(new Animal("Dog", 12));
		
		for(Animal animal: animals) {
			System.out.println(animal+" "+animal.hashCode());
		}
		
		
		// HashSet and converting to ArrayList
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(12);
		hashSet.add(23);
		hashSet.add(13);
		hashSet.add(10);
		hashSet.add(29);
		
		System.out.println("Hash Set");
		for(int number: hashSet) {
			System.out.println(number);
		}
		
		List<Integer> myList = new ArrayList<Integer>(hashSet);
		System.out.println("Array List");
		for(int number: myList) {
			System.out.println(number);
		}
		System.out.println("Sorted Array List");
		Collections.sort(myList);
		for(int number: myList) {
			System.out.println(number);
		}
		
		
		System.out.println(myList.get(0));
	}

}
