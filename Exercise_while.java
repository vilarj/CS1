import java.util.Scanner;

/*
 * Write a program to ask the user for a number
 * then print out all the numbers from 0 to that number.
 * Use the while loops to implement the iteration
 */
public class Exercise_while {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("Enter a number, please: ");
		number = input.nextInt();
		
		// Doing the math
		while (number > 0) { // The logic could be while (number <= 0) { i++; SOP Statement }
			number--;
			System.out.println(number);
			
		}
		
		// Closing the Scanner
		input.close();
	}
}
