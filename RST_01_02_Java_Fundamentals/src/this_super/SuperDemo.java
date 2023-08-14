package this_super;
/*
 * Agenda:-
 * -------
 * 
 * 1. What is "super" keyword in Java? 
 *  Ans:- to refer the parent class instance variables
 * 
 * 2. Why do we need to use "super" keyword in Java? 
 * 	Ans:- in case of inheritance, if i want to refer the parent class reference, i need to use "super"
 * 
 * 3. "super" keyword with respect to variables and methods?
 *  Ans:- "super" keyword can be used to refer the parent class instance variables.
 *  	  "super" keyword can be used to refer the parent class methods.
 * 
 * 
 */


class P{
	String name = "Red"; // instance variable
	
	void testing() {
		System.out.println("inside testing from class P");
	}
}


class C extends P{
	
	String name = "RedSysTech"; // instance variable
	
	void m1() {
		System.out.println("name: "+name);
		System.out.println("name from parent class is: "+super.name);
		super.testing();
	}
	
}

public class SuperDemo {

	public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		
	}

}
