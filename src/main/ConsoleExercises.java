package main;

import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

//        System.out.print("Enter your favorite number: ");
//        int favNumber = scanner.nextInt();
//        System.out.println(favNumber);

//        System.out.print("Enter 3 words: ");
//        String firstWord = scanner.next();
//        String secondWord = scanner.next();
//        String thirdWord = scanner.next();
//        System.out.printf("Your 3 words are: \n%s \n%s \n%s", firstWord, secondWord, thirdWord);
//
//        // Clears buffer
//        scanner.nextLine();

//        System.out.print("Enter a sentence: ");
//        String aSentence = scanner.nextLine();
//        System.out.printf("You entered: %s.\n", aSentence);

        System.out.print("Enter the length your room: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of your room: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height of your room: ");
        double height = scanner.nextDouble();

        double area = length * width;
        double volume = area * height;
        double perimeter = length * 2 + width * 2;

        System.out.printf("The area of your room is: %.2f.\n" +
                "The perimeter of your room is: %.2f.\n" +
                "The volume of your room is: %.2f.\n", area, perimeter, volume);

        scanner.close();
    }
}
