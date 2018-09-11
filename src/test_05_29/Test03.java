package test_05_29;

public class Test03 {
    public static void main(String[] args) {
        MyClass3 mc1 = new MyClass3();
        System.out.println(MyClass3.i);
        MyClass3 mc2 = new MyClass3(10);
        System.out.println(MyClass3.i);
    }
}

class MyClass3 {
    static int i = 20;

    static {
        i = 20;
        System.out.println("In Static");
    }

    public MyClass3() {
        System.out.println("MyClass3()");
    }

    public MyClass3(int i) {
        System.out.println("MyClass3(int)");
        MyClass3.i = i;
    }
}