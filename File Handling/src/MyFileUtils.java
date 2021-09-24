
public class MyFileUtils {
	public static  int substract10FromLargeNumber(int number) throws Exception {
		if(number < 10) {
			throw new Exception("The entered number is less than 10");
		}
		return number - 10;
	}
}
