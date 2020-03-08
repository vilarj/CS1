
public class Conversion {
	public static void main(String[] args) {
		int dec1 = 25;
		int dec2 = 255;
		int hex1 = 0x15;
		int hex2 = 0x55;
	
		// Doing the Math using the class toHexString
		
		System.out.format("Decimal value 25 in hex is: 0x" + Integer.toHexString(dec1) + "%n");
		System.out.format("Decimal value 255 in hex is: 0x" + Integer.toHexString(dec2) + "%n");
		System.out.format("Hexadecimal value 0x15 in decimal is:" + Integer.toHexString(hex1) + "%n");
		System.out.format("hexadecimal value 0x55 in decimal is:" + Integer.toHexString(hex2) + "%n");
		
	}
}
