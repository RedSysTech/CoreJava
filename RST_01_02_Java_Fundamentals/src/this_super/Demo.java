package this_super;
/*
 * Agenda:-
 * -------
 * 
 * 1. What is "this" keyword in Java? 
 *  Ans:- to refer a current class instance variables
 * 
 * 2. Why do we need to use "this" keyword in Java? 
 * 	Ans:- in case of inheritance, if i want to refer the current class reference, i need to use "this"
 * 
 * 3. Where can't we use "this" keyword?
 *  Ans:- Except static area, we can use "this" keyword because static is no where related to object.
 * 
 * 
 */

class Parent{
	
	String name = "Red"; // instance variable
}

class Child extends Parent{
	
	String name = "RedSysTech"; // instance variable
	
	int x,y;
	
	 void m1() {
		System.out.println("name: "+name);
		System.out.println("name using this keyword: "+this.name);
	}
	 
	 void m2(int x, int y) {
		this.x = x;
		this.y=y;
		 
	 }
}

public class Demo {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.m1();
		
		c.m2(10, 20);
		System.out.println(c.x);
		System.out.println(c.y);
	}

}
