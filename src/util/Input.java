package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString() {
        return this.scanner;
    }

    public boolean yesNo() {
        String reply = scanner.nextLine().toLowerCase();
        return reply.startsWith("y");
    }

    public int getInt(int min, int max) {
        System.out.println("Enter an integer between 1 and 10: ");
    }

    public int getInt() {

    }

    public double getDouble(double min, double max) {

    }

    public double getDouble() {

    }


}
