package test_05_25;

public class AbstractTest {
    public static void main(String[] args) {

    }
}

abstract class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    abstract public double getGirth();

    abstract public double getArea();
}

class Ractangle extends Shape {

    public Ractangle(double x, double y) {
        super(x, y);
    }

    @Override
    public double getGirth() {
        return (this.getX() + this.getY()) * 2;
    }

    @Override
    public double getArea() {
        return this.getX() * this.getY();
    }
}

@SuppressWarnings("ALL")
class Square extends Ractangle {

    public Square(double x) {
        super(x, x);
    }

}

abstract class Circle extends Shape {

    public Circle(double x, double y) {
        super(x, y);
    }
}