/**
 * Write a Java program that ask the user for three 
 * numbers typed in the keyboard. 
 * And, print the average of those numbers 
 */

import java.util.Scanner;
public class Exercise {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		int user1, user2, user3;
		double avg;
		
		
		System.out.println("Type a number, please: ");	// First number
		user1 = user.nextInt();
		
		System.out.println("Type a number, please: ");	// Second number
		user2 = user.nextInt();
		
		System.out.println("Type a number, please: ");	// Third number
		user3 = user.nextInt();
		
		avg = (user1 + user2 + user3)/3.0;
		
		System.out.println("The average is: " +avg);	// Printing out the average
		
		user.close();	// Closing Scanner
	}
}
