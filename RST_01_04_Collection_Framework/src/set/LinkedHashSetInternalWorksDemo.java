package set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/*
 * Agenda:
 * 
 * 1. Define LinkedHashSet constructors
 * 2. Duplicate - not allowed
 * 3. Insertion order - maintained
 * 4. Heterogeneous objects - allowed
 * 5. Null insertion - allowed
 * 6. Serializable - implemented by default
 * 7. Cloneable - implemented by default
 * 8. When we should go for LinkedHashSet?
 * 9. HashSet vs LinkedHashSet?
 * 
 */
public class LinkedHashSetInternalWorksDemo {

	public static void main(String[] args) {
		
		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add("RedSysTech");
		lhs.add("Java");
		lhs.add("0001");
		
		System.out.println(lhs); // insertion order is maintained
		
		lhs.add("0001");
		System.out.println(lhs); // duplicates are not added, but no errors/exceptions
		
		lhs.add(123);
		System.out.println(lhs); // Heterogeneous objects - allowed
		
		lhs.add(null);
		System.out.println(lhs); // Null insertion - allowed
		
		LinkedHashSet lhs1 = new LinkedHashSet(20);
		
		LinkedHashSet lhs2 = new LinkedHashSet(20,0.85f);
		
		TreeSet ts = new TreeSet();
		LinkedHashSet lhs3 = new LinkedHashSet(ts);

		
	}

}
