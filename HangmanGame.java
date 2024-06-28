import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame{

    public static void main(String[] args) {
        String[] words = {"apple","banana","cherry","olive","programming","programmer","python","html","toyota","subaru","android","Timber","headphones","cars"};

        Random randint =  new Random();
        String chosenword = words[randint.nextInt(words.length)];

        char[] display = new char[chosenword.length()];
        for(int i = 0; i < display.length; i++){
            display[i] = '_';

        }

        List<Character> guessedcharacters = new ArrayList<>();
        int wrongGuess = 0;
        int maxwrongGuess = 6;
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);


        while(wrongGuess < maxwrongGuess && new String(display).contains("_")){
            System.out.println("Current word: " + new String(display));
            System.out.println("Guessed letters: " + guessedcharacters);
            System.out.println("Enter a letter: ");

            char guess = scanner.next().charAt(0);


            if (guessedcharacters.contains(guess)){
                System.out.println("You already guessed that letter!");

            } else {

                guessedcharacters.add(guess);
                boolean correctGuess = false;

                for(int i = 0; i < chosenword.length(); i++){
                    if(chosenword.charAt(i) == guess){
                        display[i] = guess;
                        correctGuess = true;

                    }
                }

                if(!correctGuess){
                    wrongGuess++;
                }
            }

            printHangman(wrongGuess);


        }

        if (wrongGuess == maxwrongGuess){
            System.out.println("You lost! The word was:  " + chosenword);

        }else{
            System.out.println("Congratulations! You have guessed the word: " + chosenword);
        }
    }


public static void printHangman(int incorrectGuesses) {
    System.out.println("Incorrect guesses: " + incorrectGuesses);
//this thing is copied from a source: 
    switch (incorrectGuesses) {
        case 0 -> {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            }
        case 1 -> {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            }
        case 2 -> {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println("  |   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            }
        case 3 -> {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println(" /|   |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            }
        case 4 -> {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println(" /|\\  |");
            System.out.println("      |");
            System.out.println("      |");
            System.out.println("=========");
            }
        case 5 -> {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println(" /|\\  |");
            System.out.println(" /    |");
            System.out.println("      |");
            System.out.println("=========");
            }
        case 6 -> {
            System.out.println("  +---+");
            System.out.println("  |   |");
            System.out.println("  O   |");
            System.out.println(" /|\\  |");
            System.out.println(" / \\  |");
            System.out.println("      |");
            System.out.println("=========");
            }
        }
    }
}