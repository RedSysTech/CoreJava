package WaysToStopThreadExecution.Join;

public class JoinDemo {

	public static void main(String[] args) {
		
		ChildThreadClass t1 = new ChildThreadClass();
		t1.start();
		
		// this line of code is executed by Main thread.
		// if main thread wants to wait till the child thread completes, 
		// then main thread has to call child thread's join
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Main thread");
		}

	}

}
