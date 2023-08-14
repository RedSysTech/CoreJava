package methodsinJava;

public class MethodDemo {

	public static void main(String[] args) {
		
		display("RedSysTech");
		System.out.println(doCalculate(10,20));
	}
	
	
	public static void display(String name) {
		System.out.println("My name is :" + name);
	}
	
	public static int doCalculate(int a, int b) {
		return a+b;
	}

}
