package Streams;

import java.util.Arrays;
import java.util.List;

/*
 * reduce operation applies a binary operator to each element in the stream 
 * 		where the first argument to the operator is the return value of the previous application 
 * 		and second argument is the current stream element.
 * 
 * eg: sum(), min(), max(), count() etc. 
 * 
 * reduce is for doing aggregations.
 * 
 * syntax: reduce(initialValue i, Accumulator a)
 */
public class StreamReduce {

	public static void main(String[] args) {
		
		// Creating list of integers
        List<Integer> l = Arrays.asList(1, 100, 40, 6, 8);
  
        // Finding sum of all elements
        int sum = l.stream().reduce(0,(element1, element2) -> element1 + element2);
  
        // Displaying sum of all elements
        System.out.println("The sum of all elements is --> " + sum);
        
        // Finding sum of all elements - 5
        int newSum = l.stream().reduce(-5,(element1, element2) -> element1 + element2);
  
        // Displaying sum of all elements
        System.out.println("The sum of all elements AFTER -5S is --> " + newSum);
        
        // to print the max value in the stream
        int maxNum = l.stream().reduce(0,(element1, element2) -> element1 > element2?element1: element2);
        System.out.println("The maxNum of all elements is --> " + maxNum);
	
	}

}
