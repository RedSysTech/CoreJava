package system_exit;

/*
 * Agenda:
 * -----
 * 
 * What will happen if i use System.exit() inside the try block. Will the finally blocks get executed or not?
 * 
 * exit(0) vs exit(1) vs exit(-1)
 * 
 * Ans:- a nonzero status code indicates abnormal termination.
 * 
 */
public class System_exit {

	public static void main(String[] args) {
		
		try {
			System.out.println("inside try");
			//System.exit(0); // current jvm is terminated
			
			System.exit(1);
		}
		finally {
			System.out.println("inside finally");
		}
	}

}
