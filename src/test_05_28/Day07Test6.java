package test_05_28;

public class Day07Test6 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        Circle c = new Circle(5.0);
        Square s = new Square(5.0);
        Rectangle r = new Rectangle(5.0, 6.0);
        shapes[0] = c;
        shapes[1] = s;
        shapes[2] = r;
        for (Shape shape : shapes) {
            System.out.println(shape.area());
            System.out.println(shape.perimeter());
        }
    }
}
