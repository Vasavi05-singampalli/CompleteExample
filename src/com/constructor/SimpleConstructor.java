package com.constructor;

public class SimpleConstructor {

	String name;

	// Constructor
	SimpleConstructor() {
		this.name = "NaveensBook.com";
	}

	public static void main(String[] args) {
		SimpleConstructor obj = new SimpleConstructor();
		System.out.println(obj.name);
	}

}
