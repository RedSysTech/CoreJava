package PreDefinedFunctionalInterface;

import java.util.function.Function;

/*
 * Agenda:-
 * -------
 * 
 * What is function chaining? - way of calling diff. functions in the same single line.
 * 
 * eg: 
 * 		f1.andThen(f2).apply(5)
 * 		f1.compose(f2).apply(5)
 * 
 * What is method chaining? - way of calling diff. methods in the same single line.
 * 
 */
public class FunctionChaining {

	public static void main(String[] args) {
		Demo d = new Demo();
		d.setName("RedSysTech").print();

		// functional chaining
		Function<Integer, Integer> f1 = (i) -> (i*2);
		Function<Integer, Integer> f2 = (i) -> (i+2);
		
		System.out.println(f1.andThen(f2).apply(5));// 12
		System.out.println(f1.compose(f2).apply(5)); // 14
		
	} 
	

}

class Demo{
	String name;
	
	public Demo setName(String n)
	{
		this.name = n;
		return this;
	}
	
	
	
	public void print()
	{
		System.out.println(name);
	}
}
