package cursors;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Agenda:-
 * ------
 * 1. What is a cursor concept in Java?
 * 2. What is ListIterator - it's an interface extends Iterator interface - since JDK 1.2 - Bidirectional movement
 * 3. Why do we need to use ListIterator? - to read, remove, replace, add the elements in List Collections only
 * 4. How to use ListIterator?
 * 5. listIterator() -  returns the elements in a proper sequence
 * 6. listIterator(int index) -  returns the elements starting from the given index
 * 
 * Forward:- 
 * 7. hasNext() - boolean - returns true till it finds the last element
 * 8. next() - gives the next element present inside the Collection
 * 9. nextIndex() -  to know the index of the next element inside the Collection
 * 
 * Backward:-
 * 10. hasPrevious() - boolean - traverse backwards and returns true till it finds the last element
 * 11. previous() - gives the next element present inside the Collection
 * 12. previousIndex() -  to know the index of the previous element inside the Collection
 * 
 * 13. set(Object newObj) - to replace the current object with the newObj
 * 14. add(Object newObj) - to add the newObj
 * 15. remove() -  special method in Iterator - to remove an element from the Collection
 * 
 * 16. Real time use case:- Students database - retrieve only a particular student details
 */
public class ListIteratorDemo {

	public static void main(String[] args) {
		
		ArrayList studentsDB = new ArrayList();
		for(int i=0;i<10;i++) {
			studentsDB.add("Student"+i);
		}
		System.out.println("Entire Student database:- "+studentsDB);
		
		System.out.println("============================================================");
		
		//declare ListIterator
		ListIterator li = studentsDB.listIterator();
		while(li.hasNext()) {
			String s = (String) li.next();
			if(s.equals("Student7")) {
			System.out.println("Found the student -> "+s+" and going to remove him...");
			li.remove(); // special method in Iterator
			}
		}
		System.out.println("Student database after removal:- "+studentsDB);

		System.out.println("============================================================");
		
		//print the elements forward direction from a particular index. eg:- starts from Student3
		ListIterator li1 = studentsDB.listIterator(3);
		while(li1.hasNext()) {
			String s = (String) li1.next();
			System.out.println("Print the students from Student3:- "+s);
		}
		System.out.println("What's the next index:- "+li1.nextIndex());
		
		System.out.println("============================================================");
		
		//print the elements backward direction from a particular index. eg:- backwards from Student3
		ListIterator li2 = studentsDB.listIterator(3);
		while(li2.hasPrevious()) {
			String s = (String) li2.previous();
			System.out.println("Print the students backwards from Student5:- "+s);
		}
		System.out.println("What's the previous index:- "+li2.previousIndex());
	
		System.out.println("============================================================");
		
		//add(Object newObj)
		LinkedList countryList = new LinkedList();
		countryList.add("USA");
		countryList.add("CANADA");
		System.out.println("countryList BEFORE Adding:-->"+countryList);
		
		ListIterator cli = countryList.listIterator();
		while(cli.hasNext()) {
			if(cli.next().equals("CANADA")) {
				cli.add("INDIA");
			}
		}
		System.out.println("countryList AFTER Adding:-->"+countryList);
		
		System.out.println("============================================================");
		
		//set(Object newObj)
		LinkedList techList = new LinkedList();
		techList.add("JAVA");
		techList.add("PYTHON");
		System.out.println("techList Contains:-->"+techList);
		
		ListIterator chli = techList.listIterator();
		chli.next();
		chli.set("C");
		System.out.println("techList AFTER Replace:-->"+techList);
		
		System.out.println("============================================================");
		
	}
}
