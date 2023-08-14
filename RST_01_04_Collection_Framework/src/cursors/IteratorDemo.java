package cursors;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Agenda:-
 * ------
 * 1. What is a cursor concept in Java?
 * 2. What is Iterator - it's an universal cursor - interface since JDK 1.2
 * 3. Why do we need to use Iterator? - read, remove elements in the Collection
 * 4. How to use Iterator?
 * 5. hasNext() - boolean - returns true till it finds the last element
 * 6. next() - gives the next element present inside the Collection
 * 7. remove() -  special method in Iterator - to remove an element from the Collection
 * 8. Real time use case:- Students database - retrieve only a particular student details
 */
public class IteratorDemo {

	public static void main(String[] args) {
		
		ArrayList studentsDB = new ArrayList();
		
		for(int i=0;i<10;i++) {
			studentsDB.add("Student"+i);
		}
		
		System.out.println("Entire Student database:- "+studentsDB);
		
		//declare Iterator
		Iterator i = studentsDB.iterator();
		
		//how to use Iterator?
		while(i.hasNext()) {
			String s = (String)i.next();
			
			if(s.equals("Student7")) {
			  i.remove();
			}
			
			
		}
		
		System.out.println("Entire Student database after the removal:- "+studentsDB);
		
	}
}
