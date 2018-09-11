package test_05_29;

public class InnerClassDemo1 {
    public static void main(String[] args) {
        Outter1 outter1 = new Outter1();
        outter1.n();
        Outter1.Inner1 inner1 = new Outter1().new Inner1();
        inner1.m();
    }
}

class Outter1 {
    int i = 1;

    class Inner1 {
        int j = 1;

        public void m() {
            System.out.println(i);
        }
    }

    public void n() {
        Inner1 inner1 = new Inner1();
        inner1.m();
    }
}

