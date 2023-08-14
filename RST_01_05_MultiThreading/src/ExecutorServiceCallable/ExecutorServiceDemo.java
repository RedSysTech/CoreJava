package ExecutorServiceCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ChildThread[] jobs = {new ChildThread("Karthik"), new ChildThread("Jai")};
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		Future f = null;
		
		for(ChildThread j: jobs) {
			f = service.submit(j);
		}
		System.out.println("f is --> "+f.get());
		
		service.shutdown();
	}

}
