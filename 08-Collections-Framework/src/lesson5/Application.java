package lesson5;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ref
		 * 
		 * https://beginnersbook.com/2013/12/hashmap-in-java-with-example/
		 * 
		 * */
		// Example 1

		HashMap<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary.put("Brilliant", "exceptionally clever or talented.");
		dictionary.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary.put("Confidence", "the feeling or belief that one can rely on someone or something; firm trust.");

		for (String key : dictionary.keySet()) {
			System.out.println("[" + key + "] " + dictionary.get(key));
		}

		System.out.println("-------------------");
		
		//Example 2
		
		// LinkedHashMap is maintain ordering
		LinkedHashMap<String, String> dictionary1 = new LinkedHashMap<String, String>();
		dictionary1.put("Brave", "ready to face and endure danger or pain; showing courage.");
		dictionary1.put("Brilliant", "exceptionally clever or talented.");
		dictionary1.put("Joy", "a feeling of great pleasure and happiness.");
		dictionary1.put("Confidence", "the feeling or belief that one can rely on someone or something; firm trust.");
		
		for (String key : dictionary1.keySet()) {
			System.out.println("[" + key + "] " + dictionary1.get(key));
		}
		
		System.out.println("-------------------");
		
		//Mapping on both key and value
		for ( Map.Entry<String,String> entry : dictionary1.entrySet() ) {
			System.out.println( "[" + entry.getKey() + " : " + entry.getValue() + "]" );
		}
		
		//Example 3
		
		// TreeMap stores info in natural order
		
		TreeMap<String, String> treeMap = new TreeMap<>();
		treeMap.put("Dog", "4");
		treeMap.put("Banana", "2");
		treeMap.put("Cat", "3");
		treeMap.put("Apple", "1");
		
		treeMap.put("Banana", "2333");
		
		for (Map.Entry<String, String> entry: treeMap.entrySet() ) {
			System.out.println(entry.getKey() +  " : " + entry.getValue());
		}

		
	}

}
