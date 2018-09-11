package test_05_07;

public class Test {
    public static void main(String[] args) {
        // int a = 3;
        // int b = 4;
        // int c = 5;
        // boolean d = a > b && c++ > 4;
        // int i = 5;
        // int j = 2 * i++ + 3 * ++i;
        // System.out.println(j);
        // System.out.println(c + "," + d);
        // System.out.println(1.0 / 0);
        // System.out.println(2 << 2);
        // System.out.println(2 + 'a');
        // int a = 5;
        // int b = (a++) + (--a) + (++a);
        // System.out.println(a);
        // System.out.println(b);
        int b = 4;
        int a = 5;
        switch (b) {
            case 3:
                a++;
                break;
            case 2:
                ++a;
                break;
            default:
                a += 2;
                break;
        }
        System.out.println(a);
    }
}
