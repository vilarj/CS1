import java.util.Scanner;
public class YardsFeetInches {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		int yards;
		int feet; 
		int inches;
		int total;
		
		System.out.print("Enter number of inches: ");	// Asking for the yards
		total = input.nextInt();
		
		yards = total / 36;
		feet = (total-36)/12;
		inches = (total-36) - (12*feet);
		
		System.out.print("Yards: " +yards);	// Yards in the total of inches
		System.out.print("Feet: " +feet);	// Asking for inches
		System.out.print("Inches: " +inches); 
		
		input.close();
	}
}
