package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
 * sorted() - to sort the stream of objects in a def. sorting manner.
 *          which means - numbers - ascending order
 *          			- strings - Alphabetical order
 * sorted(Comparator c) -  custom sorting order
 */
public class StreamSorted {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Mani");
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		
		List<String> result1 = s.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted strings -->"+result1);
		
		List<Integer> i = new ArrayList<Integer>();
		i.add(10);
		i.add(100);
		i.add(20);
		i.add(1000);
		
		List<Integer> result2 = i.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted integers -->"+result2);
		
		
		List<String> result3 =  s.stream().sorted((i1,i2) -> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Decendiing order .. sorted strings -->"+result3);
	}

}
