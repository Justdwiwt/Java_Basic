package test_05_29;

public class Test01 {
    public static void main(String[] args) {
        MyClass1 mc1 = new MyClass1();
        MyClass1 mc2 = new MyClass1();
        MyClass1.a = 100;
        mc1.b = 200;
        MyClass1.a = 300;
        mc2.b = 400;
        System.out.println(MyClass1.a);
        System.out.println(mc1.b);
        System.out.println(MyClass1.a);
        System.out.println(mc2.b);
    }
}

class MyClass1 {
    static int a;
    int b;
}