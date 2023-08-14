package Interthreadcomm;

public class AmazonThread extends Thread{
	
	public void run() {
		System.out.println("Amazon is going to deliver the order...");
		
		synchronized (this){
			this.notify();
			System.out.println("notified the waiting thread...");
		
		}
	}
}
