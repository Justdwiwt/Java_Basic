package test_05_28;

public class Test04 {
    public static void main(String[] args) {
        ClassD cd1 = new ClassD();
        System.out.println("----");
        ClassD cd2 = new ClassD(10);
    }
}

class ClassA {
    public ClassA() {
        System.out.println("ClassA()");
    }
}

class ClassB {
    public ClassB() {
        System.out.println("ClassB()");
    }
}

class ClassC extends ClassA {
    public ClassC() {
        System.out.println("ClassC()");
    }
}

class ClassD extends ClassB {
    private ClassA ca = new ClassA();
    private ClassC cc;

    public ClassD() {
        System.out.println("ClassD()");
    }

    public ClassD(int i) {
        cc = new ClassC();
        System.out.println("ClassD(int)");
    }
}
