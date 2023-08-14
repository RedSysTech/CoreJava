package LambdaRelatedToCollections;

public class Employee {
	
	private Integer empID;
	private String empName;
	private int salary;
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
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
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + "]";
	}
	public Employee(Integer empID, String empName, int salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}
	
	
	
	

}
