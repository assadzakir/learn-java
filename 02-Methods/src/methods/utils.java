package methods;

public class utils {

	public static int add(int a, int b) {
		return utils.addTwo(a, b);
	}
	
	public static void printData(String data) {
		System.out.println("String " + data);
	}
	
	public static void printData(int data) {
		System.out.println("Number " + data);
	}
	
	private static int addTwo(int first, int second) {
		return first+second;
	}
}
