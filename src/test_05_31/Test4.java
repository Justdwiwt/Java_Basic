package test_05_31;

public class Test4 {
    public static void main(String[] args) {
        Myclass.method(new IA4() {
            @Override
            public void ma() {
                System.out.println("ma in anonymous inner class");
            }
        });
        class MyMaClass implements IA4 {

            @Override
            public void ma() {
                System.out.println("ma in local inner class");
            }
        }
        Myclass.method(new MyMaClass());
    }
}

interface IA4 {
    void ma();
}

class Myclass {
    public static void method(IA4 ia4) {
        System.out.println("in method");
        ia4.ma();
    }
}

