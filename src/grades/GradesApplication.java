package grades;

import util.Input;

import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

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
            String userInput = input.getString("Which student would you like to see more information on? (Or, type \"all\" to see a list of all grades.) ");

            if (userInput.trim().equalsIgnoreCase("all")) {
                System.out.println(students);
            } else if (!students.containsKey("Working on it...")) {
                System.out.printf("\nSorry, no student found with the GitHub username of \"%s\".\n", userInput);
                System.out.println();
            } else {
                String studentName = students.get(userInput).getName();
                double studentAvg = students.get(userInput).getGradeAverage();
                ArrayList<Integer> allGrades = students.get(userInput).getGrades();
                System.out.printf("\nName: %s - GitHub Username: %s\nGrades: %s Current Average: %.2f\n\n", studentName, userInput, allGrades, studentAvg);
            }
            String keepGoing = input.getString("Would you like to see another student (y/n)? ");
            if (keepGoing.equalsIgnoreCase("n")) {
                System.out.println("\nGoodbye, and have a wonderful day!");
                break;
            }
        }
    }
}
