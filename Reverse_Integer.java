/*
 * Write a method with the following header to display an integer in reverse order:
 * public static void reverse(int number)
 * Write a main() method to test the reverse() method using the following data:
 * Enter an integer: 3456
 * Reversed: 6543
 */
import java.util.Scanner;
public class Reverse_Integer {
	
	// This method takes a value and reverse it
	public static int ReverseInteger(int number) {		
		int reverse = 0;
		int r;
		while(number > 0) {
			r = number % 10;
			reverse = reverse * 10 + r;
			number = number / 10;
			}
		return reverse;
		}
	
	// Main
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n;
	
	// Storing the number from the user
	System.out.print("Enter an integer: ");
	n = input.nextInt();
	
	// Checking the value
	if(n <  0) {
		System.out.println("Error! It needs to be an integer");
	}
	
	else {
		System.out.print("Reverse: " + ReverseInteger(n));
	}
	// Closing the Scanner class
	input.close();
	}
	
}
