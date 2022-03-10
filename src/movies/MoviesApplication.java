package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        Movie[] movies = MoviesArray.findAll();

        int choice;

        do {
            System.out.print("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n\n");
            choice = input.getInt("Enter your choice: ", 0, 5);

            if (choice == 1) {
                for (int i = 0; i < movies.length; i++) {
                    System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }

            }
            if (choice == 2) {

                for (int i = 0; i < movies.length; i++) {
                    String category = movies[i].getCategory();
                    if (category == "animated")
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            }
            if (choice == 3) {

                for (int i = 0; i < movies.length; i++) {
                    String category = movies[i].getCategory();
                    if (category == "drama")
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            }
            if (choice == 4) {

                for (int i = 0; i < movies.length; i++) {
                    String category = movies[i].getCategory();
                    if (category == "horror")
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            }
            if (choice == 5) {

                for (int i = 0; i < movies.length; i++) {
                    String category = movies[i].getCategory();
                    if (category == "scifi")
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                }
            }
            System.out.println();
        } while (choice > 0);


        input.close();
    }
}
