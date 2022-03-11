package movies;

import util.Input;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MoviesApplication {
    private static Input input = new Input();
    private static Movie [] allMovies = MoviesArray.findAll();

    public static void main(String[] args) {


        int choice = 0;

        do {
            printMenu();
            choice = input.getInt("Enter your choice: ", 0, 6);

            if (choice == 1) {

                for (Movie movie : allMovies) {
                    System.out.println(movie);
                }

            }
            if (choice == 2) {
                for (Movie movie : allMovies) {
                    String category = movie.getCategory();
                    if (Objects.equals(category, "animated"))
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
            if (choice == 3) {

                for (Movie movie : allMovies) {
                    String category = movie.getCategory();
                    if (Objects.equals(category, "drama"))
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
            if (choice == 4) {

                for (Movie movie : allMovies) {
                    String category = movie.getCategory();
                    if (Objects.equals(category, "horror"))
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
            if (choice == 5) {

                for (int i = 0; i < allMovies.length; i++) {
                    String category = allMovies[i].getCategory();
                    if (Objects.equals(category, "scifi"))
                        System.out.println(allMovies[i].getName() + " -- " + allMovies[i].getCategory());
                }
            }
            if (choice == 6) {
                String newName = input.getString("Please enter the movie name: ");
                String newCategory = input.getString("Please enter the movie category: ");
                Movie newMovie = new Movie(newName, newCategory);
                allMovies = Arrays.copyOf(allMovies, allMovies.length + 1);
                allMovies[allMovies.length - 1] = newMovie;
            }
            System.out.println();
        } while (choice != 0);


        input.close();
    }
    public static void printMenu() {
        System.out.print("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "6 - add a new movie\n\n");
    }

    public static void addMovie(String name, String category) {
        Movie newMovie = new Movie(name, category);
    }
}
