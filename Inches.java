import java.util.Scanner;
public class Inches {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int yards, feet, inches, total;
		
		System.out.print("Enter number of yards: ");	// Asking for the yards
		yards = input.nextInt() * 36;		
		
		System.out.print("Enter number of feet: ");	// Asking for the feet
		feet = input.nextInt() * 12;		
		
		System.out.print("Enter number of inches: ");	// Asking for inches
		inches = input.nextInt();		
		
		total = yards + feet + inches;
		
		System.out.println("The total number of inches is: " + total);
		input.close();
	}
}
