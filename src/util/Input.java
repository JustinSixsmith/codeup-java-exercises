package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.print(prompt + " ");
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        String reply = scanner.nextLine().toLowerCase();
        return reply.startsWith("y");
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userInt = scanner.nextInt();
        if (!(userInt >= min && userInt <= max)) {
            return getInt(prompt, min, max);
        }
        int myInt = userInt;
        scanner.nextLine();
        return myInt;
    }


    public int getInt(String prompt) {
        System.out.print(prompt + " ");
        if (!scanner.hasNextInt()) {
            scanner.nextLine();
            return getInt(prompt);
        }
        int myInt = scanner.nextInt();
        scanner.nextLine();
        return myInt;
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userDbl = scanner.nextDouble();
        if (!(userDbl >= 1 && userDbl <= 10)) {
            return getDouble(prompt, min, max);
        }
        double myDbl = userDbl;
        scanner.nextLine();
        return myDbl;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        if (!scanner.hasNextDouble()) {
            scanner.nextLine();
            return getDouble(prompt);
        }
        double myDbl = scanner.nextDouble();
        scanner.nextLine();
        return myDbl;
    }

    public void close() {
        scanner.close();
    }
}
