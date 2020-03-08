/*
 * Write a program that uses a for loop to calculate n!,
 *  for a given n.  Ask the user for a value of n and your 
 *  program should compute and print the value of n! ( n! = 1 * 2 * 3 * … * N).
 */
import java.util.Scanner;
public class Exercise2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, f = 1;
		
		System.out.print("Enter n:" );
		n = input.nextInt();
		
		if(n <= 0) {
			System.out.println("There is no factorial of negative numbers");
		}
		
		for(int i = 1; i <= n; i++) {
			f = f * i; 
		}
		
		System.out.printf("%d! = %d%n", n, f);
		input.close();
	}
}
