/*
 * Write a program that prints out the value of 2
 * raise to the power of x, for x = 1,2,3,...,12
 * 
 */
public class Method_exercise1 {
	public static void main(String[] args) {
		int x = 1, result;
		
		while(x <= 12) {
			result = (int) Math.pow(2, x);
			System.out.println(x + " to the power of " + x + " is: " + result);
			x++;
		}
	}
}
