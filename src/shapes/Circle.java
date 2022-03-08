package shapes;

public class Circle {
    private static int numCircles = 0;

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI. * radius * radius;
    }


    public double getCircumference() {
        return 2 * Math.PI * radius;
    }



//    accessors
    public static int getNumCircles() {
        return numCircles;
    }

    public static void setNumCircles(int numCircles) {
        Circle.numCircles = numCircles;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
