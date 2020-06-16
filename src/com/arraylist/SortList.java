package com.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortList {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");
		Collections.sort(fruits);
		System.out.println("List of fruits:");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println("After removing Banana from list:");
		fruits.remove("Banana");
		for (String str : fruits) {
			System.out.println(str);
			
		}
		Collections.sort(fruits, Collections.reverseOrder());
		System.out.println("reverse order " + fruits);
	}

}
