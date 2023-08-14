package io_functions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class OutputStreamsDemo {

	public static void main(String[] args) throws IOException {
		
		//DisplayOnScreenDemo(); //Display on the screen
		BufferedWriterFileOutputDemo();  //Keyboard
		
	}
	
	public static void DisplayOnScreenDemo() {
		
		
		// print
		System.out.print("Welcome to ");
		System.out.print("RedSysTech");
		
		
		// println
		System.out.println("Happy");
		System.out.println("learning");
		
		
		// printf
		int x = 10;
		float y = 3.14f;
				
		System.out.printf("Formatted output is: %d %d%n", x, -x);
		System.out.printf("Precision formatting upto 4 decimal places %.4f\n",y);
		System.out.printf("%s %S!%n","Hello","World");
		
	}

	
	
	public static void BufferedWriterFileOutputDemo() throws IOException {
		
		String[] list = {"one", "two", "three", "four"};
		
		// File
		File f = new File("/Users/ns/Desktop/inputFile.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for (String s : list) {
            bw.write(s + "\n");
        }

        bw.close (); // Close the stream
	}
	
	
	
	

}
