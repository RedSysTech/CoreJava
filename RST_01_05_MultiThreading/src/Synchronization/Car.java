package Synchronization;

public class Car {

	
	public static synchronized void drive(String name) throws InterruptedException {
		for(int i=0;i<3;i++) {
			System.out.println("I am driving"+name);
			Thread.sleep(2000);
		}
		
	}
	
}
