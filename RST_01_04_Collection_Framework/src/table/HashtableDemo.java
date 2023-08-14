package table;

import java.util.Hashtable;
/* 
 * Agenda:-
 * ------
*  1. Hashtable is a Class in Java
*  2. Hashtable implements Map interface and also extends Dictionary (abstract class)
 * 3. Underlying data structure - Hashtable
 * 4. Duplicate Keys - not allowed
 * 5. Duplicate Values - allowed
 * 6. Heterogeneous keys - allowed 
 * 7. Heterogeneous values - allowed
 * 8. insertion order - based on the hashCode() of the keys.
 * 9. null keys insertion - not allowed, because hashCode() of the null keys throws errors.
 * 10. null values insertion - not allowed, because internal implementation throws Runtime Null pointer exception
 */
public class HashtableDemo {

	public static void main(String[] args) {
		 
		Hashtable ht = new Hashtable(); // initial capacity = 11
		 
		ht.put(new Employee(10), "USA"); // 10%11 = 10
		ht.put(new Employee(200), "IND"); // 200%11 = 2
		ht.put(new Employee(100), "CA"); // 100%11 = 1
		ht.put(new Employee(50), "AUS"); // 50%11 = 6
		ht.put(new Employee(300), "NZ"); // 300%11 = 3
		ht.put(new Employee(56), "UK"); // 56%11 = 1
		
		
		System.out.println("Hashtable contains --> "+ht);

	}

}

class Employee{
	
	int empId;
	
	Employee(int empID){
		this.empId = empID;
	}
	
	@Override
	public int hashCode() {
		
		return empId;
	}
	
	@Override
	public String toString() {
		return empId+"";
	}
}
