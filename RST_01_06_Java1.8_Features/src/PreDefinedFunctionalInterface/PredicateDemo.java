package PreDefinedFunctionalInterface;

import java.util.function.Predicate;

/*
 * Agenda:-
 * -------
 * 
 * What is Predicate - it's a pre-defined functional interface provided by Oracle team since JDK 1.8
 * 
 * When to use Predicate? - when you want to check any conditions on the objects inside your collections.
 * 
 * How to use? - using test() method which returns the boolean.
 * 
 * 1. Write a prgm to find the given number id ODD / EVEN?
 * 2. Write a prgm to check if the given String's length is > 3 OR not.
 */
public class PredicateDemo {

	public static void main(String[] args) {
		
		Predicate<Integer> p = (i) -> i%2 ==0;
		System.out.println(p.test(3));
		
		Predicate<String> p1 = (s) -> s.length()>3;
		System.out.println(p1.test("RedSysTech"));

	}

}
