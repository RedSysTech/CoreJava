package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

/*
 * what? - empty() is to create an empty stream
 * 
 * why? - useful to avoid null pointer exceptions while calling
 *        methods with stream parameters.
 */
public class StreamEmptyDemo {

	public static void main(String[] args) {
	
		Collection c = null;
		nullCheck(c).forEach(System.out::println);;
		
	}
	
	public static Stream nullCheck(Collection c) {
		return c == null? Stream.empty() : c.stream();
	}
}
