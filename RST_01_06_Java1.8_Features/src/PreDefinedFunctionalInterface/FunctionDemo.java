package PreDefinedFunctionalInterface;

import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Agenda:-
 * -------
 * 
 * What is Function - it's a pre-defined functional interface provided by Oracle team since JDK 1.8
 * 
 * When to use Function? - when you want to perform some operation on the given input
 * and expects its output.
 * 
 * 
 * How to use? - using apply() method which returns the same object type as i/p.
 * 
 * 1. Write a prgm to add 150 to the given number during the run time
 * 2. Write a prgm to frame the firstName as FirstName - FirstName.
 */
public class FunctionDemo {

	public static void main(String[] args) {
		
		Function<Integer, Integer> f = (i) -> 150+i;
		System.out.println(f.apply(200));
		
		Function<String, String> f2 = (s) -> s+" - "+s;
		System.out.println(f2.apply("RedSysTech"));

	}

}
