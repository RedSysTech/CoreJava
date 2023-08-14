package ReentrantLockDemo;

public class ReentrantMain {

	public static void main(String[] args) {
		 
		Car c = new Car();
		
		ChildThread ct1 = new ChildThread(c,"Fast");
		ct1.start();
		
		ChildThread ct2 = new ChildThread(c,"Slow");
		ct2.start();
	}

}
