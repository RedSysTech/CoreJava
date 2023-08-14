package table;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/*
 * Agenda:-
 * ------
 * 1. What is Properties class in Java?
 * 2. How to create an object for the Properties class?
 * 3. Use FileInputStream to read the input file
 * 4. load() - to dump from file into Java object
 * 5. getProperty() - to get the value for the given Key
 * 6. setProperty() - to set the value for the given Key
 * 7. Use FileOutputStream to write the Property object into the file
 * 4. store() - to write from Java object into the file.
 */
public class PropertiesClassDemo {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties(); // create an object for the Properties class
		
		FileInputStream fis = new FileInputStream("courseDetails.properties"); // use FileInputStream class
		
		// to dump from file into Java object
		p.load(fis);
		
		System.out.println("display the data from the file --> "+p); 
		System.out.println("===================================");
		
		
		String s = p.getProperty("channelName");
		System.out.println("display the channelName from file --> "+s);
		System.out.println("===================================");
		
		
		// to set a new value in the Property object
		p.setProperty("env", "PROD2");
		
		// to write Property object into the file
		FileOutputStream fos = new FileOutputStream("courseDetails.properties"); // use FileOutputStream class
		
		// to write from Java object into the file.
		p.store(fos, "my updated comment");
		
	}

}
