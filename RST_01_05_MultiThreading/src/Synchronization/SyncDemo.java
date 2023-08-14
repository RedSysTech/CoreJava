package Synchronization;

public class SyncDemo {

	public static void main(String[] args) throws InterruptedException {
		
		Car c = new Car();
		ChildThread t1 = new ChildThread(c,"Slow");
		t1.start();
		
		ChildThread t2 = new ChildThread(c,"Fast");
		t2.start();
		
	}

}
