package constructor_overloading_overriding;

/* Agenda:-
 * -------
 * 1. What is Constructor overloading?
 * 2. What is Constructor overriding? -> NOT APPLICABLE
 */

class Parent{
	
	Parent(){
		
	}
	
	void m1() {
		System.out.println("inside m1");
	}
}

public class Child extends Parent{

	Child(int x){
		
	}
	
	Child(){
		
	}


	public static void main(String [] args) {
		
		Child c = new Child();
		c.m1();
		
	
	}
}
