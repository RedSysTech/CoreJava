package WaysToStopThreadExecution.sleep;

public class ChildThreadClass extends Thread{
	
	public void run() {
		
		for(int i=0;i<4;i++)
		{
			try {
				System.out.println("Child thread");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("child thread is interrupted by main thread");
			}
		}
	}
	
}
