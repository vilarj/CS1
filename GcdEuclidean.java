
/*
 * First write a method called gcd() to calculate the greatest common divisor (GCD) of two positive
 *  integers using Euclidean algorithm. Then write a main() method that requests two positive integers
 *   from the user, validates the input, calls the gcd() method to compute the GCD, and outputs the 
 *   return value of the gcd method() (all user input and output should be done in main()).
 *   Check Wikipedia to find more information about GCDs and Euclidean algorithm.  
 *   Below is a pseudocode for calculating the GCD, which you might find it useful:
 *   method gcd(a, b) {
    while (b ≠ 0) {
        t = b
        b = a mod b 
        a = t
    }
    return a
}

 * Test your program with the following data:
 * Enter a: 34
 * Enter b: 289
 * The GCD of 34 and 289 is 17
 */
import java.util.Scanner;
public class GcdEuclidean {
	
	// gcd method
	public static int gcd(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		
		// Getting a from the user
		System.out.println("Enter a: ");
		a = Math.abs(input.nextInt());
		
		// Getting b from the user
		System.out.println("Enter b: ");
		b = Math.abs(input.nextInt());
		
		// Calling gcd()
		System.out.println("The GCD of " + a + " and " + b + " is " + gcd(a,b));
		
		// Closing the Scanner
		input.close();
	}
}
