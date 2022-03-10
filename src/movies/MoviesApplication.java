package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        Movie[] allMovies = MoviesArray.findAll();

        int choice;

        do {
            System.out.print("What would you like to do?\n" +
                    "\n" +
                    "0 - exit\n" +
                    "1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category\n" +
                    "6 - add a new movie\n\n");
            choice = input.getInt("Enter your choice: ", 0, 6);

            if (choice == 1) {

                for (int i = 0; i < allMovies.length; i++) {
                    System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                }

            }
            if (choice == 2) {

                for (int i = 0; i < allMovies.length; i++) {
                    String category = allMovies[i].getCategory();
                    if (category == "animated")
                        System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                }
            }
            if (choice == 3) {

                for (int i = 0; i < allMovies.length; i++) {
                    String category = allMovies[i].getCategory();
                    if (category == "drama")
                        System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                }
            }
            if (choice == 4) {

                for (int i = 0; i < allMovies.length; i++) {
                    String category = allMovies[i].getCategory();
                    if (category == "horror")
                        System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                }
            }
            if (choice == 5) {

                for (int i = 0; i < allMovies.length; i++) {
                    String category = allMovies[i].getCategory();
                    if (category == "scifi")
                        System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                }
            }
//            if (choice == 6) {
//                String newName = input.getString("Please enter the movie name: ");
//                String newCategory = input.getString("Please enter the movie category: ");
//                allMovies[allMovies.length] = new Movie(newName, newCategory);
//            }
            System.out.println();
        } while (choice > 0);


        input.close();
    }
    public static void addMovie(String name, String category) {
        Movie newMovie = new Movie(name, category);
    }
}
