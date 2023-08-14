package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Agenda:-
 * -------
 * 
 * 1. What is Comparable Interface?
 * 2. Why do we need Comparable Interface? - default sorting 
 * 3. How Comparable Interface works internally? - 'compareTo' method is used to compare objects 
 * Eg:- addingObj.compareTo(existingObj)
 * 
 */
public class ComparableDemo {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(100);
		l.add(500);
		l.add(876);
		l.add(50);
		
		System.out.println("maintained the insertion order --> "+l); // maintained the insertion order
		
		Collections.sort(l); // if i want to sort by Natural sorting - i.e., Ascending order for integers
		
		System.out.println("default sorted --> "+l);
		
		List empList = new ArrayList<EmployeeData>(); // ArrayList of EmployeeData objects
		
		empList.add(new EmployeeData(123, "John",1000));
		empList.add(new EmployeeData(456, "Kumar",2000));
		empList.add(new EmployeeData(789, "San",350));
		empList.add(new EmployeeData(99, "Maddy",3000));
		
		System.out.println("maintained the insertion order --> "+empList); // maintained the insertion order
		
		Collections.sort(empList); // if i want to sort by Natural sorting - i.e., Ascending order for EmpID
		
		System.out.println("default sorted --> "+empList);
		
	}

}


class EmployeeData implements Comparable<EmployeeData>{
	
	int empID;
	String empName;
	int salary;
	
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + "]";
	}

	public EmployeeData(int empID, String empName, int salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(EmployeeData ed) {
		// TODO Auto-generated method stub
		if (this.empID < ed.empID) {
            return -1;
        } else if (this.empID > ed.empID) {
            return 1;
        } else {
            return 0;
        }
	}

	
	//Getters and Setters
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}

