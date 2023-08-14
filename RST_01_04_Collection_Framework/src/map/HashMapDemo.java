package map;

import java.util.HashMap;
import java.util.Map;

/* Agenda:-
 * -------
 * 
 * 1. What is a HashMap?
 * 2. When we should go for HashMap?
 * 3. Underlying data structure - Hashtable
 * 4. Duplicate keys - not allowed - means it overwrites with the new value for the same key
 * 5. Duplicate values - allowed
 * 6. Heterogeneous keys - allowed
 * 7. Heterogeneous values - allowed
 * 8. null key - only 1 time allowed
 * 9. null values - allowed any no. of times
 * 10. Insertion order - not maintained
 * 11. How HashMap implements - Cloneable, Serializable interface
 * 12. Different constructors for HashMap
 * 13. Methods like - put, putAll, get, remove, containsKey etc., etc.,
 * 
 */
public class HashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> hm = new HashMap();
		
		hm.put(101, "IN");
		hm.put(102, "US");
		System.out.println("Initial HashMap is -->"+hm); // print the elements in the HashMap
		
		System.out.println(hm.put(101, "CA")); // returns the older value which is IN here
		System.out.println("HashMap with duplicate key -->"+hm); //Duplicate keys
		
		hm.put(103, "CA");
		System.out.println("HashMap with duplicate values -->"+hm); //Duplicate values
		
		
		Map<Integer,String> newhm = new HashMap();
		newhm.put(200, "AUS");
		
		hm.putAll(newhm);
		System.out.println("HashMap after putAll -->"+hm); //HashMap after putAll
		
		System.out.println("return the value for the given key -->"+hm.get(101)); // return the value for the given key
	
		System.out.println("return the value which is removed for the given key -->"+hm.remove(101)); // return the value which is removed for the given key
		System.out.println("HashMap after the removal is -->"+hm);
		
		System.out.println("Does the HashMap contains the key 102? -->"+hm.containsKey(102)); // containsKey()
		
		System.out.println("Does the HashMap contains the Value IN? -->"+hm.containsValue("IN")); // containsValue()
		
		System.out.println("HashMap isEmpty? -->"+hm.isEmpty()); // isEmpty()
		
		System.out.println("HashMap size -->"+hm.size()); // size()
		
		//Special methods
		System.out.println("To get all the keys -->"+hm.keySet()); // keySet()
		System.out.println("To get all the values -->"+hm.values()); // values()
		System.out.println("To get all the entries -->"+hm.entrySet()); // entrySet()
	
		
	}

}
