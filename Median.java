/*
 * Write a program to help students practice median.  
 * Write a program to generate five two-digit random numbers.  
 * Store the integers in an array.  
 * Verify all numbers are unique, no duplications.
 */
import java.util.Scanner;
public class Median {

	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int result, median;
		String response;
		int numbers[] = {(int)Math.round(Math.random() * 99), (int) Math.round(Math.random() * 99), (int) Math.round(Math.random() * 99), 
				(int) Math.round(Math.random() * 99), (int) Math.round(Math.random() * 99)};
		
		// Sorting the array
		java.util.Arrays.sort(numbers);
		
		// Because I have five numbers, the median is the number 3 in numbers[]; numbers[2]
		median = numbers[2];
		
		System.out.print("What is the median of these numbers: " + numbers[0] + ", " + numbers[1] + 
					", " + numbers[2] + ", " + numbers[3] + " and " + numbers[4] + ": ");
		result = input.nextInt();
	
		// Correct answer
		if(result == median) {
			System.out.print("Your answer is correct. Do you want to play again (Y/N): ");
			response = input.next();
			
			if(response.equals("y") || response.equals("Y")) {
				System.out.print(Yes(response));
			}
		}
		
		// Incorrect answer
		else if(result != median) {
			System.out.print("Your answer is not correct. Do you want to play again? (Y/N): ");
			response = input.next();
			
			if(response.equals("y") || response.equals("Y")) {
				System.out.print(Yes(response));
			}
		}
	
		// Closing the Scanner
		input.close();
	}
	
	// Keep playing method
	public static String Yes(String response){
		Scanner input = new Scanner(System.in);
		int result, median;
		
		// Generating the new random array of five numbers and looping
		while(response.equals("y") || response.equals("Y")) {
			int[] n = {(int)Math.round(Math.random() * 99), (int) Math.round(Math.random() * 99), (int) Math.round(Math.random() * 99), 
					(int) Math.round(Math.random() * 99), (int) Math.round(Math.random() * 99)};
			
			java.util.Arrays.sort(n);
			
			System.out.print("What is the median of these numbers: " + n[0] + ", " + n[1] + 
					", " + n[2] + ", " + n[3] + " and " + n[4] + ": ");
			result = input.nextInt();
			median = n[2];
			
			// Correct
			if(result == median) {
				System.out.print("Your answer is correct. Do you want to play again? (Y/N): ");
				response = input.next();
				
				while(response.equals("y") || response.equals("Y")) {
					System.out.println(Yes(response));
				}
			}
			
			// Incorrect
			else if(result != median) {
				System.out.print("Your answer is not correct. Do you want to play again? (Y/N): ");
				response = input.next();
				
				while(response.equals("y") || response.equals("Y")) {
					System.out.print(Yes(response));
				}
			}
		}
		// Closing the Scanner
		input.close();
		return response;
	}
}
