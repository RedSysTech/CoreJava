package set;

import java.util.NavigableSet;
import java.util.TreeSet;
 
/*
 * Agenda:-
 * -------
 * 1. NavigableSet extends SortedSet interface
 * 2. Duplicated - not allowed
 * 3. Insertion elements - by default in some sorting order
 * 4. lower(30) - returns the last before 30 = 20    (< obj)
 * 5. floor(30) - returns either 30 or last before 30 = 30 (<= obj)
 * 6. higher(30) - returns the element first after 30 = 40 (> obj)
 * 7. ceiling(30) - returns either 30 or first after 30 = 30  (>= obj)
 * 8. pollFirst() - remove and returns the first
 * 9. pollLast() - remove and returns the last
 * 10. descendingSet() - returns the NavigableSet in descending order
 * 10. null insertion - not allowed
 */

public class NavigableSetDemo {

	public static void main(String[] args) {
		
		 NavigableSet ts = new TreeSet(); 
		 
		 ts.add(10); 
		 ts.add(20);
		 ts.add(30);
		 ts.add(40);
		 ts.add(50);
		
		 System.out.println(ts);
		 
		 System.out.println("ts.lower(30) --> "+ts.lower(30)); // last before 30 = 20    (< obj)
		 System.out.println("ts.floor(30) --> "+ts.floor(30)); // either 30 or last before 30 = 30 (<= obj)
		 System.out.println("ts.floor(29) --> "+ts.floor(29)); // either 29 or last before 29 = 20 (<= obj)
		 
		 System.out.println("ts.higher(30) --> "+ts.higher(30)); // first after 30 = 40 (> obj)
		 System.out.println("ts.ceiling(30) --> "+ts.ceiling(30)); // either 30 or first after 30 = 30  (>= obj)
		 System.out.println("ts.ceiling(32) --> "+ts.ceiling(32)); // either 32 or first after 32 = 40  (>= obj)
		 
		 System.out.println("ts.pollFirst() --> "+ts.pollFirst()); // remove and returns the first
		 System.out.println(ts);
		 
		 System.out.println("ts.pollLast() --> "+ts.pollLast()); // remove and returns the last
		 System.out.println(ts);
		 
		 System.out.println("ts.descendingSet() --> "+ts.descendingSet()); // returns the NavigableSet in descending order
	}
}
