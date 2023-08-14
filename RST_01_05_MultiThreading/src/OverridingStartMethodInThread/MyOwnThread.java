package OverridingStartMethodInThread;

public class MyOwnThread extends Thread{
	
	//job of the thread
	public void run() {
		System.out.println("********");
		System.out.println("Inside child thread");
		System.out.println("Curent thread inside child class:-"+Thread.currentThread().getName());
		System.out.println("********");
	}
	
	//overriding the start method..
	public void start() {
		System.out.println("********");
		System.out.println("Inside overriden start method..");
		System.out.println("Curent thread inside overriden start method:-"+Thread.currentThread().getName());
		System.out.println("********");
	}
}
