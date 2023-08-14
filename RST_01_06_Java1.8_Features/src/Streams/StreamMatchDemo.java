package Streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/*
 * allMatch(Predicate p) - returns whether ALL elements of this stream 
 * 						   match the provided predicate.
 * 
 * anyMatch(Predicate p) - returns whether ANY elements of this stream 
 * 						   match the provided predicate.
 * 
 * noneMatch(Predicate p) - returns whether NONE of the elements of this stream 
 * 						   match the provided predicate.
 * 
 * Practical coding:- Use the given elements to demonstrate the allMatch, anyMatch and noneMatch
 */
public class StreamMatchDemo {

	public static void main(String[] args) {
		List<Integer> l = Arrays.asList(10,20,30,25);
		
		boolean b1 = l.stream().allMatch(n -> n%2 ==0);
		System.out.println(b1);
		
		boolean b2 = l.stream().anyMatch(n -> n%2 ==0);
		System.out.println(b2);
		
		boolean b3 = l.stream().noneMatch(n -> n%2 ==0);
		System.out.println(b3);
	
	}

}
