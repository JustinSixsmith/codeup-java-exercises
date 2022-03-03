package main;

import javax.swing.*;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

//        for (int j = 100; j >= -10; j-=5) {
//                System.out.println(j);
//        }
//
//        for (long k = 2; k < 1000000; k*=k) {
//            System.out.println(k);
//    }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


        Scanner scanner = new Scanner(System.in);

        boolean userContinues = true;
//
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int userInt = scanner.nextInt();
//            System.out.println();
//            System.out.println("Here is your table!");
//            System.out.println();
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i < userInt; i++) {
//                System.out.format("%-6d", i);
//                System.out.print(" | ");
//                System.out.format("%-7d", i * i);
//                System.out.print(" | ");
//                System.out.println(i * i * i);
//            }
//            System.out.println();
//            System.out.println("Would you like to enter another number? (y/n) ");
//            String userResponse = scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")) {
//                userContinues = false;
//            }
//        } while (userContinues);
//
//        System.out.println("Math complete!");
//
//        scanner.close();


        do {
            System.out.println("Enter a grade from 0 - 100: ");
            int numGrade = scanner.nextInt();

            if (numGrade >= 88) {
                System.out.println("A");
            } else if (numGrade >= 80) {
                System.out.println("B");
            } else if (numGrade >= 67) {
                System.out.println("C");
            } else if (numGrade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to enter another grade (y/n)? ");
            String gradeUserResponse = scanner.next();

            if (!(gradeUserResponse.equalsIgnoreCase("y"))) {
                userContinues = false;
            }

            System.out.println("Grading is complete!");

        } while (userContinues);


    }
}
