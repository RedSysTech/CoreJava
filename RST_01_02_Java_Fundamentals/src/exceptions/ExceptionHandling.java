package exceptions;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		// 1. Arithmetic Exception
//		try {
//			int a = 5;
//			int b = a/0;
//		}
//		catch(ArithmeticException ae)
//		{
//			System.out.println(ae.getMessage());
//		}
//		System.out.println("rest of the code in my program..");

		
//********************************************************************************	
		
//		// 2. NullPointer Exception
//		try {
//			String s1 = null; //null value 
//	        System.out.println(s1.length());
//		}
//		catch(NullPointerException ae)
//		{
//			System.out.println(ae.getMessage());
//		}
//		System.out.println("rest of the code in my program..");

		
//********************************************************************************		
		
//		// 3. StringIndexOutOfBound Exception
//		try {
//			String s2 = "Welcome to RedSysTech "; // length is 22 
//          char c = s2.charAt(24); // accessing 25th element 
//		System.out.println(c);
//		}
//		catch(StringIndexOutOfBoundsException ae)
//		{
//			System.out.println(ae.getMessage());
//		}
//		System.out.println("rest of the code in my program..");	
		
		
//********************************************************************************		
		
//		// 4. NumberFormat Exception
//		try {
//			int i = Integer.parseInt ("RedSysTech") ; 
//			System.out.println(i);
//		}
//		catch(NumberFormatException ae)
//		{
//			System.out.println(ae.getMessage());
//		}
//		System.out.println("rest of the code in my program..");	
	
		
		
//********************************************************************************
		
		
//		// 5. ArrayIndexOutOfBounds Exception
		try {
			int a[] = new int[5]; // size 5
        a[7] = 9; // accessing 8th element in an array of size 5
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae.getMessage());
		}
		System.out.println("rest of the code in my program..");		
		
		
		
	}

}
