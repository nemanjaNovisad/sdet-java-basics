package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {

		// from a String get the part which starts from the symbol # and ends at the
		// symbol #

		// substring starting point and everything after (2) -> or starting and ending
		// point (0,6)

		String str = "I am #Confused#";
		System.out.println(str.substring(5));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2, 4));
		System.out.println(str.substring(0, 1));

		str = "Ashar is great";
		System.out.println(str.substring(0, 6));

	}

}
