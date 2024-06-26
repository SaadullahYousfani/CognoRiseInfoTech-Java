import java.util.Random;
import java.util.Scanner;

class TaskOne{
public static void main(String[] args){
    System.out.println("Number Guessing Game");
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();


    int answer = random.nextInt(100) + 1;
    int guesses = 0;

    final int TotalGuesses = 8;

    System.out.println("Welcome to The Number Guessing Game!");
    System.out.println("Guess The Number between 1 and 100: ");

    while (guesses < TotalGuesses){
        System.out.println("Enter your Guess: ");
        int guess = scanner.nextInt();
        guesses++;

        if (guess < answer){
            System.out.println("You Guess To low: Try Again!");
        } else if (guess > answer){
            System.out.println("You Guess To High: Try Again!.");

        } else{
            System.out.println("Congratulations! You Guessed The Number :) ");
            break;

        }

    }

    if (guesses == TotalGuesses && answer != scanner.nextInt()) {

        System.out.println("Sorry you have reached the maximum number of guesses:");
    }
    scanner.close();

    }

}