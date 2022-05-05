import java.util.Random;

import java.util.Scanner;

public class number {

	public static void main(String[] args) {
		
		System.out.println("-----------------");
		System.out.println("..PICK A NUMBER..");
		System.out.println("-----------------");
		System.out.println();
		Random rand = new Random();
		int random_number = rand.nextInt(99) + 1;
		
		Scanner myKeyboard = new Scanner(System.in);
		System.out.println("pick a number between");
		int guess;
		int numberOfTries = 1;
		boolean win = false;
		while(win == false) {
			guess = myKeyboard.nextInt();
			if(numberOfTries <5) {
			
			if(guess == random_number)
			{
				System.out.println();
				System.out.println("you got it!: " +random_number);
				System.out.println("It only took you " + numberOfTries+ " guesses to get it right");
				myKeyboard.close();
				win = true;
			}
			else if(guess < random_number) {
				System.out.println("You are too low!");
				System.out.println();
				System.out.println("guess again: ");
			}
			else if(guess > random_number) {
				System.out.println("You are too high!");
				System.out.println();
				System.out.println("guess again: ");
			}
			}
			else if(numberOfTries==5)
			{
				if(guess==random_number) 
				{
					System.out.println();
					System.out.println("you got it!: " +random_number);
					System.out.println("It only took you " + numberOfTries+ " guesses to get it right");
					myKeyboard.close();
					win = true;
				}
				if(guess!=random_number) {
					System.out.println();
					System.out.println("sorry you are out of attempts The correct answer is: " +random_number + "/n Better luck next time");
					myKeyboard.close();
					break;
				}
			}
			numberOfTries = numberOfTries + 1;
		}
		
		

	}
}

