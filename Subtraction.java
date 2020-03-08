/*
 * Write a Java program to help first graders to practice math subtraction.
 */
import java.util.Scanner;
import java.util.Random;
public class Subtraction {
	
	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner(System.in);
		Random rand_1 = new Random();
		Random rand_2 = new Random();
		int number1, number2, option, result;
		String decision;
		
		// Random numbers
		number1 = rand_1.nextInt(10);
		number2 =  rand_2.nextInt(10);
		result = number1 - number2;
		
		if(number1 > number2) {
			System.out.println("What is " + number1 + " - " + number2 + " ?");
			option = input.nextInt();
			
			// Correct Answer
			if (option == result) {
				System.out.println("You are correct!");
			}
			
			else{
				System.out.println("Your answer is incorrect! " + number1 + " - " + number2 + " is difference");
				System.out.println("Do you want to play again? (Y/N)");
				decision = input.next();
				
				// If user chooses yes
				while (decision.equals("yes") || decision.equals("Yes")) {
					// New numbers
					number1 = rand_1.nextInt(10);
					number2 = rand_2.nextInt(10);
					result = number1 - number2;
					
					// Checking
					if (number1 > number2) {
					System.out.println("What is " + number1 + " - " + number2 + " ?");
					option = input.nextInt();
					
						// Correct
						if(option == result) {
							System.out.println("You are correct!");
							return;
						}
					}
					else {
						System.out.println("Your answer is incorrect! " + number1 + " - " + number2 + " is difference");
						System.out.println("Do you want to play again? (Y/N)");
						decision = input.next();
						
						if(decision.equals("no")) {
							return;
						}
					}
				}
			}
		}
	}
}
