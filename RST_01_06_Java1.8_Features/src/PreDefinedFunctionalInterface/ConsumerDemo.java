package PreDefinedFunctionalInterface;

import java.util.Date;
import java.util.function.Consumer;

/*
 * Agenda:-
 * ------
 * 
 * What is consumer? - it's a pre-defined functional interface provided by Oracle team since JDK 1.8
 * 
 * When we should go for? -  When you want to pass some inputs and didn't expects the outputs.
 *		Eg: to store the data in the database
 *
 * How to use it? - using accept() method
 *
 * Practical prgm:- Write an program to write the data into the 
 *                  System out println statements with the current date and time.
 * 
 *         I/P --> NO return data
 * 
 */
public class ConsumerDemo {

	public static void main(String[] args) {
		
		Consumer<String> c = (s) -> System.out.println("the log is -->"+s+" the current date is --> "+new Date());
		c.accept("RedSysTech");
	}

}
