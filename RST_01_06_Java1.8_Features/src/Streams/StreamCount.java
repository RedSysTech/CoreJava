package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * count() - to get the no. of elements in the stream
 */
public class StreamCount {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		s.add("Sanjay");
		
		System.out.println("size of the list -->"+s.size());
		
		System.out.println("total elements inside the stream --> "+s.stream().count());
		
		System.out.println("no. of elements starts with 'S' --> "+s.stream().filter(i->i.startsWith("S")).count());
		
	
	}

}
