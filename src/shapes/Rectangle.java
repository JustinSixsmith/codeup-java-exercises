package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double setLength(double length) {
        this.length = length;
        return length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
