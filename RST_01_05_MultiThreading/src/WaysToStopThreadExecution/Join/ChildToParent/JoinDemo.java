package WaysToStopThreadExecution.Join.ChildToParent;

public class JoinDemo {

	public static void main(String[] args) {
	
		
		ChildThreadClass t1 = new ChildThreadClass();
		t1.mt = Thread.currentThread();
		t1.start();
		
		for(int i=0;i<4;i++)
		{
			System.out.println("Main thread");
		}

	}

}
