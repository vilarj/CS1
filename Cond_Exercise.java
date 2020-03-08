/**
 * 
 * Write a program that reads an integer from the user and determines whether
 * or not the integer is even (evenly divisible by 2) or odd (not evenly divisible by 2)
 *
 */

import java.util.Scanner;
public class Cond_Exercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int answer;
		
		System.out.println("Type in a number, please:");
		answer = input.nextInt();
		
		answer = (answer%2);
		
		if (answer == 0) {
			System.out.println("The number is even");
		}
		else {
			System.out.println("The number is odd");
		}
		input.close();
	}
}
