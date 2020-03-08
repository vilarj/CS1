/*
 * Inverse of a String. For instance: daniel  -- leinad
 */
import java.util.Scanner;
public class Inverse_String {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String original = "";
		String newString = "";
		
		// Storing the original String
		System.out.println("Enter the String, please: ");
		original = input.nextLine();
		
		// Finding the first character and minus one form it
		for(int i = original.length() - 1; i >= 0; i--) {
			newString += original.charAt(i);
		}
		
		// Results
		System.out.println(newString);
		//System.out.println("	" + newString);
		//System.out.println("		" + newString);
		//System.out.println("			" + newString);
		//System.out.println("				" + newString);
		
		// Closing the Scanner
		input.close();
	}
}
