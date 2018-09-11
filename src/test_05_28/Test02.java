package test_05_28;

public class Test02 {
    public static void main(String[] args) {
        Sub1 s = new Sub1();
        s.m1();
        System.out.println("--------");
        s.m2();
    }
}

class Super1 {
    public void m1() {
        System.out.println("m1() in Super");
    }

    public void m2() {
        System.out.println("m2() in Super");
    }
}

class Sub1 extends Super1 {
    @Override
    public void m1() {
        System.out.println("m1() in Sub");
        super.m1();
    }
}