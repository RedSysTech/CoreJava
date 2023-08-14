package interface_demo;
/*
 * Agenda:-
 * ------
 * 1. What is an interface in Java?
 * 	Ans:- Service requirement specification. 
 * 		  It's a contract/agreement b/w client and the service provider
 * 		eg: same java app run on Tomcat, weblogic, websphere etc.,,
 * 		Eg: Servlet API specification given by SUN microsystems tells which class and methods should be used.
 * 		Eg: JDBC API for DB Driver
 * 
 * 2. What does an interface contains in Java?
 * 	Ans:- Only the specification but not the implementation, and hence every methods are abstract by def.
 *    From 1.9 onwards, private methods are allowed inside interface...
 * 
 * 3. Why do we need to use Interface?
 * 	Ans:- Multiple inheritance is not supported in Java but we can implement multiple interface
 * 
 * 4. Types of interfaces?
 * 	Ans:- Marker -> without any methods
 * 		  Functional interface -> has only 1 abstract method (java 1.8 onwards)
 * 
 * 
 * Which is better to use? Interface or Class?
 *  Ans:- Depends on the use case. Interface is better because you can implement > 1 interface but can't 
 *        extend >1 class.
 * 
 * 5. What is @Override anotation in java?
 * 	Ans:- It's a methadata tells compiler that the given method is overriden in the implementation class.
 * 
 */


interface Bank{
	
	void printStatement();
	
	void displayStatement();
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		Bank mb = new Bank() {
			@Override
			public void displayStatement() {
				System.out.println("inside display");
				
			}
			
			@Override
			public void printStatement() {
				System.out.println("inside print");
				
			}
		};
		
		
		mb.displayStatement();
		mb.printStatement();

	}
}
