package test_05_24;

public class StaticMethod {
    public static void main(String[] args) {
        A a = new A();
        A.a();
        B.a();
        B.b();
    }
}

class A {
    public static void a() {
        System.out.println("a");
    }

    public static void b() {
    }

    public void c() {
    }
}

class B extends A {
    public static void a() {
        System.out.println();
    }

    @Override
    public void c() {
        super.c();
    }
}