package exceptions;

public class ExceptionNotHandled {

	public static void main(String[] args) {
		// 1. Arithmetic Exception
//		int a = 5;
//		int b = a/0;
//		System.out.println("rest of the code in my program..");

		//********************************************************************************			
		// 2. NullPointer Exception
//		String s1 = null; //null value 
//        System.out.println(s1.length());
//		System.out.println("rest of the code in my program..");	
		
		//********************************************************************************	
		// 3. StringIndexOutOfBound
//		String s2 = "Welcome to RedSysTech "; // length is 22 
//        char c = s2.charAt(24); // accessing 25th element 
//        System.out.println(c);
//		System.out.println("rest of the code in my program..");
		
		//********************************************************************************			
		// 4. NumberFormat Exception
//		int i = Integer.parseInt ("RedSysTech") ; 
//		System.out.println(i);
//		System.out.println("rest of the code in my program..");
		
		//********************************************************************************	
		// 5. ArrayIndexOutOfBounds Exception
		int a[] = new int[5]; // size 5
        a[7] = 9; // accessing 8th element in an array of size 5
		System.out.println("rest of the code in my program..");
		
		//********************************************************************************	
	}

}
