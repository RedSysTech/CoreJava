package blocksInJava;

public class BlocksDemo {

	static
	{
		System.out.println("inside block..");
	}
	
	public static void main(String[] args) {
		
		System.out.println("inside main method..");
		
		if(true) {
			System.out.println("it's true..");
		}
		
		if(true) 
		{
			System.out.println("it's true always..");
		}
	}
}
