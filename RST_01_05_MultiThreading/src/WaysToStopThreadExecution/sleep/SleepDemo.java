package WaysToStopThreadExecution.sleep;

public class SleepDemo {

	public static void main(String[] args) {
		ChildThreadClass t1 = new ChildThreadClass();
		t1.start();
		//t1.interrupt(); // main thread is interrupting child thread
		for(int i=0;i<4;i++)
		{ 
			System.out.println("Main thread");
		}

	}

}
