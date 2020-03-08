/*
 * write a for loop that prints all the powers
 * of two between 1 and 1 billion
 */
public class Exercise_For_2 {
	public static void main(String[] args) {
		for(int i=1; i<=1000000000; i = i*2) {
			System.out.println(i);
		}
	}
}
