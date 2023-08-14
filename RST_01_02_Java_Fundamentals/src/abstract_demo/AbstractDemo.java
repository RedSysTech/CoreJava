package abstract_demo;
/*
 * Agenda:-
 * ------
 * 
 * 1. What is Abstract method?
 * 	Ans:- A method with only declaration but no implementation
 * 
 * 2. What is Abstract class?
 * 	Ans:- Any class with atleast one abstract method
 * 		  It can have both abstract and normal/concrete methods
 * 		  Implementation is written in sub class
 * 			Object can't be created
 * 
 * 3. When we should go for Abstract class?
 * Ans:- Partial requirement is ready
 */

abstract class Vehicle{
	
	abstract void start();
	
	void driving() {
		System.out.println("inside driving");
	}
}

class Car extends Vehicle{

	@Override
	void start() {
		System.out.println("inside start...");
		
	}
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.driving();
		c.start();
	}

}
