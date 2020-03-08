/*
 * Write two methods named area(() that return
 * type double. One method calculates the area of a circle
 * that has a single argument, which is the radius.
 * The second method calculates the area of a rectangle that has
 * two arguments, which are the length and the width.
 * Write a main() to test them both
 */
public class Overloading_exercise {

	public static void main(String[] args) {
		
		// First Method
		System.out.format("C = %.3f  ", area(2));
		
		// Second Method
		System.out.println("C = " + area(2, 4));
	}
	
	
	// Calculating the area by passing one parameter
	static double area(double r){
		return Math.PI * (r * r);
	}
	
	// Calculate the area by passing two parameters
	static double area(double width, double length) {
		return width * length;
	}
}