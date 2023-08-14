package set;

import java.util.TreeSet;

/* 
 * Agenda:-
 * ------
*  1. TreeSet is a Class in Java
*  2. TreeSet implements NavigableSet interface
 * 3. Underlying data structure - Balanced tree
 * 4. Default/Natural sorting order
 * 5. Duplicated - not allowed
 * 6. Heterogeneous objects - not allowed to insert
 * 7. insertion order - by default in some sorting order
 * 8. null insertion - not allowed
 */
public class TreeSetDefaultSortingDemo {

	public static void main(String[] args) {
		
		//Default/Natural sorting order - Strings
		TreeSet t1 = new TreeSet();
		t1.add("A");
		t1.add("B");
		t1.add("a");
		t1.add("b");
		t1.add("Z");
		System.out.println("By default sorted strings A to Z --> "+t1);
		
		//Default/Natural sorting order - numbers
		TreeSet t2 = new TreeSet();
		t2.add(10);
		t2.add(200);
		t2.add(30);
		t2.add(300);
		t2.add(50);
		System.out.println("By default sorted numbers in Ascedning order --> "+t2);
		
		
		//Default/Natural sorting order - NonComparable objects eg:StringBuffer
		TreeSet t6 = new TreeSet();
		//t6.add(new StringBuffer("Red"));  // RE:- cannot be casted to Comparable
		System.out.println("NonComparable objects are not allowed --> "+t6);
		
		//Default/Natural sorting order - Comparable objects eg:String
		TreeSet t7 = new TreeSet();
		t7.add(new String("Red"));  
		System.out.println("Only Comparable objects are allowed --> "+t7);
		
		//Default/Natural sorting order - Homogeneous objects only
		TreeSet t8 = new TreeSet();
		t8.add(new String("Red"));  
		t8.add(new String("White"));  
		t8.add("Black"); 
		System.out.println("Homogeneous objects only allowed --> "+t8);   // o/p:- [Black, Red, White] 
		
		//Default/Natural sorting order - Homogeneous objects
		TreeSet t9 = new TreeSet();
		t9.add(new String("Red"));  
		t9.add(new String("White"));  
		//t9.add(10); 				// RE:- String cannot cast to Integer
		System.out.println("String cannot cast to Integer --> "+t9);
		
		//Default/Natural sorting order - Duplicates not allowed
		TreeSet t10 = new TreeSet();
		t10.add(new String("Red"));  
		t10.add(new String("Red"));  
		t10.add("Black"); 
		t10.add("Red");
		t10.add("Black"); 
		System.out.println("Duplicates not allowed --> "+t10);  // o/p:- [Black, Red]
	}
}
