/*
 * Write a program that calls a method to calculate the area of a
 * rectangle. The length and the width are provided by the user.
 * The method takes these two sides as inputs, and returns the calculated area.
 */
import java.util.Scanner;
public class Method_4 {

		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double base, height, area;
		
		// Asking for the base
		System.out.println("Enter the base of the triangle: ");
		base = input.nextDouble();
		
		// Asking for the height
		System.out.println("Enter te height of the triangle: ");
		height = input.nextDouble();
		
		// Calling the method
		area = Triangle_Area(base, height);
		
		// Result
		System.out.println("The area is: " + area);
		
		// Closing the Scanner
		input.close();
	}
	
		// Method that calculates the area of a triangle
	public static double Triangle_Area(double base, double height) {
		return (base * height);
	}
}
