/*
 * Types of Inheritance in Java:
 * ----------------------------
 * 1. Single 
 * 2. Multilevel
 * 3. Multiple - DOES NOT SUPPORT MULTIPLE INHERITANCE!!!
 * 4. Hierarchy
 * 
 */


class Employee{
	
	int salary = 10000;
}

class Developer extends Employee{
	
	int bonus = 500;
}

class JavaDeveloper extends Employee{
	
	int extraBonus = 700;
}

public class InheritanceDemo{
	
	public static void main(String [] args) {
		
		JavaDeveloper jd = new JavaDeveloper();
		//System.out.println(jd.bonus);
		System.out.println(jd.salary);
		System.out.println(jd.extraBonus);
	}
}







