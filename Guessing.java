/*
 * Write a program that plays a guessing game with the user. Specifically, your program should randomly pick 
 * a number between 1 and 100. Then, ask the user for a guess. You should verify and tell the user if the guess
 *  is not a valid guess. Otherwise, tell the user their guess was too high or too low. The program should continue 
 *  to prompt the user for new guesses until they get the correct number, telling them each time if the guess was too high or too low or invalid.
 */
import java.util.Scanner;
public class Guessing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int guessing = 0, random_number;
		
		// Math random gives double numbers between 0.1.. - 0.15...
		// Converted Math.random() into an integer and since the number is too low I multiplied it by 100
		random_number = (int) (Math.random() * 100);
		
		do {
			// Storing the value of guessing
			System.out.println("Enter your guess (between 1 - 100): ");
			
			// Checking for character errors
			if (!input.hasNextInt()) {
				
			System.out.println("Error! Enter a number: ");
			input.next(); // This method looks for another input
			}
			
			else {
				guessing = input.nextInt();
				
				// logic
				if (random_number > guessing) {
					System.out.println("Too low!");
				}
				
				else if(random_number < guessing) {
					System.out.println("Too high!");
				}
			}

		} while(guessing != random_number);
			// Final message
			System.out.println("You win!");
		
		// closing the Scanner class
		input.close();
		
	}
}
