package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String studentName;
    private ArrayList<Integer> grades;
    private HashMap<String, String> attendance;

    public Student(String studentName) {
        this.studentName = studentName;
        this.grades = new ArrayList<>();
        this.attendance = new HashMap<>();
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nAverage: %.1f", studentName, getGradeAverage());
    }

    // returns the student's name
    public String getStudentName() {
        return this.studentName;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
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

    public String recordAttendance(String date, String value) {
        if (!(value.equalsIgnoreCase("p") || value.equalsIgnoreCase("a"))) {
            System.out.println("You must enter a \"p\" for Present, or \"a\" for Absent.");
        } else if (value.equalsIgnoreCase("p")) {
            String attStr = "Present";
            return attendance.put(date, attStr);
        } else {
            String attStr = "Absent";
            return attendance.put(date, attStr);
        }
        return date;
    }

    public HashMap<String, String> getAttendance() {
        return attendance;
    }

//    public Set attendancePercentage() {
//        Set records = this.attendance.keySet();
//        String day;
//        for (day : records) {
//            System.out.println(day);
//        }
//    }

    public static void main(String[] args) {
        Student bob = new Student("Bob");
        System.out.println(bob.getStudentName());
        bob.addGrade(98);
        System.out.println(bob.getGradeAverage());
        bob.attendance.put("2017-10-02", "p");
        bob.attendance.put("2017-10-03", "p");
        bob.attendance.put("2017-10-04", "a");
        System.out.println(bob.getAttendance());
        System.out.println(bob);

    }


}
