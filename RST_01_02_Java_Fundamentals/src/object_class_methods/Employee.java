package object_class_methods;

/*
 * Every class in Java is directly or indirectly derived from the Object class.
 * 
 * Object class is present in java.lang package.
 * 
 * If a Class does not extend any other class then it is direct child class of Object 
 * and if extends other class then it is an indirectly derived.
 * 
 * So, Object class methods are available to all Java classes. 
 * 
 * toString() - String representation of an Object
 * 
 * hashCode() - JVM generates a unique number. It convert the internal address of object 
 * 				to an integer by using an algorithm.
 * 				JVM uses hashcode() while saving objects into hashing related data structures 
 * 				like HashSet, HashMap, Hashtable etc.
 * 
 * equals(Object obj) - way to compare objects for equality
 * 
 * getClass() - to get actual runtime class of the object.
 * 
 * finalize() - This method is called just before an object is garbage collected by GC.
 * 
 * clone() - It returns a new object that is exactly the same as this object.
 * 
 * wait()-It tells the calling thread to give up the lock and go to sleep until 
 * 		  some other thread enters the same monitor and calls notify().
 * 
 * notify()-It wakes up one single thread that called wait() on the same object.
			It should be noted that calling notify() does not actually give up a lock on a resource.
 * 
 * notifyAll()-It wakes up all the threads that called wait() on the same object.
 * 
 */
public class Employee implements Cloneable {

	int roll_no =100;
	
	public static void main(String args[]) throws CloneNotSupportedException 
    { 
    	Employee e = new Employee(); 
  
        // toString() 
        System.out.println(e); // It internally calls .toString()
        System.out.println(e.toString()); 
        
        // hashCode()
        System.out.println(e.hashCode());
        
        //getCalss()
        String s = new String("RedSysTech"); 
        Class c = s.getClass(); 
        System.out.println("Class of Object obj is : "+ c.getName());
        
        //equals()
        String s1 = "RedSysTech";
        String s2 = "RedSysTech";
        System.out.println("Equals method: "+s1.equals(s2));
        System.out.println("EqualsIgnoreCase method: "+s1.equalsIgnoreCase(s2));
        
        //clone()
        Employee e1 = (Employee) e.clone();
        System.out.println("After roll_no of e is: "+e.roll_no);
        System.out.println("After roll_no of e1 is: "+e1.roll_no);
       
        //finalize() 
        e = null; 				// available for GC
        System.gc(); 
        System.out.println("end"); 
    } 
    
    @Override
    protected void finalize() 
    { 
        System.out.println("finalize method called"); 
    } 
}
