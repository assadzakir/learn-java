package lesson3;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*   Points to Note about HashSet:

			-1 HashSet doesn’t maintain any order, the elements would be returned in any random order.
			
			-2 HashSet doesn’t allow duplicates. 
			If you try to add a duplicate element in HashSet,
			 the old value would be overwritten.
			 
			-3 HashSet allows null values however if you insert more than one nulls it would still return only one null value.
			
			-4 HashSet is non-synchronized.
			
			-5 The iterator returned by this class is fail-fast 
			which means iterator would throw ConcurrentModificationException 
			if HashSet has been modified after creation of iterator, 
			by any means except iterator’s own remove method.
			
			
			
			
			# HashSet doesn’t maintain any kind of order of its elements.
			
			# TreeSet sorts the elements in ascending order.
			
			# LinkedHashSet maintains the insertion order.
			 Elements gets sorted in the same sequence in 
			which they have been added to the Set.
			
			*/	
		LinkedHashSet<Integer> values = new LinkedHashSet<>(); 
		
		values.add(12);
		values.add(43);
		values.add(15);
		values.add(67);
		values.add(43);
		values.add(33);

		for (Integer value : values) {
			System.out.println(value);
		}
		
		System.out.println("---------------------------");
		
		HashSet<Animal> animals = new HashSet<>();
		
		Animal animal1 = new Animal("Dog", 12);
		Animal animal2 = new Animal("Cat", 8);
		Animal animal3 = new Animal("Bird", 3);
		Animal animal4 = new Animal("Dog", 12);
		Animal animal5 = new Animal("Kangaroo", 24);
		
		animals.add(animal1);
		animals.add(animal2);
		animals.add(animal3);
		animals.add(animal4);
		animals.add(animal5);
		
		System.out.println(animal1.hashCode()); 
		System.out.println(animal4.hashCode());
		
		for (Animal animal : animals) {
			System.out.println(animal);
		}

	}

}
