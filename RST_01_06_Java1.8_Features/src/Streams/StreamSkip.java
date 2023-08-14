package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Agenda:-
 * ------
 * 
 * What is skip(long n) method? - to skip the elements till nth element in the stream.
 * 
 * Practical coding:- Demonstrate how skip() works in Stream API?
 * 
 * */
public class StreamSkip {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		s.add("Mani");
		s.add("Kumar");
		s.add("Satish");
		s.add("Ramesh");
		s.add("Vivek");
		
		s.stream().forEach(System.out::println);
		
		System.out.println("--------------");
		s.stream().skip(2).forEach(System.out::println);
		
	
	}

}
