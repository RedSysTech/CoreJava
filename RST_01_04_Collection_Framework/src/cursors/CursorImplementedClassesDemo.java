package cursors;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

/*
 * Agenda:-
 * ------
 * What are the implemented classes of,
 *    1. Enumeration (I)
 *    2. Iterator (I)
 *    3. ListIterator (I)
 */
public class CursorImplementedClassesDemo {

	public static void main(String[] args) {
	
		Vector v = new Vector();
		Enumeration e = v.elements();
		System.out.println(e.getClass().getName());
		
		
		ArrayList al = new ArrayList();
		Iterator i = al.iterator();
		System.out.println(i.getClass().getName());
		
		
		LinkedList l = new LinkedList();
		ListIterator li = l.listIterator();
		System.out.println(li.getClass().getName());

	}

}
