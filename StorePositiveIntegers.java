/*
 * Write a program that reads a stream of integers from a file and writes 
 * only the positive numbers to a second file. The user should be prompted 
 * to enter the names of both the input file and output file in main(), and 
 * then main() should attempt to open both files (providing an error if there
 *  is an error during this process). The main() method should then call the
 *   processData() method to read all the integers from the input file and 
 *   write only the positive integers to the output file. The processData() 
 *   method takes arguments:  a Scanner object to read from the input file 
 *   and a PrintWriter object to write to the output file. You can assume 
 *   that if you are able to successfully open the input file, then there 
 *   will only be integers in it.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
public class StorePositiveIntegers {

	public static void main(String[] args) {
		String user_file, user_output;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the file: ");
		user_file = input.next();
		
		System.out.println("Enter the output file: ");
		user_output = input.next();
		
		try(Scanner even = new Scanner(new File("integers.txt")); 
				PrintWriter output = new PrintWriter(new File("output.txt"))) {
				 
				if(user_file.equals("integers.txt") && user_output.equals("output.txt")) {
					processData(even, output);
				}
				else {
					System.out.println("The file you are looking for does not exist");
				}
			}
		
		catch(FileNotFoundException ex){
			System.out.println("The file you are trying to enter does not exist! ");
			System.exit(0);
		}
		
		input.close();
	}
	
	public static void processData(Scanner even, PrintWriter output_file) {
		while(even.hasNextInt()) {
			int taking_value = even.nextInt();
			
			if(taking_value > 0) {
				output_file.print(taking_value + ", ");
			}
		}
		
	}
}
