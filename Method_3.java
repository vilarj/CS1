

/*
 * Write a program that calls a method to find the maximum
 * value of two floating numbers that are entered by the user.
 * The main method displays the result to the console 
 */
import java.util.Scanner;
public class Method_3 {

	public static void main(String[] args) {
		float num1, num2, result;
		Scanner input = new Scanner(System.in);
		
		// Asking for the first number
		System.out.println("Enter a value, please: ");
		num1 = input.nextFloat();
		
		// Asking for the first number
		System.out.println("Enter a value, please: ");
		num2 =  input.nextFloat();
		
		// Calling the method
		result = Max_value(num1, num2);
		
		// Printing out the result
		System.out.println("The maximun is: " + result);
		
		// Closing the Scanner class
		input.close();
	}
	
	public static float Max_value(float num1, float num2) {
		// Comparison
		if (num1 > num2) {
			return num1;
		}
		else {
			return num2;
		}
	}
}
