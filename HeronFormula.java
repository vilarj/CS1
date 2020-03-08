/*
 * Get the three side lengths of a triangle from the user (which might have decimal values): a, b, c.
 * Check to ensure each side is greater than zero.
 * Check to ensure that the sides are valid for a triangle. Importantly, the sum of the lengths of any two sides must be 
 * larger than the length of the third side (you must check all three sides this way).
 */
import java.util.Scanner;

public class HeronFormula {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c, Sem_perimeter, area;
		
		// Getting the values
		System.out.println("Enter the length of a side a: ");
		a = input.nextDouble();
		
		// Checking a
		if (a == 0) {
			System.out.println("The value has to be greater than 0. Try it again, please");
		}
		
		System.out.println("Enter the length of a side b: ");
		b = input.nextDouble();
		
		// Checking b
		if (b == 0) {
			System.out.println("The value has to be greater than 0. Try it again, please");
		}
		
		System.out.println("Enter the length of a side c: ");
		c = input.nextDouble();
		
		Sem_perimeter = (a + b + c)/2;
		 
		// Checking c
		if (c == 0) {
			System.out.println("The value has to be greater than 0. Try it again, please");
		}
		
		// Calculating the Semi-perimeter
		if ((a + b) > c) {
			Sem_perimeter = (a + b + c)/2;
		}
		else {
			System.out.println("a + b must be greater than c");
		}
		area = Math.sqrt(Sem_perimeter*(Sem_perimeter - a)*(Sem_perimeter - b)*(Sem_perimeter - c));
		
		System.out.println("The area is: " +area);
		input.close();
	}
}
