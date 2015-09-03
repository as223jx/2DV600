package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountChars {
	
	public static void main(String[] args) {
		
		int uppercase = 0;
		int lowercase = 0;
		int whitespace = 0;
		int other = 0;
		int numbers = 0;
		Scanner fileScan;
		StringBuilder sb = new StringBuilder();
		
		try {
			
			fileScan = new Scanner(new File(args[0]));
		
			while(fileScan.hasNextLine()) {
				sb.append(fileScan.nextLine());
			}
			
			// Looping through all characters.
			
			for (int i = 0; i < sb.length(); i++) {
				char ch = sb.charAt(i);
				
				if(Character.isUpperCase(ch)) {
					uppercase++;
				}
				
				if (Character.isLowerCase(ch)) {
					lowercase++;
				}
				
				if (Character.isWhitespace(ch)) {
					whitespace++;
				}
				
				if (Character.isDigit(ch)) {
					numbers++;
				}
			}
			
			other = sb.length() - (uppercase + lowercase + whitespace + numbers);
			
			System.out.println("Uppercase letters: " + uppercase);
			System.out.println("Lowercase letters: " + lowercase);
			System.out.println("Whitespaces: " + whitespace);
			System.out.println("Numbers: " + numbers);
			System.out.println("Other characters: " + other);
			
		} catch (FileNotFoundException e) {
			System.out.println("Error! File could not be found.");
		}
	}
	
}