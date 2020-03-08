/*
 * The body mass index (BMI) is a measure of a person’s health 
 * status based on the person’s weight and height.  It is calculated 
 * by taking a person’s weight in kilograms and dividing it by the 
 * square of person’s height in meters:
 * 
 * BMI=  (weight (Kg)) / [height (m)^2 
 * BMI	INTERPRETATION
 * Below 18.5	Underweight
 * 18.5 – 24.9	Normal
 * 25.0 – 29.9	Overweight
 * Above 30.0	Obese
 */
import java.util.Scanner;
public class BodyMassIndex {
	
	// Main method
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		
		// Asking for the name
		System.out.println("Name: ");
		name = input.next();
		
		// Asking for the age
		System.out.println("Age: ");
		age = input.nextInt();
		
		// Checking inmediately
		if (age < 17) {
			System.out.println(name + ", you are not old enoght");
		}
		
		// Concluding and calling the methods
		System.out.print("Weight: ");
		System.out.format("%.1f", lbsToKg(43));
		System.out.print(" lbs");
		System.out.print("\nHeight: ");
		System.out.format("%.1f", ftToM(1.60));
		System.out.print(" ft");
		
		// Closing the Scanner
		input.close();
	}
	
	// Body Mass Index method
	public static double bmi(double weight, double height) {
		double conversion = ((weight) / (height * height));
		return conversion;
	}
	
	// Pounds to Kg method
	public static double lbsToKg(double weight) {
		double conversion = weight * 2.20462;
		return Math.round(conversion);
	}
	
	// Feet to Meters method
	public static double ftToM(double height) {
		double conversion = height * 3.28084;
		return conversion;
	}
	
	// Health Status method
	public static String healthStatus(double name, double age, double weight, double height) {
		if(Math.abs(weight) <= 18.5) {
			return "Underweight";
		}
		else if(Math.abs(weight) >= 18.5 || height <= 24.9) {
			return "Normal";
		}
		
		else if (Math.abs(weight) >= 25.0 || height <= 29.9) {
			return "Overweight";
		}
	
		else if (Math.abs(weight) > 30.0){
			return "Obese";
		}
		else {
			return "Try to input positive values";
		}
	}
}
