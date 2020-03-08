/*
 * Write a program that opens a file named integers.txt
 * then read 5 integers from the file and prints each one
 * out
 * 
 * You will have to create the imtegers.txt file
 * manually first and put at least 5 integers into it
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class File_Reading_Exercise {

	public static void main(String[] args) {
		
		File f = new File("integers.txt");
		Scanner input;
		try {
			input = new Scanner(f);
			input.close();
		} catch (FileNotFoundException ex) {
			
			System.exit(0);
		}
		
		
	}
}
