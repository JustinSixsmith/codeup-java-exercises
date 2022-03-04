package main;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(addNums(5, 3));
//        System.out.println(subNums(5, 3));
//        System.out.println(mulNums(7, 3));
//        System.out.println(divNums(5, 7));
//        System.out.println(modNums(5, 3));

//        int userInput = getInteger(1, 20);
//        System.out.println("You entered: " + userInput);

        Scanner scanner = new Scanner(System.in);

        boolean userContinues = true;

//        do {
//            factorial();
//            System.out.println("Would you like to continue (y/n)? ");
//            String userReply = scanner.next();
//            if (!(userReply.equalsIgnoreCase("y"))) {
//                userContinues = false;
//                System.out.println("Factorials complete.");
//            }
//        } while (userContinues);


        do {
            int diceRoll = rollDice(2);
            System.out.printf("Your total is: %d!\n", diceRoll);
            System.out.println("Would you like to roll again (y/n)? ");
            String userReply = scanner.next();
            if (!(userReply.equalsIgnoreCase("y"))) {
                userContinues = false;
                System.out.println("Game time is over!");
            }
        } while (userContinues);


        scanner.close();
    }


//    public static int addNums(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subNums(int num1, int num2) {
//        return num1 - num2;
//    }
//
////    public static int mulNums(int num1, int num2) {
////        return num1 * num2;
////    }
//
//    public static double divNums(double num1, double num2) {
//    if (num1 == 0 || num2 == 0) {
//            return 0;
//        }
//        return num1 / num2;
//    }
//
//    public static int modNums(int num1, int num2) {
//        return num1 % num2;


//    public static int mulNums(int num1, int num2) {
//        int total = num1;
//        for (int i = 1; i < num2; i++) {
//            total += num1;
//        }
//        return total;
//    }


//    public static int mulNums(int num1, int num2) {
//        if (num1 == 0 || num2 == 0) {
//            return 0;
//        }
//        return num1 + mulNums(num1, num2 - 1);
//    }


//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Please enter a number between 1 and 20: ");
//        int userNum = scanner.nextInt();
//        if (userNum >= 1 && userNum <= 20) {
//            System.out.print("Thank you, ");
//            return userNum;
//        }
//        return getInteger(min, max);
//    }
//
//
//    public static void factorial() {
//        int userInput = getInteger(1, 20);
//        long factor = 1;
//        for (int i = 1; i <= userInput; i++) {
//            factor *= i;
//        }
//        System.out.printf("the factorial of %d is: %d\n", userInput, factor);
//    }


    public static int rollDice(int numDice) {
        System.out.println("How many sides to the pair of dice? ");
        Scanner scanner = new Scanner(System.in);
        int sides = scanner.nextInt();
        int die1 = (int) Math.floor(Math.random() * sides + 1);
        int die2 = (int) Math.floor(Math.random() * sides + 1);
        System.out.println("Your first die rolled a: " + die1);
        System.out.println("Your second die rolled a: " + die2);
        return die1 + die2;
    }


}