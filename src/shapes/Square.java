package shapes;

public class Square extends Quadrilateral implements Measurable {

//    public Square(double length, double width) {
//        super(length, width);
//    }

    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return this.length;
    }

    public double setSide(double side) {
        return setLength(side);
    }

    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double setLength(double length) {
        this.length = this.width = length;
        return length;
    }

    @Override
    public void setWidth(double width) {
        this.width = this.length = width;
    }
}
