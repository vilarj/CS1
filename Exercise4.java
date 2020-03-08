/*
 * Write a program that asks the user for exactly ten integers 
 * and then prints them out in the reverse order given.  
 * Use an array to store the values so you can print them 
 * out after you have read in all ten.
 */
import java.util.Scanner;
public class Exercise4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[10];
		
		System.out.println("Enter the values: ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextInt();
		}
	
		System.out.println("The values in reverse order: ");
		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
		}
		
		input.close();
	}

}
