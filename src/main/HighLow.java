package main;

import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) Math.floor(Math.random() * 100 + 1);
        int remainingGuesses = 10;
        System.out.println("You have 10 attempts to guess the secret number between 1 and 100!");

        while (true) {
            System.out.println(remainingGuesses + " guesses remaining.");
            System.out.println("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                remainingGuesses--;
                scanner.nextLine();
                continue;
            }
            int userNum = scanner.nextInt();
            scanner.nextLine();
            if (userNum == randomNumber) {
                System.out.println("GOOD GUESS!");
                break;
            } else if (userNum < randomNumber) {
                System.out.println("HIGHER");
            } else {
                System.out.println("LOWER");
            }
            remainingGuesses--;
            if (remainingGuesses <= 0) {
                System.out.println("Sorry, you ran out of guesses!");
                break;
            }
        }


        scanner.close();

    }

}
