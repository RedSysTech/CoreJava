package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Agenda:-
 * -------
 * 
 * 1. What is Comparator Interface?
 * 2. Why do we need Comparator Interface? - custom sorting 
 * 3. How Comparator Interface works internally? - 'compare' method is used to compare objects 
 * Eg:- compare(Employee addingEmployee, Employee existingEmployee)
 * 
 */
public class ComparatorDemo {

	public static void main(String[] args) {
		
		List l = new ArrayList();
		
		l.add(100);
		l.add(500);
		l.add(876);
		l.add(50);
		
		System.out.println("maintained the insertion order --> "+l);
		
		Collections.sort(l);
		
		System.out.println("default sorted --> "+l);
		
		List empList = new ArrayList<Employee>();
		empList.add(new Employee(123, "John",1000));
		empList.add(new Employee(456, "Kumar",2000));
		empList.add(new Employee(789, "San",350));
		empList.add(new Employee(99, "Maddy",3000));
		
		System.out.println("maintained the insertion order --> "+empList);
		
		  Collections.sort(empList,new Comparator<Employee>() {
		  
		  @Override 
		  public int compare(Employee addingEmployee, Employee existingEmployee) 
		  { 
			  if(addingEmployee.getSalary() > existingEmployee.getSalary()) 
			  { 
				  return -1; 
			  } 
			  else { 
				  return 1; 
				  } 
			  }
		  });
		  
		System.out.println("sorted based on Salary --> "+empList);	
	}
}


class Employee{
	
	int empID;
	String empName;
	int salary;
	
	
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + "]";
	}

	public Employee(int empID, String empName, int salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
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

