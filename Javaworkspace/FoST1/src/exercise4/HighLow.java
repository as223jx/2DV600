package exercise4;

import java.util.Random;
import java.util.Scanner;

public class HighLow {
	
	public static void main(String[] args) {
		
		while(true){

			boolean correct = false;
			int count = 0;
			Random rand = new Random();
			int random = rand.nextInt (101);
			
			do {
				
				count ++;
				
				try{
					
					// System.out.println("(Cheat sheet! Random is: " + random + ")");
					
					Scanner scan = new Scanner(System.in);
					System.out.print("Guess a number between 1-100: ");
					int guess = scan.nextInt();

					if (guess < 1 || guess > 100) {
						System.out.println("Error! The number should be between 1-100.\n");
						count--;
					}
					else if (guess == random) {
						System.out.println("Correct! It took you " + count + " guesses!\n");
						correct = true;
					}
					else if (guess > random) {
						System.out.println("Hint: Lower\n");
					}
					else if (guess < random) {
						System.out.println("Hint: Higher\n");
					}
					
				}
				
				catch(Exception e) {
					System.out.println("Error! Make sure you type an integer.\n");
					count--;
				}
				
			} while(!correct);
		}
	}
}