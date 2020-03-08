/*
 * Write a program that creates an array called numbers
 * of 1000 integer elements and initializes all 1000 elements to 1
 */
public class Array_exercise1 {

	public static void main(String[] args) {
		int number[] = new int[1000];	// Instantiating the object number to the class array
		
		for(int i = 0; i < number.length; i++) {	// When doing the comparison, never use a number; instead, use the length class
			number[i] = 1;  // All the numbers of the array = 1
			System.out.println(number[i]);
		}
	}
}
