package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * concat(Stream a, Stream b) -  to concat all the elements in stream a and then 
 * 					followed by all the elements in stream b 
 * 
 */
public class StreamConcat {

	public static void main(String[] args) {
		
        Stream s1 = Stream.of(10,20);
        Stream s2 = Stream.of(30,40);
        
        List<Integer> l = (List<Integer>) Stream.concat(s1, s2).collect(Collectors.toList());
        
        l.iterator().forEachRemaining(System.out::println);
        
        Stream s3 = Arrays.asList("A","B","C","D").stream();
        //System.out.println(s3.collect(Collectors.joining()));
        
        //System.out.println(s3.collect(Collectors.joining(",")));
        
        System.out.println(s3.collect(Collectors.joining(",","{","}")));
        
	}

}
