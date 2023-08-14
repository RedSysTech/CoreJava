package list;

import java.util.Iterator;
import java.util.LinkedList;

/*
 * Agenda:
 * ------
 * 
 * LinkedList creation
 * 
 * Adding Hetrogeneous objects to an LinkedList
 * 
 * Allows Duplicates
 * 
 * Insertion Order is Maintained
 * 
 * Underlying Data Structure:- Double linked list
 * 
 * Null insertion is possible
 * 
 */
public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList l1 = new LinkedList();  // LinkedList creation
		
		System.out.println(l1);
		System.out.println(l1.size());
		
		l1.add("r");
		l1.add("e");
		l1.add('d'); // Hetrogeneous objects
		
		System.out.println(l1);
		System.out.println(l1.size());
		
		l1.add("r");
		l1.add("e");
		l1.add('d'); // duplicates allowed
		
		System.out.println(l1);
		System.out.println(l1.size());
		
		l1.add(null); // null insertion allowed
		
		System.out.println(l1);
		System.out.println(l1.size());	
		
		System.out.println(l1.getFirst()); // get the first element/object
		System.out.println(l1.getLast()); // get the last element/object
		
		l1.addFirst("RedSysTech"); // add the first element/object
		l1.addLast("channel"); // add the last element/object
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		System.out.println(l1.removeFirst()); // removes the first element/object
		System.out.println(l1.removeLast()); // removes the last element/object
		
		System.out.println("-----Iterator----");
		Iterator<LinkedList> itr = l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		l1.clear(); // removes all the elements
		
		System.out.println(l1);
		System.out.println(l1.size());
		
	}

}
