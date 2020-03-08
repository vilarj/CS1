/*
 * Write a program to compute the square root of a number. 
 * DO NOT USE any math libraries/methods in this program. 
 * You will be using the Babylonian method (a.k.a. Heron’s method) 
 * to approximate the square root.
 */

import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		double x, error, lastGuess;
		
		System.out.println("Enter the value of x: ");
		x = user_input.nextInt();
		
		System.out.println("Enter error tolerance: ");
		error = user_input.nextDouble();
		
		System.out.println("Enter your guess: ");
		lastGuess = user_input.nextDouble();
		
		if(x == 1) {
			System.out.print("The square root of " + x + " is: " + x);
		}
		
		else {
			System.out.println(squareRoot(lastGuess, x, error));
			
			}
		
		user_input.close();
	}
	
	public static double absoluteValue(double a) {
		if(a > 0) {
			return a;
		}
		
		return a * -1.0;
	}
	
	public static double squareRoot(double lastGuess, double x, double error) {
		double last_guess = lastGuess;
		double nextGuess;
		boolean end;
		do {
			nextGuess = (last_guess + (x / last_guess)) / 2;
			
			if (absoluteValue(last_guess - nextGuess) > error) {
				end = false;
			}
			
			else {
				end = true;
			}
			
			last_guess = nextGuess;
		}
		while(!end);
		
		System.out.print("The square root of " + x + " is: ");
		return nextGuess;
	}
}
