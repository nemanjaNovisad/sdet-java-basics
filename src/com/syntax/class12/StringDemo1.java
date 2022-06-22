package com.syntax.class12;

public class StringDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String name = new String("Nemanja");
//		String name2 = "Nemanja";
//		
//		//all classes in java can be treated as data types
//		//if a class is present inside the same package or if a class belongs to java.lan package
//		
//		System.out.println(name.length());
		
		
		
		
		String firstName = "Adem";
		String lastName = " Jones";
		String fullName = firstName + lastName; //always always prefer this
		String fullName2 = firstName.concat(lastName); //never use this because it can lead you to nullpointer exception
		
		System.out.println(fullName2);
		System.out.println(fullName);
		
		String name = "";
		System.out.println(name.isEmpty());
		//System.out.println(name.isBlank()); //it doesn't work in older version of eclipse
		
		String str = " never ";
		System.out.println(str.trim()); //it removes spaces only before and after 'never'
		
		
	}

}
