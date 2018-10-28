package methods;

import greetings.Greetings;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		System.out.println(utils.add(1, 2));
		utils.printData("Hello world");
		utils.printData(100);
		Greetings greet =  new Greetings();
		greet.greet("world");
	}

}
