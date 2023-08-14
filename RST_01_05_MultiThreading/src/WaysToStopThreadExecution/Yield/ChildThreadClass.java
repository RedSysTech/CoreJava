package WaysToStopThreadExecution.Yield;

public class ChildThreadClass extends Thread{
	
	public void run() {
		for(int i=0;i<4;i++)
		{
			System.out.println("Child thread");
			Thread.yield(); // yield is a native method - underlying OS also should support
		}
	}
	
}
