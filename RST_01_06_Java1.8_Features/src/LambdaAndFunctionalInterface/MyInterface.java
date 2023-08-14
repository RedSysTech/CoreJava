package LambdaAndFunctionalInterface;

//Functional Interface
public interface MyInterface {

	public void mt1();
}


//This is the implementation class of Functional Interface.
// This implementation is going to be replaced by the Lambda expression.
class MyImpl implements MyInterface{
	
	@Override
	public void mt1() {
		System.out.println("this is my mt1...");	
	}
	
}
