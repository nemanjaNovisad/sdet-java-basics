package com.syntax.class12;

import java.util.Iterator;

public class StringDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String str = "Sameer is funny Sameer is gulbadan and he is sheer badan";
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(5));
		
//		for (int i = 0; i < args.length; i++) {System.out.println(str.charAt[i]));}
			
		
		
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			
			if('s'==str.charAt(i)||'S'==str.charAt(i)||'a'==str.charAt(i)||'A'==str.charAt(i)) {
				counter++;
			}
		}
		System.out.println("Letters 'S' and 'A'  appeared " + counter + " times.");
			
		}

	}


