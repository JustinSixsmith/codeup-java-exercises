package main;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] family = new Person[3];
        family[0] = new Person("Justin");
        family[1] = new Person("Joanna");
        family[2] = new Person("Charlotte");
        for (int i = 0; i < family.length; i++) {
            System.out.println(family[i].getName());
        }

        addPerson(family);

    }

    public static void addPerson(Person[] family) {
        System.out.println(family[0].getName());
    }
}
