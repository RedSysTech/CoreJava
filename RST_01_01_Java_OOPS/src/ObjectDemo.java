class Student{
	
	String name;
	
	public String display() {
		return name;
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name="Karthik";
		System.out.println(s1.display());

	}

}
