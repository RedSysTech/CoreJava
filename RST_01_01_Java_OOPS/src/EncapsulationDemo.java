

class Bank{
	
	private float balance = 500;
	
	
	public float getBalance() {
		
		// validation...
		
		return balance;
	}
	
	
	
	public void setBalance() {
		
		// validation...
		
		
	}
	
}


public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Bank b = new Bank();
	
		
		System.out.println(b.getBalance());
	}

}
