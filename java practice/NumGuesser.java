import java.util.Scanner;
import java.util.Random;

public class NumGuesser {
    
    // global variables
    public static int min;
    public static int max;

    // easy mode
    public static void easy() {
        min = 1;
        max = 100;
    }

    // medium mode
    public static void medium() {
        min = 1;
        max = 250;
    }
    
    // hard mode
    public static void hard() {
        min = 1;
        max = 500;
    }

    public static void main(String[] args) {
        // import declaration to use in code later
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // setups a count variable that counts down after each attempt /// do not change ///
        int attempts = 5;

        // create 3 modes, and use methods to change the (min,max) values to increase challenge
        System.out.println("Do you want to choose easy mode, medium, or hard mode. Easy mode has the range 1-100, Medium: 1-250, Hard: 1-500: ('easy' OR 'medium' OR 'hard') ");
        String difficulty = input.nextLine().toLowerCase();
        if (difficulty.equals("easy")) {
            easy();
        }
        else if (difficulty.equals("medium")) {
            medium();
        }
        else if (difficulty.equals("hard")) {
            hard();
        }
        else {
            System.out.println("Invalid input. Defaulting to easy mode.");
            easy();
        }

        // set the value of the number to be guessed between the minimum and maximum
        int number = rand.nextInt(min,max + 1);

        // intitially flag win as false after the decision to start the loop
        boolean win = false; 

        while (!win) {

            // asks for user input
            System.out.println("\n oka try guess a number between " + min + "-" + max + ". You will have 5 attempts to guess it or you will lose.");
            System.out.print("You currently have " + attempts + " left. Enter your guess: ");
            int guess = input.nextInt();
            attempts -= 1;
            // if the guess is less than the number, it says that the guess is less than the number
            if (guess > number) {
                System.out.println("\nThe mystery number is lower than " + guess);
            }

            // vice versa
            else if (guess < number) {
                System.out.println("\nThe mystery number is higher than " + guess);
            }

            // if its neither conditionals, the user guessed the right number and wins. the win varaible is set to true to break the while loop. 
            else {
                System.out.println("\nCongratulations! your guess of " + guess + " is correct with " + attempts + " attempts left. GGs");
                win = true;

            }

            if (attempts == 0) {
                System.out.println("You ran out of guesses. The mystery number was " + number);
                System.exit(0); 
            }
        }

        // closes the input
        input.close(); 
    }
}