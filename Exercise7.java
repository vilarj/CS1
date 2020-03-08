/*
 * Write a method that is passed a String array and returns the longest String 
 * (the one with the most characters).  
 * If there are multiple String objects that are tied for the longest, 
 * return the last such String. Write a main() method to test your method.
 *  
 */

public class Exercise7 {
	public static void main(String[] args) {
		String[] vals = {"addadsad", "shjfhdg", "MORE STUFF", "jsdhfjkhfsakgjhfkjgh"};
		
		String correct = longString(vals);
		
		System.out.println("This is the largest string: " + correct);
		
	}
	
	public static String longString(String[] a) {
		String longest = "";
		int maxLength = -1;
		
		for(int i = 0; i < longest.length(); i++) {
			if(a[i].length() >= maxLength) {
				maxLength = a[i].length();
				longest = a[i];
			}
		}
		return longest;
	}
}
