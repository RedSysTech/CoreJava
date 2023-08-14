package operators;

public class AssignmentOperators {

	public static void main(String[] args) {
		

		int a =10;
		int b = 20;
		int c = 0;
		 
		System.out.println(" --------------------------------------------");
		System.out.println(" --------------ASSIGNMENT OPERATORS----------");
		System.out.println(" --------------------------------------------");
		
		c = a + b;
		System.out.println(" c = a + b = "+ c); // 10+20 = 30
		
		
		c += a; // c=c+a
		System.out.println(" c += a = "+ c); // 30+10 = 40
		
		
		c -= a; // c=c-a
		System.out.println(" c -= a = "+ c); // 40-10 = 30
		
		
		c *= a; // c=c*a
		System.out.println(" c *= a = "+ c); // 30 * 10 = 300
		
		
		c /= a; // c=c/a
		System.out.println(" c /= a = "+ c); // 300 / 10 = 30
		
		
		
		c %= a; // c=c%a
		System.out.println(" c %= a = "+ c); // 30 % 10 = 0 (Remainder)
		
		
		c <<= 2 ;
		System.out.println(" c <<= 2 = "+ c); //   0
		
		
		c >>= 2 ; 
		System.out.println(" c >>= 2 = "+ c); //   0
		
		
		c &= a ; // c = c & a
		System.out.println(" c &= a = "+ c); //  0
		
		
		c |= a ; // c = c | a
		System.out.println(" c |= a = "+ c); // 10
		
		
		c ^= a ; // c = c ^ a
		System.out.println(" c ^= a = "+ c); // 0
		
	
		
		System.out.println(" --------------------------------------------");
		System.out.println(" --------------------------------------------");
	}

}
