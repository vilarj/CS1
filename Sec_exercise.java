/**
 *Write a program that reads two values (x and y) from 
 * the user, calculates x**y, and prints the answer
 */

import java.util.Scanner;
public class Sec_exercise {
	
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		double x, y, result;
		
		System.out.println("Enter a value for X, please: ");		// Asking for the value of x
		x = user.nextDouble();
		
		System.out.println("Enter a value for Y, please: ");		// Asking for the value of y
		y = user.nextDouble();
		
		result = Math.pow(x, y);	// Doing the Math
		
		System.out.println(x + " to the power of " + y + " is: " +result);		// Printing out the result
		
		user.close();		// Closing the scanner
	}
}
