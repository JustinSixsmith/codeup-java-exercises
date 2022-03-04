package main;

import java.util.Scanner;

public class MethodsExercises {

    public static void main(String[] args) {

//        System.out.println(addNums(5, 3));
//        System.out.println(subNums(5, 3));
//        System.out.println(mulNums(7, 3));
//        System.out.println(divNums(5, 7));
//        System.out.println(modNums(5, 3));

//        int userInput = getInteger(1, 10);
//        System.out.println("You entered: " + userInput);

        Scanner scanner = new Scanner(System.in);
        boolean userResponse = true;

        do {
            factorial();
            System.out.println("Would you like to continue (y/n)? ");
            String userReply = scanner.next();
            if (!(userReply.equals("y"))) {
                userResponse = false;
                System.out.println("Number factorials complete.");
            }
        } while (userResponse);

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


    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number between 1 and 10: ");
        int userNum = scanner.nextInt();
        if (userNum >= 1 && userNum <= 10) {
            System.out.print("Thank you, ");
            return userNum;
        }
        return getInteger(min, max);
    }


    public static void factorial() {
        int userInput = getInteger(1, 10);
        long factor = 1;
        for (int i = 1; i <= userInput; i++) {
            factor *= i;
        }
        System.out.printf("the factorial of %d is: %d\n", userInput, factor);
    }


}