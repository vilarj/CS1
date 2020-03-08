
import java.util.Scanner;

public class InputOutput {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
				int points;
				
				System.out.println("Enter the number of hit points: ");
				points = input.nextInt();
				
				System.out.println("You entered: " + points + " points.");
				input.close();
}
}
