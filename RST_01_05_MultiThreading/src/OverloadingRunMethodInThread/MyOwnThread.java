package OverloadingRunMethodInThread;

public class MyOwnThread extends Thread{
	
	//job of the thread
	public void run() {
		System.out.println("----------------------");
		System.out.println("Inside child thread");
		System.out.println("Curent thread inside child class:-"+Thread.currentThread().getName());
	    System.out.println("----------------------");
	}
	
	public void run(int x) {
		System.out.println("----------------------");
		System.out.println("Inside overloaded run method...");
		System.out.println("Curent thread inside child class:-"+Thread.currentThread().getName());
	    System.out.println("----------------------");
	}
	
}
