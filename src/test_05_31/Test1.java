package test_05_31;

public class Test1 {
    public static void main(String[] args) {
        IA ia = new MyClass();
        ia.m1();
        System.out.println(IA.a);
    }
}

interface IA {
    void m1();

    int a = 100;
}

class MyClass implements IA {

    @Override
    public void m1() {

    }
}