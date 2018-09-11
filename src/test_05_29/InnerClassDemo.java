package test_05_29;

public class InnerClassDemo {
    public static void main(String[] args) {
        Outter outter = new Outter();
        outter.m();
    }
}

class Outter {
    int i = 1;

    public void m() {
        //方法内部类(局部内部类)
        class Inner {
            int j = 1;

            public Inner() {
            }

            public void m() {
                System.out.println(j);
            }
        }
        Inner inner = new Inner();
        inner.m();
    }
}
