package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {
        Input input = new Input();

        while (true) {
            doACircle(input);

            boolean moreCircles = input.yesNo("More circles (y/n)? ");
            if (!moreCircles) {
                break;
            }
        }


        input.close();
    }

    private static void doACircle(Input input) {
        double radius = input.getDouble("Enter circle radius: ");
        Circle circle = new Circle(radius);
        Circle.setNumCircles(Circle.getNumCircles() + 1);

        System.out.printf("Area of circle with radius %f is %f\n", radius, circle.getArea());
        System.out.printf("Circumference of circle with radius %f is %f\n", radius, circle.getCircumference());
    }
}
