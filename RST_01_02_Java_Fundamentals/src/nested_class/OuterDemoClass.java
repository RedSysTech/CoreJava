package nested_class;

/*
 * Agenda:-
 * ------
 * 1. What are local inner Nested classes in Java?
 * 2. How to write a local inner nested class in Java?
 * 3. How to access the local inner nested class in Java?
 *
 */
public class OuterDemoClass {

	int x = 10;
	
	 void display() {
		
		class LocalInner{
			int y=20;
		}
		
		LocalInner lic = new LocalInner();
		System.out.println(lic.y);
		
	}
	
	
	public static void main(String[] args) {
		OuterDemoClass o = new OuterDemoClass();
		System.out.println(o.x);
		o.display();
		
	}

}
