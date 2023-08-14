package constructor;
/*
 * Agenda:-
 * -------
 * 1. Need for a Constructor? - Ans:- to perform initialization for instance variables
 * 2. What is a Constructor? 
 * 3. How to write a Constructor?
 * 4. What is a Default constructor?
 * 5. Rules for a Constructor?
 * 			1. Same name as Class name
 * 			2. No return type
 * 6. Where are the constructors applicable? 
 * 		Ans:- Every class including Abstract class but not Interface (no instance variables as all are public static final) 
 */

class Student{	

	int rollNo;
	String name;
	
	 Student(){
		System.out.println("inside def. constructor");
		rollNo = 10;
	}
	 
	 Student(int rollNo){
			System.out.println("inside customized constructor");
			this.rollNo = rollNo;
		}
	
}

public class ConstructorDemo {

	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println(s.rollNo);
		System.out.println(s.name);
		
		
		Student s1 = new Student(100);
		System.out.println(s1.rollNo);
		System.out.println(s1.name);
	}
}
