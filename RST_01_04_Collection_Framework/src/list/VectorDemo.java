package list;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*
 * Agenda:
 * ------
 * 
 * Vector creation
 * 
 * Adding Heterogeneous objects to a Vector
 * 
 * Allows Duplicates
 * 
 * Insertion Order is Maintained
 * 
 * Underlying Data Structure:- Growable Array
 * 
 * Null insertion is possible
 * 
 * Serializable, Clonable, RandomAccess
 * 
 * Synchronized - Thread Safe
 * 
 */
public class VectorDemo {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();  // Vector creation
		
		System.out.println(v1);
		System.out.println(v1.size());
		
		v1.addElement("r");
		v1.addElement("e");
		v1.addElement('d'); // Heterogeneous objects
		
		System.out.println(v1);
		System.out.println(v1.size());
		
		v1.addElement("r");
		v1.addElement("e");
		v1.addElement('d'); // duplicates allowed
		
		System.out.println(v1);
		System.out.println(v1.size());
		
		v1.addElement(null); // null insertion allowed
		
		System.out.println(v1);
		System.out.println(v1.size());	
		
		
		v1.removeElement("r"); // remove particular element
		
		System.out.println(v1);
		System.out.println(v1.size());
		
		v1.removeElementAt(1); // remove element at a particular index
		
		System.out.println(v1);
		System.out.println(v1.size());
		
		System.out.println(v1.firstElement()); // remove first element
		System.out.println(v1.lastElement()); // remove last element
		
		// Enumerator
		
		Enumeration er = v1.elements(); // enumerate
		while(er.hasMoreElements()) {
			System.out.println(er.nextElement());
		}
		
		v1.removeAllElements(); // remove all the elements from Vector class
		
		System.out.println(v1);
		System.out.println(v1.size());
		
	}

}
