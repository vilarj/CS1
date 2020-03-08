/*
 * Write a program that reads in a series of positive integers and 
 * prints out the maximum value entered.  The user will indicate 
 * they are finished entering numbers by entering zero or a negative integer.
 */

import java.util.Scanner;
public class Exercise1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputValue;
		int max = 0;
			
		System.out.print("Enter positive integers, stopping with zero or a negative number: ");
		do {
			inputValue = input.nextInt();
			if(inputValue > max) {
				max = inputValue;
			}
		} while(inputValue > 0);
	
		if (max == 0) {
			System.out.println("You didn't enter any positive numbers!");
			System.exit(0);
		}
		System.out.printf("The max was %d%n", max);
		input.close();
	}
}
