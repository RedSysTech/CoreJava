package FunctionalInterface;

public class FuncIntrDemo {

	public static void main(String[] args) {
		
		 
		MyInterface i = () -> {System.out.println("callling from the functional interface...");};
		i.mt1();
	}

}
