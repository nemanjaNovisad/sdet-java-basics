package com.syntax.class09;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		for(int i=1; i<=5;i++) {
//		continue;
//		System.out.println(“Hello”);
//		break;
//		}
		//	unreachable code
		// The loop will run 5 times but it will never print Hello

	
	
	// Continue we use to skip a specific iteration in the loop
	
	// Break we use to “stop” the loop or exit it
	
	/*
			for(int i=1; i<=5;i++) {
			break;
			System.out.println(“Hello”);
			}
	*/
	
	//				 NESTED LOOPS
	
	
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			for(int y=1;y<=3; y++) {
				System.out.println("Bye");
			}
		}
	System.out.println(".");
		
		for(int i=1; i<=5; i++) {
			System.out.println("Hello");
			for(int y=1;y<=3; y++) {
				System.out.println("Bye");
				break;
			}
			
		}
	
	/*	for(int i=1; i<=5; i++) {
			System.out.println(“Hello”);
			for(int y=1;y<=3; y--) {
				System.out.println(“Bye”); //infinite inner loop
					
					// Output is 1 Hello, infinite Bye
				}
			}
	 */
		
		// Outer loop controls the complete number of iterations for the inner loop
		// Inner loop executes x number of times within each iteration-> number of times defined by condition of inner loop
		
	/*		System.out.println(“Hello”); // infinite outer loop
			for(int y=1;y<=3; y++) {
				System.out.println(“Bye”);
	
				}
			}
		
	*/
	}

}
