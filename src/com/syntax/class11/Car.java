package com.syntax.class11;

public class Car {

	
	String model;
	String make;
	String color;
	int year;
	String typeOfEngine;
	int hp;
	
	void moveForward () { System.out.println("Car is moving forward");}
	void reverse () {System.out.println("Car is moving backwards");};
	
	
	
	public static void main(String[] args) {
		
		Car bmw = new Car();
		bmw.model = "x5";
		bmw.make = "BMW";
		bmw.color = "Black";
		bmw.year = 2022;
		bmw.typeOfEngine = "V8";
		bmw.hp = 500;
		System.out.println(bmw.model);
		bmw.moveForward();
		bmw.reverse();
		
		Car mazda = new Car();
		mazda.model = "CX5";
		mazda.make = "MAZDA";
		mazda.color = "White";
		mazda.year = 2018;
		mazda.typeOfEngine = "V8";
		mazda.hp = 500;
		mazda.moveForward();
		mazda.reverse();
		
		
		

	}

}
