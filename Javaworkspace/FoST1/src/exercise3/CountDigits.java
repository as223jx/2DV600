package exercise3;

import java.util.Scanner;

public class CountDigits {
	
	public static void main(String[] args) {
		
		while(true) {
			
			try {
				
				Scanner scan = new Scanner(System.in);
				System.out.print("Enter a positive integer: ");
				int integer = scan.nextInt();
				String str = Integer.toString(integer);
	
				int zeros = 0;
				int odd = 0;
				int even = 0;
				int sum = 0;
	
				
				for (int i = 0; i < str.length(); i++) {
					int number = Integer.parseInt(Character.toString(str.charAt(i)));
					sum = sum + number;
					if (number == 0) {
						zeros ++;
					}
					
					if (number % 2 == 0) {
						even++;
					}
					else{
						odd++;
					}
				}
				
				System.out.println("Zeros: " + zeros);
				System.out.println("Odd: " + odd);
				System.out.println("Even: " + even);
				System.out.println("Sum: " + sum + "\n");
				
			}
			catch (Exception e) {
				System.out.print("Error!\n");
			}
		}
	}
	
}