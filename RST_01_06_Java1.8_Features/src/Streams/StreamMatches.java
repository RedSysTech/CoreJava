package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * allMatch(Predicate p) - returns if all the elements in the stream is matching the given predicate p
 * anyMatch(Predicate p) - returns if any of the elements in the stream is matching the given predicate p
 * noneMatch(Predicate p) - returns if none of the elements in the stream is matching the given predicate p
 * 
 */
public class StreamMatches {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		
		boolean allMatchingresult = s.stream().allMatch(i -> i.startsWith("J"));
		System.out.println("allMatchingresult is:--> "+allMatchingresult);
		
		boolean anyMatchingresult = s.stream().anyMatch(i -> i.startsWith("J"));
		System.out.println("anyMatchingresult is:--> "+anyMatchingresult);
		
		boolean noneMatchingresult = s.stream().noneMatch(i -> i.startsWith("J"));
		System.out.println("noneMatchingresult is:--> "+noneMatchingresult);
	}

}
