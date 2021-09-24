package lesson3;
import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("name", "Madusanka");
		dictionary.put("school", "Ananda College");
		dictionary.put("address", "168/B, Oruthota, Gampaha");
		dictionary.put("gf", "none");
		
//		for(String word: dictionary.values()) {
//			System.out.println(word);
//		}
		
		for(Map.Entry<String, String> entry: dictionary.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
		
	}

}
