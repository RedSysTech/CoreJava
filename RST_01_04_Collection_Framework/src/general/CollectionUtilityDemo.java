package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Agenda:-
 * -------
 * 1. Use of Collections class in java
 * 2. addAll
 * 3. sort
 * 4. copy
 * 5. fill
 * 6. Collections.synchronizedList(mylist)
 * 7. Collections.synchronizedSet(mySet); 
 * 8. Collections.synchronizedMap(myMap);
 */
public class CollectionUtilityDemo {

	public static void main(String[] args) {
		
		List countries = new ArrayList();
		Collections.addAll(countries, "USA", "CAN", "IND");
		System.out.println("Countries are:- "+countries);

		System.out.println("=====================================================");
		
		Collections.sort(countries);
		System.out.println("After Natural sorting:- "+countries);
		
		System.out.println("=====================================================");
		
		Collections.sort(countries,Comparator.reverseOrder());
		System.out.println("Reverse order:- "+countries);

		System.out.println("=====================================================");
		
		List mylist = new ArrayList();
		Collections.addAll(mylist, "SUN", "MON", "TUE", "WED");
		
		Collections.copy(mylist, countries);
		System.out.println("Extra elements copied:- "+mylist);
		
		System.out.println("=====================================================");
		
		
		Collections.fill(mylist, "dummy data");
		System.out.println("Filled with Dummy data:- "+mylist);
		
		System.out.println("=====================================================");
		
		//Collections.synchronizedList(mylist);
		//Collections.synchronizedSet(s1); 
		//Collections.synchronizedMap(m1);
			
	}

}
