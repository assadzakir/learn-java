package java_basics;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double [] array = new double[100];
		
		array[0] = 100;
		array[1] = 100;
		array[99] = 100.5;
		
		System.out.println(array[0]); // 100.0
		
		String [] words = new String[] {"Hello", "World"};
		
		System.out.println(words[0]); // Hello
		
		words = new String[2];
		
		System.out.println(words[0]); // null

		


		

	}

}
