package map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/* Agenda:-
 * -------
 * 1. What is a IdentityHashMap?
 * 2. When we should go for IdentityHashMap?
 * 3. Underlying data structure - Hashtable
 * 4. Duplicate keys - not allowed - means it overwrites with the new value for the same key
 * 5. Duplicate values - allowed
 * 6. Heterogeneous keys - allowed
 * 7. Heterogeneous values - allowed
 * 8. null key - only 1 time allowed
 * 9. null values - allowed any no. of times
 * 10. Insertion order - not maintained, but it uses the Hashcode to persists the data
 * 11. How IdentityHashMap implements - Cloneable, Serializable interface
 * 12. Different constructors for IdentityHashMap
 * 13. Methods like - put, putAll, get, remove, containsKey etc., etc.,
 * 
 */
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		//insertion in HashMap
		HashMap m = new HashMap();
		Integer i = new Integer(100);
		Integer j = new Integer(100);
		m.put(i,"US");
		m.put(j,"IN");
		System.out.println("HashMap --> "+m); // HashMap uses equals method to insert the key
		
		//insertion in IdentityHashMap
		IdentityHashMap im = new IdentityHashMap();
		Integer k = new Integer(100);
		Integer l = new Integer(100);
		im.put(k,"US");
		im.put(l,"IN");
		System.out.println("IdentityHashMap --> "+im); // IdentityHashMap uses == operator to insert the key
		
		System.out.println("===================================");
		
		im.put(101, "IN");
		im.put(102, "US");
		System.out.println("Initial IdentityHashMap is -->"+im); // print the elements in the IdentityHashMap
		
		System.out.println("returns the older value --> "+im.put(101, "CA")); // returns the older value which is IN here
		System.out.println("IdentityHashMap with duplicate key -->"+im); //Duplicate keys
		
		im.put(103, "CA");
		System.out.println("IdentityHashMap with duplicate values -->"+im); //Duplicate values
		
		System.out.println("===================================");
		
		Map<Integer,String> newhm = new HashMap();
		newhm.put(200, "AUS");
		
		im.putAll(newhm);
		System.out.println("IdentityHashMap after putAll -->"+im); //IdentityHashMap after putAll
		
		System.out.println("===================================");
		
		System.out.println("return the value for the given key -->"+im.get(101)); // return the value for the given key
	
		System.out.println("return the value which is removed for the given key -->"+im.remove(101)); // return the value which is removed for the given key
		System.out.println("IdentityHashMap after the removal is -->"+im);
		
		System.out.println("===================================");
		
		System.out.println("Does the IdentityHashMap contains the key 102? -->"+im.containsKey(102)); // containsKey()
		
		System.out.println("Does the IdentityHashMap contains the Value IN? -->"+im.containsValue("IN")); // containsValue()
		
		System.out.println("IdentityHashMap isEmpty? -->"+im.isEmpty()); // isEmpty()
		
		System.out.println("IdentityHashMap size -->"+im.size()); // size()
		
		System.out.println("===================================");
		
		//Special methods
		System.out.println("To get all the keys -->"+im.keySet()); // keySet()
		System.out.println("To get all the values -->"+im.values()); // values()
		System.out.println("To get all the entries -->"+im.entrySet()); // entrySet()
		
		System.out.println("===================================");
		
		//different constructors
		Map<Integer,String> ihm1 = new IdentityHashMap(); // initial cap = 21
		
		Map<Integer,String> ihm2 = new IdentityHashMap(25); // custom defined cap = 25
		
		Map<Integer,String> ihm3 = new IdentityHashMap(new HashMap()); // pass HasMap object as parameter
	
	}

}
