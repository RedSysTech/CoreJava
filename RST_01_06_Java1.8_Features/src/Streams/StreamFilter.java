package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * filter(Predicate p) - to filter based on the given predicate function
 */
public class StreamFilter {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		
		// how to filter the objects which starts with "J"?
		List<String> result = s.stream().filter(i->i.startsWith("J")).collect(Collectors.toList());
		System.out.println(result);
	
	}

}
