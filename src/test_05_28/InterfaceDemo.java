package test_05_28;

public class InterfaceDemo {
}

interface Shapes {
    double getx();

    double gety();
}

class Rectangles implements Shapes {

    @Override
    public double getx() {
        return 0;
    }

    @Override
    public double gety() {
        return 0;
    }
}