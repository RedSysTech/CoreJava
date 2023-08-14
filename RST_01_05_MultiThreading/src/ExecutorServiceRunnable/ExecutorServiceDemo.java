package ExecutorServiceRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		ChildThread[] jobs = {new ChildThread("Karthik"), new ChildThread("Jai")};
		ExecutorService service = Executors.newFixedThreadPool(3);
		 
		for(ChildThread j: jobs) {
			service.submit(j);
		}
		
		service.shutdown();
	}

}
