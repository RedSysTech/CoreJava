package map;

import java.util.Comparator;
import java.util.TreeMap;

public class CustomSortingTreeMapDemo {

	public static void main(String[] args) {
		//Customized sorting order - Numbers
		TreeMap t1 = new TreeMap(new myOwnIntgAscComparator());
		t1.put(10,'Z');
		t1.put(100,'G');
		t1.put(20,'L');
		t1.put(200,'S');
		System.out.println(t1); // {10=Z, 20=L, 100=G, 200=S}
		
		//Customized sorting order - Strings
		TreeMap t2 = new TreeMap(new myOwnStrAscComparator());
		t2.put("Red",100);
		t2.put("White",350);
		t2.put("Black",10);
		System.out.println(t2);  // {Black=10, Red=100, White=350}
		
		//Customized sorting order - NonComparable StringBuffer
		TreeMap t3 = new TreeMap(new myOwnStrBuffDescComparator());
		t3.put((new StringBuffer("Red")),100);
		t3.put((new StringBuffer("White")),350);
		t3.put((new StringBuffer("Black")),10);
		System.out.println(t3);   // {White=350, Red=100, Black=10}

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
