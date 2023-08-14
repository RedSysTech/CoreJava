package GetSetThreadNames;

public class MyThreadDemo {

	public static void main(String[] args) {
		
		MyOwnThread t = new MyOwnThread(); // thread instantiation
		t.start(); //  starting a thread
		System.out.println("----------------------");
		System.out.println("Curent thread inside main class:-"+Thread.currentThread().getName());
		Thread.currentThread().setName("RedSysTech");
		System.out.println("Curent thread name after set to RedSysTech:-"+Thread.currentThread().getName());
		
	}

}
