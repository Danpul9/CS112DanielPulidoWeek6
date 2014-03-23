import java.util.Random;
import java.util.Scanner;

public class rockPaperScissors {
	static Scanner k;
	static int rand = 0;
	static String comp ="";
	static int input;
	static String player = "";
	// rock = 1 paper = 2 scissors = 3
	static void aiDecision() {
		Random r = new Random();
		rand += r.nextInt(3);
		switch (rand) {
        case 1:  comp = "Rock";
                 break;
        case 2:  comp = "Paper";
        break;
        case 3:  comp = "Scissors";
        break;
        case 0:  comp = "rock";
        break;
		}
	}
	
	static void decision() {
		switch (player) {
        case "rock":  input = 1;
                 break;
        case "paper":  input = 2;
        break;
        case "scissors":  input = 3;
        break;
		}
	}
	
	public static void main(String[] args) {
		k = new Scanner(System.in);
		System.out.println("Type either Rock, Paper or Scissors.");
		player = k.next();
		decision();
		System.out.printf("you chose %s\n", player);
		aiDecision();
		System.out.printf("your opponent chose %s\n", comp);
		
		switch (input) {
		case 1: 
			if(rand == 2) {
			System.out.println("You lose.");
		}
		else {
			if(rand == 3) {
			System.out.println("You Win.");
		}
			else {
				if(rand == 1) {
					System.out.println("It's a tie.");
				}
			}
		}
			break;
		case 2:	
			if(rand == 2) {
			System.out.println("It's a tie.");
		}
		else {
			if(rand == 3) {
			System.out.println("You lose.");
		}
			else {
				if(rand == 1) {
					System.out.println("You win.");
				}
			}
		}
			break;
		case 3:
			if(rand == 2) {
			System.out.println("You win.");
		}
		else {
			if(rand == 3) {
			System.out.println("It's a tie.");
		}
			else {
				if(rand == 1) {
					System.out.println("You Lose.");
				}
			}
		}
		}
	}

}