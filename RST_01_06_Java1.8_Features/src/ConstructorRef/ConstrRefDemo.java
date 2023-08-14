package ConstructorRef;
/*
 * Agenda:-
 * -------
 * 
 * What is Constructor reference? - it's a way of referring a Constructor (new Object) in the functional interface.. 
 *							if the abstract method inside the functional interface is returning an Object of a class
 *                          then, you can refer it with the help of Constr. ref.
 * 
 * How to use Constructor reference? - using the DOUBLE COLON (::) operator
 * 
 * Syntax: className :: new
 *         
 * Practical Program:- Write a prgm to demonstrate Constructor reference.
 *       
 */
public class ConstrRefDemo {

	public static void main(String[] args) {

		// lambda exp
		Demo d = () -> {
			return new Test();
		};
		
		//constr
		Demo d1 = Test::new;
		
	}
}



interface Demo{
	
	public Test mt1();
}

class MyClass implements Demo{
	// traditional way
	public Test mt1() {
		return new Test();
	}
}

class Test{
	
}


