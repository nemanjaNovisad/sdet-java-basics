package com.syntax.class13;

public class Examples {

	public static void main(String[] args) {

		String name = "nemanja lokac";
		System.out.println("Giraffe \nAcademy");
		System.out.println("Giraffe \"Academy\"");

		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		System.out.println(name.contains("j"));
		System.out.println(name.charAt(1));
		System.out.println(name.indexOf("a"));
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 5));
		System.out.println(name.substring(0, name.indexOf(" ")));

	}

}
