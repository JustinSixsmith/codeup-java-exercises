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

    public boolean yesNo() {
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
        if (scanner.hasNextInt() == false) {
            scanner.nextLine();
            return getInt(prompt);
        }
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        System.out.println("Enter a decimal number between 1 and 10: ");
        double userDbl = scanner.nextInt();
        if (!(userDbl >= 1 && userDbl <= 10)) {
            getDouble(min, max);
        }
        return userDbl;
    }

    public double getDouble(String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextDouble() == false) {
            scanner.nextLine();
            return getInt(prompt);
        }
        return scanner.nextInt();
    }


}
