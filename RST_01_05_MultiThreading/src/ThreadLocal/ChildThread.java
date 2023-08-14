package ThreadLocal;

public class ChildThread implements Runnable {

	String name;
	
	ChildThread(String name){
		this.name = name;
	}
	
	int count = 0;
	ThreadLocal tl = new ThreadLocal() {
		// overriding the initial value
		
		public Object initialValue() {
			return ++count;
		}
	};
	
	public void run() {
		for(int i=1;i<3;i++)
		{
			System.out.println("inside child thread --> "+name+" --> "+Thread.currentThread().getName()+" --> "+tl.get());
			try {
				Thread.sleep(2000); // 2 sec
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}
