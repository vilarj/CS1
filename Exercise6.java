/*
 * Write a method that is passed a double array that then squares every value 
 * in the array.  That is, the method replaces each element in the 
 * array with the value of the original element squared.  
 * The method must work for any size array.  Write a main() method to test your method.
 */

public class Exercise6 {
	public static void main(String[] args) {
		double[] original = {2.5, 6.7, 9.6, 10.5};
		
		System.out.println("Original: ");
		
		for(int i = 0; i < original.length; i++) {
			System.out.printf("%.2f%n", original[i]);
		}
		
		Sqrt(original);
		
		System.out.println("\nSquared Values: ");
		
		for(int i = 0; i < original.length; i++) {
			System.out.printf("%.2f%n", original[i]);
		}
	}
	
	public static void Sqrt(double[] a) {
		for(int i = 0; i < a.length; i++) {
			a[i] = a[i] * a[i];
		}
	}
}
