package Daemon;

public class MainThreadDemo {

	public static void main(String[] args) {
		System.out.println("is the main thread Daemon? --> "+Thread.currentThread().isDaemon()); // is the main thread Daemon? false
		
		//Thread.currentThread().setDaemon(true);
		
		ChildThread ct = new ChildThread();
		System.out.println("is the newly created thread Daemon? --> "+ct.isDaemon()); // false
		
	
		ct.setDaemon(true);
		System.out.println("after set it to Daemon: "+ct.isDaemon()); // true

	}

}
