package io_functions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputStreamsDemo {

	public static void main(String[] args) throws IOException {
		
		//ScannerKeyboardInputDemo(); //Keyboard
		//BufferedReaderKeyboardInputDemo();  //Keyboard
		//BufferedReaderFileInputDemo(); //File input
		
	}
	
	public static void ScannerKeyboardInputDemo() {
		
		// Scanner class
		Scanner sc = new Scanner(System.in);
		
		// Get the inut from the user Keyboard
		String name = sc.nextLine();
		char gender = sc.next().charAt(0);
		int age = sc.nextInt(); 
	    long phoneNo = sc.nextLong(); 
	    double marks = sc.nextDouble();

	    System.out.println("Name: "+name); 
	    System.out.println("Gender: "+gender); 
	    System.out.println("Age: "+age); 
	    System.out.println("Phone Number: "+phoneNo); 
	    System.out.println("marks: "+marks); 
		
		
	}
	
	
	public static void BufferedReaderKeyboardInputDemo() throws IOException {
		
		 // BufferedReader class Demo
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        System.out.println("Hello..."+str);
        
	}
	
	
	public static void BufferedReaderFileInputDemo() throws IOException {
		
		// File
		File f = new File("/Users/ns/Desktop/inputFile.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line); // Display the file's contents on the screen, one line at a time
		}

		br.close(); // Close the stream	
	}
	
	

}
