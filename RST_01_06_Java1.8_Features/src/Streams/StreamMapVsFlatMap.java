package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * map(Function f) - to apply the Function f to each and every elements in the stream.
 * 
 */
public class StreamMapVsFlatMap {

	public static void main(String[] args) {
		System.out.println("--------------------");
		List<String> l = new ArrayList<String>();
		l.add("Karthik");
		l.add("Jai");
		l.add("San");
		
		List<String> mapResult = l.stream().map(i->i.concat(" - RedSysTech")).collect(Collectors.toList());
		System.out.println(mapResult);
		System.out.println("--------------------");
		
		
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
		
		System.out.println("---- JAVA 1.8 flatMap ----");
		// In JAVA 1.8
		List<String> newResult = Stream.of(array)  // Stream<String[]>
		                        .flatMap(Stream::of)        // Stream<String>
		                       .filter(i ->!i.equals("BIKE"))
		                        .collect(Collectors.toList());
		                        

		  for (String s : newResult) {
		      System.out.println(s);
		  }
		  System.out.println("--------------------");
	}

}
