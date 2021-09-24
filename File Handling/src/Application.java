import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner input = new Scanner(System.in);
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
//		
//		input.close();
		
		
		try {
			File file = new File("myfile.txt");
			Scanner input = new Scanner(file);
			while(input.hasNextLine()) {
				String line = input.nextLine();
				System.out.println(line);
			}
			input.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found...");
		}
		
		try {
			
			int answer = MyFileUtils.substract10FromLargeNumber(15);
			System.out.println(answer);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
