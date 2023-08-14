package nested_class;
/*
 * Agenda:-
 * ------
 * 1. What are member inner Nested classes in Java?
 * 2. How to write a member inner nested class in Java?
 * 3. How to access the member inner nested class members in Java?
 *
 */


public class Outer_member_inner {
	
	int x=10;

	class MemberInner{
		int y = 20;
	}

	public static void main(String[] args) {
		
		Outer_member_inner o = new Outer_member_inner();
		System.out.println(o.x);

		Outer_member_inner.MemberInner mi = new Outer_member_inner(). new MemberInner();
		System.out.println(mi.y);
	}

}
