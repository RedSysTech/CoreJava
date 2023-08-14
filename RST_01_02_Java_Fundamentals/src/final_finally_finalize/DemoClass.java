package final_finally_finalize;

public class DemoClass {

	public static void main(String[] args) {
		DemoClass dc = new DemoClass(); //create an Object		
		dc = null; //making the object reference as null		
        System.gc(); // Requesting JVM to call Garbage Collector method 
        System.out.println("Main Completes");
	}	
	 // Here overriding finalize method 
    public void finalize() 
    { 
        System.out.println("finalize method overriden"); 
    }
}
