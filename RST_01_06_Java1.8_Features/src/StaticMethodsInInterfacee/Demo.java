package StaticMethodsInInterfacee;

/*
 * Agenda:-
 * -------
 * 
 * Practical prgm:- How to use the static methods inside a interface since JDK 1.8?
 */
public class Demo {

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Karthik");
		System.out.println(e1.empId);
		System.out.println(e1.empName);
		System.out.println(Employee.compName);
		
		System.out.println(Test.getRating(2, 2));
	}

}

interface Test{
	
	public static int getRating(int a, int b) {
		return a+b;
	}
}

class Employee implements Test{
	// instance var
	int empId;
	String empName;
	
	// static var
	static String compName = "RedSysTech";

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	
	
	
}




