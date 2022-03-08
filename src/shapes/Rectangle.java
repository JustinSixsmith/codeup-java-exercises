package shapes;

public class Rectangle {
    protected double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("in the Rectangle constructor.");
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    // accessors

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
