class Mobile{
	
	String name;
	String color;
	int price;
	int tax;
	
	public int getTotalPrice()
	{
		return price+tax;
	}
}


public class Demo {

	public static void main(String[] args) {
		
		Mobile iphone = new Mobile();
		iphone.name="iPhone";
		iphone.color="White";
		iphone.price=50000;
		iphone.tax=10;
		
		System.out.println(iphone.getTotalPrice());
		
		
		Mobile samsung = new Mobile();
		samsung.name="samsung";
		samsung.color="Black";
		samsung.price=40000;
		samsung.tax=5;
		
		System.out.println(samsung.getTotalPrice());
		

	}

}
