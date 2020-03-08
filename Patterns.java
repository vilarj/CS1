/*
 * 1.	Write a method to display a pattern as follows:
 * 				0
                   1 0
                 2 1 0
              3 2 1 0
                 :
                 :
			n n-1 … 3 2 1
			The method header is:
			public static void displayPattern(int n)
 */

public class Patterns {

	// This method will create a pattern
	public static int displayPattern(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(i);
			
			for(int a = 1; a < n; a++) {
				System.out.println(a + "  " + i);
				
				for(int b = 2; b < n; b++) {
					System.out.println(b + "  " + a + "  " + i);
					
					for(int c = 3; c < n; c++) {
						System.out.println(c + "  " + b + "  " + a + "  " + i);
						
						for(int d = 4; d < n; d++) {
							System.out.println(d + "  " + c + "  " + b + "  " + a + "  " + i);
							
							for(int e = 5; e < n; e++) {
								System.out.println(d + "  " + c + "  " + b + "  " + a + "  " + i);
								
								for(int f = 6; f < n; f++) {
									System.out.println(d + "  " + c + "  " + b + "  " + a + "  " + i);
									
									for(int g = 7; g < n; g++) {
										System.out.println(d + "  " + c + "  " + b + "  " + a + "  " + i);
									}
								}
							}
						}
					}
				}
			}
		}
		return n;
	}
	
	// Main method
	public static void main(String[] args) {
		// Overloading
		System.out.println(displayPattern(4));
	}
}
