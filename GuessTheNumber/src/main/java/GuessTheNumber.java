import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();
        Random random = new Random();
        int number = random.nextInt(20) + 1;
        System.out.println("Hello! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Well, " + name + ", I am thinking of a number between 1 and 20.");
        System.out.println("Take a guess.");
        boolean correct = false;
        int guessCount = 0;
        while(!correct) {
            int guess = scanner.nextInt();
            guessCount++;
            if(guess > number) {
                System.out.println("Your guess is too high.");
                System.out.println("Take a guess");
            } else if(guess < number) {
                System.out.println("Your guess is too low");
                System.out.println("Take a guess");
            } else {
                System.out.println("Good job, " + name + "! You guessed my number in " + guessCount +" guesses!");
                System.out.println("Would you like to play again? (y or n");
            }
        }
    }
}
