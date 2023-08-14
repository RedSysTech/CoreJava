package WaysToDefineThread;

public class MyRunnableDemo {

	public static void main(String[] args) {
		MyRunnable r = new MyRunnable();
		Thread t = new Thread(r); // create thread object
		t.start();

		System.out.println("inside main thread"); // this line is executed by main thread.
	}

}
