/*
 * Write a program that asks the user for two integers,
 * x and y, and then outputs the sum of x and y.
 * 
 * Your program must use try-catch blocks to print out useful errors
 * messages if the user does not follow directions(that is if they enter
 * a value that is not an integer)
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class Try_Catch_Exercise {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0, sum = 0;
		
		try {
		System.out.print("Enter the value of x: ");
		x = input.nextInt();
		
		System.out.print("Enter the value of y: ");
		y = input.nextInt();
		}
		
		catch(InputMismatchException ex){
			System.out.println("Error! An integer is required!");
			System.exit(0);
		}
		
		sum = x + y;
		System.out.print("The sum of " + x + " and " + y + " is: " + sum);
	
		input.close();
	}
}
