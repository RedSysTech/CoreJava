package set;

import java.util.SortedSet;
import java.util.TreeSet;

/*
 * Agenda:-
 * -------
 * 1. SortedSet extends Set interface
 * 2. Duplicated - not allowed
 * 3. Insertion elements - by default in some sorting order
 * 4. first() - returns the very first element.
 * 5. last() - returns the last element.
 * 6. headSet() - returns the list of elements which are < this value.
 * 7. tailSet() - returns the list of elements which are >= this value.
 * 8. subSet() - returns the list of elements in between this value.
 * 9. comparator() - returns null because of natural sorting order
 * 10. null insertion - not allowed
 */
public class SortedSetDemo {

	public static void main(String[] args) {
		
		 SortedSet ts = new TreeSet(); 
		 
		 ts.add(10); 
		 ts.add(20);
		 ts.add(30);
		 ts.add(40);
		 ts.add(50);
		 
		 System.out.println(ts);
		 
		 System.out.println(ts.first()); // returns the very first element. 
		 System.out.println(ts.last()); // returns the last element.
		 System.out.println(ts.headSet(30)); // returns the list of elements which are < this value.
		 System.out.println(ts.tailSet(30)); // returns the list of elements which are >= this value.
		 System.out.println(ts.subSet(20, 40));// returns the list of elements in between this value.
		 System.out.println(ts.comparator()); // returns null because of natural sorting order.
		 
		 // ts.add(null); // won't allow null to inserted, because it can't use null for sorting the elements.

	}

}
