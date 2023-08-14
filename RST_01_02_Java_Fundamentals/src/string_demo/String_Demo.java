package string_demo;

public class String_Demo {

	public static void main(String[] args) {
		
		String s1 = new String();
		System.out.println("s1 -->"+s1);
		
		s1 = "RedSysTech";
		System.out.println("s1 -->"+s1);
		
		String s2 = new String("RedSysTech");
		System.out.println("s2 -->"+s2);
		
		
		String s3 = "RedSysTech";
		System.out.println("s3 -->"+s3);
		
		
		System.out.println("s1 address:-"+s1.hashCode());
		System.out.println("s2 address:-"+s2.hashCode());
		System.out.println("s3 address:-"+s3.hashCode());
		
		
		System.out.println(s1.length());
		System.out.println(s1.indexOf("R"));
		System.out.println(s1.charAt(0));
		System.out.println(s1.replace("R", "T"));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.concat("Channel"));
		System.out.println(s1.compareTo("red"));
		System.out.println(s1.contains("Red"));
		System.out.println(s1.startsWith("R"));
		System.out.println(s1.endsWith("h"));
		
		
		 System.out.println(String.format("%f", 100.00));
		 
		 System.out.println(s1.isEmpty());
		 
		 System.out.println(s1.matches("Red"));
		 
		 String splitted = "Jai,Kar,San";
		 splitted.split(",");
		 System.out.println(splitted);
		 
		 
		 System.out.println(s1.substring(3));
		 System.out.println(s1.substring(3,5));
		 
		 System.out.println(" Red ".trim());
		 
		 
	}

}
