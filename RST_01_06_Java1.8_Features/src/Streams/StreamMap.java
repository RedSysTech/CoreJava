package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * map(Function f) - to apply the Function f to each and every elements in the stream.
 * 
 */
public class StreamMap {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		
		List<String> mapResult = s.stream().map(i->i.concat(" - RedSysTech")).collect(Collectors.toList());
		System.out.println(mapResult);
		
	}

}
