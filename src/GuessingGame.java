import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class GuessingGame {
    private int targetNum;
    private String name;
    private int numGuesses;
    private Scanner scanner;
    private Random random;

    public GuessingGame() {
        scanner = new Scanner(System.in);
        random = new Random();
        // greet player
        System.out.println("Welcome to the number guessing game!");
        // get player name
        System.out.println("What's your name?");
        name = scanner.nextLine();
        System.out.println("Hello, " + name + " I'm thinking of a number between 1 and 100.");
        // choose random number between 1 and 100
        targetNum = random.nextInt(100) + 1;
        numGuesses = 0;
        // game loop
        while (true) {
            // get guess
            System.out.print("Try to guess my number.\nYour guess? ");
            try {
                int guess = scanner.nextInt();
                if (guess < 1 || guess > 100) {
                    throw new InputMismatchException();
                }
                // if guess is correct
                if (guess != targetNum) {
                    // give hint
                    if (guess < targetNum) {
                        System.out.println("Your guess is too low, try again.");
                    } else {
                        System.out.println("Your guess is too high, try again.");
                    }
                    // increase number of guesses
                    numGuesses++;
                } else {
                    System.out.println("Well done " + name);
                    System.out.println("You found my number in " + numGuesses + " tries!");
                    break;
                }
            } catch (InputMismatchException e) {
                throw new RuntimeException(e);
            }
        }
    }
}