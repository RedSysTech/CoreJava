package Deadlock;

public class Person2 extends Thread{

	Person1 p1;
	
	synchronized void m1(Person1 p1){
		p1.m1(this);
	}
}
