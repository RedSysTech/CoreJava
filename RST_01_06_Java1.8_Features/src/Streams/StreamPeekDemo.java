package Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Agenda:-
 * -------
 * 
 * Structure of a Stream?
 * 
 * 			source = provides the elements to the pipeline
 * 			0 or more = intermediate operations = get elements one-by-one and process them
 * 			0 or 1 = terminal operations = initiate the work in the pipeline
 * 
 * 			eg: peek() is a intermediate operation
 * 			forEach() is a terminal operation
 * 
 * How peek() works in Java?
 */
public class StreamPeekDemo {

	public static void main(String[] args) {
		
		Stream s1 = Stream.of(10,20,45,88);
		//s1.peek(System.out::println);
		
		s1.peek(n -> System.out.println(n)).collect(Collectors.toList());
	}

}
