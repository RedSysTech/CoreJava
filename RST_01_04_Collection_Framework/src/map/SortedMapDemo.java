package map;

import java.util.SortedMap;
import java.util.TreeMap;
/*
 * Agenda:-
 * -------
 * 1. SortedMap is an Interface which extends Map interface. So we will use TreeMap (C) object for the demo.
 * 2. Duplicate Keys - not allowed
 * 3. Duplicate values - allowed
 * 4. Insertion elements - by default in some sorting order
 * 5. firstKey() - returns the very first entry.
 * 6. lastKey() - returns the last entry.
 * 7. headMap() - returns the list of elements which are < this value.
 * 8. tailMap() - returns the list of elements which are >= this value.
 * 9. subMap() - returns the list of elements in between this value.
 * 10. comparator() - returns null because of natural sorting order
 * 11. null insertion - not allowed
 */
public class SortedMapDemo {

	public static void main(String[] args) {
		
		SortedMap sm = new TreeMap();
		
		sm.put(10, 'A');
		sm.put(20, 'B');
		sm.put(30, 'C');
		sm.put(40, 'D');
		sm.put(50, 'E');
		
		System.out.println("SortedMap contains --> "+sm);
		
		System.out.println("first key in the SortedMap --> "+sm.firstKey());
		System.out.println("last key in the SortedMap --> "+sm.lastKey());
		System.out.println("SortedMap headMap <30 --> "+sm.headMap(30)); // <30
		System.out.println("SortedMap tailMap >=30 --> "+sm.tailMap(30)); // >=30
		System.out.println("SortedMap subMap >=20 and <40 --> "+sm.subMap(20,40)); // >=20 and <40
		System.out.println("SortedMap comparator --> "+sm.comparator()); // null for default natural sorting order.
		
		SortedMap sm1 = new TreeMap();
		sm1.put(null, 'A'); // RE:- NullPointerException, it won't allow null to inserted, because it can't use null for sorting the elements.
	} 

}
