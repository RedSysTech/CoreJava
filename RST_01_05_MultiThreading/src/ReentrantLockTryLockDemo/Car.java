package ReentrantLockTryLockDemo;

import java.util.concurrent.locks.ReentrantLock;

public class Car {

	/*
	 * public synchronized void Drive(String name) throws InterruptedException {
	 * for(int i=1;i<3;i++) { System.out.println("I am driving "+name);
	 * Thread.sleep(2000); } }
	 */
	
	// instead of using synchronized, i want to use ReentrantLock
	
	ReentrantLock l = new ReentrantLock();
	
	public  void Drive(String name) throws InterruptedException {
		 
		if(l.tryLock())
		{
			 for(int i=1;i<3;i++) 
			 { 
				 System.out.println("I am driving "+name);
				 Thread.sleep(2000); 
			 } 
			 l.unlock();
		}
		else {
			System.out.println("perform some other operations...");
		}
		
	}
	
	
	
}
