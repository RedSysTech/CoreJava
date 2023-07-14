
//------------------------------------------------------------------------------------------

	/*
	 * Abstraction in Java
	 */

//------------------------------------------------------------------------------------------

class Audi extends Car{
	
	void start() {
		System.out.println("Audi car started...");
	}
	
	void autoGear() {
		System.out.println("Audi car Autogear enabled...");
	}

}

class BMW extends Car{
	
	void start() {
		System.out.println("BMW car started...");
	}
	
	void autoGear() {
		System.out.println("BMW car Autogear enabled...");
	}

}


//------------------------------------------------------------------------------------------

class Showroom{
	
	void display(Car c) {
		c.start();
		c.autoGear();
	}
	


}


//------------------------------------------------------------------------------------------


abstract class Car{
	
	abstract void start();
	
	abstract void autoGear();
	
}

public class AbstractDemo {

	public static void main(String[] args) {
		Showroom r = new Showroom();
		
		Audi a = new Audi();
		r.display(a);
		
		BMW b = new BMW();
		r.display(b);

	}

}

//------------------------------------------------------------------------------------------