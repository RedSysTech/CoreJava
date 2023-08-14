package Deadlock;

public class Courier {

	public static void main(String[] args) {
		
		Person1 p1 = new Person1();
		Person2 p2 = new Person2();
		 
		p1.start();
		p2.start();
		
		p1.m1(p2); // main thread
		
		System.out.println("after deadlock...");

	}

}
