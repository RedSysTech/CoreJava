package continue_st;

public class Continue_demo {

	/*
	 * Continue:
	 * It's similar to break, but it stops only the execution of
	 * current statement and return to the next iteration
	 * 
	 * Continue keyword is used in..
	 * 
	 * 	for loops
	 * 
	 * 	while loops
	 * 
	 * 	do-while loops
	 *
	 */
	public static void main(String[] args) {
		
	
	System.out.println("*****************************************");
	
	for(int i =0; i<5; i++)
	{
		if(i==3) {
			continue;
		}
			System.out.println("i value is : "+i);
	}
	 
	 System.out.println("*****************************************"); 
	 
	 int a=5;
	 
	 while(a>0) {
			
		 a--;
			if(a==2)
			{
				continue;
			}
			 System.out.println("Inside while loop: "+a); 
			 
		}
		
	System.out.println("*****************************************"); 
	
	 int b = 5;
	 
	 do{
			b--;
			if(b==2)
			{
				continue;
			}
			System.out.println("inside do: "+b);
			
		}
		while(b>0);
		
	
	
	System.out.println("*****************************************"); 
	
	}
	
}
