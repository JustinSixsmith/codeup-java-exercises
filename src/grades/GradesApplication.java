package grades;

import util.Input;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GradesApplication {
    private static Input input = new Input();
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student john = new Student("John");
        Student sally = new Student("Sally");
        Student pete = new Student("Pete");
        Student linda = new Student("Linda");
        john.addGrade(93);
        john.addGrade(94);
        john.addGrade(82);
        sally.addGrade(92);
        sally.addGrade(81);
        sally.addGrade(76);
        pete.addGrade(98);
        pete.addGrade(100);
        pete.addGrade(94);
        linda.addGrade(74);
        linda.addGrade(60);
        linda.addGrade(94);

        students.put("johnjohn", john);
        students.put("sosal", sally);
        students.put("peteyboy", pete);
        students.put("dumdum41", linda);

        System.out.println("Welcome!");
        System.out.println();

        while (true) {
            System.out.printf("Here are the GitHub usernames of our students:\n\n%s\n\n", students.keySet());
            String userInput = input.getString("Which student would you like to see more information on? ");


            if (!students.containsKey(userInput)) {
                System.out.printf("\nSorry, no student found with the GitHub username of \"%s\".\n", userInput);
                System.out.println();
            } else {
                System.out.printf("\nName: %s - GitHub Username: %s\n Current Average: %f\n\n", students.get(userInput).getName(), userInput, students.get(userInput).getGradeAverage());
            }
            String keepGoing = input.getString("Would you like to see another student (y/n)? ");
            if (keepGoing.equalsIgnoreCase("n")) {
                System.out.println("\nGoodbye, and have a wonderful day!");
                break;
            }
        }
    }
}
