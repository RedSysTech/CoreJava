package arrays;

/*
 * 
 * Agenda:- 
 * 
 *   1. How to create a multi-dimensional array for the below example from the scratch?
 *   
 *   2. How to add values to multi-dimentional array?
 *   
 *   3. How to read the values from multi-dimentional array?
 *    
 * Example:
 * 
 * 	  - - - - - - - - - - - - -
 * S1| 50 | 35 | 80 | 90 | 95 |
 *    - - - - - - - - - - - - - 
 * S2| 15 | 50 |    |    |    |
 *    - - - - - - - - - - - - -
 * S3| 45 | 90 | 70 |    |    |
 *    - - - - - - - - - - - - -
 * S4| 10 |    |    |    |    |
 *    - - - - - - - - - - - - -
 * 
 */
public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
	
		int[][] s = new int[4][];
		
		s[0] = new int[5];
		s[1] = new int[2];
		s[2] = new int[3];
		s[3] = new int[1];
		
		s[0][0] = 50;
		s[0][1] = 35;
		s[0][2] = 80;
		s[0][3] = 90;
		s[0][4] = 95;
		
		s[1][0] = 15;
		s[1][1] = 50;
		
		s[2][0] = 45;
		s[2][1] = 90;
		s[2][2] = 70;
		
		s[3][0] = 10;
		
		System.out.println("s--> "+s);
		
		System.out.println(s[0][0]);
		System.out.println(s[0][1]);
		System.out.println(s[0][2]);
		System.out.println(s[0][3]);
		System.out.println(s[0][4]);

	}

}
