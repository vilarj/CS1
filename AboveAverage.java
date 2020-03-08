/*
 * Write a program that reads a stream of integers from the console and stores them in an array. 
 * The array is then analyzed to compute the average of all the values in the array, 
 * and finally all the values that are above the average should be printed out to the screen.  
 * Specifically, you must write three methods: main(), readIntoArray(), and printAboveAverage().
 * main() creates a scanner and an array of 100 elements of integer type, and outputs a message to 
 * the screen asking for a sequence of numbers.  readIntoArray() is then called to read values from 
 * the scanner and store them in the array.  It must be passed two arguments: the scanner and the
 * array objects.  You should only store as many integers as the array can handle.  Note, however, 
 *  that there might be fewer than 100 values typed at the console – store whichever is fewer.  
 *  This method must return how many integers, up to the length of the array, were read into the array. 
 *The hasNextInt() method of the scanner will be useful to determine if there are additional integers to 
 * read from the console.
 * Finally, printAboveAverage() should be called to read through the array, compute the average,
 * and then print out all values in the array that are above the average.  
 * For each value above the average it should print the index in the array, as well as the value itself.  
 * printAboveAverage() should take two arguments: the array and the actual number of values in the array. 
 * Note that the second argument is not the total number of elements that the array can hold but is
 * instead the number of values that are valid (i.e. populated in the readIntoArray() method). 
 * For example, the array should be able to hold up to 100 values, but there might have only
 * been 15 values typed at the console.
 */
// import java.util.Scanner;
public class AboveAverage {
	
	// Main method
	public static void main(String[] args) {
		// Scanner input = new Scanner(System.in);
		// int[] index = new int[100];
		
		// System.out.println(readIntoArray(input, index));
		
		
	}
	
	// readIntoArray method
	public static int[] readIntoArray(int s, int[] r) {
		System.out.println("Enter a sequence of numbers. Enter a number equals or less than 0 to stop: ");
		
		for(int i = 0; i < r.length; i++) {
			
		}
		return r;
	}
	
	
	// Print Above Method
	public static int printAboveAverage(int above) {
		return above;
	}
}
