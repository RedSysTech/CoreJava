package Synchronization;

public class ChildThread extends Thread{

	Car c;
	String name;
	
	ChildThread(Car c,String n){
		this.name = n;
		this.c = c;
	}
	
	public void run() {
		try {
			c.drive(name);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
