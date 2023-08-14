package LambdaRelatedToMultithreading;
/*
 *  Agenda:-
 *  -------
 * How to write a Lambda expression with respect to Multi-threading. eg:- Runnable interface
 * 
 * Practical eg:- Write a prgm to start a thread and execute it's job using lambda.
 */
public class Demo {

	public static void main(String[] args) {
		
		
		
		// how to use lambda to multithreading?
		Runnable r1 = () -> {
			System.out.println("inside run method using lambda...");

		} ;
		Thread t1 = new Thread(r1);
		t1.start();
		

	}

}
