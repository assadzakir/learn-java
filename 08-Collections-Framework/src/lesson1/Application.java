package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Example 1
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("dog");
		animals.add("lion");
		animals.add("tiger");
		
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		System.out.println("```````````````````````````````````");
		
		for(String animal: animals) {
			System.out.println(animal);
		}
		
		System.out.println("```````````````````````````````````");
		
		
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		vehicles.add(new Vehicle("Honda", "2018 modal", 500000));
		vehicles.add(new Vehicle("Suzuki", "2018 modal", 200000));
		vehicles.add(new Vehicle("Civic", "2018 modal", 300000));
		vehicles.add(new Vehicle("Yamaha", "2018 modal", 400000));
		
//		for(Vehicle car: vehicles) {
//			System.out.println(car);
//		}

		printElements(vehicles);



	}
	
	public static void printElements(List someList) {
	for (int i = 0; i < someList.size(); i++) {
		System.out.println(someList.get(i));
	}
	
}

}
