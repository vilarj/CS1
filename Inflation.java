
/**
 * Write a program that deals with inflation, which is essentially the rising cost of general goods over time. 
 *  That is, the price of goods, such as a packet of cookies, goes up as time goes by. So, you will write 
 *  a program to gauge the expected cost of an item in a specified number of years. 
 *  
 *  The program asks for the cost of the item, the number of years, and the rate of inflation. 
 *  The output is the estimated cost of the item after that number of years, using the given inflation rate. 
 *  The user enters the inflation rate as a percentage, for example 4.5. 
 *  You will have to convert the percentage to a fraction (like 0.045), and then use a loop to estimate the item's price adjusted for inflation. 
 */
import java.util.Scanner;

public class Inflation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double item_price, inflation_rate, inflation;
		int years;

		// Cost of the item
		System.out.print("Enter the current price of the item: $");
		item_price = input.nextDouble();

		// Number of years
		System.out.print("Enter the number of years: ");
		years = input.nextInt();

		// Inflation rate
		System.out.print("Enter the inflation rate as a percentage: ");
		inflation_rate = input.nextDouble() / 100;

		// Math
		inflation = item_price * (1 + inflation_rate); // cost * 1 year + increment

		for (int i = 0; i < years - 1; i++) {
			inflation = inflation * (1 + inflation_rate); // cost * 1 year + increment
		}

		// Result
		System.out.print("After " + years + " years, the price will be $");	System.out.format("%.2f ", inflation);
		
		
		input.close();
		
		
	}
}
