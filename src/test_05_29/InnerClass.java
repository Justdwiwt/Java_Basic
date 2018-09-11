package test_05_29;

public class InnerClass {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            void m() {

            }
        };
        new B() {
        };
    }
}

abstract class A {
    abstract void m();
}

class B {
}