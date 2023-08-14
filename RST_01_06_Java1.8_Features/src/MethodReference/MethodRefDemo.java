package MethodReference;

/*
 * Agenda:-
 * -------
 * 
 * What is Method reference? - it's a way of referring a method inside the functional interface.. eg: Runnable interface
 * 							   It is compact and easy form of lambda expression
 * 
 * How to use Method reference? - using the DOUBLE COLON (::) operator
 * 
 * Syntax: className :: methodName
 *         objRef    :: methodName
 *         
 *         Types: Referencing Static methods
 *         		  Referencing Instance methods
 *                Referencing Constructor
 *         
 * Practical Program:- Write a prgm to demonstrate Method reference with respect to Multithreading
 *       
 */
public class MethodRefDemo {

	public static void main(String[] args) {
	
//		MyThread mt = new MyThread();
//		Thread t = new Thread(mt);
//		t.start();
		
	
		Runnable r = MethodRefDemo::mt1;
		
		Thread t = new Thread(r);
		t.start();
		
	}
	
	public static void mt1() {
			System.out.println("inside run method from mt1...");
		}
}


