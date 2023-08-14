package OverloadingRunMethodInThread;

public class MyThreadDemo {

	public static void main(String[] args) {
		
		MyOwnThread t = new MyOwnThread(); // thread instantiation
		t.run(); //  starting a thread
		System.out.println("----------------------");
		System.out.println("Curent thread inside main class:-"+Thread.currentThread().getName());
		System.out.println("inside main thread"); // this line is executed by main thread.
		
	}

}
