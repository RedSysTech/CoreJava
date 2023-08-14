package arrays;

/*
 * Agenda:- 
 *    
 *   1. one dimensional array: declaration, creation and Initialization
 *    
 *   2. int array, char array, String array, Object array, Number array
 *    
 *   3. Array: length vs length()
 *    
 *   4. char array to int array conversion demo
 */
public class UnidimensionalArrayDemo {

	public static void main(String[] args) {
		
		int [] x;          //Array declaration
		x = new int[10];  //Array creation
		x[0]= 100;        //Array Initialization
		System.out.println("x --> "+x); // memory address
		System.out.println("x[0] --> "+x[0]); // 1st element
		
		
		
		System.out.println("===== INT ARRAY ==============");		
		int[] y = {10,20,30};
		System.out.println("y[0] --> "+y[0]); // 1st element
		System.out.println("y[1] --> "+y[1]); // 2nd element
		System.out.println("y[2] --> "+y[2]); // 3rd element
		
		System.out.println("y[-1] --> "+y[-1]); // -1st element
		System.out.println("y[3] --> "+y[3]); // 4th element
		
		
		
		System.out.println("====== CHAR ARRAY =============");	
		char[] c = {'r','e','d','s','y','s','t','e','c','h'};
		System.out.println("c[1] --> "+c[1]);
		
		
		
		System.out.println("====== STRING ARRAY =============");
		String[] s = {"redsystech","channel"};
		System.out.println("s[0] --> "+s[0]);
		
		
		
		// length vs length()
		System.out.println("s.length --> "+s.length);
		System.out.println("s[0].length --> "+s[0].length()); //10
		
		
		System.out.println("===== ARRAY LENGTH ==============");
		int[] arr1 = new int[0];
		System.out.println("arr1.length = "+arr1.length);
		//int[] arr2 = new int[-1];
		//System.out.println("arr2.length = "+arr2.length);
		int[] arr3 = new int[5];
		System.out.println("arr3.length = "+arr3.length);
		
		
		System.out.println("====== OBJECT ARRAY =============");
		Object[] obj = new Object[5];
		obj[0]= new Object();
		obj[1]= new String("RedSysTech");
		obj[2]= new Integer(100);
		
		
		System.out.println("====== NUMBER ARRAY =============");
		Number[] n = new Number[5];
		n[0]= new Integer(10);
		n[1]= new Double(99.9);
		//n[2]= new String("RedSysTech"); // Compile time error - can't convert from String to Number
		
		
		System.out.println("====== ARRAY CONVERSION DEMO =============");
		int[] mark = {10,20,30,40,50};
		char[] names = {'a','b'};
		
		int[] b=mark;
		//int[] cc = names; // Compile time error - can't convert from char[] to int[]
		
	}

}
