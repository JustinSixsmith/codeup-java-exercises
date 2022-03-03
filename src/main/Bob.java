package main;

import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Yeah? ");
        String saidToBob = scanner.nextLine();

        if (saidToBob.endsWith("?")) {
            System.out.println("Sure.");
        } else if (saidToBob.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        }else if (saidToBob.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever.");
        }

        scanner.close();
    }
}
