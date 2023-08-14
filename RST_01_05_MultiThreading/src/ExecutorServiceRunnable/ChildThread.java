package ExecutorServiceRunnable;

public class ChildThread implements Runnable {

	String name;
	
	ChildThread(String name){
		this.name = name;
	}
	public void run() {
		for(int i=1;i<3;i++)
		{
			System.out.println("inside child thread --> "+name+" --> "+Thread.currentThread().getName());
			try {
				Thread.sleep(2000); // 2 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
