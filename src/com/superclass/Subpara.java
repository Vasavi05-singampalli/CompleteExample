package com.superclass;

class Superpara {

	// no-arg constructor
	Superpara() {
		System.out.println("no-arg constructor of parent class");
	}

	// arg or parameterized constructor
	Superpara(String str) {
		System.out.println("parameterized constructor of parent class");
	}
}

public class Subpara extends Superpara {
	Subpara() {
		/*
		 * super() must be added to the first statement of constructor otherwise
		 * you will get a compilation error. Another important point to note is
		 * that when we explicitly use super in constructor the compiler doesn't
		 * invoke the parent constructor automatically.
		 */
		super("Hahaha");
		System.out.println("Constructor of child class");

	}

	void display() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Subpara obj = new Subpara();
		obj.display();
	}

}
