/*
 * Write a program to compute the sum, 
 * mean, and population standard deviation of 
 * a list of 5 numbers. First, have the user supply 
 * five numbers via the keyboard. 
 */

import java.util.Scanner;

public class Statistics {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double num1, num2, num3, num4, num5, sum, mean, differences, population, Final_population;
		
		// Asking for the numbers
		System.out.println("Enter a number, please: ");
		num1 = input.nextDouble();
		
		System.out.println("Enter a second number, please: ");
		num2 = input.nextDouble();
		
		System.out.println("Enter a third number, please: ");
		num3 = input.nextDouble();
		
		System.out.println("Enter a foruth number, please: ");
		num4 = input.nextDouble();
		
		System.out.println("Enter a fifth number, please: ");
		num5 = input.nextDouble();
		
		// Doing the math
		sum = num1 + num2 + num3 + num4 + num5;
		mean = (num1 + num2 + num3 + num4 + num5)/5;
		differences = ((Math.pow(num1 - mean, 2)) 
				+ (Math.pow(num2 - mean, 2)) 
				+ (Math.pow(num3 - mean, 2)) 
				+ (Math.pow(num4 - mean, 2))
				+ (Math.pow(num5 - mean, 2)));
		population = differences / 5;
		Final_population = Math.sqrt(population);
		
		System.out.println("The Sum: "+sum);
		System.out.println("The Mean: " + mean);
		System.out.println("The Population Standard Deviation: " + Final_population);
		
		 input.close();
	}
}
