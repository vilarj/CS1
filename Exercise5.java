/*
 * Write a program that calculates the total cost of buying
 * Cheeto's in Bulk. The user enters the number of bags purchased, 
 * and the program computes and outputs the total cost using these rules:
 * 
 * Less than 10 bags purchased, cost is $2/bag
 * Between 10 and 20 bags (inclusive),cost is $1.50/bag
 * More than 20 bags, cost is $1.25/bag
 * 
 */
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total, bags_purchased;
		
		System.out.println("Enter the number of bags purchased: ");
		bags_purchased = input.nextDouble();
		
		total = 2 * bags_purchased;
		
		if(bags_purchased < 10) {
			System.out.println("The total cost is: $" + total);
		}
		
		else if(bags_purchased > 10  || bags_purchased < 20) {
			total = bags_purchased * 1.50;
			System.out.println("The total cost is: $" + total);
		}
		
		else if(bags_purchased > 20) {
			total = bags_purchased * 1.25;
			System.out.println("The total cost is: $" + total);
		}
		
		else {
			System.out.println("There's an error! Try again");
		}
		
		input.close();
	}
}
