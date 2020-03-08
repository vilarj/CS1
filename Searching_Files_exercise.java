/*
 * Write a program that writes the number from 1-100
 * to a file named "numbers.txt"
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class Searching_Files_exercise {

	public static void main(String[] args) {
		try(PrintWriter f = new PrintWriter(new File("numbers.txt"))) {
			for(int i = 0; i < 101; i++) {
				System.out.println(i);
			}
		}
		
		catch(FileNotFoundException ex){
			System.out.println("File does not exist! ");
			System.exit(0);
		}
	}
}
