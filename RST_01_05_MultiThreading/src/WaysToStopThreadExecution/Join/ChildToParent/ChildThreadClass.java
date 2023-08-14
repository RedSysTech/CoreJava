package WaysToStopThreadExecution.Join.ChildToParent;

public class ChildThreadClass extends Thread{
	
	Thread mt;
	public void run() {
		try {
			mt.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
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
