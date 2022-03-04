package main;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) Math.floor(Math.random() * 100 + 1);
        boolean wrongGuess = true;
        int remainingGuesses = 10;
        System.out.println("You have 10 attempts to guess the secret number between 1 and 100!");

        do {
            System.out.println(remainingGuesses + " guesses remaining.");
            System.out.println("Enter your guess: ");
            int userNum = scanner.nextInt();
            if (remainingGuesses <= 0) {
                System.out.println("Sorry, you ran out of guesses!");
                wrongGuess = false;
            } else if (userNum == randomNumber) {
                System.out.println("GOOD GUESS!");
                wrongGuess = false;
            }else if (userNum < randomNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
            remainingGuesses -= 1;
        } while (wrongGuess);


        scanner.close();

    }
}

