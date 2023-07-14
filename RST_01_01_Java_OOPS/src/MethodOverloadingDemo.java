
class A{
	
	void display() {
		System.out.println("Karthik");
	}
	
	void display(String s) {
		System.out.println("Karthik" + s);
	}
	
}


public class MethodOverloadingDemo {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.display();
		
		a.display(" Ponnusamy");

	}

}
