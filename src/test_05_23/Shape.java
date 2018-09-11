package test_05_23;

public class Shape {
    private double length;
    private double weight;

    public Shape(double length, double weight) {
        this.length = length;
        this.weight = weight;
    }


    public static void main(String[] args) {
        Shape r = new Rectangle(4.0, 5.0);
        System.out.println(r.perimeter());
        System.out.println(r.area());
        System.out.println("--------");
        Shape s = new Square(3.14);
        System.out.println(s.perimeter());
        System.out.println(s.area());
        System.out.println("--------");
        Shape c = new Circle(2.0);
        System.out.println(c.area());
        System.out.println(c.perimeter());
    }


    public double getLength() {
        return length;
    }

    public double getWeight() {
        return weight;
    }

    public double perimeter() {
        return (length + weight) * 2;
    }

    public double area() {
        return length * weight;
    }
}


class Rectangle extends Shape {

    public Rectangle(double length, double weight) {
        super(length, weight);
    }

    @Override
    public double perimeter() {
        return (this.getLength() + this.getWeight()) * 2;
    }

    @Override
    public double area() {
        return (this.getWeight() * this.getLength());
    }
}

class Square extends Rectangle {

    public Square(double weight) {
        super(weight, weight);
    }
}

class Circle extends Shape {

    public Circle(double weight) {
        super(weight, weight);
    }

    @Override
    public double perimeter() {
        return this.getWeight() * 3.14 * 2;
    }

    @Override
    public double area() {
        return this.getWeight() * this.getWeight() * 3.14;
    }
}