package shapes;

public class Square extends Rectangle {

    private double side;

    public Square(double length, double width) {
        super(length, width);
    }

    public Square(double side) {
        super(side, side);
        System.out.println("in the Square constructor.");
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

}
