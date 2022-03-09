package shapes;

public class Square extends Quadrilateral implements Measurable {
    private double side;

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return side * 2 + side * 2;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
