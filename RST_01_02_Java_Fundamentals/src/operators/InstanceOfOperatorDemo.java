package operators;


public class InstanceOfOperatorDemo {
	
	public static void main(String[] args) {
		
		System.out.println(" --------------------------------------------");
		System.out.println(" --------------INSTANCEOF  OPERATORS----------");
		System.out.println(" --------------------------------------------");
		
		
		String s = "Karthik";
		boolean output = s instanceof String;
		System.out.println(" s instanceof String ? "+ output); // true
		
		
		
		InstanceOfOperatorDemo obj = new InstanceOfOperatorDemo();
		boolean result = obj instanceof InstanceOfOperatorDemo;
		System.out.println(" obj instanceof InstanceOfOperatorDemo ? = "+ result); // true

		
		System.out.println(" --------------------------------------------");
		System.out.println(" --------------------------------------------");
	}
}
