import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		// int [] words = new Array[10];   Array declaration 
		ArrayList<String> words = new ArrayList<String>();
		words.add("Hello");
		words.add("world");
		//words.add(10);
		//words.add(9);
		//words.add(12.45);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(9);
		
		String item1 = (String) words.get(0);
		System.out.println(item1);
		
		for(int number: numbers) {
			System.out.println(number);
		}
	}

}
