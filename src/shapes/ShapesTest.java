package shapes;

public class ShapesTest {

    //    public static void main(String[] args) {
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("The perimeter of box1 is: " + box1.getPerimeter());
//        System.out.println("The area of box1 is: " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("The area of box 2 is: " + box2.getArea());
//        System.out.println("The perimeter of box2 is: " + box2.getPerimeter());
//    }

    public static void main(String[] args) {
        Measurable myShape = new Square(5);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());

        Measurable myShape2 = new Rectangle(5, 6);
        System.out.println(myShape2.getArea());
        System.out.println(myShape2.getPerimeter());
    }

}
