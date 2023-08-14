package set;

public class ComparableDemo {

	public static void main(String[] args) {
		
		System.out.println("A".compareTo("B")); // A has to come before B => -ve
		
		Integer i = (Integer)10;
		Integer j = (Integer)100;
		
		System.out.println(i.compareTo(j)); // 10 has to come before 100 => -ve
	}

}
