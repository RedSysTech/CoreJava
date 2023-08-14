package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * flatMap(Function f):
 * 
 * Why? - to convert the above 2 levels Stream into 
 * one Stream level or a 2d array into a 1d array.
 * 
 * [
  		[1, 2],
  		[3, 4],
  		[5, 6]
	]
	
	
	to [1, 2, 3, 4, 5, 6]
 *
 *  i.e: Stream<String[]> to Stream<String>
 *
 */
public class StreamFlatMap {

	public static void main(String[] args) {
		
		System.out.println("---- JAVA 1.7 ----");
		
		String[][] array = new String[][]{{"CAR", "BUS"}, {"BIKE", "ROAD"}, {"MACHINE", "SCOOTER"}};

		  // array to a stream
		  Stream<String[]> s1 = Arrays.stream(array);

		  // x is a String[]
		  List<String[]> result = s1
		          .filter(x -> {
		              for(String s : x){      
		                  if(s.equals("BIKE")){
		                      return false;
		                  }
		              }
		              return true;
		          }).collect(Collectors.toList());

	
		  
		// print array
		result.forEach(x -> System.out.println(Arrays.toString(x)));
		
		System.out.println("---- JAVA 1.8 ----");
		
		// In JAVA 1.8
		String[][] myArray = new String[][]{{"CAR", "BUS"}, {"BIKE", "ROAD"}, 
			                                {"MACHINE", "SCOOTER"}};
		
		List<String> newResult = Stream.of(myArray)  // Stream<String[]>
		                        .flatMap(Stream::of)        // Stream<String>
		                       .filter(i ->!i.equals("BIKE"))
		                        .collect(Collectors.toList());
		                        
		  for (String s : newResult) {
		      System.out.println(s);
		  }
		
	}

}
