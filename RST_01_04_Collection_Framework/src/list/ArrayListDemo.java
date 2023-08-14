package list;

import java.util.ArrayList;
import java.util.List;

/*
 * Agenda:
 * ------
 * 
 * ArrayList creation
 * 
 * Adding Hetrogeneous objects to an ArrayList
 * 
 * Allows Duplicates
 * 
 * Insertion Order is Maintained
 * 
 * Growable Array
 * 
 * Null insertion is possible
 * 
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		
		List al = new ArrayList();  // ArrayList creation
		System.out.println(al);
		System.out.println(al.size());
		al.add("r");
		al.add("e");
		al.add('d'); // Hetrogeneous objects
		System.out.println(al);
		System.out.println(al.size());
		al.add("r");
		al.add("e");
		al.add('d'); // duplicates allowed
		System.out.println(al);
		System.out.println(al.size());
		al.add(null); // null insertion allowed
		System.out.println(al);
		System.out.println(al.size());	
	}

}
