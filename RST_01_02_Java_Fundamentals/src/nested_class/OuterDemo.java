package nested_class;

/*
 * Agenda:-
 * 
 * 1. What are Static Nested Class in Java?
 * 
 * 2. How to create Objects for Static Nested Class in Java?
 */
public class OuterDemo {

	int x=10;

	static class StaticNestedClass{
		int y=20;
	}
	
	public static void main(String[] args) {
		
		OuterDemo o = new OuterDemo();
		System.out.println(o.x);
	
		OuterDemo.StaticNestedClass snc = new OuterDemo.StaticNestedClass();
		System.out.println(snc.y);
	}
}
