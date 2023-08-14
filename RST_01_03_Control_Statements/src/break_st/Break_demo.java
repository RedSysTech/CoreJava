package break_st;

public class Break_demo {

	/*
	 * Break:
	 * To come out of the current enclosed loop
	 * 
	 * Break keyword is used in..
	 * 
	 * 	for loops
	 * 
	 * 	while loops
	 * 
	 * 	do-while loops
	 * 
	 * 	switch statements
	 */
	public static void main(String[] args) {
		
	
	System.out.println("*****************************************");
	
	RedSysTech: for(int i =0; i<3; i++)
		{
			for(int j=0; j<3;j++)
			{
				System.out.println("value of i & j are: "+i+" "+j);
				if(j==2)
					break RedSysTech;
			}
		}
	 
	 System.out.println("*****************************************"); 
	 
	 int a=10;
	 
	 while(a>5) {
			System.out.println("Inside while loop: "+a);
			a--;
			if(a==9)
			{
				break;
			}
		}
		
	System.out.println("*****************************************"); 
	
	 int b = 10;
	 
	 do{
			System.out.println("inside do: "+b);
			b--;
			if(b==8)
			{
				break;
			}
		}
		while(b>5);
		
	
	
	System.out.println("*****************************************"); 
	
	String name ="Red";
	
	switch(name)
	{
	case "Red":
		System.out.println("inside case Red");
		break;
	case "Blue":
		System.out.println("inside case Blue");
		break;
	case "Black":
		System.out.println("inside case Black");
		break;
	default:
		System.out.println("none of the cases matched...");
	
	}
	
	System.out.println("*****************************************");
	
	}
}
