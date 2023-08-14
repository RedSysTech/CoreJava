package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * forEach(Consumer c) - to filter based on the given Consumer function - NO Guaranteed order
 * forEachOrdered(Consumer c) - to filter based on the given Consumer function - Guaranteed order
 */
public class StreamForEach {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		
		System.out.println("---- JDK 1.7----");
		for( String s1:s)
		{
			System.out.println(s1);
		}
		
		// 1.8
		System.out.println("---- JDK 1.8--FOR EACH---");
		s.parallelStream().forEach(System.out::println);
		
		System.out.println("---- JDK 1.8--FOR EACH ORDERED--");
		s.parallelStream().forEachOrdered(System.out::println);
		
		
		
	}

}
