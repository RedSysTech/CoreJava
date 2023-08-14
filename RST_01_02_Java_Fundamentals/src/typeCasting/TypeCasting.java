package typeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		

		// IMPLICIT OR WIDENING
		
		int i = 10;
		long l = i;
		
		System.out.println("i --> "+i);
		
		System.out.println("l --> "+l);

		
		// EXPLICIT OR NARROWING
		
		float f = 3.14f;
		int k = (int) f;
		
		System.out.println("f --> "+f);
		System.out.println("k --> "+k); // Truncation
		
		
		
		long L = 123456789;
		byte b = (byte) L;
		
		System.out.println("L --> "+L);
		System.out.println("b --> "+b); // Data Loss
		
		
		
	}

}
