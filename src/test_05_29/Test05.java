package test_05_29;

public class Test05 {
    public static void main(String[] args) {
        MyClass5 mc1 = new MyClass5();
        System.out.println("-------");
        MyClass5 mc2 = new MyClass5();
        System.out.println("-------");
        System.out.println(mc1.cc = mc2.cc);
        System.out.println("-------");
        System.out.println(MyClass5.ca == MyClass5.ca);
    }
}

class ClassA {
    static {
        System.out.println("In ClassA static");
    }

    public ClassA() {
        System.out.println("ClassA()");
    }
}

class ClassB {
    static {
        System.out.println("In ClassB static");
    }

    public ClassB() {
        System.out.println("ClassB()");
    }
}

class ClassC extends ClassB {
    static {
        System.out.println("In ClassC static");
    }

    public ClassC() {
        System.out.println("ClassC()");
    }
}

class MyClass5 {
    static ClassA ca = new ClassA();
    ClassC cc = new ClassC();

    static {
        System.out.println("In MyClass5 static");
    }

    public MyClass5() {
        System.out.println("MyClass5()");
    }
}