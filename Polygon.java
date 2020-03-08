/*
 * Write a program to compute the area, perimeter, and interior angle of a regular polygon. 
 * First, have the user supplies the number of sides of the polygon (a whole number, which must be 3 or greater) 
 * and the side length (any positive number).
 * 
 * Area = S^2n/4tan(180/n) = S^2n/4tan(pi/n)
 * 
 * where n is the number of sides and s is the side length. 
 * Note that both equations are equivalent, with the first equation using degrees and the second equation
 *  using radians.
 * 
 */
import java.util.Scanner;
public class Polygon {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double length_s, n, area, perimeter, int_angle; 		//length_s is the length of one side		n is the number of sides that determine the polygon
		
		do {
			// Asking for the polygon
			System.out.println("Enter the number of sides: ");
			
				while(!input.hasNextDouble()) {
					
					// Checking whether the output is a number or a word
					System.out.println("Error! Enter a number: ");
					input.next();
				}
				
			n = input.nextDouble();
			
//			// Asking for the side length
//			System.out.println("Enter the side length: ");
//			length_s = input.nextDouble();
		}while(n < 3);
		
		
		do {
			// Asking for the side length
			System.out.println("Enter the side length: ");
			
				while(!input.hasNextDouble()) {
					
					// Checking whether the output is a number or a word
					System.out.println("Error! Enter a number: ");
					input.next();
				}
			length_s = input.nextDouble();
			
		}while(length_s <= 0);
		
		// Area in radians
		area = (Math.pow(length_s, 2) * n) / (Math.tan(Math.PI/n) * 4);
		
		// Perimeter
		perimeter = n * length_s;
		
		// Inteior Angle
		int_angle = 180 - (360 / n);
			
		System.out.format("Area: %.3f ", area); System.out.print("\n");
		System.out.format("Perimeter: %.3f ", perimeter); System.out.print("\n");
		System.out.format("Interior Angle: %.3f ", int_angle); System.out.print("degrees");
		
		input.close();
		
	}
}
