package ThreadGroups;

public class TGConstructors {

	public static void main(String[] args) {
		
		//Constructors
		ThreadGroup g1 = new ThreadGroup("1st TG");
		System.out.println(g1.getParent().getName()); // Ans:- main... Reason:-because it's executed by main thread
		
		ThreadGroup g2 = new ThreadGroup(g1, "2nd TG");
		System.out.println(g2.getParent().getName());// Ans:- 1st TG... Reason:-because it's given with the name when it's created.
		
		//methods
		System.out.println(g1.getName());
		System.out.println(g1.getMaxPriority()); // g1 tg's max priority
		System.out.println(g1.getParent().getMaxPriority()); // main TG's max priority
		
		g1.list(); // it prints the info about the TG. Just for debugging purpose only..
		
		System.out.println(g1.activeCount()); // returns no. of active threads inside the g1 TG
		
		System.out.println(g1.activeGroupCount());// returns no. of active TG inside the g1 TG
		
		Thread[] t = new Thread[5];
		g1.enumerate(t); // to copy the active threads in g1 to the thread array t
		System.out.println("There are no active threads in g1 to be copied to array t --> "+g1.activeCount());
		
		for(Thread t1: t) {
			System.out.println("iterate the threads..--> "+t1);
		}
		
		ThreadGroup[] tg = new ThreadGroup[5];
		g1.enumerate(tg); // to copy the active Thread Sub Group's in g1 to the thread array tg
		System.out.println("There are no active thread Sub groups in g1 to be copied to array tg --> "+g1.activeCount());
		
		
		for(ThreadGroup tg1: tg) {
			System.out.println("iterate the THREADGROUPs.."+tg1);
		}
		
		System.out.println("g1.isDaemon()? "+g1.isDaemon()); // to check if the TG is daemon or not?
		
		g1.setDaemon(true); // to set the TG as Daemon
		
		System.out.println("g1.isDaemon() after setting? "+g1.isDaemon());
		
		g1.interrupt(); //  to interrupt all the WAITING / SLEEPING threads inside the TG g1.
		
		
		g1.destroy(); // to destroy the TG g1 and it's all sub TG's inside the g1
		
		
		System.out.println("====================");
		// write a pgm to print all the active threads under the system TG
		ThreadGroup s = Thread.currentThread().getThreadGroup().getParent();
		Thread[] count = new Thread[s.activeCount()];
		s.enumerate(count);
		
		for (Thread t1: count) {
			System.out.println(t1.getName());
		}
		
	}

}
