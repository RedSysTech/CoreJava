package cursors;

import java.util.Enumeration;
import java.util.Vector;

/*
 * Agenda:-
 * ------
 * 1. What is a cursor concept in Java? - it's like a pointer to get the elements from the Collection
 * 2. What is Enumeration - it's an interface since JDK 1.0
 * 3. Why do we need to use Enumeration? - to get elements one by one from the Collection
 * 4. How to use Enumeration?
 * 5. hasMoreElements() - boolean - returns true till it finds the last element
 * 6. nextElement() - gives the next element present inside the Collection
 * 7. Real time use case:- Students database - retrieve only a particular student details
 */ 
public class EnumerationDemo {
 
	public static void main(String[] args) {
		
		Vector studentsDB = new Vector();
		
		for(int i=0;i<10;i++) {
			studentsDB.addElement("Student"+i);
		}
		
		System.out.println("Entire Student database:- "+studentsDB);
		
		//declare Enumeration
	    Enumeration e = studentsDB.elements();
	
		
		// get the elements by Enumeration
		while(e.hasMoreElements()) {
			String s = (String)e.nextElement();
			
			if(s.equals("Student7")) {
				System.out.println(s);
			}
			
		}
		
		
	}
}
