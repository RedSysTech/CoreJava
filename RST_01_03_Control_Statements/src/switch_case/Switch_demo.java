package switch_case;

public class Switch_demo {

	public static void main(String[] args) {
		
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

	}

}
