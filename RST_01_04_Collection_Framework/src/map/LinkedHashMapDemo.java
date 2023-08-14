package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* Agenda:-
 * -------
 * 1. What is a LinkedHashMap?
 * 2. When we should go for LinkedHashMap?
 * 3. Underlying data structure - Hashtable + LinkedList
 * 4. Duplicate keys - not allowed - means it overwrites with the new value for the same key
 * 5. Duplicate values - allowed
 * 6. Heterogeneous keys - allowed
 * 7. Heterogeneous values - allowed
 * 8. null key - only 1 time allowed
 * 9. null values - allowed any no. of times
 * 10. Insertion order -  maintained - because of underlying LinkedList implementation
 * 11. How LinkedHashMap implements - Cloneable, Serializable interface
 * 12. Different constructors for LinkedHashMap
 * 13. Methods like - put, putAll, get, remove, containsKey etc., etc.,
 * 14. LinkedHashMap constructors
 */
public class LinkedHashMapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> lhm = new LinkedHashMap();
		
		lhm.put(101, "IN");
		lhm.put(102, "US");
		System.out.println("Initial LinkedHashMap is -->"+lhm); // print the elements in the LinkedHashMap
		
		System.out.println(lhm.put(101, "CA")); // returns the older value which is IN here
		System.out.println("LinkedHashMap with duplicate key -->"+lhm); //Duplicate keys
		
		lhm.put(103, "CA");
		System.out.println("LinkedHashMap with duplicate values -->"+lhm); //Duplicate values
		
		
		Map<Integer,String> newlhm = new LinkedHashMap();
		newlhm.put(200, "AUS");
		
		lhm.putAll(newlhm);
		System.out.println("LinkedHashMap after putAll -->"+lhm); //LinkedHashMap after putAll
		
		System.out.println("return the value for the given key -->"+lhm.get(101)); // return the value for the given key
	
		System.out.println("return the value which is removed for the given key -->"+lhm.remove(101)); // return the value which is removed for the given key
		System.out.println("HashMap after the removal is -->"+lhm);
		
		System.out.println("Does the LinkedHashMap contains the key 102? -->"+lhm.containsKey(102)); // containsKey()
		
		System.out.println("Does the LinkedHashMap contains the Value IN? -->"+lhm.containsValue("IN")); // containsValue()
		
		System.out.println("LinkedHashMap isEmpty? -->"+lhm.isEmpty()); // isEmpty()
		
		System.out.println("LinkedHashMap size -->"+lhm.size()); // size()
		
		//Special methods
		System.out.println("To get all the keys -->"+lhm.keySet()); // keySet()
		System.out.println("To get all the values -->"+lhm.values()); // values()
		System.out.println("To get all the entries -->"+lhm.entrySet()); // entrySet()	
		
		//different types of Constructors
		Map<Integer,String> lhm1 = new LinkedHashMap(); // initial cap = 16, default fill ratio = 0.75
		
		Map<Integer,String> lhm2 = new LinkedHashMap(25); // custom defined cap = 25, default fill ratio = 0.75
		
		Map<Integer,String> lhm3 = new LinkedHashMap(25, 0.80f); // custom defined cap = 25, custom defined fill ratio = 0.80
		
		Map<Integer,String> lhm4 = new LinkedHashMap(new HashMap()); // pass the HashMap object to the constructor
		
		Map<Integer,String> lhm5 = new LinkedHashMap(25, 0.80f, true); // // custom defined cap = 25, custom defined fill ratio = 0.80, access 
		Map<Integer,String> lhm6 = new LinkedHashMap(25, 0.80f, false); 
	}

}
