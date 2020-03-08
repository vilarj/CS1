/*
 * Write a method named getDouble() that reads
 * a double value from the user and returns it to main()
 * then print the value in main()
 */
import java.util.Scanner;
public class Method_exercise2 {

	public static void main(String[] args) {
		double user;
		user = getDouble();
		
		System.out.println("The value is: " + user);
		
	}
	
	// Second Method
	public static double getDouble() {
		Scanner input = new Scanner(System.in);
		double user;
		
		// Asking for a value
		System.out.println("Enter a number: ");
		user = input.nextDouble();
		input.close();
		return user;
	}
}
