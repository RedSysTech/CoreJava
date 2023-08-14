package string_demo;

/*
 * Agenda:
 * ------
 * 
 * .equals vs == operator in Java
 * 
 * .equals  is a method in String class
 * ==       is an operator
 * 
 * .equals for content comparison (if both objects has the same value)
 * ==      for address comparison (if both objects point to the same memory location)
 * 
 * 
 * 
 */
public class String_Comparison {

	public static void main(String[] args) {
		
		String s1 = new String ("RedSysTech");
		String s2 = new String ("RedSysTech");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		System.out.println(t1==t2);
	}

}
