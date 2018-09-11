package test_05_29;

public class InnerStaticClass {
    public static void main(String[] args) {
        Outter2.Inner2 inner2 = new Outter2.Inner2();
        inner2.j++;
        System.out.println(inner2.j);
    }
}

class Outter2 {
    static int i = 1;

    static class Inner2 {
        int j = 1;

        public void m() {
            System.out.println(i);
        }
    }
}
