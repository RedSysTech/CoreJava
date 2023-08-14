package ReentrantLocks;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLocksConsMethodsDemo {

	public static void main(String[] args) {
		
		ReentrantLock l = new ReentrantLock(); // get the object of the lock
		
		l.lock(); // main thread is executing this line.. so MT got this lock
		l.lock(); // Reentrant means the same thread can get the lock any no. of times
		
		System.out.println("l.getHoldCount()"+l.getHoldCount()); // the lock is holded by MT two times
		System.out.println("l.getQueueLength()"+l.getQueueLength()); //how many other threads are waiting for this lock
		System.out.println("l.hasQueuedThreads()"+l.hasQueuedThreads()); // true if any other threads are waiting for this lock 
		System.out.println("l.isLocked()"+l.isLocked()); // true
		System.out.println("l.isFair()"+l.isFair()); // def, it's false
		System.out.println("l.isHeldByCurrentThread()"+l.isHeldByCurrentThread()); // true, becoz the current thread which is MT is holding the lock 
		
		l.unlock();
		
		System.out.println("l.getHoldCount()"+l.getHoldCount());
		
	}

}
