package parent_child_class;
/*
 * Agenda:-
 * -------
 * 1. Need for parent and child class? 
 * 	Ans:- to achieve Inheritance (where one class acquires the members (methods and fields) of another)
 * 
 * 2. Parent class?
 * 	Ans:- class whose properties are inherited
 * 
 * 3. Child class?
 * 	Ans:- class which inherits the properties of other class
 * 
 */

class Parent{
	
	int rollNo;
	
	void display() {
		System.out.println("inside display method from parent...");
	}
}

public class Child extends Parent{

	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}

}
