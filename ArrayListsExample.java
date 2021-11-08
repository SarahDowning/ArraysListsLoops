package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListsExample {
	
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>(); // Don't forget to import lists from java.util
		
	//	ArrayList<String> names2 = new ArrayList<>(); no real difference between the two
		
		names.add("Sarah");
		names.add("Jay");
		names.add("Bailey");
		names.add("Helen");
		names.add("Andrew");
		
		System.out.println(names);
		System.out.println(names.get(1)); //prints out element at given index
		
		names.set(2, "Eeyore");
		System.out.println(names);
		
		names.remove(4); //removes an index
		System.out.println(names);
		
		Collections.sort(names); // sorts by alphabetical order
		System.out.println(names);
		System.out.println(names.size()); // prints the size of the list
		
		// FOR EACH LOOP (enhanced for loop)
		// for each name in names, print out name
		
		for (String name : names) { 
			System.out.println(name);
		}
		
		// REGULAR FOR LOOP
		
		for (int i=0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		
		//swapping/reversing commands etc.
		
		Collections.swap(names, 0, 3); // swaps index 0 and index 3
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		
		//creating lists without new ArrayList<> means means it can't be changed
		//List<String> pets = new ArrayList<> List.of("cat", "dog", "bunny"); 
		//System.out.println(pets);
		
	}

}
