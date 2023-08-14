package ThreadConstructors;

public class MyThreadDemo {

	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		System.out.println("t1-->"+t1.getName());
		
		MyRunnable r = new MyRunnable();
		Thread t2 = new Thread(r);
		System.out.println("t2-->"+t2.getName());
		
		Thread t3 = new Thread("RedSysTech-3");
		System.out.println("t3-->"+t3.getName());
		
		Thread t4 = new Thread(r, "RedSysTech-4");
		System.out.println("t4-->"+t4.getName());
		
		ThreadGroup g1 = new ThreadGroup("1st TG");
		Thread t5 = new Thread(g1, "RedSysTech-5");
		System.out.println("t5-->"+t5.getName());
		System.out.println("t5-->"+t5.getThreadGroup().getName());
		
		Thread t6 = new Thread(g1, r);
		System.out.println("t6-->"+t6.getThreadGroup().getName());
		
		Thread t7 = new Thread(g1, r, "RedSysTech");
		System.out.println("t7-->"+t7.getThreadGroup().getName());
		
		Thread t8 = new Thread(g1, r, "RedSysTech", 10);
		System.out.println("t8-->"+t8.getThreadGroup().getName());
	}

}
