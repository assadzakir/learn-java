package methods;

import greetings.Greetings;

public class Methods {

	public static void main(String[] args) {
		
//		Java Identifiers
//		All Java components require names. Names used for classes, variables, and methods are called identifiers.
//
//		In Java, there are several points to remember about identifiers. They are as follows −
//
//		All identifiers should begin with a letter (A to Z or a to z), currency character ($) or an underscore (_).
//
//		After the first character, identifiers can have any combination of characters.
//
//		A key word cannot be used as an identifier.
//
//		Most importantly, identifiers are case sensitive.
//
//		Examples of legal identifiers: age, $salary, _value, __1_value.
//
//		Examples of illegal identifiers: 123abc, -salary.
//
//		Java Modifiers
//		Like other languages, it is possible to modify classes, methods, etc., by using modifiers. There are two categories of modifiers −
//
//		Access Modifiers − default, public , protected, private
//
//		Non-access Modifiers − final, abstract, strictfp

		// TODO Auto-generated method stub
		System.out.println("Hello world"); // Hello world
		System.out.println(utils.add(1, 2)); // 3
		utils.printData("Hello world"); // String Hello world
		utils.printData(100); // Number 100
		Greetings greet =  new Greetings();
		greet.greet("world"); // Hello world
	}

}
