package exercise5;

import java.util.Scanner;

public class Diamond {
	
	public static void main(String[] args) {
		
		while(true) {
			
			try {
				
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter a positive odd integer: ");
				int integer = scan.nextInt();
				if(integer % 2 != 0) {
					StringBuilder sb = new StringBuilder();
					
					// First part up until middle
					
					for (int i = 0; i < integer; i++) {
			
						// Makes sure i is uneven and checks how many spaces there should be.
						// Spaces are split in two around the amount of stars (i).
						if(i % 2 != 0){
							
							int spaces = (integer - i) / 2;
							for (int j = 0; j < spaces; j++) {
								sb.append(" ");
							}
							for (int k = 0; k < i; k++) {
								sb.append("*");
							}
							for (int l = 0; l < spaces; l++) {
								sb.append(" ");
							}
							sb.append("\n");
							
						}
						
					}
					
					// Middle row of stars (the amount that the user entered).
					
					for (int i = 0; i < integer; i++) { 
						sb.append("*");
					}
					sb.append("\n");
					
					// Bottom part, reversed use of the code for the top part.
					
					int count = integer;
					for (int i = 0; i < integer; i++) {
			
						if(count % 2 != 0 && count != integer){
							int spaces = (integer - count) / 2;
							for (int j = 0; j < spaces; j++) {
								sb.append(" ");
							}
							for (int k = 0; k < count; k++) {
								sb.append("*");
							}
							for (int l = 0; l < spaces; l++) {
								sb.append(" ");
							}
							sb.append("\n");
						}
						count --;
					}
					
					System.out.println(sb.toString());
				}
				
			}
			catch(Exception e) {
				System.out.println("Error! Please make sure to enter a positive odd integer.");
			}
		}
	}
}