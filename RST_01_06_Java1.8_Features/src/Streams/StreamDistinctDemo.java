package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * distinct() - to remove the duplicates and have only the distinct objects in the streams
 * 
 * Practical prgm:- write a prgm to remove the duplicates from the group of elements.
 * 
 */
public class StreamDistinctDemo {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		s.add("Karthik");
		
		s.stream().distinct().forEach(System.out::println);
		
		Integer [] i = {10,20,10,55,9,3,9};
		Stream.of(i).distinct().forEach(System.out::println);
	}

}
