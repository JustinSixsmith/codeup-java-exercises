package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yeah? ");
        String saidToBob = scanner.nextLine();

        boolean more = true;

        do {
            if (saidToBob.endsWith("?")) {
                System.out.println("Sure.");
            } else if (saidToBob.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (saidToBob.equals("")) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Is that it (y)? ");
            saidToBob = scanner.nextLine();

            if (saidToBob.equalsIgnoreCase("y")) {
                more = false;
            }
        } while (more);

        System.out.println("kbye.");

        scanner.close();
    }
}
