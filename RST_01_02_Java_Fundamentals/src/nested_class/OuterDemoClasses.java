package nested_class;

/*
 * Anonymous inner class - inner class without a name and for which only a single object is created.
 * 
 * Syntax: like the invocation of a constructor, except a class definition in a block of code.
 */

class Student{
	int rollNo;
	
	void display() {
		
	}
}

public class OuterDemoClasses {
	
	public static void main(String[] args) {

	Thread t = new Thread() {
		public void run() {
			System.out.println("child thread");
		}
	};
	t.start();
	System.out.println("MAIN THREAD");
	
	
	Runnable r = new Runnable() {
		
		@Override
		public void run() {
			System.out.println("inside runnable run method..");
			
		}
	};
	Thread t1 = new Thread(r);
	t1.start();
	System.out.println("MAIN THREAD FROM RUNABLE INTERFACE...");
	
		
	Student s1 = new Student() {
		
		//overriding without extending a class..
		
		void display() {
			System.out.println("displaying student..");
		}
	};
	
	s1.display();	
}
	
	
}


