package Interthreadcomm;

public class MainThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		AmazonThread at = new AmazonThread();
		at.start();
		
		System.out.println("===== MAIN THREAD IS EXECUTING ======");
	    synchronized(at) { 
	      System.out.println("main thread is going to wait for the Amazon's delivery...");
		  at.wait();
		  System.out.println("main thread got notified.. thx"); 
		  }
	}
}
