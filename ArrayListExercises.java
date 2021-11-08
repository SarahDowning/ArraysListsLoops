package com.qa.helloworld;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercises {

	public static void main(String[] args) {

		List<String> animals = new ArrayList<>();
		List<Integer> animalAge = new ArrayList<>();
		
		//adding elements
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Rabbit");
		animals.add("Hamster");
		animals.add("Ferret");
		
		animalAge.add(3);
		animalAge.add(5);
		animalAge.add(1);
		animalAge.add(2);
		animalAge.add(4);

		//printing the array list
		System.out.println(animals);

		//regular for loop
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		
		//enhanced for loop
		for (String animal : animals) {
			System.out.println(animal);

		}
		
		//getting specific elements .get
		System.out.println(animals.get(2));
		System.out.println(animals.get(0));
		
		//setting different elements .set
		animals.set(0, "Doggos");
		System.out.println(animals);
		
		//removing an element .remove
		animals.remove(4); //removes ferret
		System.out.println(animals);
		
		//sorting the array list
		Collections.sort(animals);
		System.out.println(animals);
		
		System.out.println(animalAge);
		Collections.sort(animalAge);
		System.out.println(animalAge);
		
		Collections.reverse(animalAge);
		System.out.println(animalAge);
		
		Collections.swap(animals, 2, 3);
		System.out.println(animals);
	}
}
