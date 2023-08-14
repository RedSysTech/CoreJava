package separators;

import java.util.ArrayList;
import java.util.List;

/*
 * 	WHAT ARE SEPARATORS IN JAVA?
 * 
 * Separators :- are the symbols used to define the structure of a Java Program
 * 
 * 		.       -> to refer a field or methods
 * 	
 * 		,		-> to separate the args in a method signature
 * 
 * 		;		-> used in for loops and in the statements
 * 
 * 		()		-> condition checks, method signatures
 * 
 * 		{}		-> to define the blocks and Arrays
 * 
 * 		[]		-> to define Arrays and it's values
 * 
 * 		<>		-> to pass the parameters
 * 
 * 		:		-> used in for loops
 * 
 */

public class Separators {

	public static void main(String[] args) {
		
		System.out.println();
	}
	
	void testing(int a, int b) {
		
		for(int i=0;i<10;i++) {
			
			
			if(true) {
				System.out.println("true..");
			}
		}
		
		String[] cars = {"Audi", "BMW"};
		System.out.println(cars[0]);
		
		List <String> l = new ArrayList();
		
		
		for(String s:cars) {
			
		}
	}

}
