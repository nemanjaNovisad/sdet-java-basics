package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "kat";
		String name2 = "kat";

		System.out.println(name.equals(name2));
		name2 = "KAT";
		System.out.println(name.equalsIgnoreCase(name2));

		String userName = "admin";
		String password = "password456";
		String confirmPassword = "password456";

		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else if (password.length() < 8) {
			System.out.println("Password is too short");
		} else if (password.contains(userName)) {
			System.out.println("Password cannot contain username");
		} else if (!confirmPassword.equals(password)) {
			System.out.println("Passwords do not match");
		} else {
			System.out.println("Your username and password has been created");
		}

	}

}

//
//Asghar(Instructor)  12:59 PM
//Store username, password and confirm password from a user and check following requirements:
//Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
//Password should be minimum 8 characters, if less → message=”Password is too short”.
//Password cannot contain username if so, → message=”Password cannot contain username”.
//Password should match confirmed password, if not  → message=“Passwords do not match”.
//Only after all requirements met → message “Your username and password has been created”