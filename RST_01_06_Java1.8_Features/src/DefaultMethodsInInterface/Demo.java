package DefaultMethodsInInterface;

/*
 * Agenda:
 * ------
 * 
 * Practical Program:- How to use Default methods in the interface since JDK 1.8?
 * 
 */
public class Demo{
	
	public static void main(String args[]) {
		A a = new A();
		a.mt1();
		a.mt3();
		
		
		B b = new B();
		b.mt1();
		b.mt3();
	}
}

interface Test{
	
	void mt1();
	
	void mt2();
	
	default void mt3() {
		System.out.println("inside default method...");
	}
}

class A implements Test{

	@Override
	public void mt1() {
		System.out.println("inside A - mt1");
		
	}

	@Override
	public void mt2() {
		// TODO Auto-generated method stub
		
	}
	
}

class B implements Test{

	@Override
	public void mt1() {
		System.out.println("inside B - mt1");
		
	}

	@Override
	public void mt2() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mt3() {
		System.out.println("INSIDE DEFAULT METHOD Over...");
		
	}
	
}

