package LambdaRelatedToCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 *  Agenda:-
 *  -------
 * How to write a Lambda expression with respect to Collections. eg:- Comparator interface
 * 
 * Practical eg:- Write a prgm to sort the given Employee records based on the Emp Name using Lambda.
 */
public class Demo {

	public static void main(String[] args) {
		List<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(20, "Karthik", 600));
		l.add(new Employee(40, "Jai", 200));
		l.add(new Employee(2, "San", 700));
		
		System.out.println("before sorting-->"+l);
		
		//Collections.sort(l, new EmpSort());
		//Collections.sort((List) l);
		
		Collections.sort(l, (e1,e2)->e1.getEmpID().compareTo(e2.getEmpID()));
		
		
		System.out.println("after sorting-->"+l);
		
		
		
	}

}
