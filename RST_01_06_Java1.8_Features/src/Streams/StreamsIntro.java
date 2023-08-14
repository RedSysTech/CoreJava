package Streams;

import java.util.*;
import java.util.stream.*;
/*
 * Stream:
 * ------
 * 
 * What? -  It's an interface in java.util.stream package since JDK 1.8
 * 
 * Where to use? - Anywhere to deal with the group of objects in your prgm. eg: Array, Collections etc.,
 * 
 * When to use? - if you want to process on the objects from the group of objects (eg: Array, Collections etc.,)
 *                then go for Stream API.
 *                
 * What advantage of Stream API? -  Concise code
 * 
 * 27 methods in the Stream API:
 * -------------------------
 * 
 * stream() - to convert group of objects into Streams
 * 
 * filter(Predicate p) - to filter the objects based on some condition
 * 
 * map(Function f) - to perform some operation to the objects inside the stream
 * 
 * flatMap(Function f)
 * 
 * collect(Collectors c) - to collect the data back from the stream
 * 
 * count() -  to know the number of objects in the stream
 * 
 * sorted() - def. natural sorting order
 * sorted(Comparator c) -  custom sorting order
 * 
 * min() - to get the first element in the stream
 * max() - to get the last element in the stream
 * 
 * forEach(Consumer c) -  to perform some consumer operations on the stream of each objects
 * forEachOrdered(Consumer c)-  to perform some consumer operations on the stream of each ordered objects
 * 
 * distinct() -  to get the unique objects from the stream
 * empty() -  to make the stream empty
 * limit(long n) -  to truncate any elements in the stream after the given n size.
 * 
 * toArray() - to convert a stream of objects into an Array
 * Stream.of(a) -  to get the stream of objects from an Array 'a'
 * 
 * skip(long n) - to skip/discard the first n elements in the stream
 * generate(Supplier s) - to create a stream of objects with the given Supplier s
 * 
 * 
 * findAny() - returns if it finds any elements otherwise returns the empty stream
 * findFirst() - returns if it finds any elements in the first match otherwise returns the empty stream
 * 
 * allMatch(Predicate p) - returns if all the elements in the stream is matching the given predicate p
 * anyMatch(Predicate p) - returns if any of the elements in the stream is matching the given predicate p
 * noneMatch(Predicate p) - returns if none of the elements in the stream is matching the given predicate p
 * 
 * concat(Stream a, Stream b) -  to join all the elements in stream a and then followed by all the elements in stream b 
 *
 * 
 * reduce(identity) - to produce one single result from a sequence of elements, by repeatedly applying a combining operation
 * 
 * 
 */
public class StreamsIntro {

	public static void main(String[] args) {
		
	 Stream s = Stream.of(10,20,30,40); // group of objects
	 System.out.println(s.count());
	 
	 Integer [] i = {10,30,55,65,99};
	 Stream s1 = Stream.of(i);
	 System.out.println(s1.count()); // deal with the array of objects
	 
	 List<Integer> l = new ArrayList();
	 l.add(22);
	 l.add(221);
	 l.add(222);
	 l.add(223);
	 l.add(224);
	 l.add(225);
	 Stream s3 = Stream.of(l);
	 System.out.println(s3.count()); // deal with the collections
	 System.out.println("--"+l.stream());
	 System.out.println("0000"+s3);
	 
	 // proof for the concise code:
	 // 1.7 code to create a list with only even numbers from the given list?
	 List<Integer> l1 = new ArrayList();
	 l1.add(10);
	 l1.add(220);
	 l1.add(11);
	 l1.add(17);

	 List<Integer> result = new ArrayList<Integer>();
	 for(Integer ll : l1) {
		 
		 if(ll%2 == 0) {
			 result.add(ll);
		 }
	 }
	 System.out.println(result);
	
	// 1.8 code to create a list with only even numbers from the given list?
	 List<Integer> l2 = new ArrayList<Integer>();
	 l2.add(10);
	 l2.add(220);
	 l2.add(11);
	 l2.add(17);
	 
	 List newList = l2.stream().filter(x->x%2==0).collect(Collectors.toList());
	 System.out.println(newList);
	 
	}
}
