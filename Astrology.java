/*
 * Write an Astrology program. The user will give their birthday as a month number (1 – 12) and
 *  then a day number (1 – 31). Your program will then output the person's astrological sign on one line, 
 *  and then a horoscope for the user on the next. 
 *  
 *  A sample test case is provided here:
 *  Enter your birth month (1-12): 9
 * Enter your birth day (1-31): 26
 * You are a Libra!
 * Tony Stark will buy out your business.
 */

import java.util.Scanner;

public class Astrology {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month, day;
		
		// Asking for the month
		System.out.print("Enter your birth month (1-12): ");
		month = input.nextInt();
		
		// Asking for the day
		System.out.print("Enter your birth day (1-31): ");
		day = input.nextInt();
		
		// Checking the user's input
		if ((month==0) || (day > 31)) 
			System.out.println("Incorrect month or day entered. Try again");
		
		// Aquarium
		if ((month == 1) && (day >= 20) || (month == 2) && (day < 19)) {
			System.out.println("You are Aquarium!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Piesces
		else if ((month == 2) && (day >= 19 ) || (month == 3) && (day <=20)) {
			System.out.println("You are Piesces!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Aries
		else if((month == 3) && (day >= 21) || (month == 4) && (day < 19)) {
			System.out.println("You are Aries!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Taurus
		else if ((month == 4) && (day >= 19) || (month == 5) && (day < 20)) {
			System.out.println("You are Taurus!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Gemini
		else if ((month == 5) && (day >= 20) || (month == 6) && (day < 21)) {
			System.out.println("You are Gemini!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Cancer
		else if((month == 6) && (day >= 21) || (month == 6) && (day < 21)) {
			System.out.println("You are Cancer!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Leo
		else if ((month == 7) && (day >= 22) || (month == 8) && (day < 22)) {
			System.out.println("You are Leo!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Virgo
		else if ((month == 8 ) && (day >= 22) || (month == 9) && (day < 22)) {
			System.out.println("You are Virgo!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Libra
		else if ((month == 9) && (day >= 22) || (month == 10) && (day < 22)) {
			System.out.println("You are Libra!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Scorpio
		else if ((month == 10) && (day >= 22) || (month == 11) && (day < 21)) {
			System.out.println("You are Scorpio!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		// Sagittarius
		else if ((month == 11) && (day >= 21) || (month == 12) && (day < 21)) {
			System.out.println("You are Sagittarius");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		//Capricorn
		else if((month == 12) && (day >= 21) || (month == 1) && (day < 19)) {
			System.out.println("You are Capricorn!");
			System.out.println("Tony Stark will buy out your business.");
		}
		
		else {
			System.out.println("Invalid date. Try again, please!");
		}
		input.close();
	}
}
