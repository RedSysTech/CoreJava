package Streams;

import java.util.stream.Stream;

/*
 * Agenda:-
 * -------
 * 
 * What is limit()? - to get only the no. of records what we want..
 * 
 * Why do we need to use limit()? - to tune the performance during the issue analysis
 */
public class StreamLimitDemo {

	public static void main(String[] args) {
		
		Stream s = Stream.iterate(1, n -> n+2);
		//s.forEach(System.out::println);
		
		s.limit(10).forEach(System.out::println);
		
		
//		for(int n=1;n<10;n=n+2)
//		{
//			System.out.println(n);
//		}
	}

}
