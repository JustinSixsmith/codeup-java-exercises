package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    @Override
    public String toString() {
        return getName() + " - " + "Grade average: " + getGradeAverage();
    }

    // returns the student's name
    public String getName() {
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        this.grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return total / grades.size();
    }


    public static void main(String[] args) {
        Student bob = new Student("Bob");
        System.out.println(bob);
        bob.addGrade(98);
        System.out.println(bob);
    }
}
