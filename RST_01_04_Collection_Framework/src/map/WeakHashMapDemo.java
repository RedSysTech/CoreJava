package map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* Agenda:-
 * -------
 * 1. What is a WeakHashMap?
 * 2. When we should go for WeakHashMap?
 * 3. Underlying data structure - Hashtable
 * 4. Duplicate keys - not allowed - means it overwrites with the new value for the same key
 * 5. Duplicate values - allowed
 * 6. Heterogeneous keys - allowed
 * 7. Heterogeneous values - allowed
 * 8. null key - only 1 time allowed
 * 9. null values - allowed any no. of times
 * 10. Insertion order - not maintained
 * 11. How WeakHashMap implements - Cloneable, Serializable interface
 * 12. Different constructors for WeakHashMap
 * 13. Methods like - put, putAll, get, remove, containsKey etc., etc.,
 * 14. Real time use case:- web site design tool
 *      Expectation:- To get the image from the Cache rather than the disk which is expensive
 *      With Strong references - it forces the image to remain in memory
 *      With Weak references -  cache should always contain a reference to any image which is already in memory.
 */
public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Map<Integer,String> wh = new WeakHashMap();
		
		System.out.println("=========================================");
		wh.put(101, "IN");
		wh.put(102, "US");
		System.out.println("Initial WeakHashMap is -->"+wh); // print the elements in the WeakHashMap
		System.out.println("Returns the older value which is replaced --> "+wh.put(101, "CA")); // returns the older value which is IN here
		System.out.println("WeakHashMap with duplicate key, it replaced the new value -->"+wh); //Duplicate keys
		wh.put(103, "CA");
		System.out.println("WeakHashMap with duplicate values -->"+wh); //Duplicate values
		
		
		System.out.println("=========================================");		
		Map<Integer,String> newhm = new HashMap();
		newhm.put(200, "AUS");
		wh.putAll(newhm);
		System.out.println("WeakHashMap after putAll -->"+wh); //WeakHashMap after putAll
		
		
		System.out.println("=========================================");
		System.out.println("Return the value for the given key -->"+wh.get(101)); // return the value for the given key	
		System.out.println("Return the value which is removed for the given key -->"+wh.remove(101)); // return the value which is removed for the given key
		System.out.println("WeakHashMap after the removal is -->"+wh);	
		System.out.println("Does the WeakHashMap contains the key 102? -->"+wh.containsKey(102)); // containsKey()	
		System.out.println("Does the WeakHashMap contains the Value IN? -->"+wh.containsValue("IN")); // containsValue()
		System.out.println("WeakHashMap isEmpty? -->"+wh.isEmpty()); // isEmpty()
		System.out.println("WeakHashMap size -->"+wh.size()); // size()
		
		
		System.out.println("=========================================");
		//Special methods
		System.out.println("To get all the keys -->"+wh.keySet()); // keySet()
		System.out.println("To get all the values -->"+wh.values()); // values()
		System.out.println("To get all the entries -->"+wh.entrySet()); // entrySet()
		
		
		System.out.println("=========================================");
		HashMap hm = new HashMap();
		Employee e = new Employee();
		hm.put(e,"US");
		System.out.println("Original HashMap contains  --> "+hm);
		e =null; // making the Key as null
		System.gc(); // calling the Garbage Collector
		Thread.sleep(10000); // make it sleep for sometime
		System.out.println("HashMap after the GC contains  --> "+hm);
		
		
		System.out.println("=========================================");
		WeakHashMap whm = new WeakHashMap();
		Employee e1 = new Employee();
		whm.put(e1,"US");
		System.out.println("Original WeakHashMap contains  -->"+whm);
		e1 =null; // making the Key as null
		System.gc(); // calling the Garbage Collector
		Thread.sleep(10000); // make it sleep for sometime
		System.out.println("WeakHashMap after the GC contains  --> "+whm);
		
	}

}

class Employee{
	
}
