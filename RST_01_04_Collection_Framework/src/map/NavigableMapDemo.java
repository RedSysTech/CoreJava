package map;

import java.util.NavigableMap;
import java.util.TreeMap;
/*
 * Agenda:-
 * -------
 * 1. NavigableMap extends SortedMap interface
 * 2. Duplicate keys - not allowed
 * 3. Duplicate values - allowed
 * 3. Insertion elements - by default in some sorting order
 * 4. lowerKey(30) - returns the last before 30 = 20    (< obj)
 * 5. floorKey(30) - returns either 30 or last before 30 = 30 (<= obj)
 * 6. higherKey(30) - returns the element first after 30 = 40 (> obj)
 * 7. ceilingKey(30) - returns either 30 or first after 30 = 30  (>= obj)
 * 8. pollFirstEntry() - remove and returns the first entry
 * 9. pollLastEntry() - remove and returns the last entry
 * 10. descendingMap() - returns the NavigableMap in descending order
 * 10. null insertion - not allowed
 */
public class NavigableMapDemo {

	public static void main(String[] args) {
		
		 NavigableMap nm = new TreeMap(); 
		 nm.put(10, 'A');
		 nm.put(30, 'B');
		 nm.put(50, 'C');
		 nm.put(40, 'D');
		 nm.put(20, 'E');
		 nm.put(20, 'F');
		 nm.put(60, 'A');
		 System.out.println("NavigableMap contains --> "+nm); //{10=A, 20=F, 30=B, 40=D, 50=C, 60=A}
	
		 
		 System.out.println("===================================");
		 System.out.println("nm.lowerKey(30) --> "+nm.lowerKey(30)); // last before 30 = 20    (< obj)
		 System.out.println("nm.floorKey(30) --> "+nm.floorKey(30)); // either 30 or last before 30 = 30 (<= obj)
		 System.out.println("nm.floorKey(29) --> "+nm.floorKey(29)); // either 29 or last before 29 = 20 (<= obj)
		 
		 
		 System.out.println("===================================");
		 System.out.println("nm.higherKey(30) --> "+nm.higherKey(30)); // first after 30 = 40 (> obj)
		 System.out.println("nm.ceilingKey(30) --> "+nm.ceilingKey(30)); // either 30 or first after 30 = 30  (>= obj)
		 System.out.println("nm.ceilingKey(32) --> "+nm.ceilingKey(32)); // either 32 or first after 32 = 40  (>= obj)
		 
		 
		 System.out.println("===================================");
		 System.out.println("nm.pollFirstEntry() --> "+nm.pollFirstEntry()); // remove and returns the first 10=A
		 System.out.println("NavigableMap after the pollFirstEntry --> "+nm);            //{20=B, 30=C, 40=D, 50=E}
		 
		 
		 System.out.println("===================================");
		 System.out.println("nm.pollLastEntry() --> "+nm.pollLastEntry()); // remove and returns the last 50=E
		 System.out.println("NavigableMap after the pollLastEntry --> "+nm);            // {20=B, 30=C, 40=D}
		 
		 
		 System.out.println("===================================");
		 System.out.println("nm.descendingMap() --> "+nm.descendingMap()); // returns the NavigableMap in descending order {40=D, 30=C, 20=B}
		 
		 
		 System.out.println("===================================");
		 NavigableMap nm1 = new TreeMap();
		// nm1.put(null, 'A'); // RE:- NullPointerException, it won't allow null to inserted, because it can't use null for sorting the elements.	
	}
}
