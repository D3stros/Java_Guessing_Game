import java.util.Scanner;

public class Guessing_Game {

	public static void main(String[] args) {
		int max = 1000;
		int min = 1;
		int temp;
		int numberOfAttemps = 1;
		
		Scanner sc = new Scanner(System.in);
		int guess = (max + min) / 2;
		
		do {
			System.out.println("Is the number " + guess + "?");
			
			System.out.println("Yes: Press 1");
			System.out.println("No the number is smaller: Press2");
			System.out.println("No, the number is greater : Press3");
			System.out.println("Your input: ");
			temp = sc.nextInt();
			
			if(temp == 1) {
				System.out.println("Yes, you won");
				System.out.println("Attempts: " + numberOfAttemps);
			} else if(temp == 2) {
				max = guess;
				guess = nextGuess(guess, max, min);
				numberOfAttemps++;
			} else if(temp == 3) {
				min = guess;
				guess = nextGuess(guess, max, min);
				numberOfAttemps++;
			} else {
				System.out.println("Wrong input");
			}
		} while(temp != 1);

	}
	
	public static int nextGuess(int guess, int max, int min) {
		guess = (max + min) / 2;
		return guess;
	}

}
