package test_05_28;

public class InterfaceDemo1 {
    public static void main(String[] args) {
        B b = new C();
//        A a = (A) b;
        System.out.println(A.i);
    }
}


interface A {
    int i = 1;

    void m();
}

class B {
}

class C extends B {
}

class D extends B {
}
