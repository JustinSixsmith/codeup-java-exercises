package main;

public class ControlFlowExercises {
    public static void main(String[] args) {


//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        for (int j = 100; j >= -10; j--) {
//            if (j % 5 == 0) {
//                System.out.println(j);
//            }
//        }

//        for (long k = 2; k < 1000000; k++) {
//            System.out.println(k);
//            k *= k;
//            k--;
//    }

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }

}
}
