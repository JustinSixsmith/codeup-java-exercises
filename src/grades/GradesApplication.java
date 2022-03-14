package grades;

import util.Input;

import java.security.Key;
import java.util.*;

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

        students.put("jonjon", john);
        students.put("sosal", sally);
        students.put("peteyboy", pete);
        students.put("dumdum41", linda);

        System.out.print("\nWelcome!\n");


        while (true) {
            int selection = input.getInt("\nPlease enter your selection from the list below (1, 2, or 3).\n1. See a list of our students.\n2. View the overall class average.\n3. Print a csv report of all students.\n4. Exit\n");
            if (selection == 4) {
                System.out.println("\nGoodbye, and have a wonderful day!");
                break;
            } else if (selection == 1) {
                System.out.printf("Here are the GitHub usernames of our students:\n\n%s\n", students.keySet());
                String userInput = input.getString("\nWhich student would you like to see more information on? (Or, type \"all\" to see a list of all grades.) ");

                if (userInput.trim().equalsIgnoreCase("all")) {

                    Set eachStudent = students.keySet();
                    for (Object student : eachStudent) {
                        String studentName = students.get(student).getName();
                        double studentAvg = students.get(student).getGradeAverage();
                        ArrayList<Integer> allGrades = students.get(student).getGrades();
                        System.out.printf("\nName: %s - GitHub Username: %s\nGrades: %s Current Average: %.1f\n\n", studentName, student, allGrades, studentAvg);
                    }

                } else if (!students.containsKey(userInput)) {
                    System.out.printf("\nSorry, no student found with the GitHub username of \"%s\".\n", userInput);
                    System.out.println();

                } else {
                    String studentName = students.get(userInput).getName();
                    double studentAvg = students.get(userInput).getGradeAverage();
                    ArrayList<Integer> allGrades = students.get(userInput).getGrades();
                    System.out.printf("\nName: %s - GitHub Username: %s\nGrades: %s Current Average: %.1f\n\n", studentName, userInput, allGrades, studentAvg);
                }

                String keepGoing = input.getString("Would you like to see another student (y/n)? ");
                if (keepGoing.equalsIgnoreCase("n")) {
                    System.out.println("\nGoodbye, and have a wonderful day!");
                    break;
                }
            } else if (selection == 2) {
                double classTotal = 0;
                Set eachStudent = students.keySet();
                for (Object student : eachStudent) {
                    classTotal += students.get(student).getGradeAverage();
                }
                double classAvg = classTotal / students.size();
                System.out.printf("\nClass average: %.1f\n", classAvg);
            } else if (selection == 3) {
                Set eachStudent = students.keySet();
                for (Object student : eachStudent) {
                    String studentName = students.get(student).getName();
                    double studentAvg = students.get(student).getGradeAverage();
                    System.out.printf("%s,%s,%.1f\n", studentName, student, studentAvg);
                }
            }
        }
    }
}
