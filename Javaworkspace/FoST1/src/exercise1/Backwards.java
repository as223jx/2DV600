package exercise1;

import java.util.Scanner;

public class Backwards {
	
	public static void main(String[] args) {
		
		System.out.print("Enter a string to reverse: ");
		
		try{
			
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			scan.close();
			
			String backwards = new StringBuilder(str).reverse().toString();
			System.out.println(backwards);
		
		}
		catch(Exception e) {
			System.out.println("Error! An error has occured.");
		}
		
	}
}