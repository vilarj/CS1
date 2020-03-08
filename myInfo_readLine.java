/*
 * Write a program that reads every line (one entire line at a time)
 * from a file named "myInfo.txt". For each line, print out
 * both to the screen and to another file named "LineCounts.txt"
 * the number of characters were on that line
 */
import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class myInfo_readLine {

	public static void main(String[] args) {
		try(Scanner file_in = new Scanner(new File("myInfo.txt"))){
			PrintWriter fill_out = new PrintWriter(new File("LineCounts.txt"));
			
			while(file_in.hasNext()) {
				String nextLine = file_in.nextLine();
				System.out.println(nextLine.length());
				fill_out.print(nextLine.length());
			}
			
		}
		
		catch(FileNotFoundException ex) {
			System.out.print("File was not found");
			System.exit(0);
		}
	}

}
