package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * min(Comparator c) - to get the very first element after doing the sorting
 * max(Comparator c) - to get the last element after doing the sorting
 */
public class StreamMinMax {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Karthik");
		s.add("Jai");
		s.add("San");
		
		String minResult = s.stream().min((i1,i2) -> -i1.compareTo(i2)).get();
		System.out.println("minResult -->"+minResult);
		
		String maxResult = s.stream().max((i1,i2) -> -i1.compareTo(i2)).get();
		System.out.println("maxResult -->"+maxResult);
	}

}
