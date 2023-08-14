package Streams;

import java.util.Random;
import java.util.stream.Stream;

/*
 * Agenda:-
 * -------
 * What is generate() method in Stream API?
 * 
 * Stream.generate(Supplier s) -  generate the objects into the stream, 
 * 								  based on the supplier s
 * Practical coding:- to generate 5 random Integer values
 */
public class StreamGenerateDemo {

	public static void main(String[] args) {
		 		
	   Random r = new Random();
	   System.out.println(r.nextInt());
	   
	   System.out.println("--------");
	   
	   Stream.generate(new Random()::nextInt).limit(2).forEach(System.out::println);

	}

}
