/*
 * Write a program that works with fractions. You are to implement three methods called subtractFractions(), \
 * multiplyFructions() and divideFractions() to perform subtraction, multiplication and division, respectively, 
 * on a pair of fractions.  You are given two fractions as arguments for each function; each of them is a two-element 
 * array (the numerator is at index 0, the denominator is at index 1).  
 * The methods are to return a resulting, simplified fraction as a new two-element 
 * array (again, with the numerator at index 0, and denominator at index 1).  
 * 
 */
import java.util.Scanner;
public class Fractions {

	// Error to output if either denominator is zero
	static final String DENOMINATOR_IS_ZERO = "Denominator cannot be zero.";

	// Error to output if dividing by zero
	static final String DIVIDE_BY_ZERO = "Cannot divide by zero.";

	// Error to output if the operation is invalid
	static final String INVALID_OPERATOR = "Invalid operation.";

	/**
	 * Returns the greatest common divisor (gcd) of two integers
	 * 
	 * param num1 integer 1 param num2 integer 2 return gcd of integers 1 and 2
	 */
	public static int gcd(int f1, int f2) {
		int t;
		while (f2 != 0) {
			t = f2;
			f2 = f1 % f2;
			f1 = t;
		}

		return f1;
	}

	/**
	 * Returns the simplified form of a fraction
	 * 
	 * param f fraction (numerator=[0], denominator=[1]) return simplified fraction
	 * (numerator=[0], denominator=[1])
	 */
	public static int[] simplifyFraction(int[] f) {
		int gcd = gcd(f[0], f[1]);
		int[] result = { f[0] / gcd, f[1] / gcd };

		if ((result[0] < 0 && result[1] < 0) || (result[1] < 0)) { // adjusting negative signs
			result[0] = -result[0];
			result[1] = -result[1];
		}

		return result;
	}

	/**
	 * Adds two fractions
	 * 
	 * param f1 first fraction (numerator=[0], denominator=[1]) param f2 second
	 * fraction (numerator=[0], denominator=[1]) return result of adding parameters
	 * (numerator=[0], denominator=[1])
	 */
	public static int[] addFractions(int[] f1, int[] f2) {
		int[] result = new int[2];
		result[0] = ( (f1[0] * f2[1]) + (f2[0] * f1[1]) );
		result[1] = f1[1] * f2[1];

		return simplifyFraction(result);
	}

	/**
	 * Subtracts two fractions
	 * 
	 * param f1 first fraction (numerator=[0], denominator=[1]) param f2 second
	 * fraction (numerator=[0], denominator=[1]) return result of subtracting
	 * parameter f2 from f1 (numerator=[0], denominator=[1])
	 */
	public static int[] subtractFractions(int[] f1, int[] f2) {
		int[] result = new int[2];
		
		result[0] = ((f1[0] * f2[1]) - (f1[1] * f2[0]));
		result[1] = f2[0] * f2[1];
		
		return new int[2];
	}

	/**
	 * Multiplies two fractions
	 * 
	 * param f1 first fraction (numerator=[0], denominator=[1]) param f2 second
	 * fraction (numerator=[0], denominator=[1]) return result of multiplying
	 * parameters (numerator=[0], denominator=[1])
	 */
	public static int[] multiplyFractions(int[] f1, int[] f2) {
		int[] result = new int[2];
		
		result[0] = f1[0] * f1[1];
		result[1] = f2[0] * f2[1];
		
		return new int[2];
	}

	/**
	 * Divides two fractions
	 * 
	 * param f1 first fraction (numerator=[0], denominator=[1]) param f2 second
	 * fraction (numerator=[0], denominator=[1]) return result of dividing parameter
	 * f2 by f1 (numerator=[0], denominator=[1])
	 */
	public static int[] divideFractions(int[] f1, int[] f2) {
		int[] result = new int[2];
		
		result[0] = f1[0] * f2[1];
		result[1] = f2[0] * f1[1];
		
		return new int[2];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] numerator = new int[2];
		int[] denominator = new int[2];;
		String operation;
		
		System.out.print("Enter the numerator for the first fraction: ");
		numerator[0] = input.nextInt();
		
		System.out.print("Enter the denominator for the first fraction: ");
		denominator[0] = input.nextInt();
		
		System.out.print("Enter the numerator for the second fraction: ");
		numerator[1] = input.nextInt();
		
		System.out.print("Enter the denominator for the second fraction: ");
		denominator[1] = input.nextInt();
		
		System.out.print("Enter the operation (+, -, *, /): ");
		operation = input.next();
		
		// Checking and calling the methods
		if(operation.equals("")) {
			System.out.print("The operation is not defined");
		}
		
		else if(denominator[0] == 0 && denominator[1] == 0) {
			System.out.print("The denominators cannot be zero");
		}
		
		else if(operation.equals("+")) {
			System.out.print(numerator[0] + "/" + denominator[0] + " + " + numerator[1] + "/" + denominator[1] + " = ");
			System.out.print(addFractions(numerator, denominator));				
		}
		
		else if(operation.equals("-")) {
			System.out.print(numerator[0] + "/" + denominator[0] + " - " + numerator[1] + "/" + denominator[1] + " = ");
			System.out.print(addFractions(numerator, denominator));	
		}
		
		else if(operation.equals("*")) {
			System.out.print(numerator[0] + "/" + denominator[0] + " * " + numerator[1] + "/" + denominator[1] + " = ");
			System.out.print(addFractions(numerator, denominator));	
		}
		
		else if(operation.equals("/")) {
			System.out.print(numerator[0] + "/" + denominator[0] + " / " + numerator[1] + "/" + denominator[1] + " = ");
			System.out.print(addFractions(numerator, denominator));	
		}
		
		// Closing the Scanner
		input.close();
	}
}
