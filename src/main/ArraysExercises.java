package main;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));


        Person[] family = new Person[4];
        for (int i = 0; i < family.length; i++) {
            family[i] = new Person("unknown");
        }
        family[0].setName("Justin");
        family[1].setName("Joanna");
        family[2].setName("Charlotte");
        for (int i = 0; i < family.length; i++) {
            System.out.println(family[i].getName());
        }

        Person son = new Person("Nolan");
        addPerson(family, son);

    }

    public static void addPerson(Person[] people, Person person) {
        String newName = person.getName();
        people[people.length - 1].setName(newName);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());
        }
    }
}
