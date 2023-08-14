package FunctionalInterface;
/*
 * Functional Interface:
 * --------------------
 * 
 * What? - an interface which has Exactly only 1 abstract method in it. 
 * 		   No restrictions on the no. of default or static methods in it.
 *         The restriction is only for the no. of abstract method.
 * 
 * Why? - this is used to call the lambda functions
 * 
 * How? - we can define a functional interface by @FunctionalInterface.
 * 
 * @FunctionalInterface? - to tell compiler to check if the interface has more than 1 abstract method,
 * 						   then throw the compile time error.
 * 
 * 
 */
@FunctionalInterface
public interface MyInterface {

	void mt1(); // 1st abstract method
	
	//public abstract void mt2(); // 2nd abstract method
	
	default void mt3() {
		
	}	
	
	static void mt4() {
		
	}
}




