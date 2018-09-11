package test_05_28;

public class Test03 {
    public static void main(String[] args) {
        Super2 s = new Sub2();
        s.method(10);
        System.out.println("-------");
        s.method();
        System.out.println("-------");
        s.method("hello");
    }
}

class Super2 {
    public void method() {
        System.out.println("method() in Super");
    }

    public void method(String str) {
        System.out.println("method(Str) in Sub");
    }

    public void method(int i) {
        System.out.println("method(int) in Super");
    }
}

class Sub2 extends Super2 {
    @Override
    public void method() {
        System.out.println("method() in Sub");
    }

    @Override
    public void method(int i) {
        System.out.println("method(String) in Sub");
    }
}
