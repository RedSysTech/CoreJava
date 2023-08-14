package this_super;

/*
 * Agenda:-
 * ------
 * 
 * 1. What is super() used for in Java?
 *   Ans:- If i want to call parent class's constructor, i have to use super()
 *   
 * 2. What is this() used for in Java?
 *   Ans:- If i want to call current class's constructor, i have to use this()
 *   
 * 3. Rules to use this() and super()?
 * 	Ans:- always be first line inside the constructor
 *        always should be inside the constructor (not inside methods)
 *        can't use both simultaneously
 *        
 *        
 */

class Vehicle{
	
	Vehicle(){
		System.out.println("inside def-constr from Vehicle");
	}
}

class Car extends Vehicle{
	
	Car(){
		super();
	
		System.out.println("inside def-constr from Car");
	}
	
	Car(String name){
		this();
	
		System.out.println("inside Custom-constr from Car");
	}
}

public class SuperThisConstructor {

	
	public static void main(String[] args) {
		
		Car c = new Car("AUDI");
		
		
	}

}
