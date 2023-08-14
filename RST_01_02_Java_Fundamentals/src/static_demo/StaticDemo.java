package static_demo;

/*
 * 
 * static keyword:
 * 	- is mainly used for memory management
 *  - used for a constant variable or a method that is same for every instance of a class.
 *  
 *  1. variables
 *  2. methods
 *  3. blocks 
 *  4. nested classes 
 *  
 */
public class StaticDemo {

	// static variable (a single copy of the variable is created and divided among all objects at the class level. )
	static int i = m1();
	 
	
	// static block (gets executed exactly once, when the class is first loaded.)
	static {
		System.out.println("Inside the static block");
	}
	
	
	// static method
	static int m1() {
		System.out.println("called from i ");
		return 10;
	}
	 
	// static method(main !!)
	public static void main(String[] args)
	{
		System.out.println("Value of i : "+i);
		System.out.println("Inside main method");
		
		StaticDemo.InnerClass obj = new StaticDemo.InnerClass();
		obj.disp();
	}
				
	//Static class
	static class InnerClass{
		private static String str= "RedSysTech";
		
			//non-static method
			public void disp(){
					System.out.println("Displaying from Static Nested class:- "+str);
			}
	}
}
