package string_demo;

public class String_Pool_Intern_Demo {

	public static void main(String[] args) {
		
		// Use case 1
		String s1 = new String("RedSysTech");
		String s2 = new String("RedSysTech");
		System.out.println(s1 == s2);
		
		// Use case 2
		String s3 = new String("Java");
		String s4 = s3.intern(); // refers to the SCP
		System.out.println(s3 == s4);
		
		String s5 = "Java"; // refers to the SCP
		System.out.println(s4 == s5);	
		
	}

}
