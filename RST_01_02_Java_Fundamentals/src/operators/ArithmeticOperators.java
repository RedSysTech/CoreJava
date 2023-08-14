package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		

		int a =10;
		int b = 20;

		
		System.out.println(" --------------------------------------------");
		System.out.println(" --------------ARTHIMETIC OPERATORS----------");
		System.out.println(" --------------------------------------------");
		
		System.out.println(" a + b = "+ (a+b)); // 30
		System.out.println("a - b = "+ (a-b)); // -10
		System.out.println("a * b = "+ (a*b)); // 200
		System.out.println("a / b = "+ (a/b)); //  0
		System.out.println("a % b = "+ (a%b)); // 10
		
		
		
		System.out.println(" --------------------------------------------");
		System.out.println(" ---POST INCREMENT AND DECREMENT OPERATORS---");
		System.out.println(" --------------------------------------------");
		
		System.out.println(" a++  = "+ (a++)); // a = 10 and then it gets incremented after this line.
		System.out.println("now a is = "+ a); // a = 11
		
		System.out.println(" a-- = "+ (a--));    // a = 11 and then it gets decremented after this line.
		System.out.println("now a is = "+ a); // a = 10
		 
		
		
		
		System.out.println(" --------------------------------------------");
		System.out.println(" --- PRE INCREMENT AND DECREMENT OPERATORS---");
		System.out.println(" --------------------------------------------");
		
		System.out.println("now a is = "+ a); // a = 10
		System.out.println(" ++a  = "+ (++a)); // a = 11 Here the value is incremented and then it gets assigned to the variable.
		System.out.println("now a is = "+ a); // a = 11
		
		
		System.out.println("now a is = "+ a); // a = 11
		System.out.println(" --a = "+ (--a));    // a = 10 Here the value is decremented and then it gets assigned to the variable.
		System.out.println("now a is = "+ a); // a = 10
		
		System.out.println(" --------------------------------------------");
		System.out.println(" --------------------------------------------");
	}

}
