/*
 * Write a method that computes the gravitational force between two bodies using the formula: 
 * m1 is the mass of the first body m2 is the mass of the second body d is the distance between 
 * them G is a constant: 6.673 x 10-11  N(m/kg)2 Both masses and the distance must be passed as 
 * arguments to the method Also write a main() method to test your method
 */

public class Exercise3 {

	static final double G = 6.673 * Math.pow(10, -11); 
	
	public static void main(String[] args) {
		double f = gForce(10000, 10000, 1);
		System.out.printf("Given m1 = %.3fkg, m2 = %.3fkg, d = %.3fm, then F = %.3fN%n", 10000.0, 10000.0, 1.0, f);
	}
	
	public static double gForce(double m1, double m2, double d) {
		double force;
		force = (G * m1 * m2) / (d * d);
		return force;		
	}
}
