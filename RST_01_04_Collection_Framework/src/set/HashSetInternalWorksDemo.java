package set;

import java.util.HashSet;
import java.util.TreeSet;

/*
 * Agenda:
 * 
 * 1. Define HashSet constructors
 * 2. Duplicate - not allowed
 * 3. Insertion order - not maintained
 * 4. Heterogeneous objects - allowed
 * 5. Null insertion - allowed
 * 6. Serializable - implemented by default
 * 7. Cloneable - implemented by default
 * 
 * 
 */
public class HashSetInternalWorksDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();

		hs.add("RedSysTech");
		hs.add("Java");
		hs.add("0001");
		
		System.out.println(hs); // insertion order is not maintained
		
		hs.add("0001");
		System.out.println(hs); // duplicates are not added, but no errors/exceptions
		
		hs.add(123);
		System.out.println(hs); // Heterogeneous objects - allowed
		
		hs.add(null);
		System.out.println(hs); // Null insertion - allowed
		
		HashSet hs1 = new HashSet(20);
		
		HashSet hs2 = new HashSet(20,0.85f);
		
		
		
		
	}

}
