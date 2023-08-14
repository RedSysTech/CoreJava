package WaysToStopThreadExecution.Join;

public class ChildThreadClass extends Thread{
	
	public void run() {
		for(int i=0;i<4;i++)
		{
			System.out.println("Child thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
