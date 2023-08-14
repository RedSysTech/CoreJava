package nested_class;
/*
 * Agenda:-
 * ------
 * 1. What are Nested classes in Java?
 * 2. How to write a nested class in Java?
 * 3. How to access the nested class members in Java?
 * 4. Types of Nested class in Java?
 * 		Ans:- Static & Non-Static (member inner, local inner, anonymous inner)
 */


public class Outer {
	
	int x=10;

	class NestedClass{
		
		int y =20;
	}

	public static void main(String[] args) {
		
		Outer o = new Outer();
		System.out.println(o.x);

		Outer.NestedClass n = new Outer().new NestedClass();
		System.out.println(n.y);
	}

}
