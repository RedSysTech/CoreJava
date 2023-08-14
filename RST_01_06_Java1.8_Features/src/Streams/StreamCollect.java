package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * collect(Collector c) - to collect the elements of the stream based on the collector c
 */
public class StreamCollect {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		
		List<String> result = s.stream().filter(i -> i.startsWith("J")).collect(Collectors.toList());
		System.out.println(result);
		
	}

}
