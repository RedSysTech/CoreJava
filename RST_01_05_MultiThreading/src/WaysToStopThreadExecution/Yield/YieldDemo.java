package WaysToStopThreadExecution.Yield;

/*
 * yield is a native method in Java
 * 
 * Practical use case example:
 * A person standing in line is not given chance by other person.
 * 
 */
public class YieldDemo {

	public static void main(String[] args) {
		
		ChildThreadClass t1 = new ChildThreadClass();
		t1.start();
		for(int i=0;i<4;i++)
		{
			System.out.println("Main thread");
		}

	}

}
