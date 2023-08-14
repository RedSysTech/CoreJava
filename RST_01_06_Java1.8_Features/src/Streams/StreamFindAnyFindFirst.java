package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * findAny() - to find if the given filter condition is matching in ANY of the elements in the stream
 * findFirst() - to find if the given filter condition is matching with the FIRST element in the stream
 */
public class StreamFindAnyFindFirst {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		s.add("Karthik");
		s.add("Karthik");
		
		String result = s.stream().findAny().filter(i -> i.equalsIgnoreCase("Karthik"))
				.get();
		System.out.println(result); // Karthik is the output
		
		//java.util.NoSuchElementException: No value present
//		String result1 = s.stream().findAny().filter(i -> i.equalsIgnoreCase("Kum"))
//				.get();
//		System.out.println(result1);
		
		String result2 = s.stream().findFirst().filter(i -> i.equalsIgnoreCase("Karthik"))
				.get();
		System.out.println(result2); // Karthik is the output otherwise java.util.NoSuchElementException: No value present
		
		
	}

}
