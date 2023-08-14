package ThreadPriorities;

/*
 * What is Priority? - Importance
 * Why Priority? - in which order you want threads to execute
 * Priority range = 1 to 10
 * Min Priority = 1
 * Max Priority = 10
 * Normal Priority = 5
 * 
 * Default priority of the "main" thread = 5
 * Default priority of all other threads = inherit from it's parent
 * 
 * t.getPriority()
 * t.setPriority()
 * 
 */
public class MyThreadDemo {

	public static void main(String[] args) {
		System.out.println("Main thread's priority -->"+Thread.currentThread().getPriority());
		MyOwnThread t = new MyOwnThread();
		t.start();
		System.out.println(t.getPriority());
		t.setPriority(10); // some OS doesn't support the thread priorities... that's why the o/p is inconsistent
		System.out.println(t.getPriority());
		System.out.println("inside main thread");

	}

}
