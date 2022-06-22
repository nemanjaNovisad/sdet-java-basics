package com.syntax.class11;

public class Dog {

	// atributes how the object will look like

	String name;
	int age;
	double weight;
	String color;
	double height;
	String breed;

	// how the object behave

	void bark() {
		System.out.println("Dog barks");
	}

	void walks() {
		System.out.println("Dog walks");
	}

	void eat() {
		System.out.println("Dog like to eat bone");
	}

	public static void main(String[] args) {

		Dog loki = new Dog(); // creating an object and storing in a variable
		loki.name = "Loki";
		loki.age = 9;
		loki.weight = 45;
		loki.color = "Brown";
		loki.height = 2.6;
		loki.breed = "Boxer";
		loki.bark();

	}

}
