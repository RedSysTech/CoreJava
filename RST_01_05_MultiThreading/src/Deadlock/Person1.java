package Deadlock;

public class Person1 extends Thread{

	Person2 p2;
	
	synchronized void m1(Person2 p2){
		p2.m1(this);
	}
	
	

}
