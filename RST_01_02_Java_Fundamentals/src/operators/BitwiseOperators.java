package operators;

public class BitwiseOperators {

	public static void main(String[] args) {
		

		int a =5;  //0101
		int b = 7; //0111  
		

				
		System.out.println(" --------------------------------------------");
		System.out.println(" --------------BITWISE OPERATORS----------");
		System.out.println(" --------------------------------------------");
		
		/*
		 * Bitwise AND Operation of 5 and 7 
		 * 
		 * 	  0101
			& 0111
            ________
   	          0101 = 5 (In decimal)
		 */
		System.out.println("a & b = "+ (a&b));
		
		
		
		/*
		 * Bitwise OR Operation of 5 and 7 
		 * 
		 * 	  0101
			| 0111
            ________
   	          0111 = 7 (In decimal)
		 */
		System.out.println("a | b = "+ (a|b));
		
		
		
		/*
		 * Bitwise XOR Operation of 5 and 7 
		 * 
		 * 	  0101
			^ 0111
            ________
   	          0010 = 2 (In decimal)
		 */
		
		System.out.println("a ^ b = "+ (a^b));
		
		
		
		
		/*
		 * Bitwise Compliment Operation of 5 and 7 
		 * 
		 * 	  0101
			~
            ________
   	          1010 = 2's complement of 1010 = -6
		 */
		
		System.out.println(" ~a = "+ (~a));
		
		
		 
		
		System.out.println(" --------------------------------------------");
		System.out.println(" --------------------------------------------");
	}
 
}
