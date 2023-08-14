package LambdaAndFunctionalInterface;

/*
 * Lambda:
 * ------
 * 
 * What is Lambda? - it's anonymous function - NO NAME, NO RETURN TYPE, NO SPECIFIER
 * 
 * Why Lambda? - To simply the code which increases the code readability, maintainability
 * 
 * How to write Lambda expression? - by using "->"
 * 
 * 
 * How to link a functional interface with Lambda?
 *  -- a functional interface can be used to hold the lambda expression
 *  
 * How lambda and functional interface works together? - the below program.
 * 
 * 
 */
public class LambdaDemo {

	public static void main(String[] args) {
		
		//MyImpl i = new MyImpl(); OR
		
		MyInterface i = new MyImpl(); // here interface is holding the object of it's impl class.
		i.mt1();
		
		MyInterface j = () -> System.out.println("this is my mt1 by Lambda function...");
		j.mt1();
	}

}


