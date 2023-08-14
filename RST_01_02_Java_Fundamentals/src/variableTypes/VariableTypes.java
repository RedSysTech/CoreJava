package variableTypes;

public class VariableTypes {

	int a = 10; // instance variable
	
	static int c = 200; // static variable
	
	public static void main(String[] args) {
		
		int b = 100; // local variable
		
		VariableTypes vt = new VariableTypes();
		
		System.out.println("Instance variable: "+vt.a);
		
		System.out.println("Local variable: "+b);
		
		System.out.println("Static variable: "+c);
	}

}
