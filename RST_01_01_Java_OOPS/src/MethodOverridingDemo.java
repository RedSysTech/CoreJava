
class ParentClass{
	
	void display() {
		System.out.println("Karthik");
	}
	
}

class ChildClass extends ParentClass{
	
	void display() {
		System.out.println("Jai");
	}
	
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		ChildClass c = new ChildClass();
		
		c.display();
	
	}

}
