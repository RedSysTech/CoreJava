package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * 
 * Agenda:-
 * ------
 * 
 * toArray() - to convert a given stream into an Array
 * 
 * Stream.of(i) - to convert the given array i into stream
 * 
 * Practical coding:- Write a prgm to convert an ArrayList into an Array?
 */
public class StreamToArray {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		
		String[] sa = s.stream().toArray(String[]::new);
		
		for(String r:sa) {
			System.out.println(r);
		}
		
		Integer [] i = {10,20,30,40};
		List<Integer> l = Stream.of(i).collect(Collectors.toList());
		System.out.println(l.size());
		
	}

}
