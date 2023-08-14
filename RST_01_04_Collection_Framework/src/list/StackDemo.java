package list;

import java.util.Stack;

/*
 * Agenda:
 * ------
 * 
 * Stack creation
 * 
 * Adding Heterogeneous objects to a Stack
 * 
 * Allows Duplicates
 * 
 * Insertion Order is Maintained
 * 
 * Null insertion is possible
 * 
 * push()  pop()  peek()  search()
 *
 * LIFO = Last In First Out
 */ 
public class StackDemo {

	public static void main(String[] args) {
		
		Stack s1 = new Stack();  // Stack creation
		
		System.out.println(s1);
		System.out.println(s1.size());
		
		s1.add("r");
		s1.add("e");
		s1.add('d'); // Heterogeneous objects
		
		System.out.println(s1);
		System.out.println(s1.size());
		
		s1.add("r"); 
		s1.add("e");
		s1.add('d'); // duplicates allowed
		
		System.out.println(s1);
		System.out.println(s1.size());
		
		s1.add(null); // null insertion allowed
		
		System.out.println(s1);
		System.out.println(s1.size());	
		
		
		s1.push("redsystech"); // pushed into Stack
		s1.push("channel"); // pushed into Stack
		
		System.out.println(s1);
		System.out.println(s1.size());
		
		System.out.println(s1.pop()); // pop --> removes the top element and returns the removed element
		
		System.out.println(s1);
		System.out.println(s1.size());
		
		System.out.println(s1.peek()); // peek --> just returns the current top element
		
		System.out.println(s1.search("redsystech"));
		System.out.println(s1.search(null));
		
	}
}
