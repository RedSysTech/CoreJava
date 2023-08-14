package map;

import java.util.HashMap;

/*
 * Agenda:-
 * ------
 * 1. What is hashing concept - HashMap internally uses Hashtable to store the elements
 * 2. How it uses hashCode() to store the objects? - uses hashCode(key); index = hash & (n-1)
 * 3. How it uses equals() to retrieve the objects? - uses the key.equals() to find the key from the nodes
 * 4. What is Collision? - more than one element needs to be stored in the same index
 * 5. Before Java 1.8 - HashMap uses LinkedList = o(n)
 * 6. After Java 1.8 - HashMap uses Balanced Tree if an index reaches 8 elements = o(log n)
 */
public class HashMapInternalWorksDemo {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap(); //Default capacity = 16
		
		hm.put("Channel Name", "RedSysTech"); // index = 4
		hm.put("Course Name", "Java"); // index = 13
		hm.put("Course ID", "0001"); // index = 0
		hm.put(null, "0001"); // hashCode(null) = 0; and hence the index = 0
		
		System.out.println(hm);

	}

}
