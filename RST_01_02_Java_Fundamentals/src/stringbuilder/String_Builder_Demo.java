package stringbuilder;

public class String_Builder_Demo {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Welcome");
		System.out.println("sb -->"+sb);
		System.out.println(sb.hashCode());
		
		System.out.println(sb.append(" to RedSysTech"));
		System.out.println(sb.hashCode());
		
		System.out.println(sb.insert(7, "2020"));
		
		System.out.println(sb.deleteCharAt(0));
		
		System.out.println(sb.delete(1,2));
		
		System.out.println(sb.replace(1, 3, "Java"));
		
		System.out.println(sb.length());
	
		System.out.println(sb.indexOf("J"));
		
		System.out.println(sb.charAt(1));
		
		System.out.println(sb.subSequence(1, 5)); // 1,(5-1)
		
		System.out.println(sb.substring(1));
		
		System.out.println(sb.reverse());
		
	}

}
