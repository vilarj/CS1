/*
 * Write a program to calculate the result of one of three operations 
 * (minimum, L1 norm, L2 norm) on a vector of three numbers. To begin,
 *  have the user input three numbers at the keyboard (e.g.   -1 2 3). Then, ask the 
 *  user to type in an operation (valid operations are “min”, “l1”, or “l2”; all letters are lowercase). 
 *  Assuming the user types a valid operation, your program should compute and output 
 *  to the screen the result based upon the three numbers; otherwise output an error.
 */
import java.util.Scanner;
public class Operations {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, num3, result, abs;
		String operation;
		
		// Getting the numbers from the user
		System.out.println("Enter three numbers: ");
		num1 = input.nextDouble();
		num2 = input.nextDouble();
		num3 = input.nextDouble();
		
		// Choosing the operation
		System.out.println("Enter operation: ");
		operation = input.next();
		
		// Min
		if (operation.equals( "min")) {
			
			// Comparison
			if(num1 < num2 && num1 < 3) {
				result = num1;
				System.out.println("min (" + num1 + " " + num2 + " " + num3 + ") = " + result);
			}
			
			else if(num2 < num1 && num2 < num3) {
				result = num2;
				System.out.println("min (" + num1 + " " + num2 + " " + num3 + ") = " + result);
			}
			
			else {
				result = num3;
				System.out.println("min (" + num1 + " " + num2 + " " + num3 + ") = " + result);
			}
		}
		
		// L1
		if(operation.equals("l1")) {
			abs = ((Math.abs(num1)) + (Math.abs(num2)) + (Math.abs(num3)));
			result = Math.pow(abs, 2);
			System.out.println("l1 (" + num1 + " " + num2 + " " + num3 + ") = " + result);
		}
		
		// L2
		if(operation.equals("l2")) {
			abs = ( (num1 * num1) + (num2 * num2) + (num3 * num3 * num3) );
			result = Math.sqrt(abs);
			
			System.out.format("%.2f", result);
		}
		
		// Invalid operation
		else {
			System.out.println("Invalid operation!");
		}
		input.close();
	}
}
