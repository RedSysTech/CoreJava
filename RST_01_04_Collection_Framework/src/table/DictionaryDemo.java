package table;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
/*
 * Agenda:-
 * ------
 * 1. What is Dictionary class in Java?
 * 2. Relationship between Dictionary and Hashtable class?
 * 3. put() - method to add the elements in the Dictionary class.
 * 4. null Keys - not allowed to insert
 * 5. null Values - not allowed to insert
 * 6. get() - to get the value for the given key
 * 7. isEmpty() - returns true if the given Dictionary has no elements else it returns false
 * 8. remove() - to remove the entry for the given key
 * 9. size() - returns the size of the Dictionary class
 * 10. Enumeration - an interface to iterate through the keys
 *
 */
public class DictionaryDemo {

	public static void main(String[] args) {
		
		Dictionary d = new Hashtable();

		d.put(100,"Red"); // 100%11 = 1
		d.put(200,"Black"); // 200%11 = 2
		d.put(10,"White"); // 10%11 = 10
		//d.put(null,"ha ha"); // no null key insertion RE:- NullPointerException
		//d.put(300,null); // no null value insertion RE:- NullPointerException
		
		System.out.println("Entries inside the Dictionary class --> "+d); // hashCode() of keys
		System.out.println("===================================");
		
		System.out.println("Get the value for the key 10 --> "+d.get(10));
		
		System.out.println("===================================");
		System.out.println("Is the Dictionary class empty? --> "+d.isEmpty());
		
		System.out.println("===================================");
		System.out.println("Remove the Entry with Key 10 and return the removed value --> "+d.remove(10));
		
		System.out.println("===================================");
		System.out.println("Dictionary class after the removal --> "+d); // after the removal
		
		System.out.println("===================================");
		System.out.println("Size of the Dictionary class --> "+d.size());
		
		System.out.println("===================================");
		// use the keys() method
        for (Enumeration e = d.keys(); e.hasMoreElements();) 
        { 
            System.out.println("Keys in Dictionary are : " + e.nextElement()); 
        }
	}

}
