package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
 * Agenda:-
 * ------
 * 
 * what is findAny() - to find any elements from the stream
 * 
 * when to use this? - when we don't care about the order of elements inside the stream.
 * 
 * Practical coding:- find the element based on the filter.
 */
public class FindAnyDemo {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(1,2,14,5,6);
	  
		Optional<Integer> o = l.parallelStream().filter(n -> n>2).findFirst();
		
		if(o.isPresent())
		{
			System.out.println(o.get());
		}
	}

}
