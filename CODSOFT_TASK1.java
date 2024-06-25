import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    private static int score = 0;

    public static void playNumberGame() {
        Random randomNumberGenerator = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = randomNumberGenerator.nextInt(100);
        int chances = 5;
        System.out.println("\t\t\tNUMBER GUESSING GAME");
        System.out.println("CHANCES: " + chances);
        
        while (chances > 0) {
            System.out.print("Enter your guessed number: ");
            int userInput = scanner.nextInt();
            
            if (randomNumber == userInput) {
                System.out.println("You guessed it right! The correct number is " + randomNumber);
                score++;
                System.out.println("Score: " + score);
                return;
            } else if (randomNumber > userInput) {
                System.out.println("Your number is too low.");
            } else {
                System.out.println("Your number is too high.");
            }
            
            chances--;
            System.out.println("Remaining chances: " + chances);
        }
        
        System.out.println("You missed. The correct number was: " + randomNumber);
        System.out.println("Score: " + score);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput;

        do {
            System.out.print("Want to play (Y/N)? ");
            userInput = scanner.next();

            if (userInput.equalsIgnoreCase("n")) {
                System.out.println("Game ended.");
                System.out.println("Final Score: " + score);
                break;
            }

            playNumberGame();
        } while (userInput.equalsIgnoreCase("y"));

        System.out.println("\n\nThank you for playing!");
        scanner.close();
    }
}
