package test_05_07;

public class CircularStatement {

    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 5; i++, a++)
            System.out.println(a);
        System.out.println("---------");
        int b = 0;
        while (b < 5) {
            System.out.println(b);
            b++;
        }
        System.out.println("---------");
        int c = 0;
        do {
            System.out.println(c);
            c++;
        } while (c < 5);
    }

}
