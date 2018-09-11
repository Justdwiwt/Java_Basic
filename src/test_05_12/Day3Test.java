package test_05_12;

public class Day3Test {

    public static void main(String[] args) {
        System.out.println("Q20:");
        pNumber();
        System.out.println("Q21:");
        System.out.println(pI());
        System.out.println("Q22:");
        for (int i = 1; i <= 10; i++)
            System.out.print(fbn(i) + " ");
    }

    public static void pNumber() {
        int s;
        for (int i = 1; i <= 1000; i++) {
            s = 0;
            for (int j = 1; j < i; j++)
                if (i % j == 0)
                    s = s + j;
            if (s == i)
                System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int pI() {
        int count = 0;
        int syn = 1;
        double PI = 0;
        int base = 1;
        while (PI > 3.1415927 || PI < 3.1415926) {
            PI += (syn * 4.0 / base);
            count++;
            base += 2;
            syn *= -1;
        }
        return count;
    }

    public static int fbn(int n) {
        if (n == 0)
            return -1;
        if (n == 1 || n == 2)
            return 1;
        else
            return fbn(n - 1) + fbn(n - 2);
    }
}
