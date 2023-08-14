package interface_demo;

/*
 * Agenda:-
 * 1. Extending an interface?
 * 	Ans:- An interface can extend multiple interface and the class which implements the extended interface
 *   should implement the methods of all the interfaces
 * 
 * 2. How multiple inheritance related to interface in Java?
 * 	Ans:- Interface helps in multiple inheritance
 */

interface A{
	void m1();
}

interface B extends A{ 
	void m2();
}

interface C{
	void m3();
}

class MyApp implements B, C{

	@Override
	public void m1() {
		System.out.println("inside m1");
		
	}

	@Override
	public void m2() {
		System.out.println("inside m2");
		
	}

	@Override
	public void m3() {
		System.out.println("inside m3");
		
	}
	
}

public class IntrefaceExtendDemo {

	public static void main(String[] args) {
		
		MyApp obj = new MyApp();
		obj.m1();
		obj.m2();
		obj.m3();
	}

}
