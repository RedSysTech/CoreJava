package PreDefinedFunctionalInterface;

import java.util.function.Supplier;

/*
 * Agenda:-
 * ------
 * 
 * What is Supplier? - it's a pre-defined functional interface provided by Oracle team since JDK 1.8
 * 
 * When we should go for? -  When you DON'T want to pass any inputs BUT expects the outputs.
 *							 It's exactly opposite to the Consumer
 *
 * How to use it? - using get() method
 *
 * Practical prgm:- Write an program to generate some random number.
 * 
 *         NO I/P data --> but returns/generates data
 * 
 */
public class SupplierDemo {

	public static void main(String[] args) {
		
		Supplier<Double> s = () -> Math.random();
		System.out.println(s.get());
	}

}
