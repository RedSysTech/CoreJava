package abstract_demo;

/*
 * Agenda:-
 * ------
 * 
 *  Interface vs Abstract class
 * 
 * Interface:-
 * 		1. If i don't know anything about the  implementation
 * 		2. Every method should be public & abstract until java 1.8. 
 *         We can have private method in interface from java 1.9 onwards.
 *      3. Can't declare interface methods with protected, final, static, synchronized, native, strictfp
 *      4. Every variable should be public, static and final
 *      5. Interface variables can't be protected, transient, volatile
 *      6. Compulsory to initialize the variables else compile time error.
 *      7. Can't declare constructors inside the interface
 * 
 * Abstract class:-
 * 		1. If i know the partial implementation
 * 		2. It can have Abstract and concrete methods, but should have atleast one abstract method.
 * 		3. No restriction for abstract class method modifiers
 * 		4. Not mandatory for Every variable should be public, static and final
 * 		5. No restriction for abstract class variable modifiers
 * 		6. No restriction initialize the variables 
 * 		7. Can declare constructors inside the abstract class
 * 
 * 
 */
public class AbstractClass_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
