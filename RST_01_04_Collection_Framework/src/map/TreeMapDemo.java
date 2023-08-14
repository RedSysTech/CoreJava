package map;

import java.util.TreeMap;
/* 
 * Agenda:-
 * ------
*  1. TreeMap is a Class in Java
*  2. TreeMap implements NavigableMap interface
 * 3. Underlying data structure - RED BLACK tree
 * 4. Duplicate Keys - not allowed
 * 5. Duplicate Values - allowed
 * 6. Heterogeneous objects - not allowed to insert as keys
 * 7. NonComparable objects - not allowed to insert as keys
 * 8. insertion order - by default in some sorting order based on keys
 * 9. null keys insertion - not allowed
 * 10. null values insertion - allowed any no. of times
 * 11. Default/Natural sorting order - Numbers - Ascending order
 * 12. Default/Natural sorting order - Strings - Alphabetical order
 */
public class TreeMapDemo {

	public static void main(String[] args) {
		
		//Default/Natural sorting order - Numbers
		TreeMap tm = new TreeMap();
		tm.put(10, 'A');
		tm.put(200, 'B');
		tm.put(30, 'C');
		tm.put(400, 'D');
		tm.put(50, 'E');
		System.out.println("Original TreeMap contains in the Ascending order --> "+tm); // sorted based on Ascending order of Keys
		
		
		System.out.println("===================================");
		tm.put(50, 'F');
		System.out.println("Duplicate keys replaces the latest value inside the TreeMap --> "+tm);// Duplicate keys are not allowed, it simply replaced with the new value
		
		
		System.out.println("===================================");
		tm.put(60, null);
		tm.put(70, null);
		System.out.println("null values are allowed any no. of times inside the TreeMap --> "+tm);// null values are allowed any number of times
		
		
		System.out.println("===================================");
		//Default/Natural sorting order - Strings
		TreeMap tm1 = new TreeMap();
		tm1.put("US", 100);
		tm1.put("IND", 300);
		tm1.put("CA", 450);
		tm1.put("AUS", 234);
		System.out.println("Original TreeMap contains in the Alphabetical order --> "+tm1); // sorted based on Alphabetical order of Keys
		
		
		System.out.println("===================================");
		//Default/Natural sorting order - NonComparable objects eg:StringBuffer
		TreeMap tm2 = new TreeMap();
		//tm2.put((new StringBuffer("Red")),100);  // RE:- cannot be casted to Comparable
		//System.out.println(tm2);
		
		
		System.out.println("===================================");
		//Default/Natural sorting order - Comparable objects eg:String
		TreeMap tm3 = new TreeMap();
		tm3.put((new String("Red")),100);  // String is a comparable 
		System.out.println("Comparable objects eg:String --> "+tm3);
		
		
		System.out.println("===================================");
		//Default/Natural sorting order - Homogeneous objects only
		TreeMap tm4 = new TreeMap();
		tm4.put((new String("RedSysTech")),100); 
		//tm4.put(100,40);  
		System.out.println("Homogeneous objects only allowed --> "+tm4);  // RE:- String cannot cast to Integer
	}
}
