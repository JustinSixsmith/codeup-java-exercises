package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(String prompt) {
        String reply = scanner.nextLine().toLowerCase();
        return reply.startsWith("y");
    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int userInt = scanner.nextInt();
        if (!(userInt >= 1 && userInt <= 10)) {
            return getInt(prompt, min, max);
        }
        return userInt;
    }


    public int getInt(String prompt) {
        System.out.println(prompt);
        if (!scanner.hasNextInt()) {
            scanner.nextLine();
            return getInt(prompt);
        }
        return scanner.nextInt();
    }

    public double getDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double userDbl = scanner.nextDouble();
        if (!(userDbl >= 1 && userDbl <= 10)) {
            return getDouble(prompt, min, max);
        }
        return userDbl;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        if (!scanner.hasNextDouble()) {
            scanner.nextLine();
            return getDouble(prompt);
        }
        return scanner.nextDouble();
    }

    public void close() {
        scanner.close();
    }
}
