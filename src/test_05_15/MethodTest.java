package test_05_15;

import java.util.Scanner;

public class MethodTest {

    public static void main(String[] args) {
        System.out.println(geD(14));
        getD();
    }

    public static void printX(int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static int getSum(int a, int b) {
        return (a + b);
    }

    public static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    // 任何大于6的偶数都可以分成两个质数之和
    public static String geD(int num) {
        int a = 7;
        int b = 7;
        for (int i = 7; i < num; i++, a++, b++) {
            boolean ak = isPrime(a);
            boolean bk = isPrime(b);
            if (a + b == num && ak && bk)
                return a + "," + b;
        }
        return "error";
    }

    @SuppressWarnings("resource")
    public static void getD() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num <= 6 || num % 2 != 0) {
            System.out.println("error");
            getD();
        }
        for (int i = 3; i < num; i += 2)
            if (isPrime(i) && isPrime(num - i) && i <= (num - i))
                System.out.println(num + "=" + i + "+" + (num - i));
    }
}
