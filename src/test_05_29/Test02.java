package test_05_29;

public class Test02 {
    public static void main(String[] args) {
        MyClass2 mc1 = new MyClass2();
        MyClass2 mc2 = new MyClass2();
        MyClass2 mc3 = new MyClass2();
    }
}

class MyClass2 {
    static int count = 0;

    public MyClass2() {
        count++;
        System.out.println(count);
    }
}