package set;

import java.util.Comparator;
import java.util.TreeSet;

/*
 * Agenda:-
 * ------
*  1. Customized sorting order - Numbers (Ascending & Descending order)
*  2. Customized sorting order - Strings (Ascending & Descending order)
*  3. Customized sorting order - NonComparable StringBuffer (Ascending & Descending order)
 */

public class TreeSetCustomSortingDemo {

	public static void main(String[] args) {
		//Customized sorting order - Numbers
		TreeSet t1 = new TreeSet(new myOwnIntgAscComparator());
		t1.add(10);
		t1.add(5);
		System.out.println(t1); 
		
		//Customized sorting order - Strings
		TreeSet t2 = new TreeSet(new myOwnStrAscComparator());
		t2.add("Red");
		t2.add("White");
		t2.add("Black");
		System.out.println(t2); 
		
		//Customized sorting order - NonComparable StringBuffer
		TreeSet t3 = new TreeSet(new myOwnStrBuffDescComparator());
		t3.add(new StringBuffer("Red"));
		t3.add(new StringBuffer("White"));
		t3.add(new StringBuffer("Black"));
		System.out.println(t3);

	}

}

class myOwnIntgAscComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	
		int addingNumber = (Integer) o1;
		int existingNumber = (Integer) o2;
		
		if(addingNumber < existingNumber) {
			return -1;
		}
		else if(addingNumber > existingNumber) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
}

class myOwnIntgDescComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	
		int addingNumber = (Integer) o1;
		int existingNumber = (Integer) o2;
		
		if(addingNumber < existingNumber) {
			return +1;
		}
		else if(addingNumber > existingNumber) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	
}

class myOwnStrAscComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	
		String addingNumber = (String) o1;
		String existingNumber = (String) o2;
		
		return addingNumber.compareTo(existingNumber);
		
	}
	
}

class myOwnStrDescComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	
		String addingNumber = (String) o1;
		String existingNumber = (String) o2;
		
		return - addingNumber.compareTo(existingNumber);
		
	}
	
}

class myOwnStrBuffAscComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	
		String addingNumber = o1.toString();
		String existingNumber =  o2.toString();
		
		return addingNumber.compareTo(existingNumber);
		
	}
	
}

class myOwnStrBuffDescComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	
		String addingNumber = o1.toString();
		String existingNumber = o2.toString();
		
		return - addingNumber.compareTo(existingNumber);
		
	}
	
}
